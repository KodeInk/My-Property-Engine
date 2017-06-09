/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty.v1._entities.Contacts;
import myproperty.v1._entities.responses.ContactsResponse;
import myproperty.v1._services.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mover 6/9/2017
 */
@RestController
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    private ContactsService contactsService;

    private static final Logger LOG = Logger.getLogger(ContactsController.class.getName());

    /*
    *
    For NOw this ENd Point is Commented, because it exposes all the contacts in the System

     */
    @RequestMapping(value = "/list", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<ContactsResponse> list() {
        return contactsService.getAllContacts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ContactsResponse getContactById(@PathVariable("id") Integer id) throws Exception {
        LOG.log(Level.INFO, " Get Contact  By Id ");
        return contactsService.getContactById(id);
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ContactsResponse updateAddressById(@RequestBody Contacts contacts, @PathVariable Integer id) throws Exception {
        LOG.log(Level.INFO, "Update Contacts  Endpoint");
        return contactsService.updateContacts(id, contacts);
    }

//    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public AddressResponse createAddress(@RequestBody Address address) throws Exception {
//        LOG.log(Level.INFO, " Create Address  Endpoint");
//        return contactsService.createAddress(address);
//    }
//

}
