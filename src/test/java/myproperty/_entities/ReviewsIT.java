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
public class ReviewsIT {

    public ReviewsIT() {
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
     * Test of getId method, of class Reviews.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Reviews instance = new Reviews();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Reviews.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Reviews instance = new Reviews();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComment method, of class Reviews.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        Reviews instance = new Reviews();
        String expResult = "";
        String result = instance.getComment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComment method, of class Reviews.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        String comment = "";
        Reviews instance = new Reviews();
        instance.setComment(comment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParenttype method, of class Reviews.
     */
    @Test
    public void testGetParenttype() {
        System.out.println("getParenttype");
        Reviews instance = new Reviews();
        String expResult = "";
        String result = instance.getParenttype();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParenttype method, of class Reviews.
     */
    @Test
    public void testSetParenttype() {
        System.out.println("setParenttype");
        String parenttype = "";
        Reviews instance = new Reviews();
        instance.setParenttype(parenttype);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParentid method, of class Reviews.
     */
    @Test
    public void testGetParentid() {
        System.out.println("getParentid");
        Reviews instance = new Reviews();
        Integer expResult = null;
        Integer result = instance.getParentid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParentid method, of class Reviews.
     */
    @Test
    public void testSetParentid() {
        System.out.println("setParentid");
        Integer parentid = null;
        Reviews instance = new Reviews();
        instance.setParentid(parentid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Reviews.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Reviews instance = new Reviews();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class Reviews.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        Reviews instance = new Reviews();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Reviews.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Reviews instance = new Reviews();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Reviews.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Reviews instance = new Reviews();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Reviews.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Reviews instance = new Reviews();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
