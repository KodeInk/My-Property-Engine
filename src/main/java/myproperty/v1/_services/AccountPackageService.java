/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.logging.Logger;
import myproperty.v1._dao.AccountPackagesDaoImpl;
import myproperty.v1._entities.Packages;
import myproperty.v1._entities.responses.AccountPackageResponse;

/**
 *
 * @author mover 6/18/2017
 */
public class AccountPackageService {

    private final AccountPackagesDaoImpl accountPackagesDaoImpl = AccountPackagesDaoImpl.getInstance();

    private static final Logger LOG = Logger.getLogger(AccountPackageService.class.getName());

    //TODO: Get AccountType
    public AccountPackageResponse findAccountPackage(String package_name) throws Exception {
        return accountPackagesResponse(accountPackagesDaoImpl.findPackagebyName(package_name));
    }

    // Package Response 
    public AccountPackageResponse accountPackagesResponse(Packages packages) {
        AccountPackageResponse accountPackageResponse = new AccountPackageResponse();
        accountPackageResponse.setId(packages.getId());
        accountPackageResponse.setPackage_name(packages.getPackage_name());
        return accountPackageResponse;
    }


}
