/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.api;

import java.util.Collection;
import myproperty._entities.Person;
import myproperty._services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
public class PersonApi {

    @Autowired
    private PersonService person_service;

    @RequestMapping(value = "/getallpeople", method = RequestMethod.GET)
    public Collection<Person> getAllPeople(int offset, int limit) {
        return person_service.getAllPeople(offset, limit);
    }

}
