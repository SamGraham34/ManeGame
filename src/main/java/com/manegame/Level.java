/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *  This class holds methods that are used by Level GUI to control Graphics and
 *  other interactions of the user.
 * @author Sam
 */
public class Level {
    
    //Label: Level [1, 2, 3, 4, …] visible = true;
    //Label: PlayerName visible = true;
    //Label: Player Score visible = true;
    //Timer visible = false;
    List<Graphic> BenefitObjectIDs = new ArrayList<>();
    int numOfBenefitObjects = BenefitObjectIDs.size();
    float playerSpeed;
    float deductionObjectSpeed;
    public int boardHeight = 500;
    public int boardWidth = 500;
    
    // grid the board? Easier to identify barriers?
    
    /** Opens a player’s board.  Level status, name, and score populate from arg.  Creates a log begin 
       event.
        */
    /*
    public void loadLevel(int playerNum) {
         //   ManeDB.dbLogBeginEvent(p);
            new LevelGUI().setVisible(true);
    }
    */
      
    
    
    /** Keeps deduction objects in motion. 
     @param g (Graphic) */
    public void objectMove(Graphic g) { 
        /*
        switch (MovementDirection) {
            case UP:
                if (g.positionYaxis != 0) {
                    g.moveUp(g);
                }
                else {
                    g.moveLeft(g);
                }
        }
        */
        
    }

    /** Keeps player icon in motion. 
        @param g Graphic */
    public void playerIconMove(Graphic g) { 
	// playerDirectionChange(ch direction) 
    }

    /** Player score increases when a benefit object is struck.  The amount is determined by which object it 
       was.  The benefit object is then removed from the board.  numOfBenefitObjects reduced by 1. 
       @param p Player */
    public void scoreIncrease(Player p) {//hitBenefitObject(BENEFITOBJECT)) {
        p.playerScore += 0;//argument;
        //BenefitObject.removeBenefitObject(BenefitObjectID[]);
        //numOfBenefitObjects -= 1;
        if (keepPlaying(numOfBenefitObjects) == false) {
            endLevel(p);} 
    }

    /** Player score decreases, and speed slows when a deduction object is struck.  
     * The object determines the amount to decrease and how long the player is slowed.  
     * The deduction object is then out of play for 5 seconds. 
     @param p Player */
    public void scoreDecrease(Player p){ //hitDeductionObject(DEDUCTIONOBJECT)) {
        p.playerScore -= 0;//argument;
	//DeductionObject.hideDeductionObject(DEDUCTIONOBJECT);
	//playerSpeed -= DeductionObject.playerSpeedDecreaseAmount(DEDUCTIONOBJECT);
	//lblTimer.Visible = true;
    }
    
    /** Checks the board to see if all benefit objects have been collected 
        @param numOfBenefitObjects int 
        @return boolean */
    public boolean keepPlaying(int numOfBenefitObjects) {
	boolean gameOn = true;
	if (numOfBenefitObjects == 0) 
		gameOn = false;
	return gameOn;}
    
    /** Player defeats a level by collecting all benefit objects on the board.  
     * This triggers a save current status event.  The next level loads for the player. 
     @param p Player 
     */
    public void endLevel(Player p)  {
	p.playerLevel +=1;
        //ManeDB.dbSaveCurrentStatus(p);
	//Level.loadLevel(p);
    } 
}
