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
public class PlayerIconTest extends GraphicTest {
    
    public PlayerIconTest() {
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
     * Test of playerDirectionChange method, of class PlayerIcon.
     */
    @Test
    public void testPlayerDirectionChange() {
        System.out.println("playerDirectionChange");
        char direction = ' ';
        PlayerIcon instance = new PlayerIcon();
        instance.playerDirectionChange(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeImageDirection method, of class PlayerIcon.
     */
    @Test
    public void testChangeImageDirection() {
        System.out.println("changeImageDirection");
        PlayerIcon instance = new PlayerIcon();
        instance.changeImageDirection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
