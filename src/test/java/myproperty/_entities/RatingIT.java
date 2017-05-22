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
public class RatingIT {

    public RatingIT() {
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
     * Test of getId method, of class Rating.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Rating instance = new Rating();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Rating.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Rating instance = new Rating();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRate method, of class Rating.
     */
    @Test
    public void testGetRate() {
        System.out.println("getRate");
        Rating instance = new Rating();
        Integer expResult = null;
        Integer result = instance.getRate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRate method, of class Rating.
     */
    @Test
    public void testSetRate() {
        System.out.println("setRate");
        Integer rate = null;
        Rating instance = new Rating();
        instance.setRate(rate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParentId method, of class Rating.
     */
    @Test
    public void testGetParentId() {
        System.out.println("getParentId");
        Rating instance = new Rating();
        Integer expResult = null;
        Integer result = instance.getParentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParentId method, of class Rating.
     */
    @Test
    public void testSetParentId() {
        System.out.println("setParentId");
        Integer parentId = null;
        Rating instance = new Rating();
        instance.setParentId(parentId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParentType method, of class Rating.
     */
    @Test
    public void testGetParentType() {
        System.out.println("getParentType");
        Rating instance = new Rating();
        String expResult = "";
        String result = instance.getParentType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParentType method, of class Rating.
     */
    @Test
    public void testSetParentType() {
        System.out.println("setParentType");
        String parentType = "";
        Rating instance = new Rating();
        instance.setParentType(parentType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Rating.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Rating instance = new Rating();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class Rating.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        Rating instance = new Rating();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Rating.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Rating instance = new Rating();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Rating.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Rating instance = new Rating();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rating.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Rating instance = new Rating();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
