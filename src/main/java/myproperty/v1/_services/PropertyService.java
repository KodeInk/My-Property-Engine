/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;
import myproperty.v1._dao.PropertyDaoImpl;
import myproperty.v1._entities.Property;
import myproperty.v1._entities.responses.PropertyResponse;
import static myproperty.v1.helper.utilities.getCurrentDate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mover 6/24/2017
 */
@Service
public class PropertyService {

    private final PropertyDaoImpl propertyDaoImpl = PropertyDaoImpl.getInstance();
    private static final Logger LOG = Logger.getLogger(PropertyService.class.getName());

    //TODO: Create new Property
    public PropertyResponse updateProperty(Integer property_id, Property property) throws Exception {

        property.setId(property_id);
        Property _property = propertyDaoImpl.findProperty(property_id);

        if (property.getBrief() != null) {
            _property.setBrief(property.getBrief());
        }

        if (property.getDetails() != null) {
            _property.setDetails(property.getDetails());
        }

        _property.setDateUpdated(getCurrentDate());

        return propertyResponse(propertyDaoImpl.edit(_property));
    }


    //TODO: Create new Property
    public PropertyResponse createProperty(Property property) throws Exception {
        property.setDateCreated(getCurrentDate());
        return propertyResponse(propertyDaoImpl.create(property));
    }

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

        // concentrate on the property : 
        propertyResponse.setAccountId(property.getAccount().getId());
        propertyResponse.setUserId(property.getUser().getId());

        return propertyResponse;
    }

}
