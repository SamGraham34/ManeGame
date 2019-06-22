/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

/**
 *  This class constructs new player objects.  It has methods for creating new 
 *  players or for building a return player using information stored in the 
 *  database.
 * @author Sam
 */
public class Player {
    //int playerIdentification = 1;
    
    int playerID;
    String playerName;
    String playerEmail;
    String playerPassword;
    int playerLevel;
    long playerScore;
    
    int newPlayerID(){
        
        playerID = ManeDB.dbGetPlayerCount();
        ++playerID;
        
        return playerID;
    }
    
    Player() {
        
    }
    
    /** New player constructor */
    Player(String name, String email, String password){
        playerID = newPlayerID(); //{returns a new player’s ID};
        playerName = name;
        playerEmail = email;
        playerPassword = password;
        playerLevel = 1;
        playerScore = 0; }

    /** Builds a player using the fields from All_Players_Table passed as arguments*/
    Player (int playerNum, String name, String email, String password, int level, long score) {
        playerID = playerNum;
        playerName = name;
        playerEmail = email;
        playerPassword = password;
        playerLevel = level;
        playerScore = score;
    }

}
