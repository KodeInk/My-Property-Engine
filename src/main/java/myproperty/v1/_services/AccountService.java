/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import myproperty.v1._entities.Account;
import myproperty.v1._entities.Accounts;
import org.springframework.stereotype.Service;

/**
 *
 * @author mover 6/13/2017
 */
@Service
public class AccountService {

    //TODO:Create Account
    public void createAccount(Account account) {
        //STEP ONE: Create User Username and Password:

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
