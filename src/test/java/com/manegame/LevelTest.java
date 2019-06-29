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
public class LevelTest {
    
    public LevelTest() {
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
     * Test of loadLevel method, of class Level.
     */
    @Test
    public void testLoadLevel() {
        System.out.println("loadLevel");
        Player p = null;
        Level instance = new Level();
        //instance.loadLevel(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of objectMove method, of class Level.
     */
    @Test
    public void testObjectMove() {
        System.out.println("objectMove");
        Graphic g = null;
        Level instance = new Level();
        instance.objectMove(g);
        
           if (g.positionXaxis < 0 || g.positionYaxis < 0 
                   || g.positionXaxis > instance.boardWidth || g.positionYaxis > instance.boardHeight ) {
               fail("Graphic off the board");
           }
           else {
               
           }
               
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of playerIconMove method, of class Level.
     */
    @Test
    public void testPlayerIconMove() {
        System.out.println("playerIconMove");
        Graphic g = null;
        Level instance = new Level();
        instance.playerIconMove(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scoreIncrease method, of class Level.
     */
    @Test
    public void testScoreIncrease() {
        System.out.println("scoreIncrease");
        Player p = null;
        Level instance = new Level();
        instance.scoreIncrease(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("Problem with increasing score");
    }

    /**
     * Test of scoreDecrease method, of class Level.
     */
    @Test
    public void testScoreDecrease() {
        System.out.println("scoreDecrease");
        Player p = null;
        Level instance = new Level();
        instance.scoreDecrease(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keepPlaying method, of class Level.
     */
    @Test
    public void testKeepPlaying() {
        System.out.println("keepPlaying");
        int numOfBenefitObjects = 0;
        Level instance = new Level();
        boolean expResult = false;
        boolean result = instance.keepPlaying(numOfBenefitObjects);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endLevel method, of class Level.
     */
    @Test
    public void testEndLevel() {
        System.out.println("endLevel");
        Player p = null;
        Level instance = new Level();
        instance.endLevel(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
