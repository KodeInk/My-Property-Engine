/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._dao.interfaces;

import java.io.Serializable;
import java.util.List;
import myproperty.v1.db._entities.Person;

/**
 *
 * @author mover
 */
public interface PersonDAO extends Serializable {

    Person create(Person person) throws Exception;

    void deletePerson(Integer id) throws Exception;

    Person edit(Person person) throws Exception;

    Person findPerson(Integer id) throws Exception;

    public List<Person> findPersonEntities() throws Exception;

    List<Person> findPersonEntities(int maxResults, int firstResult) throws Exception;

}
