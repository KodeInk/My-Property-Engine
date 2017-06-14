/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty.v1._entities.Account;
import myproperty.v1._entities.Accounts;
import myproperty.v1.helper.exception.BadRequestException;
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

    private static final Logger LOG = Logger.getLogger(AccountService.class.getName());

    //TODO:Create Account
    public void createAccount(Account account) {
        //STEP ONE: Create User Username and Password:
        // Check to see that Email Address does not exist ::


        names = account.getNames();
        email_address = account.getEmail_address();
        password = account.getPassword();
        //Check to see that Mandatory Fields are filled 
        if (names.length() <= 2 || email_address.length() <= 4 || password.length() <= 4) {
            LOG.log(Level.INFO, "Crate New Account Service Level Method Hit ");
            throw new BadRequestException("Failed because of missing mandatory fields ");
        }
        //Check in the Database to see that there is no active user with this email address ::



        //STEP TWO: Create Empty Person [Profile]:
        //STEP THREE: Create Contact Information Email Address:
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
