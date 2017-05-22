/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._entities;

import java.util.Collection;
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
public class RolesIT {

    public RolesIT() {
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
     * Test of getId method, of class Roles.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Roles instance = new Roles();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Roles.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Roles instance = new Roles();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class Roles.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Roles instance = new Roles();
        String expResult = "";
        String result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class Roles.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        String role = "";
        Roles instance = new Roles();
        instance.setRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Roles.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Roles instance = new Roles();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Roles.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Roles instance = new Roles();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Roles.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Roles instance = new Roles();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class Roles.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        Roles instance = new Roles();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserRoleCollection method, of class Roles.
     */
    @Test
    public void testGetUserRoleCollection() {
        System.out.println("getUserRoleCollection");
        Roles instance = new Roles();
        Collection<UserRole> expResult = null;
        Collection<UserRole> result = instance.getUserRoleCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserRoleCollection method, of class Roles.
     */
    @Test
    public void testSetUserRoleCollection() {
        System.out.println("setUserRoleCollection");
        Collection<UserRole> userRoleCollection = null;
        Roles instance = new Roles();
        instance.setUserRoleCollection(userRoleCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class Roles.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        Roles instance = new Roles();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class Roles.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        Roles instance = new Roles();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Roles.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Roles instance = new Roles();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Roles.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Roles instance = new Roles();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Roles.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Roles instance = new Roles();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
