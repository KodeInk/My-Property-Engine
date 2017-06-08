/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.util.List;
import myproperty.v1._entities.Address;
import myproperty.v1._entities.Person;

/**
 *
 * @author Mover
 */
public interface AddressDao {

    Address create(Address address) throws Exception;

    void deleteAddress(Integer id) throws Exception;

    Address edit(Address address) throws Exception;

    Address findAddress(Integer id) throws Exception;

    List<Address> findAddressEntities(int maxResults, int firstResult) throws Exception;

    List<Address> findAddressrEntities() throws Exception;

    public List<Address> findAddressesByUserId(Integer id) throws Exception;

    public List<Address> findAddresses(Integer parent_id, String parent_type) throws Exception;


}
