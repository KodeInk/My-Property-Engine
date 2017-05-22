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
public class CategoriesIT {

    public CategoriesIT() {
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
     * Test of getId method, of class Categories.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Categories instance = new Categories();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Categories.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Categories instance = new Categories();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Categories.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Categories instance = new Categories();
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class Categories.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        Categories instance = new Categories();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Categories.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Categories instance = new Categories();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Categories.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Categories instance = new Categories();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Categories.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Categories instance = new Categories();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Categories.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Categories instance = new Categories();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Categories.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Categories instance = new Categories();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class Categories.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        Categories instance = new Categories();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypesCollection method, of class Categories.
     */
    @Test
    public void testGetTypesCollection() {
        System.out.println("getTypesCollection");
        Categories instance = new Categories();
        Collection<Types> expResult = null;
        Collection<Types> result = instance.getTypesCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTypesCollection method, of class Categories.
     */
    @Test
    public void testSetTypesCollection() {
        System.out.println("setTypesCollection");
        Collection<Types> typesCollection = null;
        Categories instance = new Categories();
        instance.setTypesCollection(typesCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class Categories.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        Categories instance = new Categories();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class Categories.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        Categories instance = new Categories();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Categories.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Categories instance = new Categories();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Categories.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Categories instance = new Categories();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Categories.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Categories instance = new Categories();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
