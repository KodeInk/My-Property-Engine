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
public class AccountIT {

    public AccountIT() {
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
     * Test of getId method, of class Account.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Account instance = new Account();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Account.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Account instance = new Account();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountName method, of class Account.
     */
    @Test
    public void testGetAccountName() {
        System.out.println("getAccountName");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getAccountName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountName method, of class Account.
     */
    @Test
    public void testSetAccountName() {
        System.out.println("setAccountName");
        String accountName = "";
        Account instance = new Account();
        instance.setAccountName(accountName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Account.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Account instance = new Account();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class Account.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        Account instance = new Account();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountType method, of class Account.
     */
    @Test
    public void testGetAccountType() {
        System.out.println("getAccountType");
        Account instance = new Account();
        AccountType expResult = null;
        AccountType result = instance.getAccountType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountType method, of class Account.
     */
    @Test
    public void testSetAccountType() {
        System.out.println("setAccountType");
        AccountType accountType = null;
        Account instance = new Account();
        instance.setAccountType(accountType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class Account.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        Account instance = new Account();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class Account.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        Account instance = new Account();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubscription method, of class Account.
     */
    @Test
    public void testGetSubscription() {
        System.out.println("getSubscription");
        Account instance = new Account();
        Subscription expResult = null;
        Subscription result = instance.getSubscription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubscription method, of class Account.
     */
    @Test
    public void testSetSubscription() {
        System.out.println("setSubscription");
        Subscription subscription = null;
        Account instance = new Account();
        instance.setSubscription(subscription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Account.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Account.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Account instance = new Account();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Account instance = new Account();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
