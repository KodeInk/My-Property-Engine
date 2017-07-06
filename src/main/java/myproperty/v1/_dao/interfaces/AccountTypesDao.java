/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.util.List;
import myproperty.v1.db._entities.AccountTypes;

/**
 *
 * @author Manny
 */
public interface AccountTypesDao {

    AccountTypes create(AccountTypes accountTypes) throws Exception;

    AccountTypes edit(AccountTypes accountTypes) throws Exception;

    AccountTypes findAccountType(String accountType) throws Exception;

    AccountTypes findAccountTypes(Integer id) throws Exception;

    List<AccountTypes> findAccountTypesEntities() throws Exception;

    List<AccountTypes> findAccountTypesEntities(int maxResults, int firstResult) throws Exception;

}
