/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._services;

import java.util.ArrayList;
import myproperty._entities.Person;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.logging.Logger;
import myproperty._dao.PersonDAOImpl;
import myproperty._entities.PersonResponse;
import static myproperty.helper.utilities.getCurrentDate;

/**
 * mover
 *
 */
@Service
public class PersonService {

    private final PersonDAOImpl personDAOImpl = PersonDAOImpl.getInstance();
    private static final Logger LOG = Logger.getLogger(UserService.class.getName());

    //TODO: Fetch all  Users
    public Collection<PersonResponse> getAllPeople() {

        Collection<Person> people = personDAOImpl.findEntities();

        Collection<PersonResponse> personResponses = new ArrayList<>();
        //java 8 functional statement
        people.forEach((Person person) -> {
            personResponses.add(PersonResponse(person));
        });

        return personResponses;
    }

    //TODO : get Person  By Id
    public PersonResponse getPersonById(Integer id) throws Exception {
        return PersonResponse(personDAOImpl.findPerson(id));
    }


    //TODO: update Person By Id
    public PersonResponse updatePerson(Integer personId, Person person) throws Exception {

        person.setId(personId);
        return PersonResponse(personDAOImpl.edit(person));
    }

    //TODO: Create Person
    public PersonResponse createPerson(Person person) throws Exception {
        person.setDateCreated(getCurrentDate());
        return PersonResponse(personDAOImpl.create(person));
    }

    //TODO: Person Response 
    public PersonResponse PersonResponse(Person person) {
        PersonResponse personResponse = new PersonResponse();

        personResponse.setId(person.getId());
        personResponse.setNames(person.getNames());
        personResponse.setGender(person.getGender());
        personResponse.setDateofbirth(person.getDateofbirth());
        personResponse.setUserId(person.getUserId());


        personResponse.setDateCreated(person.getDateCreated());
        personResponse.setCreatedBy(person.getCreatedBy());
        personResponse.setDateUpdated(person.getDateUpdated());
        personResponse.setUpdatedBy(person.getCreatedBy());
        return personResponse;
    }


}
