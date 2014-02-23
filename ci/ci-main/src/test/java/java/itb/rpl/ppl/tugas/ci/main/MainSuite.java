/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java.itb.rpl.ppl.tugas.ci.main;

import itb.rpl.ppl.tugas.ci.main.ABBTest;
import itb.rpl.ppl.tugas.ci.main.ABTest;
import itb.rpl.ppl.tugas.ci.main.ATest;
import itb.rpl.ppl.tugas.ci.main.BTest;
import itb.rpl.ppl.tugas.ci.main.CTest;
import itb.rpl.ppl.tugas.ci.main.MainTest;
import itb.rpl.ppl.tugas.ci.main.PTest;
import itb.rpl.ppl.tugas.ci.main.QTest;
import itb.rpl.ppl.tugas.ci.main.XTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author khegi
 */
public class MainSuite extends TestCase {
    
    public MainSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("MainSuite");
        suite.addTest(XTest.suite());
        suite.addTest(QTest.suite());
        suite.addTest(ABBTest.suite());
        suite.addTest(CTest.suite());
        suite.addTest(ABTest.suite());
        suite.addTest(PTest.suite());
        suite.addTest(ATest.suite());
        suite.addTest(BTest.suite());
        suite.addTest(MainTest.suite());
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
}
