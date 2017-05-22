/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._controller;

import myproperty._entities.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import myproperty._entities.PersonResponse;
import myproperty._entities.User;
import myproperty._entities.UserResponse;
import myproperty._services.PersonService;
import myproperty._services.UserService;
import myproperty.helper.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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

    private static final Logger LOG = Logger.getLogger(UserController.class.getName());

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<UserResponse> getPeople() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse getPersonById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    //Delete has issues:
    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public Boolean deletePersonById(@PathVariable("id") int id) throws Exception {
        userService.deleteUserById(id);
        return true;
    }

    @RequestMapping(value = "/{id}/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonResponse updatePersonById(@RequestBody Person person, @RequestParam Integer id) throws Exception {
        LOG.log(Level.INFO, "Hit the User Update Endpoint");
        return personService.updatePerson(id, person);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse createPerson(@RequestBody User user) {
        try {
            return userService.createUser(user);
        } catch (Exception em) {
            throw new BadRequestException("User was not saved correctly  ");
        }
    }

    /*
        Everything will be based on permission some one has on the system:
     */

}
