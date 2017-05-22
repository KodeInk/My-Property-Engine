/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._entities;

import java.util.Date;
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
public class UserResponseIT {

    public UserResponseIT() {
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
     * Test of getId method, of class UserResponse.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        UserResponse instance = new UserResponse();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class UserResponse.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        UserResponse instance = new UserResponse();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class UserResponse.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        UserResponse instance = new UserResponse();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class UserResponse.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        UserResponse instance = new UserResponse();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class UserResponse.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        UserResponse instance = new UserResponse();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class UserResponse.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        UserResponse instance = new UserResponse();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class UserResponse.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UserResponse instance = new UserResponse();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class UserResponse.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        UserResponse instance = new UserResponse();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UserResponse.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserResponse instance = new UserResponse();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
