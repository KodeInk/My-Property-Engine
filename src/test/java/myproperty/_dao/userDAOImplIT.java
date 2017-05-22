/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._dao;

import java.util.List;
import myproperty._entities.User;
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
public class userDAOImplIT {

    public userDAOImplIT() {
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
     * Test of getInstance method, of class userDAOImpl.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        userDAOImpl expResult = null;
        userDAOImpl result = userDAOImpl.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class userDAOImpl.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        User user = null;
        userDAOImpl instance = new userDAOImpl();
        User expResult = null;
        User result = instance.create(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class userDAOImpl.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        User user = null;
        userDAOImpl instance = new userDAOImpl();
        User expResult = null;
        User result = instance.edit(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUser method, of class userDAOImpl.
     */
    @Test
    public void testFindUser() {
        System.out.println("findUser");
        Integer id = null;
        userDAOImpl instance = new userDAOImpl();
        User expResult = null;
        User result = instance.findUser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserEntities method, of class userDAOImpl.
     */
    @Test
    public void testFindUserEntities_0args() {
        System.out.println("findUserEntities");
        userDAOImpl instance = new userDAOImpl();
        List<User> expResult = null;
        List<User> result = instance.findUserEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserEntities method, of class userDAOImpl.
     */
    @Test
    public void testFindUserEntities_int_int() {
        System.out.println("findUserEntities");
        int maxResults = 0;
        int firstResult = 0;
        userDAOImpl instance = new userDAOImpl();
        List<User> expResult = null;
        List<User> result = instance.findUserEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class userDAOImpl.
     */
    @Test
    public void testDestroy() throws Exception {
        System.out.println("destroy");
        Integer id = null;
        userDAOImpl instance = new userDAOImpl();
        instance.destroy(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckPassword method, of class userDAOImpl.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("CheckPassword");
        User user = null;
        userDAOImpl instance = new userDAOImpl();
        User expResult = null;
        User result = instance.CheckPassword(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
