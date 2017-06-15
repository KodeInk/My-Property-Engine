/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty.v1._dao.AccountsDaoImpl;
import myproperty.v1._dao.AddressDaoImpl;
import myproperty.v1._entities.Account;
import myproperty.v1._entities.Accounts;
import myproperty.v1._entities.Contacts;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.User;
import myproperty.v1._entities.responses.PersonResponse;
import myproperty.v1._entities.responses.UserResponse;
import myproperty.v1.helper.ContactTypes;
import myproperty.v1.helper.ParentTypes;
import myproperty.v1.helper.StatusEnum;
import myproperty.v1.helper.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mover 6/13/2017
 */
@Service
public class AccountService {

    private String names;
    private String email_address;
    private String password;
    UserResponse userResponse;
    PersonResponse personResponse;
    User user;
    Contacts contacts;
    Accounts accounts;

    private final AccountsDaoImpl accountsDaoImpl = AccountsDaoImpl.getInstance();

    private static final Logger LOG = Logger.getLogger(AccountService.class.getName());

    @Autowired
    UserService userService;

    @Autowired
    PersonService personService;

    @Autowired
    ContactsService contactsService;
    //TODO:Create Account
    public Boolean createAccount(Account account) throws Exception {
        //STEP ONE: Create User Username and Password:
        // Check to see that Email Address does not exist ::
        names = account.getNames();
        email_address = account.getEmail_address();
        password = account.getPassword();

        Person person = new Person();

        //Check to see that Mandatory Fields are filled 
        if (names.length() <= 2 || email_address.length() <= 4 || password.length() <= 4) {
            LOG.log(Level.INFO, "Crate New Account Service Level Method Hit ");
            throw new BadRequestException("Failed because of missing mandatory fields ");
        }
        //Check in the Database to see that there is no active user with this email address ::
        List<User> users = userService.checkActiveUserByEmail(account.getEmail_address());
        if (!users.isEmpty()) {
            throw new BadRequestException("An Active User with this Email Address Exists in the database");
        }
        //create user ::
        {
            user = new User();
            user.setUsername(account.getEmail_address());
            user.setPassword(account.getPassword());
            user.setStatus(StatusEnum.PENDING.toString());
            userResponse = userService.createUser(user);
            user.setId(userResponse.getId());

        }

        //STEP TWO: Create Empty Person [Profile]:
        {
            if (userResponse.getId() > 0) {

                person.setUser(user);
                person.setNames(account.getNames());
                personResponse = personService.createPerson(person);
                person.setId(personResponse.getId());
            }
        }
        //STEP THREE: Create Contact Information Email Address:
        {
            if (personResponse.getId() > 0) {
                contacts = new Contacts();
                contacts.setType(ContactTypes.EMAIL.toString());
                contacts.setDetails(account.getEmail_address());
                contacts.setCreatedBy(user);
                contactsService.createContacts(contacts, ParentTypes.PERSON, personResponse.getId());
            }
        }
        //STEP FOUR : Create Account data
        {
            // Check to see that User is Created, Profile is Created, and Contact Information is Created for this User
            //Checker 
            if ((userResponse.getId() > 0) && (personResponse.getId() > 0) && (contacts.getId() > 0)) {
                accounts = new Accounts();

                // Re Initialize the Account Owner :: 
                User account_owner = new User();
                account_owner.setId(userResponse.getId());
                account_owner.setUsername(userResponse.getUsername());
                accounts.setAccount_owner(account_owner);

                // Set Status  ::
                accounts.setStatus(StatusEnum.ACTIVE.toString());
                accounts.setParentId(0);

                accounts = accountsDaoImpl.create(accounts);


            }
        }

        return true;
        //TODO: Send Email to the User and Notify about Account Creation ::
    }

    //TODO: Activate Account
    /*
    Pass the account ID and activate or deaactivate ::
     */
    public void activateAccount(Integer account_id) {

    }
    //TODO: Deactivate Account
    /*
    Pass the account ID and activate or deaactivate ::
     */
    public void deactivateAccount(Integer account_id) {

    }
    //TODO: update Account
    public void updateAccount(Integer account_id, Accounts accounts) {

    }
    //TODO: get account Details
    public void getAccountDetails(Integer account_id) {

    }

    //TODO: List accounts
    public void getAccounts() {

    }
}
