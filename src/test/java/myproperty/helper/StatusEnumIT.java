/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.helper;

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
public class StatusEnumIT {

    public StatusEnumIT() {
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
     * Test of values method, of class StatusEnum.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        StatusEnum[] expResult = null;
        StatusEnum[] result = StatusEnum.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class StatusEnum.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        StatusEnum expResult = null;
        StatusEnum result = StatusEnum.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromString method, of class StatusEnum.
     */
    @Test
    public void testFromString() {
        System.out.println("fromString");
        String text = "";
        StatusEnum expResult = null;
        StatusEnum result = StatusEnum.fromString(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromObject method, of class StatusEnum.
     */
    @Test
    public void testFromObject() {
        System.out.println("fromObject");
        Object text = null;
        StatusEnum expResult = null;
        StatusEnum result = StatusEnum.fromObject(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
