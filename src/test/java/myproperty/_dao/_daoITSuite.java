/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty._dao;

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
@Suite.SuiteClasses({myproperty._dao.userDAOImplIT.class, myproperty._dao.userDAOIT.class, myproperty._dao.PersonDAOIT.class, myproperty._dao.PersonDAOImplIT.class})
public class _daoITSuite {

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
