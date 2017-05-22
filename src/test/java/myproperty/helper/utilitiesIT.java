/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.helper;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
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
public class utilitiesIT {

    public utilitiesIT() {
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
     * Test of getRandomNum method, of class utilities.
     */
    @Test
    public void testGetRandomNum() {
        System.out.println("getRandomNum");
        int numLength = 0;
        String expResult = "";
        String result = utilities.getRandomNum(numLength);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaltString method, of class utilities.
     */
    @Test
    public void testGetSaltString() {
        System.out.println("getSaltString");
        int stringLenght = 0;
        String expResult = "";
        String result = utilities.getSaltString(stringLenght);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initState method, of class utilities.
     */
    @Test
    public void testInitState() {
        System.out.println("initState");
        utilities.initState();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStackTrace method, of class utilities.
     */
    @Test
    public void testGetStackTrace() {
        System.out.println("getStackTrace");
        Throwable throwable = null;
        String expResult = "";
        String result = utilities.getStackTrace(throwable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAllFromInputstream method, of class utilities.
     */
    @Test
    public void testReadAllFromInputstream() {
        System.out.println("readAllFromInputstream");
        InputStream is = null;
        long size = 0L;
        byte[] expResult = null;
        byte[] result = utilities.readAllFromInputstream(is, size);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAsString method, of class utilities.
     */
    @Test
    public void testReadAsString() throws Exception {
        System.out.println("readAsString");
        InputStream input = null;
        String expResult = "";
        String result = utilities.readAsString(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPropertyAsString method, of class utilities.
     */
    @Test
    public void testGetPropertyAsString() {
        System.out.println("getPropertyAsString");
        Properties properties = null;
        String expResult = "";
        String result = utilities.getPropertyAsString(properties);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParameterForLogging method, of class utilities.
     */
    @Test
    public void testGetParameterForLogging() {
        System.out.println("getParameterForLogging");
        Map parameter = null;
        String expResult = "";
        String result = utilities.getParameterForLogging(parameter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logParameters method, of class utilities.
     */
    @Test
    public void testLogParameters() {
        System.out.println("logParameters");
        String message = "";
        Map parameter = null;
        String logId = "";
        utilities.logParameters(message, parameter, logId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resizeImages method, of class utilities.
     */
    @Test
    public void testResizeImages_3args() {
        System.out.println("resizeImages");
        BufferedImage img = null;
        int newW = 0;
        int newH = 0;
        BufferedImage expResult = null;
        BufferedImage result = utilities.resizeImages(img, newW, newH);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resizeImages method, of class utilities.
     */
    @Test
    public void testResizeImages_BufferedImage_int() {
        System.out.println("resizeImages");
        BufferedImage img = null;
        int newW = 0;
        BufferedImage expResult = null;
        BufferedImage result = utilities.resizeImages(img, newW);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resizeImage method, of class utilities.
     */
    @Test
    public void testResizeImage() throws Exception {
        System.out.println("resizeImage");
        byte[] flieData = null;
        int width = 0;
        int height = 0;
        byte[] expResult = null;
        byte[] result = utilities.resizeImage(flieData, width, height);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addIfNotNull method, of class utilities.
     */
    @Test
    public void testAddIfNotNull() {
        System.out.println("addIfNotNull");
        Map map = null;
        Object key = null;
        Object value = null;
        utilities.addIfNotNull(map, key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atNoon method, of class utilities.
     */
    @Test
    public void testAtNoon() {
        System.out.println("atNoon");
        Long date = null;
        Long expResult = null;
        Long result = utilities.atNoon(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormattedDate method, of class utilities.
     */
    @Test
    public void testGetFormattedDate_Long() {
        System.out.println("getFormattedDate");
        Long date = null;
        String expResult = "";
        String result = utilities.getFormattedDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormattedDate method, of class utilities.
     */
    @Test
    public void testGetFormattedDate_Date() {
        System.out.println("getFormattedDate");
        Date date = null;
        String expResult = "";
        String result = utilities.getFormattedDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logHttpServletRequest method, of class utilities.
     */
    @Test
    public void testLogHttpServletRequest() {
        System.out.println("logHttpServletRequest");
        HttpServletRequest httpServletRequest = null;
        String logId = "";
        utilities.logHttpServletRequest(httpServletRequest, logId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class utilities.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String authentication = "";
        String expResult = "";
        String result = utilities.getUsername(authentication);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class utilities.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String authentication = "";
        String expResult = "";
        String result = utilities.getPassword(authentication);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogId method, of class utilities.
     */
    @Test
    public void testGetLogId() {
        System.out.println("getLogId");
        String expResult = "";
        String result = utilities.getLogId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumeric method, of class utilities.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "";
        boolean expResult = false;
        boolean result = utilities.isNumeric(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longAmountFromText method, of class utilities.
     */
    @Test
    public void testLongAmountFromText() {
        System.out.println("longAmountFromText");
        String text = "";
        Long expResult = null;
        Long result = utilities.longAmountFromText(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stringReplace method, of class utilities.
     */
    @Test
    public void testStringReplace() {
        System.out.println("stringReplace");
        String word = "";
        String stringToBeReplaced = "";
        String stringToReplace = "";
        String expResult = "";
        String result = utilities.stringReplace(word, stringToBeReplaced, stringToReplace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encryptPassword_md5 method, of class utilities.
     */
    @Test
    public void testEncryptPassword_md5() {
        System.out.println("encryptPassword_md5");
        String password = "";
        String expResult = "";
        String result = utilities.encryptPassword_md5(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentDate method, of class utilities.
     */
    @Test
    public void testGetCurrentDate() {
        System.out.println("getCurrentDate");
        Date expResult = null;
        Date result = utilities.getCurrentDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
