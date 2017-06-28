/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty.v1._entities.Person;
import myproperty.v1._entities.Property;
import myproperty.v1._entities.responses.PersonResponse;
import myproperty.v1._entities.responses.PropertyResponse;
import myproperty.v1._services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mover 6/27/2017
 */
@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    private static final Logger LOG = Logger.getLogger(PropertyController.class.getName());

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<PropertyResponse> getProperty() {
        return propertyService.getAllProperties();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PropertyResponse getPropertyById(@PathVariable("id") Integer id) throws Exception {
        return propertyService.getPropertyById(id);
    }

    @RequestMapping(value = "/accountId/{accountid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<PropertyResponse> getPropertyByAccountId(@PathVariable("accountid") Integer accountId) throws Exception {
        return propertyService.getAllPropertiesByAccountId(accountId);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<PropertyResponse> getPropertyByUserId(@PathVariable("userId") Integer userId) throws Exception {
        return propertyService.getAllPropertiesByUserId(userId);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PropertyResponse createProperty(@RequestBody Property property) throws Exception {
        return propertyService.createProperty(property);
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PropertyResponse updatePropertyById(@RequestBody Property property, @PathVariable Integer id) throws Exception {
        LOG.log(Level.INFO, "Hit the Person Update Endpoint");
        return propertyService.updateProperty(id, property);
    }




}
