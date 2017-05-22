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
public class UserControllerIT {

    public UserControllerIT() {
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
     * Test of getUsers method, of class UserController.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        UserController instance = new UserController();
        Collection<UserResponse> expResult = null;
        Collection<UserResponse> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UserController.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        int id = 0;
        UserController instance = new UserController();
        UserResponse expResult = null;
        UserResponse result = instance.getUserById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserById method, of class UserController.
     */
    @Test
    public void testDeleteUserById() throws Exception {
        System.out.println("deleteUserById");
        int id = 0;
        UserController instance = new UserController();
        Boolean expResult = null;
        Boolean result = instance.deleteUserById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserController.
     */
    @Test
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        User user = null;
        Integer id = null;
        UserController instance = new UserController();
        UserResponse expResult = null;
        UserResponse result = instance.updateUser(user, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activateUser method, of class UserController.
     */
    @Test
    public void testActivateUser() throws Exception {
        System.out.println("activateUser");
        User user = null;
        UserController instance = new UserController();
        instance.activateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deactivateUser method, of class UserController.
     */
    @Test
    public void testDeactivateUser() throws Exception {
        System.out.println("deactivateUser");
        User user = null;
        UserController instance = new UserController();
        instance.deactivateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUser method, of class UserController.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        User user = null;
        UserController instance = new UserController();
        UserResponse expResult = null;
        UserResponse result = instance.createUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
