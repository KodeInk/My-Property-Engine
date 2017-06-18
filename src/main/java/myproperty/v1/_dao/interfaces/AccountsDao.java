/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.util.List;
import myproperty.v1._entities.Accounts;

/**
 *
 * @author mover 6/15/2017
 */
public interface AccountsDao {

    Accounts create(Accounts accounts) throws Exception;

    // this is total remove:
    void deleteAccounts(Integer id) throws Exception;

    Accounts edit(Accounts accounts) throws Exception;

    Accounts findAccounts(Integer id) throws Exception;

    List<Accounts> findAccountsEntities(int maxResults, int firstResult) throws Exception;

    List<Accounts> findAccountsrEntities() throws Exception;

}
