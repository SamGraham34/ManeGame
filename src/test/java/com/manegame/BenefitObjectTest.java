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
public class BenefitObjectTest extends GraphicTest {
    
    public BenefitObjectTest() {
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
     * Test of benefitObjectImage method, of class BenefitObject.
     */
    @Test
    public void testBenefitObjectImage() {
        System.out.println("benefitObjectImage");
        int BENEFITOBJECT = 0;
        BenefitObject instance = new BenefitObject();
        String expResult = "";
        String result = instance.benefitObjectImage(BENEFITOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hitBenefitObject method, of class BenefitObject.
     */
    @Test
    public void testHitBenefitObject() {
        System.out.println("hitBenefitObject");
        int BENEFITOBJECT = 0;
        BenefitObject instance = new BenefitObject();
        int expResult = 0;
        int result = instance.hitBenefitObject(BENEFITOBJECT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBenefitObject method, of class BenefitObject.
     */
    @Test
    public void testRemoveBenefitObject() {
        System.out.println("removeBenefitObject");
        int BENEFITOBJECT = 0;
        BenefitObject instance = new BenefitObject();
        instance.removeBenefitObject(BENEFITOBJECT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
