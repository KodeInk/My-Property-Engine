/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller;

import java.util.HashMap;
import java.util.Map;
import myproperty.AppJersey;
import myproperty.v1._entities.Account;
import myproperty.v1._entities.Accounts;
import myproperty.v1._entities.responses.AccountsResponse;
import myproperty.v1.helper.utilities;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mover 6/18/2017
 */
public class AccountControllerIT {

    public AccountControllerIT() {
    }

    private static String getendPoint() {
        return AppJersey.getHOST() + "account/";
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAccounts method, of class AccountController.
     */
    @Test
    public void testGetAccounts() {
        System.out.println("Checking the Get Accounts  End Point ");
        try {
            String url = getendPoint() + "list";
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(url, String.class);
            if (result.isEmpty()) {
                fail("Was not Able to get any response ");
            }
            System.out.print(result);
        } catch (Exception e) {
            fail("Something Went Wrong ");
        }
    }

    /**
     * Test of create_new_account method, of class AccountController.
     */
    @Test
    public void testCreate_new_account() {
        System.out.println("Checking the Create  Accounts  End Point ");
        try {
            String url = getendPoint() + "create";
            RestTemplate restTemplate = new RestTemplate();
            Account acount = new Account();
            acount.setEmail_address("myprapati" + utilities.getCurrentDate().getTime() + "@myprapati.com");
            acount.setNames("Test " + utilities.getCurrentDate());
            acount.setPassword("testing");

            Map<String, String> vars = new HashMap<>();
            // Test Get Person by User id
            vars.put("names", acount.getNames());
            vars.put("password", acount.getPassword());
            vars.put("email_address", acount.getEmail_address());

            AccountsResponse result = restTemplate.postForObject(url, vars, AccountsResponse.class);

            if (result.getId() <= 0) {
                fail("Was not Able to get any response ");
            }
            System.out.print(result);
        } catch (RestClientException e) {
            System.out.println(e.toString());
            fail("Something Went Wrong ");

        }
    }

    /**
     * Test of get_account_details method, of class AccountController.
     */
    @Test
    public void testGet_account_details() throws Exception {
        System.out.println("get_account_details");
        Integer id = null;
        AccountController instance = new AccountController();
        AccountsResponse expResult = null;
        AccountsResponse result = instance.get_account_details(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activate_account method, of class AccountController.
     */
    @Test
    public void testActivate_account() throws Exception {
        System.out.println("activate_account");
        Integer id = null;
        AccountController instance = new AccountController();
        AccountsResponse expResult = null;
        AccountsResponse result = instance.activate_account(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deactivate_account method, of class AccountController.
     */
    @Test
    public void testDeactivate_account() throws Exception {
        System.out.println("deactivate_account");
        Integer id = null;
        AccountController instance = new AccountController();
        AccountsResponse expResult = null;
        AccountsResponse result = instance.deactivate_account(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update_account method, of class AccountController.
     */
    @Test
    public void testUpdate_account() throws Exception {
        System.out.println("update_account");
        Integer id = null;
        Accounts account = null;
        AccountController instance = new AccountController();
        AccountsResponse expResult = null;
        AccountsResponse result = instance.update_account(id, account);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
