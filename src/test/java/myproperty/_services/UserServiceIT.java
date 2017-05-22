/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._services;

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
public class UserServiceIT {

    public UserServiceIT() {
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
     * Test of getAllUsers method, of class UserService.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        UserService instance = new UserService();
        Collection<UserResponse> expResult = null;
        Collection<UserResponse> result = instance.getAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UserService.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        Integer id = null;
        UserService instance = new UserService();
        UserResponse expResult = null;
        UserResponse result = instance.getUserById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserById method, of class UserService.
     */
    @Test
    public void testDeleteUserById() throws Exception {
        System.out.println("deleteUserById");
        Integer id = null;
        UserService instance = new UserService();
        instance.deleteUserById(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserService.
     */
    @Test
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        User user = null;
        UserService instance = new UserService();
        UserResponse expResult = null;
        UserResponse result = instance.updateUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createUser method, of class UserService.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        User user = null;
        UserService instance = new UserService();
        UserResponse expResult = null;
        UserResponse result = instance.createUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UserResponse method, of class UserService.
     */
    @Test
    public void testUserResponse() {
        System.out.println("UserResponse");
        User user1 = null;
        UserService instance = new UserService();
        UserResponse expResult = null;
        UserResponse result = instance.UserResponse(user1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
