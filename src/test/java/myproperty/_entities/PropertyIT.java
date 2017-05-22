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
public class PropertyIT {

    public PropertyIT() {
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
     * Test of getId method, of class Property.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Property instance = new Property();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Property.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Property instance = new Property();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Property.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Property instance = new Property();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Property.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Property instance = new Property();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Property.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Property instance = new Property();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Property.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Property instance = new Property();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Property.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Property instance = new Property();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Property.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Property instance = new Property();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Property.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Property instance = new Property();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class Property.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        Property instance = new Property();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class Property.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        Property instance = new Property();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class Property.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        Property instance = new Property();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Property.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Property instance = new Property();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Property.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Property instance = new Property();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Property.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Property instance = new Property();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
