/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import myproperty.v1._dao.AddressDaoImpl;
import myproperty.v1._entities.Address;
import myproperty.v1._entities.responses.AddressResponse;
import myproperty.v1._entities.responses.UserResponse;
import myproperty.v1.helper.ParentTypes;
import myproperty.v1.helper.StatusEnum;
import static myproperty.v1.helper.utilities.getCurrentDate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mover
 * @since 5/30/2017
 */
@Service
public class AddressService {

    private final AddressDaoImpl addressDaoImpl = AddressDaoImpl.getInstance();

    //TODO: Fetch all  Users
    public Collection<AddressResponse> getAllAddresses() {

        Collection<Address> addresses = addressDaoImpl.findEntities();

        Collection<AddressResponse> addressResponses = new ArrayList<>();
        //java 8 functional statement
        addresses.forEach((Address address) -> {
            addressResponses.add(AddressResponse(address));
        });

        return addressResponses;
    }

    //TODO :  get Address by Id 
    public AddressResponse getAddresById(Integer id) throws Exception {
        Address address = addressDaoImpl.findAddress(id);
        return AddressResponse(address);
    }



    //TODO : get Address by User iD 
    public Collection<AddressResponse> getAddressByUserId(Integer userId) throws Exception {

        Collection<Address> addresses = addressDaoImpl.findAddressesByUserId(userId);

        Collection<AddressResponse> addressResponses = new ArrayList<>();
        //java 8 functional statement
        addresses.forEach((Address address) -> {
            addressResponses.add(AddressResponse(address));
        });
        return addressResponses;

    }

    //TODO: update Address
    public AddressResponse updateAddress(Integer addressId, Address address) throws Exception {

        address.setId(addressId);

        Address _Address = addressDaoImpl.findAddress(addressId);

        if (address.getLocation() != null) {
            _Address.setLocation(address.getLocation());
        }

        if (address.getLat() != null) {
            _Address.setLat(address.getLat());
        }

        if (address.getLng() != null) {
            _Address.setLng(address.getLng());
        }

        if (address.getUpdatedby() != null) {
            _Address.setUpdatedby(address.getUpdatedby());
            Date dateUpdate = getCurrentDate();
            _Address.setDateupdated(dateUpdate);
        }

        Address _address = addressDaoImpl.edit(_Address);

        return AddressResponse(_address);
    }

    //TODO: Create Address
    public AddressResponse createAddress(Address address, ParentTypes parentTypes, Integer parent_id) throws Exception {
        address.setDatecreated(getCurrentDate());
        if (address.getStatus() == null) {
            address.setStatus(StatusEnum.ACTIVE.toString());
        }
        address.setParentType(parentTypes.toString());
        address.setParentId(parent_id);


        return AddressResponse(addressDaoImpl.create(address));

        // return AddressResponse(address1);

    }

    //TODO: Address  Response
    public AddressResponse AddressResponse(Address address) {

        AddressResponse addressResponse = new AddressResponse();
        if (address == null) {
            return addressResponse;
        }

        addressResponse.setId(address.getId());
        addressResponse.setLocation(address.getLocation());
        addressResponse.setLat(address.getLat());
        addressResponse.setLng(address.getLng());

        // User Details
        if (address.getCreatedby() != null) {
            UserResponse _user = new UserResponse();

            _user.setUsername(address.getCreatedby().getUsername());
            _user.setId(address.getCreatedby().getId());
            _user.setDateCreated(address.getCreatedby().getDateCreated());
            addressResponse.setCreatedby(_user);
        }
        //Created Information
        addressResponse.setDatecreated(address.getDatecreated());

        //Updated Information
        addressResponse.setDateupdated(address.getDateupdated());

        if (address.getUpdatedby() != null) {
            UserResponse _updatedBy = new UserResponse();
            _updatedBy.setUsername(address.getUpdatedby().getUsername());
            _updatedBy.setId(address.getUpdatedby().getId());
            _updatedBy.setDateCreated(address.getUpdatedby().getDateCreated());
            addressResponse.setUpdatedby(_updatedBy);
        }

        addressResponse.setStatus(address.getStatus());
        addressResponse.setParent_id(address.getParentId());
        addressResponse.setParent_type(address.getParentType());

        return addressResponse;

    }




}
