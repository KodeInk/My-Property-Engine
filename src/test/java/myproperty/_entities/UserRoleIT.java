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
public class UserRoleIT {

    public UserRoleIT() {
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
     * Test of getId method, of class UserRole.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        UserRole instance = new UserRole();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class UserRole.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        UserRole instance = new UserRole();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class UserRole.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        UserRole instance = new UserRole();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class UserRole.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        UserRole instance = new UserRole();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class UserRole.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        UserRole instance = new UserRole();
        Integer expResult = null;
        Integer result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class UserRole.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Integer authorId = null;
        UserRole instance = new UserRole();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class UserRole.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        UserRole instance = new UserRole();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class UserRole.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        UserRole instance = new UserRole();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleId method, of class UserRole.
     */
    @Test
    public void testGetRoleId() {
        System.out.println("getRoleId");
        UserRole instance = new UserRole();
        Roles expResult = null;
        Roles result = instance.getRoleId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoleId method, of class UserRole.
     */
    @Test
    public void testSetRoleId() {
        System.out.println("setRoleId");
        Roles roleId = null;
        UserRole instance = new UserRole();
        instance.setRoleId(roleId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserId method, of class UserRole.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        UserRole instance = new UserRole();
        User expResult = null;
        User result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserId method, of class UserRole.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        User userId = null;
        UserRole instance = new UserRole();
        instance.setUserId(userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class UserRole.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UserRole instance = new UserRole();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class UserRole.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        UserRole instance = new UserRole();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UserRole.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserRole instance = new UserRole();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
