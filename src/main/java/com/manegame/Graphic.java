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
    static int object_0_Direction = 0;
    static int object_1_Direction = 1;
    static int object_2_Direction = 2;
    
    /** Creates a JLabel with image icon fitted to the size of the label for each
     * graphic.
     * @param path
     * @return JLabel
     */
    public static JLabel getGraphicImage(String path) {
        
        JLabel graphic = new Graphic();
        graphic.setBounds(250, 250, GRAPHIC_WIDTH, GRAPHIC_HEIGHT);
        ImageIcon graphicImage = new ImageIcon(path);
        Image img = graphicImage.getImage();
        Image newImg = img.getScaledInstance(graphic.getWidth(), 
                graphic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        graphic.setIcon(image);
        
        return graphic;
        
    }
    
        public static JLabel getVerticalBarrier(String path) {
        
        JLabel verticalBarrier = new Graphic();
        verticalBarrier.setBounds(250, 250, 15, 100);
        ImageIcon graphicImage = new ImageIcon(path);
        Image img = graphicImage.getImage();
        Image newImg = img.getScaledInstance(verticalBarrier.getWidth(), 
                verticalBarrier.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        verticalBarrier.setIcon(image);
        verticalBarrier.setOpaque(false);
        
        return verticalBarrier;
    }
        
    public static JLabel getHorizontalBarrier(String path) {
        
        JLabel horizontalBarrier = new Graphic();
        horizontalBarrier.setBounds(250, 250, 100, 15);
        ImageIcon graphicImage = new ImageIcon(path);
        Image img = graphicImage.getImage();
        Image newImg = img.getScaledInstance(horizontalBarrier.getWidth(), 
                horizontalBarrier.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        horizontalBarrier.setIcon(image);
        horizontalBarrier.setOpaque(false);
        
        return horizontalBarrier;
    }
    
    public static void objectMove(JLabel d) {
        Random randomDirection = new Random();
        int xAxis = d.getLocation().x;
        int yAxis = d.getLocation().y;
        int objectReference = LevelGUI.deductObjects.indexOf(d);
       
        switch (objectReference) {
            case 0:
                //int direction = 0;
                switch (object_0_Direction) {
                    
                    case 0:
                        moveUp(d);
                        if (hitTopBarrier(d) == true) {
                            d.setLocation(xAxis, yAxis);
                            object_0_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 1:
                        moveLeft(d);
                        if (hitLeftBarrier(d) == true){
                            d.setLocation(xAxis, yAxis);
                            object_0_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 2:        
                        moveDown(d);
                        if (hitBottomBarrier(d) == true){
                            d.setLocation(xAxis, yAxis);
                            object_0_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 3:
                        moveRight(d);
                        if (hitRightBarrier(d) == true){
                            d.setLocation(xAxis, yAxis);
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
                            d.setLocation(xAxis, yAxis);
                            object_1_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 1:
                        moveLeft(d);
                        if (hitLeftBarrier(d) == true){
                            d.setLocation(xAxis, yAxis);
                            object_1_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 2:        
                        moveDown(d);
                        if (hitBottomBarrier(d) == true){
                            d.setLocation(xAxis, yAxis);
                            object_1_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 3:
                        moveRight(d);
                        if (hitRightBarrier(d) == true){
                            d.setLocation(xAxis, yAxis);
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
                            d.setLocation(xAxis, yAxis);
                            object_2_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 1:
                        moveLeft(d);
                        if (hitLeftBarrier(d) == true){
                            d.setLocation(xAxis, yAxis);
                            object_2_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 2:        
                        moveDown(d);
                        if (hitBottomBarrier(d) == true){
                            d.setLocation(xAxis, yAxis);
                            object_2_Direction = randomDirection.nextInt(4);
                        }
                        break;
                    case 3:
                        moveRight(d);
                        if (hitRightBarrier(d) == true){
                            d.setLocation(xAxis, yAxis);
                            object_2_Direction = randomDirection.nextInt(4);
                        }
                        break;
                   }
                break;

            }
        
        }
    
    
    /** Object in motion moves up.  This method to be called 
     * recursively until an event (barrier or player input) 
     * occurs 
     * @param yAxis
     * @return yAxis
     */
    public static void moveUp(JLabel d) { 
           d.setLocation(d.getLocation().x, d.getLocation().y -1);
    }
    
    /** Object moves down. A recursive method until another method changes the direction 
     @param g (Graphic)
     */
    public static void moveDown(JLabel d) {
            d.setLocation(d.getLocation().x, d.getLocation().y + 1);      
    }
    
    /** Object moves left. Recursive method until direction changed by another method 
     @param g (Graphic)
     */
    public static void moveLeft(JLabel d) {
            d.setLocation(d.getLocation().x - 1, d.getLocation().y); 
    }
    
    /** Object moves right. Recursive method until direction changed by another method 
     @param g (Graphic)
     */
    public static void moveRight(JLabel d) {
            d.setLocation(d.getLocation().x + 1, d.getLocation().y);
    }
    
    /** Any graphic that runs into a barrier will turn 90 degrees to the left until there is no barrier 
     @param g (Graphic)
     */
    
    
    public static boolean hitTopBarrier(JLabel d) {  
        boolean topBarrierHit = true;
        int movingObjectXaxis = d.getLocation().x;
        int movingObjectYaxis = d.getLocation().y;
        if (movingObjectYaxis > LevelGUI.MIN_Y_AXIS) {

            topBarrierHit = false;
        }
        
        for (JLabel b : LevelGUI.barrierObjects) {
               if (movingObjectYaxis >= b.getLocation().y && movingObjectYaxis <= b.getLocation().y + b.getHeight()){
                   if (movingObjectXaxis >= b.getLocation().x - GRAPHIC_WIDTH && movingObjectXaxis <= b.getLocation().x + b.getWidth()) {
                       topBarrierHit = true;
                       break;
                   }
               }
        }
        
        
        return topBarrierHit;
    }
    
    public static boolean hitLeftBarrier(JLabel d) {  
        boolean leftBarrierHit = true;
        int movingObjectXaxis = d.getLocation().x;
        int movingObjectYaxis = d.getLocation().y;
        
        if (movingObjectXaxis > LevelGUI.MIN_X_AXIS) {
            leftBarrierHit = false;
        }
        for (JLabel b : LevelGUI.barrierObjects) {
               if (movingObjectYaxis >= b.getLocation().y && movingObjectYaxis <= b.getLocation().y + b.getHeight()){
                   if (movingObjectXaxis >= b.getLocation().x && movingObjectXaxis <= b.getLocation().x + b.getWidth()) {
                       leftBarrierHit = true;
                       break;
                   }
               }
        }   
        return leftBarrierHit;
    }
    
        public static boolean hitBottomBarrier(JLabel d) {  
        boolean bottomBarrierHit = true;
        int movingObjectXaxis = d.getLocation().x;
        int movingObjectYaxis = d.getLocation().y;

        if (movingObjectYaxis < LevelGUI.MAX_Y_AXIS) {
            bottomBarrierHit = false;
        }
        for (JLabel b : LevelGUI.barrierObjects) {
               if (movingObjectYaxis >= b.getLocation().y - GRAPHIC_HEIGHT && movingObjectYaxis <= b.getLocation().y + b.getHeight()){
                   if (movingObjectXaxis >= b.getLocation().x - GRAPHIC_WIDTH && movingObjectXaxis <= b.getLocation().x + b.getWidth()) {
                       bottomBarrierHit = true;
                       break;
                   }
               }
        }        
        return bottomBarrierHit;
    }
        
    public static boolean hitRightBarrier(JLabel d) {  
        boolean rightBarrierHit = true;
        int movingObjectXaxis = d.getLocation().x;
        int movingObjectYaxis = d.getLocation().y;

        if (movingObjectXaxis < LevelGUI.MAX_X_AXIS) {
            rightBarrierHit = false;
        }
                
        for (JLabel b : LevelGUI.barrierObjects) {
            
               if (movingObjectYaxis >= b.getLocation().y && movingObjectYaxis <= b.getLocation().y + b.getHeight()){
                   if (movingObjectXaxis >= b.getLocation().x - GRAPHIC_WIDTH && movingObjectXaxis <= b.getLocation().x + b.getWidth()) {
                       rightBarrierHit = true;
                   }
               }
            
        }   
        
        return rightBarrierHit;
    }
}

