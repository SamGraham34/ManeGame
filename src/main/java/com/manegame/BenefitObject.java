/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import javax.swing.JLabel;

/**
 * This class holds methods to control actions of objects that benefit the 
 * player.
 * @author Sam
 */
public class BenefitObject extends Graphic {
        
        /**
         * Enum of available Benefit objects.
         */
        public enum BENEFITOBJECT {HAIRCUT, FOIL, BLOW_DRY};
        
        /** Displays a benefit object image based on the object reference
        @param BENEFITOBJECT
        @return String
        */
        public JLabel benefitObjectImage(int BENEFITOBJECT) { 
        
        String path = "";
        
        switch (BENEFITOBJECT){
            case 0:
                path = "D:\\Sam\\Pictures\\Mane Game\\HAIRCUT.jpg";
                break;
            case 1:
                path = "D:\\Sam\\Pictures\\Mane Game\\HAIRFOIL.jpg";
                break;
            case 2:
                path = "D:\\Sam\\Pictures\\Mane Game\\BLOW_DRYER.jpg";
                break;
        }       
        
        return Graphic.getGraphicImage(path);
    }
        
        
    
        /** Determines how much player's score increases based on object that 
         * was struck.
        @param BENEFITOBJECT
        @return int
        */
    public static int hitBenefitObject(int benefitObjectIndexLocation) {
        int benefitAmount = 0;
        int benefitID = 0;
        
        if (benefitObjectIndexLocation % 3 == 0){
            benefitID = 0;
        }
        else if (benefitObjectIndexLocation % 2 == 0){
            benefitID = 1;
        }
        else {
            benefitID = 2;
        }
        
        switch (benefitID){
            case 0: benefitAmount = 25; // Foil
		break;
            case 1: benefitAmount = 5; // Blow Dryer
		break;
            case 2: benefitAmount = 15; // Haircut
		break;
        }
        
        return benefitAmount; 
    }
    
    /** A benefit object that has been collected is taken out of play 
     @param BENEFITOBJECT
     */
    public void removeBenefitObject(int BENEFITOBJECT) {
        //remove BENEFITOBJECT;
    }
    
}
