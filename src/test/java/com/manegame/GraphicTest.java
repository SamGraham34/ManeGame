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
public class GraphicTest {
    
    public GraphicTest() {
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
     * Test of benefitObjectImage method, of class Graphic.
     */
    @Test
    public void testBenefitObjectImage() {
        System.out.println("benefitObjectImage");
        int BENEFITOBJECT = 0;
        Graphic instance = new Graphic();
        String expResult = "";
        String result = instance.benefitObjectImage(BENEFITOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Image Not Found.");
    }

    /**
     * Test of hitBenefitObject method, of class Graphic.
     */
    @Test
    public void testHitBenefitObject() {
        System.out.println("hitBenefitObject");
        int BENEFITOBJECT = 0;
        Graphic instance = new Graphic();
        int expResult = 0;
        int result = instance.hitBenefitObject(BENEFITOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBenefitObject method, of class Graphic.
     */
    @Test
    public void testRemoveBenefitObject() {
        System.out.println("removeBenefitObject");
        int BENEFITOBJECT = 0;
        Graphic instance = new Graphic();
        instance.removeBenefitObject(BENEFITOBJECT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deductionObjectImage method, of class Graphic.
     */
    @Test
    public void testDeductionObjectImage() {
        System.out.println("deductionObjectImage");
        int DEDUCTIONOBJECT = 0;
        Graphic instance = new Graphic();
        String expResult = "";
        String result = instance.deductionObjectImage(DEDUCTIONOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerSpeedDecreaseAmount method, of class Graphic.
     */
    @Test
    public void testPlayerSpeedDecreaseAmount() {
        System.out.println("playerSpeedDecreaseAmount");
        int DEDUCTIONOBJECT = 0;
        Graphic instance = new Graphic();
        double expResult = 0.0;
        double result = instance.playerSpeedDecreaseAmount(DEDUCTIONOBJECT);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerSpeedDecreaseTime method, of class Graphic.
     */
    @Test
    public void testPlayerSpeedDecreaseTime() {
        System.out.println("playerSpeedDecreaseTime");
        int DEDUCTIONOBJECT = 0;
        Graphic instance = new Graphic();
        double expResult = 0.0;
        double result = instance.playerSpeedDecreaseTime(DEDUCTIONOBJECT);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hitDeductionObject method, of class Graphic.
     */
    @Test
    public void testHitDeductionObject() {
        System.out.println("hitDeductionObject");
        int DEDUCTIONOBJECT = 0;
        Graphic instance = new Graphic();
        int expResult = 0;
        int result = instance.hitDeductionObject(DEDUCTIONOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deductionObjectStartDirection method, of class Graphic.
     */
    @Test
    public void testDeductionObjectStartDirection() {
        System.out.println("deductionObjectStartDirection");
        int DEDUCTIONOBJECT = 0;
        Graphic instance = new Graphic();
        char expResult = ' ';
        char result = instance.deductionObjectStartDirection(DEDUCTIONOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hideDeductionObject method, of class Graphic.
     */
    @Test
    public void testHideDeductionObject() {
        System.out.println("hideDeductionObject");
        int DEDUCTIONOBJECT = 0;
        Graphic instance = new Graphic();
        instance.hideDeductionObject(DEDUCTIONOBJECT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveUp method, of class Graphic.
     */
    @Test
    public void testMoveUp() {
        System.out.println("moveUp");
        Graphic g = null;
        Graphic instance = new Graphic();
        instance.moveUp(g);            
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveDown method, of class Graphic.
     */
    @Test
    public void testMoveDown() {
        System.out.println("moveDown");
        Graphic g = null;
        Graphic instance = new Graphic();
        instance.moveDown(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveLeft method, of class Graphic.
     */
    @Test
    public void testMoveLeft() {
        System.out.println("moveLeft");
        Graphic g = null;
        Graphic instance = new Graphic();
        instance.moveLeft(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveRight method, of class Graphic.
     */
    @Test
    public void testMoveRight() {
        System.out.println("moveRight");
        Graphic g = null;
        Graphic instance = new Graphic();
        instance.moveRight(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hitBarrier method, of class Graphic.
     */
    @Test
    public void testHitBarrier() {
        System.out.println("hitBarrier");
        Graphic g = null;
        Graphic instance = new Graphic();
        instance.hitBarrier(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deductionObjectRandomDirection method, of class Graphic.
     */
    @Test
    public void testDeductionObjectRandomDirection() {
        System.out.println("deductionObjectRandomDirection");
        int DEDUCTIONOBJECT = 0;
        Graphic instance = new Graphic();
        char expResult = ' ';
        char result = instance.deductionObjectRandomDirection(DEDUCTIONOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerDirectionChange method, of class Graphic.
     */
    @Test
    public void testPlayerDirectionChange() {
        System.out.println("playerDirectionChange");
        char direction = ' ';
        Graphic instance = new Graphic();
        instance.playerDirectionChange(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
