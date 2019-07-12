/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

/**
 *  This class controls the user's icon Graphic on the player's board.
 * @author Sam
 */
public class PlayerIcon extends Graphic {//implements KeyListener {
    

    int hitDeduct = 0;
    int playerDirection;
    Timer playerTimer;
    
    public void setPlayerImage(PlayerIcon p) { 
        
        p.imagePath = "D:\\Sam\\Pictures\\Mane Game\\PLAYER_ICON.jpg";
        p.setIconImage(p);
    }
    
    public void playerMove(PlayerIcon p) {
        Random randomDirection = new Random();
        int xAxis = p.label.getLocation().x;
        int yAxis = p.label.getLocation().y;
        
        switch (p.playerDirection) {
                    
                    case 0:
                        p.moveUp(p);
                        if (p.hitTopBarrier(p) == true) {
                            p.label.setLocation(xAxis, yAxis);
                            playerDirection = 1;
                        }
                        break;
                    case 1:
                        p.moveLeft(p);
                        if (p.hitLeftBarrier(p) == true){
                            p.label.setLocation(xAxis, yAxis);
                            playerDirection = 2;
                        }
                        break;
                    case 2:        
                        p.moveDown(p);
                        if (p.hitBottomBarrier(p) == true){
                            p.label.setLocation(xAxis, yAxis);
                            playerDirection = 3;
                        }
                        break;
                    case 3:
                        p.moveRight(p);
                        if (p.hitRightBarrier(p) == true){
                            p.label.setLocation(xAxis, yAxis);
                            playerDirection = 0;
                        }
                        break;
                    }
    }
    
    public void slowPlayer(PlayerIcon p){
        if (p.hitDeduct > 0){
            p.playerTimer.stop(); // stop previous timer
        }
        else{
            p.playerTimer = new Timer(3000, new ActionListener(){ // initialize timer
                @Override
                public void actionPerformed(ActionEvent evt) {
                    p.speed = 2; //resume normal speed 
                    
                }
            });      
            p.hitDeduct++;
        }
        p.playerTimer.start(); // start the timer
      }
    
    
    /** This method allows the player to interact with the player icon.  Directional arrows will 
        control the player’s movements. 
        @param char
        */
    public void playerDirectionChange(JLabel playerIcon) {
        // code to change player direction.
        //ch[] directionArrows = [72, 75, 77, 80]; )
        
        int[][] playerLocation = new int[LevelGUI.MAX_X_AXIS][LevelGUI.MAX_Y_AXIS];
        
        int xAxis = playerIcon.getLocation().x;
        int yAxis = playerIcon.getLocation().y;
        /*
        
            InputMap inputMap = getInputMap(playerIcon.hasFocus());
            ActionMap actionMap = getActionMap();

            playerIcon.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "up");
            playerIcon.getInputMap()..put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "down");
            playerIcon.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "left");
            playerIcon.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "right");

          //  int xAxis = playerIcon.getLocation().x;
          //  int yAxis = playerIcon.getLocation().y;

            playerIcon.getActionMap().put("up", new AbstractAction() 
            {
                public void actionPerformed(ActionEvent event)
                {
                Graphic.moveUp(playerIcon);
                }
            });
            
            playerIcon.getActionMap().put("down", new AbstractAction() 
            {
                public void actionPerformed(ActionEvent event)
                {
                Graphic.moveDown(playerIcon);
                }
             });
            
            playerIcon.getActionMap().put("left", new AbstractAction() 
            {
                public void actionPerformed(ActionEvent event)
                {
                Graphic.moveLeft(playerIcon);
                }
            });
            
            playerIcon.getActionMap().put("right", new AbstractAction() 
            {
                public void actionPerformed(ActionEvent event)
                {
                Graphic.moveRight(playerIcon);
                }
            });
            /*
            actionMap.put("up", playerMove(this, xAxis, yAxis - 1));
            actionMap.put("down", new MoveAction(this, 0, yDelta));
            actionMap.put("left", new MoveAction(this, -xDelta, 0));
            actionMap.put("right", new MoveAction(this, xDelta, 0));
            */
        
       
       KeyListener direction = new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {
             //To change body of generated methods, choose Tools | Templates.
        }

        
        @Override
        public void keyPressed(KeyEvent direction) {
            
            
            int keyCode = direction.getKeyCode();
            switch( keyCode ) { 
                case KeyEvent.VK_UP:
                    playerIcon.setLocation(playerIcon.getLocation().x, playerIcon.getLocation().y - 1);
                    break;
                case KeyEvent.VK_DOWN:
                    playerIcon.setLocation(playerIcon.getLocation().x, playerIcon.getLocation().y + 1);
                    break;
                case KeyEvent.VK_LEFT:
                    playerIcon.setLocation(playerIcon.getLocation().x - 1, playerIcon.getLocation().y);
                    break;
                case KeyEvent.VK_RIGHT :
                    playerIcon.setLocation(playerIcon.getLocation().x + 1, playerIcon.getLocation().y);
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent d) {
             //To change body of generated methods, choose Tools | Templates.
        }
    };
       //playerIcon.addKeyListener(direction);
    }
    
    
    /** Turn the player's icon image according to the direction the player is moving. */
    
    
    public void changeImageDirection() {
        
       // if (event.getKeyCode() == KeyEvent.VK_UP) {
            //...
        //}
    }
    
}
/*
    public class MoveAction extends AbstractAction{
       // private Movable movable;
        private int xDelta;
        private int yDelta;

        public MoveAction(Movable movable, int xDelta, int yDelta) {
            this.movable = movable;
            this.xDelta = xDelta;
            this.yDelta = yDelta;
        }
*/