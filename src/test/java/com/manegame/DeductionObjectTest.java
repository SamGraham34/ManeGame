/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam
 */
public class DeductionObjectTest {
    
    public DeductionObjectTest() {
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
     * Test of deductionObjectImage method, of class DeductionObject.
     */
    @Test
    public void testDeductionObjectImage() {
        System.out.println("deductionObjectImage");
        int DEDUCTIONOBJECT = 0;
        DeductionObject instance = new DeductionObject();
        String expResult = "";
        String result = instance.deductionObjectImage(DEDUCTIONOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerSpeedDecreaseAmount method, of class DeductionObject.
     */
    @Test
    public void testPlayerSpeedDecreaseAmount() {
        System.out.println("playerSpeedDecreaseAmount");
        int DEDUCTIONOBJECT = 0;
        DeductionObject instance = new DeductionObject();
        double expResult = 0.0;
        double result = instance.playerSpeedDecreaseAmount(DEDUCTIONOBJECT);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerSpeedDecreaseTime method, of class DeductionObject.
     */
    @Test
    public void testPlayerSpeedDecreaseTime() {
        System.out.println("playerSpeedDecreaseTime");
        int DEDUCTIONOBJECT = 0;
        DeductionObject instance = new DeductionObject();
        double expResult = 0.0;
        double result = instance.playerSpeedDecreaseTime(DEDUCTIONOBJECT);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hitDeductionObject method, of class DeductionObject.
     */
    @Test
    public void testHitDeductionObject() {
        System.out.println("hitDeductionObject");
        int DEDUCTIONOBJECT = 0;
        DeductionObject instance = new DeductionObject();
        int expResult = 0;
        int result = instance.hitDeductionObject(DEDUCTIONOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deductionObjectStartDirection method, of class DeductionObject.
     */
    @Test
    public void testDeductionObjectStartDirection() {
        System.out.println("deductionObjectStartDirection");
        int DEDUCTIONOBJECT = 0;
        DeductionObject instance = new DeductionObject();
        char expResult = ' ';
        char result = instance.deductionObjectStartDirection(DEDUCTIONOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hideDeductionObject method, of class DeductionObject.
     */
    @Test
    public void testHideDeductionObject() {
        System.out.println("hideDeductionObject");
        int DEDUCTIONOBJECT = 0;
        DeductionObject instance = new DeductionObject();
        instance.hideDeductionObject(DEDUCTIONOBJECT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deductionObjectRandomDirection method, of class DeductionObject.
     */
    @Test
    public void testDeductionObjectRandomDirection() {
        System.out.println("deductionObjectRandomDirection");
        int DEDUCTIONOBJECT = 0;
        DeductionObject instance = new DeductionObject();
        char expResult = ' ';
        char result = instance.deductionObjectRandomDirection(DEDUCTIONOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
