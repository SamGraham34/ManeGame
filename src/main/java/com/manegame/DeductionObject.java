/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 * This class extends Graphic to control the interaction of deduction objects
 * on the user's board.
 * @author Sam
 */
public class DeductionObject extends Graphic {
    
    Timer sleeper;
    int priorHit = 0;
    
    /**
     * Enum of Deduction objects.
     */
    //public enum DEDUCTIONOBJECT {LANDLORD, TAX_COLLECTOR, STATE_INSPECTOR};

     /** Displays a deduction object image based on the object reference
      * @param DEDUCTIONOBJECT
      * @param g
      */
    
        public void setIconImage(DeductionObject d, int ref) {        
        
        
        switch (ref){
            case 0:
                d.imagePath = "D:\\Sam\\Pictures\\Mane Game\\LANDLORD.jpg";
                break;
            case 1:
                d.imagePath = "D:\\Sam\\Pictures\\Mane Game\\TAX_COLLECTOR.jpg";
                break;
            case 2:
                d.imagePath = "D:\\Sam\\Pictures\\Mane Game\\STATE_INSPECTOR.jpg";
                break;
        }       
        
        d.setIconImage(d);
    }

    /** Temporarily decrease the player’s speed by the amount returned.
     @param DEDUCTIONOBJECT
     @return double*/
    public int playerSpeedDecreaseAmount(int DEDUCTIONOBJECT) {
        int decreaseSpeedBy = 2;
        //returns a value to minus player’s speed by.
        return decreaseSpeedBy;
    }
        
    /** Player’s speed is slowed until the time value from this method runs out.
     @param DEDUCTIONOBJECT
     @return double
     */
    public double playerSpeedDecreaseTime(int DEDUCTIONOBJECT, DeductionObject d) {
        double slowedTime = 0.0;
        //Thread.sleep(5000);
        //returns a value of time to slow the player
        return slowedTime;
    }
    
    /** Determines the amount of deduction from the player’s score after striking a deduction 
        object. 
        @param DEDUCTIONOBJECT
        @return int
        */
    public int hitDeductionObject(int ref) {
        int value = 0;
        switch (ref){
            case 0:
                value = 25;
                break;
            case 1:
                value = 50;
                break;
            default:
                value = 100;     
        } 
        //returns a value to reduce player’s score by
        return value;
    }
    


    /** After a player strikes an object, the deduction object is out of play for 5 seconds. 
     @param d DeductionObject
     */
    public void hideDeductionObject(DeductionObject d) {
        
        if (d.priorHit > 0){
            d.sleeper.stop(); // stop previous timer
        }
        else{
            d.sleeper = new Timer(5000, new ActionListener(){ // initialize timer
                @Override
                public void actionPerformed(ActionEvent evt) {
                    d.label.setVisible(true); //icon back on board  
                    
                }
            });      
            d.priorHit++;
        }
        d.sleeper.start(); // start the timer
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
