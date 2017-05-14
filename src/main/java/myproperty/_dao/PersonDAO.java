/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._dao;

import myproperty._entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author CODE MOVERS
 * @version 1.0
 * @since 3/12/2017
 * @email moverr@gmail.com
 *
 */
@Repository
public class PersonDAO {

    @Autowired
    private static Map<Integer, Person> person;

    public Collection<Person> getAllPeople(int offset, int limit) {
        return null;
    }

    public Person getPersonById(int id) {
        return this.person.get(id);
    }


}
