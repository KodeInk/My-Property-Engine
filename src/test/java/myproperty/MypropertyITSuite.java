/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty;

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
@Suite.SuiteClasses({myproperty._controller._controllerITSuite.class, myproperty.db.DbITSuite.class, myproperty.annotation.AnnotationITSuite.class, myproperty._entities._entitiesITSuite.class, myproperty._services._servicesITSuite.class, myproperty.ApplicationIT.class, myproperty._dao._daoITSuite.class, myproperty.helper.HelperITSuite.class})
public class MypropertyITSuite {

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
