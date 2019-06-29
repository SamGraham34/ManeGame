/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import java.awt.Image;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 * This class extends Graphic to control the interaction of deduction objects
 * on the user's board.
 * @author Sam
 */
public class DeductionObject extends Graphic {
    
    /**
     * Enum of Deduction objects.
     */
    public enum DEDUCTIONOBJECT {LANDLORD, TAX_COLLECTOR, STATE_INSPECTOR};

     /** Displays a deduction object image based on the object reference
      * @param DEDUCTIONOBJECT
      * @param g
      */
    public JLabel deductionObjectImage(int DEDUCTIONOBJECT) {        
        String path = "";
        
        switch (DEDUCTIONOBJECT){
            case 0:
                path = "D:\\Sam\\Pictures\\Mane Game\\LANDLORD.jpg";
                break;
            case 1:
                path = "D:\\Sam\\Pictures\\Mane Game\\TAX_COLLECTOR.jpg";
                break;
            case 2:
                path = "D:\\Sam\\Pictures\\Mane Game\\STATE_INSPECTOR.jpg";
                break;
        }       
        
        return Graphic.getGraphicImage(path);
    }

    /** Temporarily decrease the player’s speed by the amount returned.
     @param DEDUCTIONOBJECT
     @return double*/
    public double playerSpeedDecreaseAmount(int DEDUCTIONOBJECT) {
        double decreaseSpeedBy = 0.0;
        //returns a value to minus player’s speed by.
        return decreaseSpeedBy;
    }
        
    /** Player’s speed is slowed until the time value from this method runs out.
     @param DEDUCTIONOBJECT
     @return double
     */
    public double playerSpeedDecreaseTime(int DEDUCTIONOBJECT, DeductionObject d) {
        double slowedTime = 0.0;
        //returns a value of time to slow the player
        return slowedTime;
    }
    
    /** Determines the amount of deduction from the player’s score after striking a deduction 
        object. 
        @param DEDUCTIONOBJECT
        @return int
        */
    public int hitDeductionObject(int DEDUCTIONOBJECT) {
        int amountToReduceScore = 0;
        //returns a value to reduce player’s score by
        return amountToReduceScore;
    }
    
    /** Each deduction object starts in a different direction; this method determines the direction  
        of each deduction object at the start of the level. 
        @param DEDUCTIONOBJECT
     * @param d
        
        */
    /*
    public static int deductionObjectStartDirection(int DEDUCTIONOBJECT, int x, int y) { 
        
        switch (DEDUCTIONOBJECT){
            case 0:
                Graphic.moveDown(y);
                break;
            case 1:
                Graphic.moveLeft(x);
                break;
            case 2:
                Graphic.moveRight(x);
                break;
        }
        
        return y;
        
           
    } */

    /** After a player strikes an object, the deduction object is out of play for 5 seconds. 
     @param DEDUCTIONOBJECT
     */
    public void hideDeductionObject(int DEDUCTIONOBJECT) {
        //set image label visible = false for 5 seconds
    }
    
    /** Deduction object changes to a random direction.  Direction may be changed to the current direction.  
        It’s random.
        @param DEDUCTIONOBJECT
        @return char
        */
    public char deductionObjectRandomDirection(int DEDUCTIONOBJECT) { 
        char directionChange = 75;
        // code to change direction randomly
        return directionChange;
    }
}
