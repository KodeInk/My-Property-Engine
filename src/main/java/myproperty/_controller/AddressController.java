/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._controller;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty._entities.Address;
import myproperty._entities.Person;
import myproperty._entities.responses.AddressResponse;
import myproperty._entities.responses.PersonResponse;
import myproperty._services.AddressService;
import myproperty._services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 *
 * @author Mover Date:5/30/2017
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    private static final Logger LOG = Logger.getLogger(AddressController.class.getName());

    @RequestMapping(value = "/list", method = GET)
    public Collection<AddressResponse> list() {
        return addressService.getAllAddresses();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AddressResponse getAddresById(@PathVariable("id") Integer id) throws Exception {
        LOG.log(Level.INFO, " Get Address By Id ");
        return addressService.getAddresById(id);
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AddressResponse updateAddressById(@RequestBody Address address, @PathVariable Integer id) throws Exception {
        LOG.log(Level.INFO, "Update Addresse Endpoint");
        return addressService.updateAddress(id, address);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AddressResponse createAddress(@RequestBody Address address) throws Exception {
        LOG.log(Level.INFO, " Create Address  Endpoint");
        return addressService.createAddress(address);
    }


}
