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
public class ABBTest {
    
    public ABBTest() {
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
     * Test of f method, of class ABB.
     */
    @Test
    public void testF() {
        System.out.println("f");
        ABB instance = new ABB();
        instance.f();
       
    }

    /**
     * Test of v method, of class ABB.
     */
    @Test
    public void testV() {
        System.out.println("Test v method of class ABB");
        ABB instance = new ABB();
        instance.v();
    }
    
}
