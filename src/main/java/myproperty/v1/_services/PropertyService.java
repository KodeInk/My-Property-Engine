/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;
import myproperty.v1._controller.entities._property;
import myproperty.v1._controller.entities._property_size;
import myproperty.v1._dao.PropertyDaoImpl;
import myproperty.v1._dao.PropertySizeDaoImpl;
import myproperty.v1.db._entities.Accounts;
import myproperty.v1.db._entities.Property;
import myproperty.v1.db._entities.PropertySize;
import myproperty.v1.db._entities.PropertyTypes;
import myproperty.v1.db._entities.User;
import myproperty.v1.db._entities.responses.PropertyResponse;
import myproperty.v1.helper.StatusEnum;
import myproperty.v1.helper.exception.BadRequestException;
import myproperty.v1.helper.exception.InternalErrorException;
import myproperty.v1.helper.exception.NotFoundException;
import static myproperty.v1.helper.utilities.getCurrentDate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mover 6/24/2017
 */
@Service
public class PropertyService {

    private final PropertyDaoImpl propertyDaoImpl = PropertyDaoImpl.getInstance();

    private final PropertySizeDaoImpl propertySizeDaoImpl = PropertySizeDaoImpl.getInstance();

    private static final Logger LOG = Logger.getLogger(PropertyService.class.getName());

    //TODO: Create new Property
    public PropertyResponse updateProperty(Integer property_id, Property property) {

        try {
        property.setId(property_id);
        Property _property = null;

            _property = propertyDaoImpl.findProperty(property_id);


        if (property.getBrief() != null) {
            _property.setBrief(property.getBrief());
        }

        if (property.getDetails() != null) {
            _property.setDetails(property.getDetails());
        }

        _property.setDateUpdated(getCurrentDate());

            return propertyResponse(propertyDaoImpl.edit(_property));
        } catch (NullPointerException ex) {
            throw new NotFoundException("Record not found in the database ");
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
            throw new InternalErrorException("Something went wrong");

        }

    }


    //TODO: Create new Property
    public PropertyResponse createProperty(_property _property) throws Exception {

        //TODO: convert Pojo to Database Entity
        Property property = GeneratePropertyEntity(_property);

//        //TODO: Create Property Size
        if (property.getBrief().isEmpty() || property.getDetails().isEmpty()) {
            throw new BadRequestException("Mandatory Fields are missing");
        }

        property.setDateCreated(getCurrentDate());
        property.setStatus(StatusEnum.ACTIVE.toString());

        property = propertyDaoImpl.create(property);

        if (property != null) {
            //Create Property Size
            _property_size[] propertySizes = _property.getProperty_size();

            PropertySize propertySize = new PropertySize();

            for (_property_size _propertySize : propertySizes) {
                propertySize.setProperty(property);
                propertySize.setSize(_propertySize.getSize());
                propertySize.setUnitMeasure(_propertySize.getUnitMeasure());

                propertySizeDaoImpl.create(propertySize);
                propertySize = null;
            }
            return propertyResponse(property);

        } else {
            throw new InternalErrorException("Something Went Wrong, Could not Save the Property");
        }


    }

    private Property GeneratePropertyEntity(_property _property) {
        Property property = new Property();
        property.setBrief(_property.getBrief());
        property.setDetails(_property.getDetails());

        User user = new User();
        user.setId(_property.getUserId());
        property.setUser(user);

        Accounts accounts = new Accounts();
        accounts.setId(_property.getAccountId());
        property.setAccount(accounts);

        PropertyTypes propertyTypes = new PropertyTypes(_property.getType());
        property.setType(propertyTypes);

        property.setBrief(_property.getBrief());
        property.setBrief(_property.getBrief());
        property.setBrief(_property.getBrief());
        property.setBrief(_property.getBrief());
        property.setBrief(_property.getBrief());

        return property;
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
    public PropertyResponse getPropertyById(Integer id) {
        try {
        Property property = propertyDaoImpl.findProperty(id);
            return propertyResponse(property);
        } catch (NullPointerException ex) {
            return propertyResponse(null);
        } catch (Exception ex) {
            throw new InternalError("Something went wrong ");
        }

    }


    public PropertyResponse propertyResponse(Property property) {

        if (property == null) {
            return null;
        }

        PropertyResponse propertyResponse = new PropertyResponse();
        propertyResponse.setId(property.getId());
        propertyResponse.setDateCreated(property.getDateCreated());
        propertyResponse.setDateUpdated(property.getDateUpdated());
        propertyResponse.setBrief(property.getBrief());
        propertyResponse.setStatus(property.getStatus());
        propertyResponse.setDetails(property.getDetails());

        propertyResponse.setProperty_type(property.getType().getType());
        // concentrate on the property : 
        propertyResponse.setAccountId(property.getAccount().getId());
        propertyResponse.setUserId(property.getUser().getId());

        return propertyResponse;
    }

}
