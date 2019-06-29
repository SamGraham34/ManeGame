/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

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
        public String benefitObjectImage(int BENEFITOBJECT) { 
        
        String benefitImage = "label.setIcon(new ImageIcon(new ImageIcon(\"icon.png\").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));";
        
        /*
        switch (BENEFITOBJECT) {
            case 0: benefitImage = ""; //Haircut image;
		break;
            case 1: benefitImage = "";// Foil image;
		break;
            case 2: benefitImage = "";// Blowdryer image;
		break;
        }
        */
        
        return benefitImage;
    }
        /** Determines how much player's score increases based on object that 
         * was struck.
        @param BENEFITOBJECT
        @return int
        */
    public int hitBenefitObject(int BENEFITOBJECT) {
        int benefitAmount = 0;
        /*
        switch (BENEFITOBJECT){
            case 0: benefitAmount = 15;
		break;
            case 1: benefitAmount = 25;
		break;
            case 2: benefitAmount = 5;
		break;
        }
        */
        return benefitAmount; 
    }
    
    /** A benefit object that has been collected is taken out of play 
     @param BENEFITOBJECT
     */
    public void removeBenefitObject(int BENEFITOBJECT) {
        //remove BENEFITOBJECT;
    }
    
}
