/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.db;

import java.util.List;
import javax.persistence.EntityManager;
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
public class JpaControllerIT {

    public JpaControllerIT() {
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
     * Test of getEntityManager method, of class JpaController.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        JpaController instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class JpaController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Entity entity = null;
        JpaController instance = null;
        Integer expResult = null;
        Integer result = instance.create(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class JpaController.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Integer id = null;
        JpaController instance = null;
        Entity expResult = null;
        Entity result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findEntities method, of class JpaController.
     */
    @Test
    public void testFindEntities_0args() {
        System.out.println("findEntities");
        JpaController instance = null;
        List expResult = null;
        List result = instance.findEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findEntities method, of class JpaController.
     */
    @Test
    public void testFindEntities_int_int() {
        System.out.println("findEntities");
        int maxResults = 0;
        int firstResult = 0;
        JpaController instance = null;
        List expResult = null;
        List result = instance.findEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByNamedQuery method, of class JpaController.
     */
    @Test
    public void testFindByNamedQuery() {
        System.out.println("findByNamedQuery");
        String namedQuery = "";
        String[] parameterKeys = null;
        Object[] parameterValues = null;
        String logId = "";
        JpaController instance = null;
        List expResult = null;
        List result = instance.findByNamedQuery(namedQuery, parameterKeys, parameterValues, logId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class JpaController.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Entity entity = null;
        JpaController instance = null;
        instance.edit(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainIds method, of class JpaController.
     */
    @Test
    public void testGetMainIds() {
        System.out.println("getMainIds");
        boolean all = false;
        Object startMainId = null;
        Integer offset = null;
        Integer limit = null;
        JpaController instance = null;
        List expResult = null;
        List result = instance.getMainIds(all, startMainId, offset, limit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class JpaControllerImpl extends JpaController {

        public JpaControllerImpl() {
            super(null);
        }
    }

}
