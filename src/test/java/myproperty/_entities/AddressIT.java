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
public class AddressIT {

    public AddressIT() {
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
     * Test of getId method, of class Address.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Address instance = new Address();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Address.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Address instance = new Address();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Address.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Address.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        Address instance = new Address();
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLongtitude method, of class Address.
     */
    @Test
    public void testGetLongtitude() {
        System.out.println("getLongtitude");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getLongtitude();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLongtitude method, of class Address.
     */
    @Test
    public void testSetLongtitude() {
        System.out.println("setLongtitude");
        String longtitude = "";
        Address instance = new Address();
        instance.setLongtitude(longtitude);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLatitude method, of class Address.
     */
    @Test
    public void testGetLatitude() {
        System.out.println("getLatitude");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getLatitude();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLatitude method, of class Address.
     */
    @Test
    public void testSetLatitude() {
        System.out.println("setLatitude");
        String latitude = "";
        Address instance = new Address();
        instance.setLatitude(latitude);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParentType method, of class Address.
     */
    @Test
    public void testGetParentType() {
        System.out.println("getParentType");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getParentType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParentType method, of class Address.
     */
    @Test
    public void testSetParentType() {
        System.out.println("setParentType");
        String parentType = "";
        Address instance = new Address();
        instance.setParentType(parentType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParentId method, of class Address.
     */
    @Test
    public void testGetParentId() {
        System.out.println("getParentId");
        Address instance = new Address();
        Integer expResult = null;
        Integer result = instance.getParentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParentId method, of class Address.
     */
    @Test
    public void testSetParentId() {
        System.out.println("setParentId");
        Integer parentId = null;
        Address instance = new Address();
        instance.setParentId(parentId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Address.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Address instance = new Address();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class Address.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        Address instance = new Address();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class Address.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        Address instance = new Address();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class Address.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        Address instance = new Address();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Address.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Address instance = new Address();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Address.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Address instance = new Address();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Address.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Address instance = new Address();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
