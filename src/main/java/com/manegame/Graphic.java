/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *  This is the base class for all animations on the user board.
 * @author Sam
 */
public class Graphic extends javax.swing.JLabel {


    Level level; //Player.playerLevel; //player’s current level
   // private enum direction {UP, LEFT, DOWN, RIGHT}
    static int GRAPHIC_HEIGHT = 20; //15? Trial and error it
    static int GRAPHIC_WIDTH = 20;
    
    public static JLabel getGraphicImage(String path) {
        
        JLabel graphic = new Graphic();
        graphic.setBounds(250, 250, GRAPHIC_WIDTH, GRAPHIC_HEIGHT);
        //graphic.setSize(GRAPHIC_WIDTH, GRAPHIC_HEIGHT);
        //contentPane.add(deductObject);
        ImageIcon graphicImage = new ImageIcon(path);
        Image img = graphicImage.getImage();
        Image newImg = img.getScaledInstance(graphic.getWidth(), graphic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        graphic.setIcon(image);
        
        return graphic;
        
    }
    
    /** Object in motion moves up.  This method to be called recursively until an event (barrier or player input) 
    occurs 
    @param g (Graphic)
    */
    public static void moveUp(JLabel d) { 
        hitBarrier(d, 0);
        if(d.getLocation().y > 1) {
            d.setLocation(d.getLocation().x,
                d.getLocation().y - 1);
        }
    }
    
    /** Object moves down. A recursive method until another method changes the direction 
     @param g (Graphic)
     */
    public static void moveDown(JLabel d) {
        hitBarrier(d, 1);
        if (d.getLocation().y < 499) {
        d.setLocation(d.getLocation().x,
                d.getLocation().y + 1);
        }

       
    }
    
    /** Object moves left. Recursive method until direction changed by another method 
     @param g (Graphic)
     */
    public static void moveLeft(JLabel d) {
        hitBarrier(d, 2);
        if (d.getLocation().x > 50) {
            d.setLocation(d.getLocation().x - 1,
                d.getLocation().y);
        }
 
    }
    
    /** Object moves right. Recursive method until direction changed by another method 
     @param g (Graphic)
     */
    public static void moveRight(JLabel d) {
        hitBarrier(d, 3);
        if (d.getLocation().x < 499) {
            d.setLocation(d.getLocation().x + 1,
                d.getLocation().y);
        }
  
            
    }
    
    /** Any graphic that runs into a barrier will turn 90 degrees to the left until there is no barrier 
     @param g (Graphic)
     */
    
    public static void hitBarrier(JLabel g, int direction) {  
        
        
        int topBoarder = 1;
        int bottomBoarder = 499;
        int leftBoarder = 50;
        int rightBoarder = 499;
        
        switch (direction) {
                case 0:
                     {if (g.getLocation().y <= topBoarder){
                       //g.setLocation(g.getLocation().x, g.getLocation().y);
                        moveLeft(g);
                        }
                     }
                     break;
                case 1:
                    {if (g.getLocation().y >= bottomBoarder){
                   // g.setLocation(g.getLocation().x, g.getLocation().y);            
                         moveRight(g);
                    }
                }
                    break;
                case 2:
                    {if (g.getLocation().x <= leftBoarder){
                   // g.setLocation(g.getLocation().x, g.getLocation().y);
                    moveDown(g);
                    }
                }
                    break;
                case 3:
                {
                    if (g.getLocation().x >= rightBoarder){
                 //   g.setLocation(g.getLocation().x, g.getLocation().y);
                        moveUp(g);
                    }
                }
                break;
            }

    }
}

