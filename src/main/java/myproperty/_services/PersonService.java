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
import java.util.List;
import java.util.logging.Logger;
import myproperty._dao.PersonDAOImpl;
import myproperty._entities.PersonResponse;
import myproperty._entities.UserResponse;
import myproperty.helper.exception.BadRequestException;
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
        Person person = personDAOImpl.findPerson(id);
        return PersonResponse(person);
    }

    //TODO : get Person  By  User Id
    public List<PersonResponse> getPersonByUserId(Integer userId) throws Exception {
        List<Person> persons = personDAOImpl.findPersonByUserid(userId);
        List<PersonResponse> personResponses = new ArrayList<>();

        persons.forEach((p) -> {
            personResponses.add(PersonResponse(p));
        });

        return personResponses;

    }



    //TODO: update Person By Id
    public PersonResponse updatePerson(Integer personId, Person person) throws Exception {

        person.setId(personId);

        Person _person = personDAOImpl.findPerson(personId);

        if (person.getNames() != null) {
            _person.setNames(person.getNames());
        }

        if (person.getGender() != null) {
            _person.setGender(person.getGender());
        }
        if (person.getDateofbirth() != null) {
            _person.setDateofbirth(person.getDateofbirth());
        }

        if (person.getUpdatedBy() != null) {
            _person.setUpdatedBy(person.getUpdatedBy());
        }

        if (person.getDateUpdated() != null) {
            _person.setDateUpdated(person.getDateUpdated());
        }

        return PersonResponse(personDAOImpl.edit(_person));
    }


    //TODO: Create Person
    public PersonResponse createPerson(Person person) throws Exception {
        person.setDateCreated(getCurrentDate());

        /*
        Check if Personal Details exist for this User, if so, You Cant Create another Person with the same User ID
         */
        List<PersonResponse> personResponses = getPersonByUserId(person.getUser().getId());
        if (!personResponses.isEmpty()) {
            throw new BadRequestException("Personal Details with this User Id Already Exists, Probably Update Them");
        }

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
        if (person.getUser() != null) {
            UserResponse _user = new UserResponse();
            _user.setUsername(person.getUser().getUsername());
            _user.setId(person.getUser().getId());
            _user.setDateCreated(person.getUser().getDateCreated());
            personResponse.setUser(_user);
        }

            //Created Information
            personResponse.setDateCreated(person.getDateCreated());

        if (person.getCreatedBy() != null) {
            UserResponse _createdBy = new UserResponse();
            _createdBy.setUsername(person.getCreatedBy().getUsername());
            _createdBy.setId(person.getCreatedBy().getId());
            _createdBy.setDateCreated(person.getCreatedBy().getDateCreated());
            personResponse.setCreatedBy(_createdBy);
        }

            //Updated Information
            personResponse.setDateUpdated(person.getDateUpdated());

        if (person.getUpdatedBy() != null) {
            UserResponse _updatedBy = new UserResponse();
            _updatedBy.setUsername(person.getUpdatedBy().getUsername());
            _updatedBy.setId(person.getUpdatedBy().getId());
            _updatedBy.setDateCreated(person.getUpdatedBy().getDateCreated());
            personResponse.setUpdatedBy(_updatedBy);
        }

            return personResponse;

    }


}
