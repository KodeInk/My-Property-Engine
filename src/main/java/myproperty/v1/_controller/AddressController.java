/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty.v1.db._entities.Address;
import myproperty.v1.db._entities.responses.AddressResponse;
import myproperty.v1._services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

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

    /*
    * 
    For NOw this ENd Point is Commented, because it exposes all the addresses in the System
    
     */
//    @RequestMapping(value = "/list", method = GET)
//    public Collection<AddressResponse> list() {
//        return addressService.getAllAddresses();
//    }

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

//    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public AddressResponse createAddress(@RequestBody Address address) throws Exception {
//        LOG.log(Level.INFO, " Create Address  Endpoint");
//        return addressService.createAddress(address);
//    }
//

}
