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
 *
 * @author Sam
 */
public class BarrierObject extends Graphic {
    
    public void verticalBarrier() {
        String path = "D:\\Sam\\Pictures\\Mane Game\\BLUE.jpg";
        //JLabel verticalBarrier = new Graphic();
        this.label.setBounds(250, 250, 16, 100);
        ImageIcon graphicImage = new ImageIcon(path);
        Image img = graphicImage.getImage();
        Image newImg = img.getScaledInstance(this.label.getWidth(), 
                this.label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        this.label.setIcon(image);
        this.label.setOpaque(false);
   
    }
    
        public void getHorizontalBarrier(String path) {
        
        JLabel horizontalBarrier = new Graphic();
        horizontalBarrier.setBounds(250, 250, 100, 15);
        ImageIcon graphicImage = new ImageIcon(path);
        Image img = graphicImage.getImage();
        Image newImg = img.getScaledInstance(horizontalBarrier.getWidth(), 
                horizontalBarrier.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        horizontalBarrier.setIcon(image);
        horizontalBarrier.setOpaque(false);
        
        
    }
    
    public void barrierImage(BarrierObject b) {
        
        b.imagePath = "D:\\Sam\\Pictures\\Mane Game\\BLOW_DRYER.jpg";
                    
        
        b.setIconImage(b);
    
}
    
}
