/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.db;

import java.util.Map;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
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
public class EntityManagerFactoryProviderIT {

    public EntityManagerFactoryProviderIT() {
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
     * Test of getInstance method, of class EntityManagerFactoryProvider.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EntityManagerFactoryProvider expResult = null;
        EntityManagerFactoryProvider result = EntityManagerFactoryProvider.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFactory method, of class EntityManagerFactoryProvider.
     */
    @Test
    public void testGetFactory() {
        System.out.println("getFactory");
        EntityManagerFactoryProvider instance = null;
        EntityManagerFactory expResult = null;
        EntityManagerFactory result = instance.getFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createFactory method, of class EntityManagerFactoryProvider.
     */
    @Test
    public void testCreateFactory() {
        System.out.println("createFactory");
        EntityManagerFactoryProvider instance = null;
        EntityManagerFactory expResult = null;
        EntityManagerFactory result = instance.createFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInstance method, of class EntityManagerFactoryProvider.
     */
    @Test
    public void testSetInstance() {
        System.out.println("setInstance");
        EntityManagerFactoryProvider instance_2 = null;
        EntityManagerFactoryProvider.setInstance(instance_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFactories method, of class EntityManagerFactoryProvider.
     */
    @Test
    public void testGetFactories() {
        System.out.println("getFactories");
        EntityManagerFactoryProvider instance = null;
        Map<String, EntityManagerFactory> expResult = null;
        Map<String, EntityManagerFactory> result = instance.getFactories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLOG method, of class EntityManagerFactoryProvider.
     */
    @Test
    public void testGetLOG() {
        System.out.println("getLOG");
        Logger expResult = null;
        Logger result = EntityManagerFactoryProvider.getLOG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
