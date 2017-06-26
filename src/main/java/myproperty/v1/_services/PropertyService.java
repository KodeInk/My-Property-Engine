/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;
import myproperty.v1._dao.PropertyDaoImpl;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.Property;
import myproperty.v1._entities.responses.AccountResponse;
import myproperty.v1._entities.responses.AccountsResponse;
import myproperty.v1._entities.responses.PersonResponse;
import myproperty.v1._entities.responses.PropertyResponse;
import myproperty.v1._entities.responses.UserResponse;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mover 6/24/2017
 */
@Service
public class PropertyService {

    private final PropertyDaoImpl propertyDaoImpl = PropertyDaoImpl.getInstance();
    private static final Logger LOG = Logger.getLogger(PropertyService.class.getName());

    //TODO: Fetch all  Property
    public Collection<PropertyResponse> getAllProperties() {
        Collection<Property> property = propertyDaoImpl.findEntities();
        Collection<PropertyResponse> propertyResponses = new ArrayList<>();
        //java 8 functional statement
        property.forEach((Property p) -> {
            propertyResponses.add(propertyResponse(p));
        });
        return propertyResponses;
    }

    //TODO: Fetch all  Property in a given account :: 
    public Collection<PropertyResponse> getAllPropertiesByAccountId(Integer accountId) {
        Collection<Property> property = propertyDaoImpl.findPropertyEntitiesByAccountId(accountId, -1, -1);
        Collection<PropertyResponse> propertyResponses = new ArrayList<>();
        //java 8 functional statement
        property.forEach((Property p) -> {
            propertyResponses.add(propertyResponse(p));
        });
        return propertyResponses;
    }

    //TODO: Fetch all  Property in post by a given user ::
    public Collection<PropertyResponse> getAllPropertiesByUserId(Integer userid) {
        Collection<Property> property = propertyDaoImpl.findPropertyEntitiesByUserId(userid, -1, -1);
        Collection<PropertyResponse> propertyResponses = new ArrayList<>();
        //java 8 functional statement
        property.forEach((Property p) -> {
            propertyResponses.add(propertyResponse(p));
        });
        return propertyResponses;
    }

    //TODO : get Property  By Id
    public PropertyResponse getPropertyById(Integer id) throws Exception {
        Property property = propertyDaoImpl.findProperty(id);
        return propertyResponse(property);
    }


    public PropertyResponse propertyResponse(Property property) {

        PropertyResponse propertyResponse = new PropertyResponse();
        
        propertyResponse.setId(property.getId());
        propertyResponse.setDateCreated(property.getDateCreated());
        propertyResponse.setDateUpdated(property.getDateUpdated());
        propertyResponse.setBrief(property.getBrief());
        propertyResponse.setStatus(property.getStatus());
        propertyResponse.setDetails(property.getDetails());

        AccountsResponse accountResponse = new AccountsResponse();

        accountResponse.setId(property.getAccount().getId());
        accountResponse.setParentId(property.getAccount().getParentId());
        accountResponse.setStatus(property.getAccount().getStatus());

        propertyResponse.setAccountResponse(accountResponse);

        return null;
    }

}
