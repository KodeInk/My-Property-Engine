/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller;

import myproperty.v1._entities.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty.v1._entities.Address;
import myproperty.v1._entities.Contacts;
import myproperty.v1._entities.responses.AddressResponse;
import myproperty.v1._entities.responses.ContactsResponse;
import myproperty.v1._entities.responses.PersonResponse;
import myproperty.v1._services.AddressService;
import myproperty.v1._services.ContactsService;
import myproperty.v1._services.PersonService;
import myproperty.v1.helper.ParentTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author CODE MOVERS
 * @version 1.0
 * @since 3/12/2017
 * @email moverr@gmail.com
 *
 */

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private ContactsService contactsService;

    private static final Logger LOG = Logger.getLogger(UserController.class.getName());

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<PersonResponse> getPeople() {
        return personService.getAllPeople();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonResponse getPersonById(@PathVariable("id") Integer id) throws Exception {
        return personService.getPersonById(id);
    }

    @RequestMapping(value = "userId/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonResponse> getPersonByUserId(@PathVariable("userId") Integer userId) throws Exception {
        return personService.getPersonByUserId(userId);
    }


    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonResponse updatePersonById(@RequestBody Person person, @PathVariable Integer id) throws Exception {
        LOG.log(Level.INFO, "Hit the Person Update Endpoint");
        return personService.updatePerson(id, person);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonResponse createPerson(@RequestBody Person person) throws Exception {
        LOG.log(Level.INFO, "Hit the Person Create Endpoint");
        return personService.createPerson(person);
    }

    //@Note: the Id is the Person ID
    @RequestMapping(value = "/{id}/createAddress", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public AddressResponse createAddress(
            @RequestBody Address address,
            @PathVariable Integer id
    ) throws Exception {
        LOG.log(Level.INFO, " Create Address  Endpoint");
        return addressService.createAddress(address, ParentTypes.PERSON, id);
    }

    //TODO: GEt Address by Person Id 
    @RequestMapping(value = "/{id}/listAddresses", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<AddressResponse> listAddreses(
            @PathVariable Integer id) throws Exception {
        return addressService.getAllAddresses(ParentTypes.PERSON, id);
    }

    //@Note: the Id is the Person ID
    @RequestMapping(value = "/{id}/createContact", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ContactsResponse createContact(
            @RequestBody Contacts contacts,
            @PathVariable Integer id
    ) throws Exception {
        LOG.log(Level.INFO, " Create Address  Endpoint");
        return contactsService.createContacts(contacts, ParentTypes.PERSON, id);
    }

    //TODO: GEt Address by Person Id
    @RequestMapping(value = "/{id}/listContacts", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<ContactsResponse> listContacts(
            @PathVariable Integer id) throws Exception {
        return contactsService.getAllContacts(ParentTypes.PERSON, id);
    }



}
