/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *  This is the base class for all animations on the user board.
 * @author Sam
 */
public class Graphic extends javax.swing.JLabel {


    Level level; //Player.playerLevel; //player’s current level

    static int GRAPHIC_HEIGHT = 30; //Height of all graphic icons
    static int GRAPHIC_WIDTH = 30; // width of all graphic icons
    static int OFFSET = 5; // strange offset for graphic barriers
    
    protected String imagePath;
    JLabel label = new JLabel();
    int speed = 2;
        
    int object_0_Direction = 0;
    int object_1_Direction = 1;
    int object_2_Direction = 2;
    
    public Graphic (){
        
        String imagePath;
        label = new JLabel();        
    }
    
    
    /** Creates a JLabel with image icon fitted to the size of the label for each
     * graphic.
     * @param path
     * @return JLabel
     */
    protected void setIconImage(Graphic g) {
    
        g.label.setBounds(250, 250, GRAPHIC_WIDTH, GRAPHIC_HEIGHT);
        ImageIcon graphicImage = new ImageIcon(g.imagePath);
        Image img = graphicImage.getImage();
        Image newImg = img.getScaledInstance(g.label.getWidth(), 
                g.label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        g.label.setIcon(image);     
    }
    
    /**
     * Objects move based on the object reference.  The current direction for each
     * deduction object is stored in a class variable.
     * @param d
     * @param ref 
     */
    public void objectMove(Graphic d, int ref) {
        Random randomDirection = new Random();
        int xAxis = d.label.getLocation().x;
        int yAxis = d.label.getLocation().y;
        //int objectReference = LevelGUI.deductObjects.indexOf(d);
       
       switch (ref) {
          case 0:
                
                switch (object_0_Direction) {
                    
                    case 0:
                        moveUp(d);
                        if (hitTopBarrier(d) == true) {
                            d.label.setLocation(xAxis, yAxis);
                            object_0_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 1:
                        moveLeft(d);
                        if (hitLeftBarrier(d) == true){
                            d.label.setLocation(xAxis, yAxis);
                            object_0_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 2:        
                        moveDown(d);
                        if (hitBottomBarrier(d) == true){
                            d.label.setLocation(xAxis, yAxis);
                            object_0_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 3:
                        moveRight(d);
                        if (hitRightBarrier(d) == true){
                            d.label.setLocation(xAxis, yAxis);
                            object_0_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    }
                break;
                
        
  
            case 1:
                    switch (object_1_Direction) {
                    
                    case 0:
                        moveUp(d);
                        if (hitTopBarrier(d) == true) {
                            d.label.setLocation(xAxis, yAxis);
                            object_1_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 1:
                        moveLeft(d);
                        if (hitLeftBarrier(d) == true){
                            d.label.setLocation(xAxis, yAxis);
                            object_1_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 2:        
                        moveDown(d);
                        if (hitBottomBarrier(d) == true){
                            d.label.setLocation(xAxis, yAxis);
                            object_1_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 3:
                        moveRight(d);
                        if (hitRightBarrier(d) == true){
                            d.label.setLocation(xAxis, yAxis);
                            object_1_Direction = randomDirection.nextInt(4);
                        }
                        break;
                   }
                    break;
            default :
                switch (object_2_Direction) {
                    
                    case 0:
                        moveUp(d);
                        if (hitTopBarrier(d) == true) {
                            d.label.setLocation(xAxis, yAxis);
                            object_2_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 1:
                        moveLeft(d);
                        if (hitLeftBarrier(d) == true){
                            d.label.setLocation(xAxis, yAxis);
                            object_2_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 2:        
                        moveDown(d);
                        if (hitBottomBarrier(d) == true){
                            d.label.setLocation(xAxis, yAxis);
                            object_2_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 3:
                        moveRight(d);
                        if (hitRightBarrier(d) == true){
                            d.label.setLocation(xAxis, yAxis);
                            object_2_Direction = randomDirection.nextInt(4);
                        }
                        break;
                   }
                break;
            }
        }
    
    
    /** Object in moves up.  
     * @param d (Graphic)
     */
    protected void moveUp(Graphic d) { 
           d.label.setLocation(d.label.getLocation().x, d.label.getLocation().y - d.speed);
    }
    
    /** Object moves down. A recursive method until another method changes the direction 
     @param d (Graphic)
     */
    protected void moveDown(Graphic d) {
            d.label.setLocation(d.label.getLocation().x, d.label.getLocation().y + d.speed);      
    }
    
    /** Object moves left. Recursive method until direction changed by another method 
     @param d (Graphic)
     */
    protected void moveLeft(Graphic d) {
            d.label.setLocation(d.label.getLocation().x - d.speed, d.label.getLocation().y); 
    }
    
    /** Object moves right. Recursive method until direction changed by another method 
     @param d (Graphic)
     */
    protected void moveRight(Graphic d) {
            d.label.setLocation(d.label.getLocation().x + d.speed, d.label.getLocation().y);
    }
    

    
   /**
    * Checks if an object hits the bottom of a barrier.
    * @param d
    * @return 
    */ 
    public boolean hitTopBarrier(Graphic d) {  
        boolean topBarrierHit = true;
        int movingObjectXaxis = d.label.getLocation().x;
        int movingObjectYaxis = d.label.getLocation().y;
        if (movingObjectYaxis > LevelGUI.MIN_Y_AXIS) {

            topBarrierHit = false;
        }
        
        for (BarrierObject b : LevelGUI.barrierIcons) {
               if (movingObjectYaxis >= b.label.getLocation().y && 
                       movingObjectYaxis <= b.label.getLocation().y + b.label.getHeight() + OFFSET){
                   if (movingObjectXaxis >= b.label.getLocation().x - GRAPHIC_WIDTH && 
                           movingObjectXaxis <= b.label.getLocation().x + b.label.getWidth()) {
                       topBarrierHit = true;
                       break;
                   }
               }
        }
        return topBarrierHit;
    }
    
    /**
     * Checks if an object hit a barrier on the left side of the barrier.
     * @param d
     * @return 
     */
    public boolean hitLeftBarrier(Graphic d) {  
        boolean leftBarrierHit = true;
        int movingObjectXaxis = d.label.getLocation().x;
        int movingObjectYaxis = d.label.getLocation().y;
        
        if (movingObjectXaxis > LevelGUI.MIN_X_AXIS) {
            leftBarrierHit = false;
        }
        for (BarrierObject b : LevelGUI.barrierIcons) {
               if (movingObjectYaxis >= b.label.getLocation().y - d.GRAPHIC_HEIGHT && 
                       movingObjectYaxis <= b.label.getLocation().y + b.label.getHeight()){
                   if (movingObjectXaxis >= b.label.getLocation().x && 
                           movingObjectXaxis <= b.label.getLocation().x + b.label.getWidth() + OFFSET) {
                       leftBarrierHit = true;
                       break;
                   }
               }
        }   
        return leftBarrierHit;
    }
    
    /**
     * Checks if an object hit the top of a barrier.
     * @param d
     * @return 
     */
        public boolean hitBottomBarrier(Graphic d) {  
        boolean bottomBarrierHit = true;
        int movingObjectXaxis = d.label.getLocation().x;
        int movingObjectYaxis = d.label.getLocation().y;

        if (movingObjectYaxis < LevelGUI.MAX_Y_AXIS) {
            bottomBarrierHit = false;
        }
        for (BarrierObject b : LevelGUI.barrierIcons) {
               if (movingObjectYaxis >= b.label.getLocation().y - (GRAPHIC_HEIGHT + OFFSET) && 
                       movingObjectYaxis <= b.label.getLocation().y + b.label.getHeight()){
                   if (movingObjectXaxis >= b.label.getLocation().x - GRAPHIC_WIDTH && 
                           movingObjectXaxis <= b.label.getLocation().x + b.label.getWidth()) {
                       bottomBarrierHit = true;
                       break;
                   }
               }
        }        
        return bottomBarrierHit;
    }
    
    /**
     * Checks if an object hit a barrier on the right side of the barrier.
     * @param d
     * @return 
     */
    public boolean hitRightBarrier(Graphic d) {  
        boolean rightBarrierHit = true;
        int movingObjectXaxis = d.label.getLocation().x;
        int movingObjectYaxis = d.label.getLocation().y;

        if (movingObjectXaxis < LevelGUI.MAX_X_AXIS) {
            rightBarrierHit = false;
        }
                
        for (BarrierObject b : LevelGUI.barrierIcons) {
            
               if (movingObjectYaxis >= b.label.getLocation().y - GRAPHIC_HEIGHT && 
                       movingObjectYaxis <= b.label.getLocation().y + b.label.getHeight()){
                   if (movingObjectXaxis >= b.label.getLocation().x - (GRAPHIC_WIDTH + OFFSET) && 
                           movingObjectXaxis <= b.label.getLocation().x - b.label.getWidth()) {
                       rightBarrierHit = true;
                   }
               }
        }      
        return rightBarrierHit;
    }
}

