/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty.v1._dao.AccountsDaoImpl;
import myproperty.v1._controller.entities._account;
import myproperty.v1._controller.entities._login;
import myproperty.v1._dao.RolesDaoImpl;
import myproperty.v1._dao.UserDAOImpl;
import myproperty.v1._dao.UserRoleDaoImpl;
import myproperty.v1.db._entities.AccountTypes;
import myproperty.v1.db._entities.Accounts;
import myproperty.v1.db._entities.Contacts;
import myproperty.v1.db._entities.Packages;
import myproperty.v1.db._entities.Person;
import myproperty.v1.db._entities.Roles;
import myproperty.v1.db._entities.User;
import myproperty.v1.db._entities.UserRole;
import myproperty.v1.db._entities.responses.AccountPackageResponse;
import myproperty.v1.db._entities.responses.AccountTypesResponse;
import myproperty.v1.db._entities.responses.AccountsResponse;
import myproperty.v1.db._entities.responses.AuthenticationResponse;
import myproperty.v1.db._entities.responses.ContactsResponse;
import myproperty.v1.db._entities.responses.PersonResponse;
import myproperty.v1.db._entities.responses.UserResponse;
import myproperty.v1.helper.enums.AccountPackage;
import myproperty.v1.helper.enums.AccountType;
import myproperty.v1.helper.enums.ContactTypes;
import myproperty.v1.helper.enums.ParentTypes;
import myproperty.v1.helper.enums.RolesEnum;
import myproperty.v1.helper.enums.StatusEnum;
import myproperty.v1.helper.exception.BadRequestException;
import myproperty.v1.helper.exception.ForbiddenException;
import static myproperty.v1.helper.utilities.encryptPassword_md5;
import static myproperty.v1.helper.utilities.getCurrentDate;
import org.apache.tomcat.util.codec.binary.Base64;
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
    private UserResponse userResponse;
    private PersonResponse personResponse;
    private ContactsResponse contactsResponse;
    private AccountPackageResponse accountPackageResponse;

    private User user;
    private Contacts contacts;
    private Accounts accounts;

    private final AccountsDaoImpl accountsDaoImpl = AccountsDaoImpl.getInstance();
    private final UserDAOImpl userDAOImpl = UserDAOImpl.getInstance();
    private final RolesDaoImpl rolesDaoImpl = RolesDaoImpl.getInstance();
    private final UserRoleDaoImpl userRoleDaoImpl = UserRoleDaoImpl.getInstance();


    private static final Logger LOG = Logger.getLogger(AccountService.class.getName());

    @Autowired
    private UserService userService;

    @Autowired
    private PersonService personService;

    @Autowired
    private ContactsService contactsService;

    @Autowired
    private AccountTypesService accountTypesService;

    @Autowired
    private AccountPackageService accountPackageService;

    //TODO:Create _account
    public AccountsResponse createAccount(_account account) throws Exception {
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

        {
            try {
                Roles roles = rolesDaoImpl.findRoleByName(RolesEnum.ADMINISTRATOR.toString());             // Get Role By Name
                UserRole userrole = new UserRole();

                //TODO: Setup the User Roles which is administrator ::
                {
                    userrole.setUser(user);
                    userrole.setRole(roles);
                    userrole.setStatus(StatusEnum.ACTIVE.toString());
                    userRoleDaoImpl.create(userrole);
                }

            } catch (Exception em) {
                System.out.println("USER ROLE SAVING");
                System.out.println(em.toString());

                throw em;
            }
        }

        //STEP TWO: Create Empty Person [Profile]:
        {
            if (userResponse.getId() > 0) {

                person.setUser(user);
                person.setNames(account.getNames());
                person.setDateCreated(getCurrentDate());
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
                contacts.setDateCreated(getCurrentDate());
                contactsResponse = contactsService.createContacts(contacts, ParentTypes.PERSON, personResponse.getId());
                contacts.setId(contactsResponse.getId());
            }
        }
        //STEP FOUR : Create _account data
        //TODO:
        {
            // Check to see that User is Created, Profile is Created, and Contact Information is Created for this User
            //Checker 
            if ((userResponse.getId() > 0) && (personResponse.getId() > 0) && (contacts.getId() > 0)) {
                accounts = new Accounts();

                // Re Initialize the _account Owner :: 
                User account_owner = new User();
                account_owner.setId(userResponse.getId());
                account_owner.setUsername(userResponse.getUsername());
                accounts.setAccount_owner(account_owner);
                accounts.setDateCreated(getCurrentDate());

                //Set Created By
                accounts.setCreatedBy(account_owner.getId());

                // Set Status  ::
                accounts.setStatus(StatusEnum.ACTIVE.toString());
                //  account.setParentId(0);

                //todo: add Packages
                accountPackageResponse = accountPackageService.findAccountPackage(AccountPackage.BASIC.toString());
                Packages packages = new Packages();
                packages.setId(accountPackageResponse.getId());
                packages.setPackage_name(accountPackageResponse.getPackage_name());
                accounts.setPackageId(packages);

                //todo: add account types
                AccountTypesResponse accountTypesResponse = accountTypesService.findAccountType(AccountType.NORMAL.toString());
                AccountTypes accountTypes = new AccountTypes();
                accountTypes.setId(accountTypesResponse.getId());
                accountTypes.setAccountType(accountTypesResponse.getAccountType());
                accounts.setAccountTypeId(accountTypes);
                accounts = accountsDaoImpl.create(accounts);



            }
        }

        return getAccountsResponse(accounts);
        //TODO: Send Email to the User and Notify about _account Creation ::
    }

    //TODO: Activate _account
    /*
    Pass the account ID and activate or deaactivate ::
     */
    public AccountsResponse activateAccount(Integer account_id) throws Exception {
        if (account_id <= 0)
            throw new ForbiddenException("Account Id can not be empty ");

        Accounts account = accountsDaoImpl.findAccount(account_id);
        //Set _account Status to Active
        account.setStatus(StatusEnum.ACTIVE.toString());

        //TODO: Setting who updates :: functionality missing ::
        //Add date _account Updated 
        account.setDateUpdated(getCurrentDate());
        return getAccountsResponse(accountsDaoImpl.edit(account));

    }
    //TODO: Deactivate _account
    /*
    Pass the account ID and activate or deaactivate ::
     */
    public AccountsResponse deactivateAccount(Integer account_id) throws Exception {
        if (account_id <= 0) {
            throw new ForbiddenException("Account Id can not be empty ");
        }

        Accounts account = accountsDaoImpl.findAccount(account_id);
        //Set _account Status to Active
        account.setStatus(StatusEnum.DEACTIVATED.toString());

        //TODO: Setting who updates :: functionality missing ::
        //Add date _account Updated
        account.setDateUpdated(getCurrentDate());
        return getAccountsResponse(accountsDaoImpl.edit(account));
    }
    //TODO: update _account
    public AccountsResponse updateAccount(Integer account_id, Accounts _account) throws Exception {
        if (account_id <= 0) {
            throw new ForbiddenException("Account Id can not be empty ");
        }

        Accounts account = accountsDaoImpl.findAccount(account_id);
        if ((_account.getAccountTypeId() != null) && (_account.getAccountTypeId() != account.getAccountTypeId())) {
            account.setAccountTypeId(_account.getAccountTypeId());
        }

        if ((_account.getPackageId() != null) && (_account.getPackageId() != account.getPackageId())) {
            account.setPackageId(_account.getPackageId());
        }

        return getAccountsResponse(accountsDaoImpl.edit(account));
    }
    //TODO: get account Details
    public AccountsResponse getAccountDetails(Integer account_id) throws Exception {
        if (account_id <= 0) {
            throw new ForbiddenException("Account Id can not be empty ");
        }
        return getAccountsResponse(accountsDaoImpl.findAccount(account_id));
    }

    //TODO: List account
    public Collection<AccountsResponse> getAccounts() {
        Collection<AccountsResponse> accountsResponses = new ArrayList<>();
        Collection<Accounts> _accounts = accountsDaoImpl.findEntities();

        _accounts.forEach((account) -> {
            accountsResponses.add(getAccountsResponse(account));
        });

        return accountsResponses;
    }

    public AuthenticationResponse loginAccount(_login login) {
        //TODO: check to see that the username and password are not empty
        User user = null;
        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setIsLoggedIn(false);
        {
            {
                if (login.getPassword() == null || login.getUsername() == null) {
                    throw new BadRequestException("Fill in Blanks");
                }
            }

            {
                String _username = login.getUsername();
                String _password = encryptPassword_md5(login.getPassword());

//                System.out.println("++++++++++++++++++++++++++++++++");
//                System.out.println(_username);
//                System.out.println(_password);
//                System.out.println("++++++++++++++++++++++++++++++++");
//

                user = userDAOImpl.loginUser(_username, _password);
                System.out.println(user);

                if (user == null) {
                    throw new ForbiddenException("Username or Password is Invalid");
                }

                String authorization = convertToBasicAuth(_username, _password);
                authenticationResponse.setAuthorization(authorization);
                authenticationResponse.setIsLoggedIn(true);
            }

        }

        return authenticationResponse;
    }

    private String convertToBasicAuth(String username, String Password) {
        String authString = username + ":" + password;
        byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
        String authStringEnc = new String(authEncBytes);
        return ("Basic " + authStringEnc);
        //  String possibleAuthenticationKey = "Basic " + Base64.getEncoder().encodeToString(usernamePassowrd.trim().getBytes());

    }

    public AccountsResponse getAccountsResponse(Accounts accounts) {
        AccountsResponse accountsResponse = new AccountsResponse();

        accountsResponse.setId(accounts.getId());


        accountsResponse.setStatus(accounts.getStatus());
        accountsResponse.setDateCreated(accounts.getDateCreated());
        //accountsResponse.setCreatedBy(account.getCrea);
        if (accounts.getCreatedBy() > 0) {
            accountsResponse.setCreatedBy(accounts.getCreatedBy());
        }


        if (accounts.getAccount_owner().getId() > 0) {
            UserResponse _user = new UserResponse();
            _user.setId(accounts.getAccount_owner().getId());
            _user.setUsername(accounts.getAccount_owner().getUsername());
            _user.setStatus(accounts.getAccount_owner().getStatus());
            _user.setDateCreated(accounts.getAccount_owner().getDateCreated());
            accountsResponse.setUser(_user);
        }




        if (accounts.getCreatedBy() > 0) {
            accountsResponse.setCreatedBy(accounts.getCreatedBy());
        }

        if (accounts.getUpdatedBy() != null) {
            accountsResponse.setUpdatedBy(accounts.getUpdatedBy());
        }

        accountsResponse.setDateUpdated(accounts.getDateUpdated());



        return accountsResponse;
    }
}
