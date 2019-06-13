/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;

/**
 *
 * @author Sam
 */
public class ManeDB {
    
    
    
     /**
     *
     * @return @throws java.lang.ClassNotFoundException
     */
    public static Connection dbConnect() throws ClassNotFoundException {
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Sam\\Pictures\\Mane Game\\ManeDB.db");
            //JOptionPane.showMessageDialog(null,"Database Connection Successful");
            return conn;
        } catch (HeadlessException | SQLException e) {
          //  JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
    /**
     * Reads data from the database.  Once user provides successful login information
     * this method returns the player's data.
     */
        public static void dbGetPlayerData() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
        /*
        try {          
            Connection connection = dbConnect();
                String query;
                query = "select (Player_ID,Player_Name,Player_Email,Player_Level,Player_Score) from All_Players_Table";
                PreparedStatement pst = null;
                           
            try {
                pst = connection.prepareStatement(query);
            } catch (SQLException ex) {
                Logger.getLogger(NewUserForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                ResultSet rs = null;
            try {
                rs = pst.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(NewUserForm.class.getName()).log(Level.SEVERE, null, ex);
            }
               //FilenameTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
   
   /**
    * Writes data to the database. This method writes player data to the database.
    * @throws ClassNotFoundException 
    */
    public static void dbSaveNewPlayer(Player p) throws ClassNotFoundException {
       Connection connection = dbConnect();
              
        try {          
            String query = "Insert into All_Players_Table (Player_ID,Player_Name,"
                    + "Player_Email,Player_Password,Player_Level,Player_Score) "
                    + "values (?,?,?,?,?)" ;
    
            try (PreparedStatement pst = connection.prepareStatement(query)) {
                //pst.setInt(1, (p.playerID + 1)); 
                pst.setString(2, p.playerName);
                pst.setString(3, p.playerEmail); 
                pst.setString(4, p.playerPassword);
                pst.setInt(5, p.playerLevel);
                pst.setLong(6, p.playerScore);
                              
                pst.execute();
                JOptionPane.showMessageDialog(null,"Player Added!");
                pst.close();
                
                dbGetPlayerData();
            }
        }
        catch (SQLException e)
        {
        
        }
    }
    
    public static void dbCreatePlayerLogTable(int playerNum) throws SQLException{
        /*      
        try {
            
            Connection connection = dbConnect();
            Statement stmt = connection.createStatement();
            String createTable = String.format("CREATE TABLE Player_%d_Log_Table", playerNum);
            String sql = String.format(createTable +
                        "(PlayerNum INT PRIMARY KEY     NOT NULL," +
                        " LastLogin           STRING    NOT NULL, " + 
                        " FailedLoginAttempts           STRING    NOT NULL, " + 
                        " LastGamePlayTime      STRING    NOT NULL, " + 
                        " TotalGamePlayTime              STRING    NOT NULL)"); 
            stmt.executeUpdate(sql);         
        
            String sqlInsertLog = "INSERT INTO " + createTable + " (Player_ID,"
                    + "Last_Login,Failed_Login_Attempts,Last_Game_Start_Time,Total_Game_Time) " +
                        "VALUES (?,?,?,?,?);"; 
            stmt.executeUpdate(sqlInsertLog);
            stmt.close();
            connection.close();
            

      } 
      catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }    
            */
   }
    
    /** Saves a player’s status.  Saves score and level to All Players Table  and creates an end log event. */
    public static void dbSaveCurrentStatus(Player p, long score, int Level) throws ClassNotFoundException {
	dbConnect();
        dbLogEndEvent(p); 
    }
    
    public static Player dbVerifyLoginEmail(String email) throws ClassNotFoundException {
	Player player = new Player();
        dbConnect();
        if (true){
                //email in All_Players_Table) {
		//Select * From All_Players_Table Where input email = player’s email; 
		//player = result;
            }
	else{
		//player fields null;
        }
        return player;
    } 
    

        /** Returns a single player from the All Players Table */
    public static Player dbGetPlayer(){
        Player player = new Player();
        try {
            dbConnect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return player;
    }

    
    /** Retrieves a player’s log table in a new window. */
    public static void dbGetLog(Player p) {  
        //code to view log table
    }
    
    /** Updates the player’s log table LastLogin field with Date/Time.Now */
    public static void dbLogBeginEvent(Player p) throws ClassNotFoundException {
        dbConnect();
        //code to begin a log event    
    } 
    
    /** Update LastGamePlay field of log table with (Current time – LastLoginTime) sums Total Game Play.*/
    public static void dbLogEndEvent(Player p) throws ClassNotFoundException {
	dbConnect();
        //code to end a log event
    }
}
    