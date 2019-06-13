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
public class NewUserFormTest {
    
    public NewUserFormTest() {
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
     * Test of validInputName method, of class NewUserForm.
     */
    @Test
    public void testValidInputName() {
        System.out.println("validInputName");
        String name = "";
        NewUserForm instance = new NewUserForm();
        boolean expResult = false;
        boolean result = instance.validInputName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validInputEmail method, of class NewUserForm.
     */
    @Test
    public void testValidInputEmail() {
        System.out.println("validInputEmail");
        String inputEmail = "";
        NewUserForm instance = new NewUserForm();
        boolean expResult = false;
        boolean result = instance.validInputEmail(inputEmail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validInputPassword method, of class NewUserForm.
     */
    @Test
    public void testValidInputPassword() {
        System.out.println("validInputPassword");
        String inputPassword = "";
        NewUserForm instance = new NewUserForm();
        boolean expResult = false;
        boolean result = instance.validInputPassword(inputPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class NewUserForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewUserForm.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
