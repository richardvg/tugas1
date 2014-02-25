/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itb.rpl.ppl.tugas.ci.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author khegi
 */
public class XTest {
    
    public XTest() {
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
     * Test of w method, of class X.
     */
    @Test
    public void testW() {
        System.out.println("Test w method of class X");
        X instance = new XImpl();
        int expResult = 0;
        int result = instance.w();
        assertEquals(expResult, result);
    }

    public class XImpl implements X {

        public int w() {
            return 0;
        }
    }
    
}
