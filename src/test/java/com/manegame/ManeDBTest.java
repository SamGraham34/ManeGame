/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.sqlite.util.StringUtils;

/**
 *
 * @author Sam
 */
public class ManeDBTest {
    
    public ManeDBTest() {
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
     * Test of dbConnect method, of class ManeDB.
     */
    @Test
    public void testDbConnect() throws Exception {
        System.out.println("dbConnect");
        Connection expResult = null;
        Connection result = ManeDB.dbConnect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dbGetPlayerData method, of class ManeDB.
     */
    @Test
    public void testDbGetPlayerData() {
        System.out.println("dbGetPlayerData");
        ManeDB.dbGetPlayerData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dbSaveNewPlayer method, of class ManeDB.
     */
    @Test
    public void testDbSaveNewPlayer() throws Exception {
        System.out.println("dbSaveNewPlayer");
        Player p = null;
        Assert.assertTrue(Pattern.matches("[a-zA-Z0-9\\s\\-]{1,50}", p.playerName));
        Assert.assertTrue(Pattern.matches("[a-zA-Z0-9\\s\\-\\@]{1,50}", p.playerEmail));
        Assert.assertTrue(Pattern.matches("[a-zA-Z0-9\\s\\-]{1,50}", p.playerPassword));
        ManeDB.dbSaveNewPlayer(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dbCreatePlayerLogTable method, of class ManeDB.
     */
    @Test
    public void testDbCreatePlayerLogTable() throws Exception {
        System.out.println("dbCreatePlayerLogTable");
        int playerNum = 0;
        ManeDB.dbCreatePlayerLogTable(playerNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dbSaveCurrentStatus method, of class ManeDB.
     */
    @Test
    public void testDbSaveCurrentStatus() throws Exception {
        System.out.println("dbSaveCurrentStatus");
        Player p = null;
        long score = 0L;
        int Level = 0;
        ManeDB instance = new ManeDB();
        instance.dbSaveCurrentStatus(p, score, Level);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dbVerifyLoginEmail method, of class ManeDB.
     */
    @Test
    public void testDbVerifyLoginEmail() throws Exception {
        System.out.println("dbVerifyLoginEmail");
        String email = "";
        ManeDB instance = new ManeDB();
        Player expResult = null;
        Player result = instance.dbVerifyLoginEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dbGetPlayer method, of class ManeDB.
     */
    @Test
    public void testDbGetPlayer() {
        System.out.println("dbGetPlayer");
        ManeDB instance = new ManeDB();
        Player expResult = null;
        Player result = instance.dbGetPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 
    /**
     * Test of dbGetLog method, of class ManeDB.
     */
    @Test
    public void testDbGetLog() {
        System.out.println("dbGetLog");
        Player p = null;
        ManeDB instance = new ManeDB();
        instance.dbGetLog(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dbLogBeginEvent method, of class ManeDB.
     */
    @Test
    public void testDbLogBeginEvent() throws Exception {
        System.out.println("dbLogBeginEvent");
        Player p = null;
        ManeDB instance = new ManeDB();
        instance.dbLogBeginEvent(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dbLogEndEvent method, of class ManeDB.
     */
    @Test
    public void testDbLogEndEvent() throws Exception {
        System.out.println("dbLogEndEvent");
        Player p = null;
        ManeDB instance = new ManeDB();
        instance.dbLogEndEvent(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
