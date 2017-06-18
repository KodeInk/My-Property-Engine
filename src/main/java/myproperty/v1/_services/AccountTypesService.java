/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.logging.Logger;
import myproperty.v1._dao.AccountTypesDaonImpl;
import myproperty.v1._entities.AccountTypes;
import myproperty.v1._entities.responses.AccountTypesResponse;

/**
 *
 * @author mover 6/17/2017
 */
public class AccountTypesService {

    private final AccountTypesDaonImpl accountTypesDaonImpl = AccountTypesDaonImpl.getInstance();

    private static final Logger LOG = Logger.getLogger(AccountTypesService.class.getName());

    //TODO: Get AccountType  
    public AccountTypesResponse findAccountType(String accountType) throws Exception {
        return accountTypesResponse(accountTypesDaonImpl.findAccountType(accountType));
    }

    public AccountTypesResponse accountTypesResponse(AccountTypes accountTypes) {
        AccountTypesResponse accountTypesResponse = new AccountTypesResponse();
        accountTypesResponse.setAccountType(accountTypes.getAccountType());
        accountTypesResponse.setId(accountTypes.getId());
        return accountTypesResponse;
    }

}
