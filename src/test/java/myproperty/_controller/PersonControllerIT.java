/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._controller;

import java.util.Collection;
import myproperty._entities.User;
import myproperty._entities.UserResponse;
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
        Collection<UserResponse> expResult = null;
        Collection<UserResponse> result = instance.getPeople();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonById method, of class PersonController.
     */
    @Test
    public void testGetPersonById() {
        System.out.println("getPersonById");
        int id = 0;
        PersonController instance = new PersonController();
        UserResponse expResult = null;
        UserResponse result = instance.getPersonById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePersonById method, of class PersonController.
     */
    @Test
    public void testDeletePersonById() throws Exception {
        System.out.println("deletePersonById");
        int id = 0;
        PersonController instance = new PersonController();
        Boolean expResult = null;
        Boolean result = instance.deletePersonById(id);
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
        User user = null;
        Integer id = null;
        PersonController instance = new PersonController();
        UserResponse expResult = null;
        UserResponse result = instance.updatePersonById(user, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPerson method, of class PersonController.
     */
    @Test
    public void testCreatePerson() {
        System.out.println("createPerson");
        User user = null;
        PersonController instance = new PersonController();
        UserResponse expResult = null;
        UserResponse result = instance.createPerson(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
