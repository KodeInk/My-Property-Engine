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
import myproperty._entities.UserResponse;
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
            if (person == null) {
                return personResponse;
            }

            personResponse.setId(person.getId());
            personResponse.setNames(person.getNames());
            personResponse.setGender(person.getGender());
            personResponse.setDateofbirth(person.getDateofbirth());

            // User Details 
            UserResponse _user = new UserResponse();
            _user.setUsername(person.getUser().getUsername());
            _user.setId(person.getUser().getId());
            _user.setDateCreated(person.getUser().getDateCreated());
            personResponse.setUser(_user);

            //Created Information
            personResponse.setDateCreated(person.getDateCreated());
            UserResponse _createdBy = new UserResponse();
            _createdBy.setUsername(person.getCreatedBy().getUsername());
            _createdBy.setId(person.getCreatedBy().getId());
            _createdBy.setDateCreated(person.getCreatedBy().getDateCreated());
            personResponse.setCreatedBy(_createdBy);

            //Updated Information
            personResponse.setDateUpdated(person.getDateUpdated());
            UserResponse _updatedBy = new UserResponse();
            _updatedBy.setUsername(person.getUpdatedBy().getUsername());
            _updatedBy.setId(person.getUpdatedBy().getId());
            _updatedBy.setDateCreated(person.getUpdatedBy().getDateCreated());
            personResponse.setUpdatedBy(_updatedBy);

            return personResponse;

    }


}
