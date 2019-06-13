/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import junit.framework.Assert;
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
     * Test graphic location too high to be seen by player.
     */
    @Test
    public void testGraphicAboveBoard() {
        System.out.println("tooHigh");
        Graphic g = null;
        Graphic instance = new Graphic();
        Assert.assertTrue("Graphic is above player's view", g.positionYaxis >= 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     /**
     * Test graphic location too low to be seen by player.
     */
    @Test
    public void testGraphicBelowBoard() {
        System.out.println("tooLow");
        Graphic g = null;
        Level level = null;
        Graphic instance = new Graphic();
        Assert.assertTrue("Graphic is below player's view", g.positionYaxis <= level.boardHeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /**
     * Test graphic location too far left to be seen by player.
     */
    @Test
    public void testGraphicLeftOfBoard() {
        System.out.println("tooFarLeft");
        Graphic g = null;
        Graphic instance = new Graphic();
        Assert.assertTrue("Graphic is left of player's view", g.positionXaxis >= 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /**
     * Test graphic location too far right to be seen by player.
     */
    @Test
    public void testGraphicRightOfBoard() {
        System.out.println("tooFarRight");
        Graphic g = null;
        Level level = null;
        Graphic instance = new Graphic();
        Assert.assertTrue("Graphic is right of player's view", g.positionXaxis <= level.boardWidth);
        // TODO review the generated test code and remove the default call to fail.
    }
        
}
