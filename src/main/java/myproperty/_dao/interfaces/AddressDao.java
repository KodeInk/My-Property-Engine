/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._dao.interfaces;

import java.util.List;
import myproperty._entities.Address;
import myproperty._entities.Person;

/**
 *
 * @author Mover
 */
public interface AddressDao {

    Address create(Address address) throws Exception;

    void deleteAddress(Integer id) throws Exception;

    Address edit(Address address) throws Exception;

    Address findAddress(Integer id) throws Exception;

    List<Person> findAddressEntities(int maxResults, int firstResult) throws Exception;

    List<Person> findAddressrEntities() throws Exception;

}
