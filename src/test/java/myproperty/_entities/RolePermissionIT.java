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
public class RolePermissionIT {

    public RolePermissionIT() {
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
     * Test of getId method, of class RolePermission.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        RolePermission instance = new RolePermission();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class RolePermission.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        RolePermission instance = new RolePermission();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class RolePermission.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        RolePermission instance = new RolePermission();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class RolePermission.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        RolePermission instance = new RolePermission();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class RolePermission.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        RolePermission instance = new RolePermission();
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class RolePermission.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        RolePermission instance = new RolePermission();
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorId method, of class RolePermission.
     */
    @Test
    public void testGetAuthorId() {
        System.out.println("getAuthorId");
        RolePermission instance = new RolePermission();
        Person expResult = null;
        Person result = instance.getAuthorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorId method, of class RolePermission.
     */
    @Test
    public void testSetAuthorId() {
        System.out.println("setAuthorId");
        Person authorId = null;
        RolePermission instance = new RolePermission();
        instance.setAuthorId(authorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPermissionId method, of class RolePermission.
     */
    @Test
    public void testGetPermissionId() {
        System.out.println("getPermissionId");
        RolePermission instance = new RolePermission();
        Permissions expResult = null;
        Permissions result = instance.getPermissionId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPermissionId method, of class RolePermission.
     */
    @Test
    public void testSetPermissionId() {
        System.out.println("setPermissionId");
        Permissions permissionId = null;
        RolePermission instance = new RolePermission();
        instance.setPermissionId(permissionId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleId method, of class RolePermission.
     */
    @Test
    public void testGetRoleId() {
        System.out.println("getRoleId");
        RolePermission instance = new RolePermission();
        Roles expResult = null;
        Roles result = instance.getRoleId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoleId method, of class RolePermission.
     */
    @Test
    public void testSetRoleId() {
        System.out.println("setRoleId");
        Roles roleId = null;
        RolePermission instance = new RolePermission();
        instance.setRoleId(roleId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class RolePermission.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        RolePermission instance = new RolePermission();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class RolePermission.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        RolePermission instance = new RolePermission();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RolePermission.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RolePermission instance = new RolePermission();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
