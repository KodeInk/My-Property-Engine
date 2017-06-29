/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.v1._controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import myproperty.AppJersey;
import myproperty.v1._entities.Property;
import myproperty.v1._entities.responses.PersonResponse;
import myproperty.v1._entities.responses.PropertyResponse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author mover 6/30/2017
 */
public class PropertyControllerIT {

    private static PropertyController controller;
    public PropertyControllerIT() {
    }

    private static String getendPoint() {
        return AppJersey.getHOST() + "property/";
    }

    @BeforeClass
    public static void setUpClass() {
        controller = new PropertyController();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getProperty method, of class PropertyController.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetProperty() throws Exception {
        System.out.println("Checking the Get Property End Point ");
        try {
            String url = getendPoint() + "list";
            RestTemplate restTemplate = new RestTemplate();
            PropertyResponse[] propertyResponses = restTemplate.getForObject(url, PropertyResponse[].class);
            assertNotNull(propertyResponses);
            for (PropertyResponse pr : propertyResponses) {
                assertNotNull(pr.getBrief());
                assertNotNull(pr.getDetails());
            }

        } catch (RestClientException e) {
            fail("Something Went Wrong ");
        }

    }

    /**
     * Test of getPropertyById method, of class PropertyController.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetPropertyById() throws Exception {
        System.out.println("Checking the Get Property By Id  End Point ");
        try {
            Map<String, String> vars = new HashMap<>();
            vars.put("id", "2");
            String url = getendPoint() + "{id}";
            RestTemplate restTemplate = new RestTemplate();
            PropertyResponse propertyResponse = restTemplate.getForObject(url, PropertyResponse.class, vars);
            assertNotNull(propertyResponse);

        } catch (RestClientException e) {
            fail("Something Went Wrong ");
        }
    }

    /**
     * Test of getPropertyByAccountId method, of class PropertyController.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetPropertyByAccountId() throws Exception {
        System.out.println("Checking the Get Property By Account Id   End Point ");
        try {
            Map<String, String> vars = new HashMap<>();
            vars.put("accountid", "1");
            String url = getendPoint() + "accountId/{accountid}";
            RestTemplate restTemplate = new RestTemplate();
            PropertyResponse[] propertyResponses = restTemplate.getForObject(url, PropertyResponse[].class, vars);

            assertNotNull(propertyResponses);
            for (PropertyResponse pr : propertyResponses) {
                System.out.println(pr);
                assertNotNull(pr.getBrief());
                assertNotNull(pr.getDetails());
            }

        } catch (RestClientException e) {
            fail("Something Went Wrong ");
        }
    }

    /**
     * Test of getPropertyByUserId method, of class PropertyController.
     */
    @Test
    public void testGetPropertyByUserId() throws Exception {
        System.out.println("Checking the Get Property By User Id   End Point ");
        try {
            Map<String, String> vars = new HashMap<>();
            vars.put("userId", "1");
            String url = getendPoint() + "user/{userId}";
            RestTemplate restTemplate = new RestTemplate();
            PropertyResponse[] propertyResponses = restTemplate.getForObject(url, PropertyResponse[].class, vars);

            assertNotNull(propertyResponses);
            for (PropertyResponse pr : propertyResponses) {
                System.out.println(pr);
                assertNotNull(pr.getBrief());
                assertNotNull(pr.getDetails());
            }

        } catch (RestClientException e) {
            fail("Something Went Wrong ");
        }
    }

    /**
     * Test of createProperty method, of class PropertyController.
     */
    @Test
    public void testCreateProperty() throws Exception {
        System.out.println("createProperty");
        Property property = null;
        PropertyController instance = new PropertyController();
        PropertyResponse expResult = null;
        PropertyResponse result = instance.createProperty(property);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePropertyById method, of class PropertyController.
     */
    @Test
    public void testUpdatePropertyById() throws Exception {
        System.out.println("updatePropertyById");
        Property property = null;
        Integer id = null;
        PropertyController instance = new PropertyController();
        PropertyResponse expResult = null;
        PropertyResponse result = instance.updatePropertyById(property, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
