/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Manny
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({myproperty._controller.AccountControllerIT.class, myproperty._controller.PersonControllerIT.class, myproperty._controller.RegistrationControllerIT.class, myproperty._controller.UserControllerIT.class})
public class _controllerITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
