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
public class SubscriptionIT {

    public SubscriptionIT() {
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
     * Test of getId method, of class Subscription.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Subscription instance = new Subscription();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Subscription.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Subscription instance = new Subscription();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Subscription.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Subscription instance = new Subscription();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Subscription.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Subscription instance = new Subscription();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateAdded method, of class Subscription.
     */
    @Test
    public void testGetDateAdded() {
        System.out.println("getDateAdded");
        Subscription instance = new Subscription();
        Date expResult = null;
        Date result = instance.getDateAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateAdded method, of class Subscription.
     */
    @Test
    public void testSetDateAdded() {
        System.out.println("setDateAdded");
        Date dateAdded = null;
        Subscription instance = new Subscription();
        instance.setDateAdded(dateAdded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class Subscription.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        Subscription instance = new Subscription();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class Subscription.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        Subscription instance = new Subscription();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubscriptionPermissionCollection method, of class Subscription.
     */
    @Test
    public void testGetSubscriptionPermissionCollection() {
        System.out.println("getSubscriptionPermissionCollection");
        Subscription instance = new Subscription();
        Collection<SubscriptionPermission> expResult = null;
        Collection<SubscriptionPermission> result = instance.getSubscriptionPermissionCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubscriptionPermissionCollection method, of class Subscription.
     */
    @Test
    public void testSetSubscriptionPermissionCollection() {
        System.out.println("setSubscriptionPermissionCollection");
        Collection<SubscriptionPermission> subscriptionPermissionCollection = null;
        Subscription instance = new Subscription();
        instance.setSubscriptionPermissionCollection(subscriptionPermissionCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountCollection method, of class Subscription.
     */
    @Test
    public void testGetAccountCollection() {
        System.out.println("getAccountCollection");
        Subscription instance = new Subscription();
        Collection<Account> expResult = null;
        Collection<Account> result = instance.getAccountCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountCollection method, of class Subscription.
     */
    @Test
    public void testSetAccountCollection() {
        System.out.println("setAccountCollection");
        Collection<Account> accountCollection = null;
        Subscription instance = new Subscription();
        instance.setAccountCollection(accountCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Subscription.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Subscription instance = new Subscription();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Subscription.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Subscription instance = new Subscription();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Subscription.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Subscription instance = new Subscription();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
