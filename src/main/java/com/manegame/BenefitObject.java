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
public class BenefitObject extends Graphic {
    
        public enum BENEFITOBJECT {HAIRCUT, FOIL, BLOW_DRY};
        
        /** Displays a benefit object image based on the object reference*/
        public String benefitObjectImage(int BENEFITOBJECT) { 
        
        String benefitImage = "";
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
    
    /** A benefit object that has been collected is taken out of play */
    public void removeBenefitObject(int BENEFITOBJECT) {
        //remove BENEFITOBJECT;
    }
    
}
