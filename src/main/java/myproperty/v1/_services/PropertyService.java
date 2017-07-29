/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.text.Utilities;
import myproperty.v1._controller.entities._property;
import myproperty.v1._controller.entities._property_size;
import myproperty.v1._dao.AccountsDaoImpl;
import myproperty.v1._dao.AddressDaoImpl;
import myproperty.v1._dao.PropertyDaoImpl;
import myproperty.v1._dao.PropertySizeDaoImpl;
import myproperty.v1._dao.PropertyTypesDaoImpl;
import myproperty.v1.db._entities.Accounts;
import myproperty.v1.db._entities.Address;
import myproperty.v1.db._entities.Property;
import myproperty.v1.db._entities.PropertySize;
import myproperty.v1.db._entities.PropertyTypes;
import myproperty.v1.db._entities.User;
import myproperty.v1.db._entities.responses.PropertyResponse;
import myproperty.v1.db._entities.responses.PropertySizeResponse;
import myproperty.v1.helper.enums.ParentTypes;
import myproperty.v1.helper.enums.StatusEnum;
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
    private final PropertyTypesDaoImpl propertyTypesDaoImpl = PropertyTypesDaoImpl.getInstance();
    private final AddressDaoImpl addressDaoImpl = AddressDaoImpl.getInstance();


    private static final Logger LOG = Logger.getLogger(PropertyService.class.getName());
    private final AccountsDaoImpl accountsDaoImpl = AccountsDaoImpl.getInstance();


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

        //TODO: Validate Mandatories\\
        _property.validate_property();
        //TODO: convert Pojo to Database Entity
        Property property = new Property();
        try {
            property.setBrief(_property.getBrief());
            property.setDetails(_property.getDetails());

            //TODO: Check that the User Exists ::
            // this might change to the logged in user no need to send it from the client
            User user = new User(_property.getUser());
            property.setUser(user);

            //TODO: Check if account exists and also that the account is Active 
            Accounts account = accountsDaoImpl.findAccount(_property.getAccount());
            if (account.getId() == null) {
                throw new BadRequestException("Associated Account does not exist");
            }
            property.setAccount(account);

            PropertyTypes propertyTypes = propertyTypesDaoImpl.findPropertyType(_property.getType());
            if (propertyTypes.getId() == null) {
                throw new BadRequestException("Invalid Property Type");
            }
            property.setType(propertyTypes);

            property.setBrief(_property.getBrief());
            property.setBrief(_property.getBrief());
            property.setBrief(_property.getBrief());
            property.setBrief(_property.getBrief());
            property.setBrief(_property.getBrief());
        } catch (Exception em) {
            System.out.println("ERROR");
            throw em;
        }
        //TODO: Create Property Size
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

            Collection<PropertySize> collection = new ArrayList<>();

            // Create Property Size
            for (_property_size _propertySize : propertySizes) {
                propertySize.setProperty(property);
                propertySize.setSize(_propertySize.getSize());
                propertySize.setUnitMeasure(_propertySize.getUnitMeasure());
                propertySizeDaoImpl.create(propertySize);
                collection.add(propertySize);
                propertySize = null;
            }
            property.setPropertySizeCollection(collection);

            // Create Property Address ::
            Address address = new Address();
            if (!_property.getLocation().isEmpty() || _property.getLocation() != null) {
                address.setLocation(_property.getLocation());
            }

            if ((!_property.getLat().isEmpty() || _property.getLat() != null) && (!_property.getLng().isEmpty() || _property.getLng() != null)) {
                address.setLng(_property.getLng());
                address.setLat(_property.getLat());
            }

            // Set Addresss to the System
            address.setParentId(property.getId());
            address.setParentType(ParentTypes.PROPERTY.toString());
            address.setStatus(StatusEnum.ACTIVE.toString());
            address.setCreatedby(property.getUser());
            address.setDatecreated(new Date());
            address = addressDaoImpl.create(address);


            return propertyResponse(property);

        } else {
            throw new InternalErrorException("Something Went Wrong, Could not Save the Property");
        }


    }

    private Property GeneratePropertyEntity(_property _property) throws Exception {
        Property property = new Property();
        property.setBrief(_property.getBrief());
        property.setDetails(_property.getDetails());

        User user = new User();
        user.setId(_property.getUser());
        property.setUser(user);

        Accounts account = accountsDaoImpl.findAccount(_property.getAccount());
        if (account.getId() != null) {
            property.setAccount(account);
        }


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

        String property_type = property.getType().getType();
        propertyResponse.setProperty_type(property_type);
        // concentrate on the property : 
        propertyResponse.setAccountId(property.getAccount().getId());
        propertyResponse.setUserId(property.getUser().getId());

        PropertySizeResponse propertySizeResponse = new PropertySizeResponse();
        PropertySizeResponse[] propertySizeResponses;
        //new PropertySizeResponse[]()

        Integer counter = 0;
        if (!property.getPropertySizeCollection().isEmpty()) {
            propertySizeResponses = new PropertySizeResponse[property.getPropertySizeCollection().size()];

            for (PropertySize propertySize : property.getPropertySizeCollection()) {
                propertySizeResponse.setId(propertySize.getId());
                propertySizeResponse.setSize(propertySize.getSize());
                propertySizeResponse.setUnitMeasure(propertySize.getUnitMeasure());
                propertySizeResponses[counter] = propertySizeResponse;
                counter++;
            }
            propertyResponse.setPropertySizeResponses(propertySizeResponses);
        }

        // property location: address system ::
        try {
        List<Address> addresses = addressDaoImpl.findAddresses(property.getId(), ParentTypes.PROPERTY.toString());

            // Set Adress 
        if (addresses.size() > 0) {
            Address address = addresses.get(0);
            propertyResponse.setLocation(address.getLocation());
            propertyResponse.setLat(address.getLat());
            propertyResponse.setLng(address.getLng());

            }
        } catch (Exception e) {
            System.out.println("Was not Able to retrieve  Property Address");
            propertyResponse.setLocation(null);
            propertyResponse.setLat(null);
            propertyResponse.setLng(null);
        }


        // property size ::

        return propertyResponse;
    }

}
