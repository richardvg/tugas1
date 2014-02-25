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
public class BTest {
    
    public BTest() {
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
     * Test of v method, of class B.
     */
    @Test
    public void testV() {
        
        System.out.println("Test f method of class A");
        B instance = new BImpl();
        instance.v();
    }

    public class BImpl implements B {

        public void v() {
        }
    }
    
}
