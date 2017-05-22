/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._dao;

import java.util.List;
import myproperty._entities.Person;
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
public class PersonDAOIT {

    public PersonDAOIT() {
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
     * Test of create method, of class PersonDAO.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Person person = null;
        PersonDAO instance = new PersonDAOImpl();
        Person expResult = null;
        Person result = instance.create(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePerson method, of class PersonDAO.
     */
    @Test
    public void testDeletePerson() throws Exception {
        System.out.println("deletePerson");
        Integer id = null;
        PersonDAO instance = new PersonDAOImpl();
        instance.deletePerson(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class PersonDAO.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Person person = null;
        PersonDAO instance = new PersonDAOImpl();
        Person expResult = null;
        Person result = instance.edit(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPerson method, of class PersonDAO.
     */
    @Test
    public void testFindPerson() throws Exception {
        System.out.println("findPerson");
        Integer id = null;
        PersonDAO instance = new PersonDAOImpl();
        Person expResult = null;
        Person result = instance.findPerson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserEntities method, of class PersonDAO.
     */
    @Test
    public void testFindUserEntities_0args() throws Exception {
        System.out.println("findUserEntities");
        PersonDAO instance = new PersonDAOImpl();
        List<Person> expResult = null;
        List<Person> result = instance.findUserEntities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserEntities method, of class PersonDAO.
     */
    @Test
    public void testFindUserEntities_int_int() throws Exception {
        System.out.println("findUserEntities");
        int maxResults = 0;
        int firstResult = 0;
        PersonDAO instance = new PersonDAOImpl();
        List<Person> expResult = null;
        List<Person> result = instance.findUserEntities(maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonDAOImpl implements PersonDAO {

        public Person create(Person person) throws Exception {
            return null;
        }

        public void deletePerson(Integer id) throws Exception {
        }

        public Person edit(Person person) throws Exception {
            return null;
        }

        public Person findPerson(Integer id) throws Exception {
            return null;
        }

        public List<Person> findUserEntities() throws Exception {
            return null;
        }

        public List<Person> findUserEntities(int maxResults, int firstResult) throws Exception {
            return null;
        }
    }

}
