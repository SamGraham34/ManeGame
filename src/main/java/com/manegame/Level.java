/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JLabel;

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
    
      
    
    public static JLabel getBarrier() {
         
        String path = "D:\\Sam\\Pictures\\Mane Game\\BLUE.jpg";
        return Graphic.getGraphicImage(path);

        
        
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
