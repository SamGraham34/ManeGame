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
public class Player {
    int playerIdentification = 0;
    
    int playerID = newPlayerID();
    String playerName;
    String playerEmail;
    String playerPassword;
    int playerLevel;
    long playerScore;
    
    int newPlayerID(){
        ++playerIdentification;
        playerID = playerIdentification;
        
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
