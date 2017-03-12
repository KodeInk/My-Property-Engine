/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._services;

import java.util.Collection;
import myproperty._dao.PersonDAO;
import myproperty._entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author CODE MOVERS
 * @version 1.0
 * @since 3/12/2017
 * @email moverr@gmail.com
 *
 */
@Service
public class PersonService {

    @Autowired
    private PersonDAO person_dao;
    public Collection<Person> getAllPeople(int offset, int limit) {
        return person_dao.getAllPeople(offset, limit);
    }

    public Person getPersonById(int id) {
        return this.person_dao.getPersonById(id);
    }


}
