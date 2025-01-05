/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.isima.codereview.tp1;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author locostiou
 */
public class AwesomePasswordCheckerTest {
    
  /**
   *
   */
  public AwesomePasswordCheckerTest()   { }

    /**
     * Test of getInstance method, of class AwesomePasswordChecker.
   * @throws java.lang.Exception
     */
    @Test
    public void testGetInstance_File() throws Exception {
//        System.out.println("getInstance");
//        File file = null;
//        AwesomePasswordChecker expResult = null;
//        AwesomePasswordChecker result = AwesomePasswordChecker.getInstance(file);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class AwesomePasswordChecker.
   * @throws java.lang.Exception
     */
    @Test
    public void testGetInstance_0args() throws Exception {
//        System.out.println("getInstance");
//        AwesomePasswordChecker expResult = null;
//        AwesomePasswordChecker result = AwesomePasswordChecker.getInstance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of maskAff method, of class AwesomePasswordChecker.
     */
    @Test
    public void testMaskAff() {
//        System.out.println("maskAff");
//        String password = "";
//        AwesomePasswordChecker instance = null;
//        int[] expResult = null;
//        int[] result = instance.maskAff(password);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDIstance method, of class AwesomePasswordChecker.
     */
    @Test
    public void testGetDIstance() {
        System.out.println("getDIstance");
        String password1 = null;
        double expResult1 = 0.0;
        double result1;
      try {
        result1 = AwesomePasswordChecker.getInstance().getDIstance(password1);
        assertEquals(expResult1, result1, 0);
      } catch (IOException ex) {
        fail("We never have to be here");
      }
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ComputeMD5 method, of class AwesomePasswordChecker.
     */
    @Test
    public void testComputeMD5() {
        System.out.println("ComputeMD5");
        String result = AwesomePasswordChecker.ComputeMD5(null);
        String result2;
        String expResult2 = "5c1df16bd4392da62d100a5c06ec5d11";
        result2 = AwesomePasswordChecker.ComputeMD5("BZH");
        assertNull(result);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
  
    
    } 

 
}
