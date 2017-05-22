/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._services;

import java.util.Collection;
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
public class PersonServiceIT {

    public PersonServiceIT() {
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
     * Test of getAllPeople method, of class PersonService.
     */
    @Test
    public void testGetAllPeople() {
        System.out.println("getAllPeople");
        PersonService instance = new PersonService();
        Collection<PersonResponse> expResult = null;
        Collection<PersonResponse> result = instance.getAllPeople();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonById method, of class PersonService.
     */
    @Test
    public void testGetPersonById() throws Exception {
        System.out.println("getPersonById");
        Integer id = null;
        PersonService instance = new PersonService();
        PersonResponse expResult = null;
        PersonResponse result = instance.getPersonById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePerson method, of class PersonService.
     */
    @Test
    public void testUpdatePerson() throws Exception {
        System.out.println("updatePerson");
        Person person = null;
        PersonService instance = new PersonService();
        PersonResponse expResult = null;
        PersonResponse result = instance.updatePerson(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPerson method, of class PersonService.
     */
    @Test
    public void testCreatePerson() throws Exception {
        System.out.println("createPerson");
        Person person = null;
        PersonService instance = new PersonService();
        PersonResponse expResult = null;
        PersonResponse result = instance.createPerson(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PersonResponse method, of class PersonService.
     */
    @Test
    public void testPersonResponse() {
        System.out.println("PersonResponse");
        Person person = null;
        PersonService instance = new PersonService();
        PersonResponse expResult = null;
        PersonResponse result = instance.PersonResponse(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
