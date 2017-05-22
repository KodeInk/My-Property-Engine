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
public class PersonIT {

    public PersonIT() {
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
     * Test of getId method, of class Person.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Person instance = new Person();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Person.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Person instance = new Person();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNames method, of class Person.
     */
    @Test
    public void testGetNames() {
        System.out.println("getNames");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getNames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNames method, of class Person.
     */
    @Test
    public void testSetNames() {
        System.out.println("setNames");
        String names = "";
        Person instance = new Person();
        instance.setNames(names);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Person.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Person.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Person instance = new Person();
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateofbirth method, of class Person.
     */
    @Test
    public void testGetDateofbirth() {
        System.out.println("getDateofbirth");
        Person instance = new Person();
        Date expResult = null;
        Date result = instance.getDateofbirth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateofbirth method, of class Person.
     */
    @Test
    public void testSetDateofbirth() {
        System.out.println("setDateofbirth");
        Date dateofbirth = null;
        Person instance = new Person();
        instance.setDateofbirth(dateofbirth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Person.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Person instance = new Person();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class Person.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        Person instance = new Person();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateUpdated method, of class Person.
     */
    @Test
    public void testGetDateUpdated() {
        System.out.println("getDateUpdated");
        Person instance = new Person();
        Date expResult = null;
        Date result = instance.getDateUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateUpdated method, of class Person.
     */
    @Test
    public void testSetDateUpdated() {
        System.out.println("setDateUpdated");
        Date dateUpdated = null;
        Person instance = new Person();
        instance.setDateUpdated(dateUpdated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreatedBy method, of class Person.
     */
    @Test
    public void testGetCreatedBy() {
        System.out.println("getCreatedBy");
        Person instance = new Person();
        User expResult = null;
        User result = instance.getCreatedBy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreatedBy method, of class Person.
     */
    @Test
    public void testSetCreatedBy() {
        System.out.println("setCreatedBy");
        User createdBy = null;
        Person instance = new Person();
        instance.setCreatedBy(createdBy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpdatedBy method, of class Person.
     */
    @Test
    public void testGetUpdatedBy() {
        System.out.println("getUpdatedBy");
        Person instance = new Person();
        User expResult = null;
        User result = instance.getUpdatedBy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdatedBy method, of class Person.
     */
    @Test
    public void testSetUpdatedBy() {
        System.out.println("setUpdatedBy");
        User updatedBy = null;
        Person instance = new Person();
        instance.setUpdatedBy(updatedBy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserId method, of class Person.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        Person instance = new Person();
        User expResult = null;
        User result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserId method, of class Person.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        User userId = null;
        Person instance = new Person();
        instance.setUserId(userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Person.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Person instance = new Person();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Person.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Person instance = new Person();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new Person();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
