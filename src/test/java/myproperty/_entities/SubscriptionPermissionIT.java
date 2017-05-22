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
public class SubscriptionPermissionIT {

    public SubscriptionPermissionIT() {
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
     * Test of getId method, of class SubscriptionPermission.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        SubscriptionPermission instance = new SubscriptionPermission();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class SubscriptionPermission.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        SubscriptionPermission instance = new SubscriptionPermission();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class SubscriptionPermission.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        SubscriptionPermission instance = new SubscriptionPermission();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class SubscriptionPermission.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        SubscriptionPermission instance = new SubscriptionPermission();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class SubscriptionPermission.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        SubscriptionPermission instance = new SubscriptionPermission();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class SubscriptionPermission.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        SubscriptionPermission instance = new SubscriptionPermission();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class SubscriptionPermission.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        SubscriptionPermission instance = new SubscriptionPermission();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class SubscriptionPermission.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        SubscriptionPermission instance = new SubscriptionPermission();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPermissionId method, of class SubscriptionPermission.
     */
    @Test
    public void testGetPermissionId() {
        System.out.println("getPermissionId");
        SubscriptionPermission instance = new SubscriptionPermission();
        Permissions expResult = null;
        Permissions result = instance.getPermissionId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPermissionId method, of class SubscriptionPermission.
     */
    @Test
    public void testSetPermissionId() {
        System.out.println("setPermissionId");
        Permissions permissionId = null;
        SubscriptionPermission instance = new SubscriptionPermission();
        instance.setPermissionId(permissionId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubscriptionId method, of class SubscriptionPermission.
     */
    @Test
    public void testGetSubscriptionId() {
        System.out.println("getSubscriptionId");
        SubscriptionPermission instance = new SubscriptionPermission();
        Subscription expResult = null;
        Subscription result = instance.getSubscriptionId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubscriptionId method, of class SubscriptionPermission.
     */
    @Test
    public void testSetSubscriptionId() {
        System.out.println("setSubscriptionId");
        Subscription subscriptionId = null;
        SubscriptionPermission instance = new SubscriptionPermission();
        instance.setSubscriptionId(subscriptionId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class SubscriptionPermission.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        SubscriptionPermission instance = new SubscriptionPermission();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class SubscriptionPermission.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        SubscriptionPermission instance = new SubscriptionPermission();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SubscriptionPermission.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SubscriptionPermission instance = new SubscriptionPermission();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
