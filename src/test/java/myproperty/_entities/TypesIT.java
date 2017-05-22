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
public class TypesIT {

    public TypesIT() {
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
     * Test of getId method, of class Types.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Types instance = new Types();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Types.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Types instance = new Types();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Types.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Types instance = new Types();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Types.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Types instance = new Types();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Types.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Types instance = new Types();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Types.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Types instance = new Types();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Types.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Types instance = new Types();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Types.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Types instance = new Types();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateAdded method, of class Types.
     */
    @Test
    public void testGetDateAdded() {
        System.out.println("getDateAdded");
        Types instance = new Types();
        Date expResult = null;
        Date result = instance.getDateAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateAdded method, of class Types.
     */
    @Test
    public void testSetDateAdded() {
        System.out.println("setDateAdded");
        Date dateAdded = null;
        Types instance = new Types();
        instance.setDateAdded(dateAdded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class Types.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        Types instance = new Types();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class Types.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        Types instance = new Types();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoryId method, of class Types.
     */
    @Test
    public void testGetCategoryId() {
        System.out.println("getCategoryId");
        Types instance = new Types();
        Categories expResult = null;
        Categories result = instance.getCategoryId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoryId method, of class Types.
     */
    @Test
    public void testSetCategoryId() {
        System.out.println("setCategoryId");
        Categories categoryId = null;
        Types instance = new Types();
        instance.setCategoryId(categoryId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Types.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Types instance = new Types();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Types.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Types instance = new Types();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Types.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Types instance = new Types();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
