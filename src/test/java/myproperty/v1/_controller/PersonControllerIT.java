/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller;

import java.util.HashMap;
import java.util.Map;
import myproperty.AppJersey;
import myproperty.v1._entities.responses.PersonResponse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Manny
 */
public class PersonControllerIT {

    private static PersonController controller;
    public PersonControllerIT() {
    }

    public static String getendPoint() {
        return AppJersey.getHOST() + "person/";
    }

    @BeforeClass
    public static void setUpClass() {
        controller = new PersonController();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPeople method, of class PersonController.
     */
    @Test
    public void testGetPeople() {
        System.out.println("Checking the Get People End Point ");
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
     * Test of getPersonById method, of class PersonController.
     */
    @Test
    public void testGetPersonById() throws Exception {
        System.out.println("Checking the Get People End Point ");
        try {
            Map<String, String> vars = new HashMap<String, String>();
            // Test person Id  one 
            vars.put("id", "7890");

            String url = getendPoint() + "{id}";
            RestTemplate restTemplate = new RestTemplate();
            PersonResponse result = restTemplate.getForObject(url, PersonResponse.class, vars);
            System.out.print(result);

            if (result.getId() == null) {
                fail("Was not Able to get any response ");
            }

        } catch (Exception e) {
            fail("Something Went Wrong ");
        }
    }

//    /**
//     * Test of getPersonByUserId method, of class PersonController.
//     */
//    @Test
//    public void testGetPersonByUserId() throws Exception {
//        System.out.println("getPersonByUserId");
//        Integer userId = null;
//        PersonController instance = new PersonController();
//        List<PersonResponse> expResult = null;
//        List<PersonResponse> result = instance.getPersonByUserId(userId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updatePersonById method, of class PersonController.
//     */
//    @Test
//    public void testUpdatePersonById() throws Exception {
//        System.out.println("updatePersonById");
//        Person person = null;
//        Integer id = null;
//        PersonController instance = new PersonController();
//        PersonResponse expResult = null;
//        PersonResponse result = instance.updatePersonById(person, id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createPerson method, of class PersonController.
//     */
//    @Test
//    public void testCreatePerson() throws Exception {
//        System.out.println("createPerson");
//        Person person = null;
//        PersonController instance = new PersonController();
//        PersonResponse expResult = null;
//        PersonResponse result = instance.createPerson(person);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createAddress method, of class PersonController.
//     */
//    @Test
//    public void testCreateAddress() throws Exception {
//        System.out.println("createAddress");
//        Address address = null;
//        Integer id = null;
//        PersonController instance = new PersonController();
//        AddressResponse expResult = null;
//        AddressResponse result = instance.createAddress(address, id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listAddreses method, of class PersonController.
//     */
//    @Test
//    public void testListAddreses() throws Exception {
//        System.out.println("listAddreses");
//        Integer id = null;
//        PersonController instance = new PersonController();
//        Collection<AddressResponse> expResult = null;
//        Collection<AddressResponse> result = instance.listAddreses(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createContact method, of class PersonController.
//     */
//    @Test
//    public void testCreateContact() throws Exception {
//        System.out.println("createContact");
//        Contacts contacts = null;
//        Integer id = null;
//        PersonController instance = new PersonController();
//        ContactsResponse expResult = null;
//        ContactsResponse result = instance.createContact(contacts, id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listContacts method, of class PersonController.
//     */
//    @Test
//    public void testListContacts() throws Exception {
//        System.out.println("listContacts");
//        Integer id = null;
//        PersonController instance = new PersonController();
//        Collection<ContactsResponse> expResult = null;
//        Collection<ContactsResponse> result = instance.listContacts(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
