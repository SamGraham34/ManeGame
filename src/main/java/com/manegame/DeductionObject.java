/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

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
      @param DEDUCTIONOBJECT
      @return String
      */
    public String deductionObjectImage(int DEDUCTIONOBJECT) { 
        String deductionImage = "";
        // code to find correct image location
        return deductionImage;
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
    public double playerSpeedDecreaseTime(int DEDUCTIONOBJECT) {
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
        @return char
        */
    public char deductionObjectStartDirection(int DEDUCTIONOBJECT) { 
        char startDirection = 72;
        // code to begin start directions
        return startDirection;    
    }

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
