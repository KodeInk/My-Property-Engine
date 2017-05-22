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
public class AccountTypeIT {

    public AccountTypeIT() {
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
     * Test of getId method, of class AccountType.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        AccountType instance = new AccountType();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class AccountType.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        AccountType instance = new AccountType();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class AccountType.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        AccountType instance = new AccountType();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class AccountType.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        AccountType instance = new AccountType();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class AccountType.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        AccountType instance = new AccountType();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class AccountType.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        AccountType instance = new AccountType();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class AccountType.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        AccountType instance = new AccountType();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class AccountType.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        AccountType instance = new AccountType();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountCollection method, of class AccountType.
     */
    @Test
    public void testGetAccountCollection() {
        System.out.println("getAccountCollection");
        AccountType instance = new AccountType();
        Collection<Account> expResult = null;
        Collection<Account> result = instance.getAccountCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountCollection method, of class AccountType.
     */
    @Test
    public void testSetAccountCollection() {
        System.out.println("setAccountCollection");
        Collection<Account> accountCollection = null;
        AccountType instance = new AccountType();
        instance.setAccountCollection(accountCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class AccountType.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        AccountType instance = new AccountType();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AccountType.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        AccountType instance = new AccountType();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AccountType.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AccountType instance = new AccountType();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
