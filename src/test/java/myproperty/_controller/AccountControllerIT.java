/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._controller;

import myproperty.v1._controller.AccountController;
import myproperty.v1._entities.User;
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
public class AccountControllerIT {

    public AccountControllerIT() {
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
     * Test of getAccounts method, of class AccountController.
     */
    @Test
    public void testGetAccounts() {
        System.out.println("getAccounts");
        AccountController instance = new AccountController();
        String expResult = "";
        String result = instance.getAccounts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create_new_account method, of class AccountController.
     */
    @Test
    public void testCreate_new_account() {
        System.out.println("create_new_account");
        User user = null;
        AccountController instance = new AccountController();
        String expResult = "";
        String result = instance.create_new_account(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
