/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.util.List;
import myproperty.v1._entities.Contacts;

/**
 *
 * @author Mover 6/8/2017
 */
public interface ContactsDAO {

    Contacts create(Contacts contacts) throws Exception;

    void deleteContacts(Integer id) throws Exception;

    Contacts edit(Contacts contacts) throws Exception;

    Contacts findContacts(Integer id) throws Exception;

    List<Contacts> findContactsEntities(int maxResults, int firstResult) throws Exception;

    List<Contacts> findContactses(Integer parent_id, String parent_type) throws Exception;

    List<Contacts> findContactsesByUserId(Integer userId) throws Exception;

    List<Contacts> findContactsrEntities() throws Exception;

}
