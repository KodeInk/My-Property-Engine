/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproperty.helper.exception;

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
@Suite.SuiteClasses({myproperty.helper.exception.ForbiddenExceptionIT.class, myproperty.helper.exception.MessageIT.class, myproperty.helper.exception.NotFoundExceptionIT.class, myproperty.helper.exception.BadRequestExceptionIT.class, myproperty.helper.exception.InternalErrorExceptionIT.class, myproperty.helper.exception.ServiceUnAvailableExceptionIT.class, myproperty.helper.exception.UnauthorizedExceptionIT.class})
public class ExceptionITSuite {

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
