/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._controller;

import java.util.Collection;
import java.util.List;
import myproperty._entities.Person;
import myproperty._entities.PersonResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manny
 */
public class PersonControllerIT {

    public PersonControllerIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPeople method, of class PersonController.
     */
    @Test
    public void testGetPeople() {
        System.out.println("getPeople");
        PersonController instance = new PersonController();
        Collection<PersonResponse> expResult = null;
        Collection<PersonResponse> result = instance.getPeople();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonById method, of class PersonController.
     */
    @Test
    public void testGetPersonById() throws Exception {
        System.out.println("getPersonById");
        Integer id = null;
        PersonController instance = new PersonController();
        PersonResponse expResult = null;
        PersonResponse result = instance.getPersonById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonByUserId method, of class PersonController.
     */
    @Test
    public void testGetPersonByUserId() throws Exception {
        System.out.println("getPersonByUserId");
        Integer userId = null;
        PersonController instance = new PersonController();
        List<PersonResponse> expResult = null;
        List<PersonResponse> result = instance.getPersonByUserId(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePersonById method, of class PersonController.
     */
    @Test
    public void testUpdatePersonById() throws Exception {
        System.out.println("updatePersonById");
        Person person = null;
        Integer id = null;
        PersonController instance = new PersonController();
        PersonResponse expResult = null;
        PersonResponse result = instance.updatePersonById(person, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPerson method, of class PersonController.
     */
    @Test
    public void testCreatePerson() throws Exception {
        System.out.println("createPerson");
        Person person = null;
        PersonController instance = new PersonController();
        PersonResponse expResult = null;
        PersonResponse result = instance.createPerson(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
