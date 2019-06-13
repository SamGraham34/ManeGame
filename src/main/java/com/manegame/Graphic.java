/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

/**
 *
 * @author Sam
 */
public class Graphic {
    Level level; //Player.playerLevel; //player’s current level
    int positionXaxis = 0;//current position on board
    int positionYaxis = 0;
    int size = 15; //15? Trial and error it
    
    public enum BENEFITOBJECT {HAIRCUT, FOIL, BLOW_DRY};
    public enum DEDUCTIONOBJECT {LANDLORD, TAX_COLLECTOR, STATE_INSPECTOR};
    
    public String benefitObjectImage(int BENEFITOBJECT) { 
        
        String benefitImage = "";
        /*
        switch (BENEFITOBJECT) {
            case 0: benefitImage = ""; //Haircut image;
		break;
            case 1: benefitImage = "";// Foil image;
		break;
            case 2: benefitImage = "";// Blowdryer image;
		break;
        }
        */
        return benefitImage;
    }
    
    public int hitBenefitObject(int BENEFITOBJECT) {
        int benefitAmount = 0;
        /*
        switch (BENEFITOBJECT){
            case 0: benefitAmount = 15;
		break;
            case 1: benefitAmount = 25;
		break;
            case 2: benefitAmount = 5;
		break;
        }
        */
        return benefitAmount; 
    }
    
    /** A benefit object that has been collected is taken out of play */
    public void removeBenefitObject(int BENEFITOBJECT) {
        //remove BENEFITOBJECT;
    }
    
    /** Displays a deduction object image based on the object reference*/
    public String deductionObjectImage(int DEDUCTIONOBJECT) { 
        String deductionImage = "";
        // code to find correct image location
        return deductionImage;
    }

    /** Temporarily decrease the player’s speed by the amount returned.*/
    public double playerSpeedDecreaseAmount(int DEDUCTIONOBJECT) {
        double decreaseSpeedBy = 0.0;
        //returns a value to minus player’s speed by.
        return decreaseSpeedBy;
    }
        
    /** Player’s speed is slowed until the time value from this method runs out. */
    public double playerSpeedDecreaseTime(int DEDUCTIONOBJECT) {
        double slowedTime = 0.0;
        //returns a value of time to slow the player
        return slowedTime;
    }
    
    /** Determines the amount of deduction from the player’s score after striking a deduction 
        object. */
    public int hitDeductionObject(int DEDUCTIONOBJECT) {
        int amountToReduceScore = 0;
        //returns a value to reduce player’s score by
        return amountToReduceScore;
    }
    
    /** Each deduction object starts in a different direction; this method determines the direction  
        of each deduction object at the start of the level. */
    public char deductionObjectStartDirection(int DEDUCTIONOBJECT) { 
        char startDirection = 72;
        // code to begin start directions
        return startDirection;    
    }

    /** After a player strikes an object, the deduction object is out of play for 5 seconds */
    public void hideDeductionObject(int DEDUCTIONOBJECT) {
        //set image label visible = false for 5 seconds
    }
    
    /** Object in motion moves up.  This method to be called recursively until an event (barrier or player input) 
    occurs */
    public void moveUp(Graphic g) {    
        /*
        g.positionYaxis = g.positionYaxis - 1;
        */
    }
    
    /** Object moves down. A recursive method until another method changes the direction */
    public void moveDown(Graphic g) {
        /*
        g.positionYaxis = g.positionYaxis + 1;
        */
    }
    
    /** Object moves left. Recursive method until direction changed by another method */
    public void moveLeft(Graphic g) {
        /*
        g.positionXaxis = g.positionXaxis - 1;
        */
    }
    
    /** Object moves right. Recursive method until direction changed by another method */
    public void moveRight(Graphic g) {
        /*
        g.positionXaxis = g.positionXaxis + 1;
        */
    }
    
    /** Any graphic that runs into a barrier will turn 90 degrees to the left until there is no barrier */
    public void hitBarrier(Graphic g) {  
        //code to turn left
    }
    
    /** Deduction object changes to a random direction.  Direction may be changed to the current direction.  It’s 
        random.*/
    public char deductionObjectRandomDirection(int DEDUCTIONOBJECT) { 
        char directionChange = 75;
        // code to change direction randomly
        return directionChange;
    }
    
    /** This method allows the player to interact with the player icon.  Directional arrows will 
    control the player’s movements. */
    public void playerDirectionChange(char direction) {
        // code to change player direction.
        //ch[] directionArrows = [72, 75, 77, 80]; )
    }





}

