/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

/**
 *  This is the base class for all animations on the user board.
 * @author Sam
 */
public class Graphic {
    Level level; //Player.playerLevel; //player’s current level
    int positionXaxis = 0;//current position on board
    int positionYaxis = 0;
    int size = 15; //15? Trial and error it
    
    /** Object in motion moves up.  This method to be called recursively until an event (barrier or player input) 
    occurs 
    @param g (Graphic)
    */
    public void moveUp(Graphic g) {    
        /*
        g.positionYaxis = g.positionYaxis - 1;
        */
    }
    
    /** Object moves down. A recursive method until another method changes the direction 
     @param g (Graphic)
     */
    public void moveDown(Graphic g) {
        /*
        g.positionYaxis = g.positionYaxis + 1;
        */
    }
    
    /** Object moves left. Recursive method until direction changed by another method 
     @param g (Graphic)
     */
    public void moveLeft(Graphic g) {
        /*
        g.positionXaxis = g.positionXaxis - 1;
        */
    }
    
    /** Object moves right. Recursive method until direction changed by another method 
     @param g (Graphic)
     */
    public void moveRight(Graphic g) {
        /*
        g.positionXaxis = g.positionXaxis + 1;
        */
    }
    
    /** Any graphic that runs into a barrier will turn 90 degrees to the left until there is no barrier 
     @param g (Graphic)
     */
    public void hitBarrier(Graphic g) {  
        //code to turn left
    }
}

