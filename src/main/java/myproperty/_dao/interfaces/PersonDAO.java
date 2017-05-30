/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._dao.interfaces;

import java.io.Serializable;
import java.util.List;
import myproperty._entities.Person;

/**
 *
 * @author mover
 */
public interface PersonDAO extends Serializable {

    Person create(Person person) throws Exception;

    void deletePerson(Integer id) throws Exception;

    Person edit(Person person) throws Exception;

    Person findPerson(Integer id) throws Exception;

    public List<Person> findUserEntities() throws Exception;

    List<Person> findUserEntities(int maxResults, int firstResult) throws Exception;

}
