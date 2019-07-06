/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

import java.awt.HeadlessException;
import java.lang.*;
import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import org.apache.maven.shared.utils.StringUtils;

/**
 *  This class houses methods to interact with the game's database.
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
        public static Player dbGetPlayerData(String email) throws ClassNotFoundException, SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
                  
            Connection connection = dbConnect();
            Statement stmt = connection.createStatement();
            ResultSet playerInfo = stmt.executeQuery("SELECT * FROM "
                    + "All_Players_Table WHERE Player_Email = " + "\"" + email + "\"");
            
            int playerNum = playerInfo.getInt("Player_ID");
            String name = playerInfo.getString("Player_Name");
            String dbEmail = playerInfo.getString("Player_Email");
            String password = playerInfo.getString("Player_Password");
            int level = playerInfo.getInt("Player_Level");
            long score = playerInfo.getLong("Player_Score");
            
            Player p = new Player(playerNum, name, dbEmail, password, level, score);
            connection.close();
            return p;
        }
     
   /**
    * Writes data to the database. This method writes player data to the database.
    * @throws ClassNotFoundException 
    */
    public static void dbSaveNewPlayer(Player p) throws ClassNotFoundException {
       Connection connection = dbConnect();
              
        try {          
            String query = "INSERT INTO All_Players_Table (Player_ID,Player_Name,"
                    + "Player_Email,Player_Password,Player_Level,Player_Score) "
                    + "VALUES (?,?,?,?,?,?)" ;
    
            try (PreparedStatement pst = connection.prepareStatement(query)) {
                pst.setInt(1, (p.playerID)); 
                pst.setString(2, p.playerName);
                pst.setString(3, p.playerEmail); 
                pst.setString(4, p.playerPassword);
                pst.setInt(5, p.playerLevel);
                pst.setLong(6, p.playerScore);
                              
                pst.execute();
                JOptionPane.showMessageDialog(null,"Player Added!");
                pst.close();
                
                //dbGetPlayerData();
                connection.close();
            }            
        }
        catch (SQLException e)
        {
        
        }
    }
    
    /**
     * Creates a new log table for the player.
     * @param playerNum
     * @throws SQLException 
     */
    public static void dbCreatePlayerLogTable(int playerNum) throws SQLException{
              
        try {
            
            Connection connection = dbConnect();
            Statement stmt = connection.createStatement();
            String createTable = String.format("CREATE TABLE Player_%d_Log_Table", playerNum);
            String sql = String.format(createTable +
                        "(RowID INT    NOT NULL," +
                        " LastLogin           STRING    NOT NULL, " + 
                        " FailedLoginAttempts           INT    NOT NULL, " + 
                        " LastGamePlayTime      STRING    NOT NULL, " + 
                        " TotalGamePlayTime              STRING    NOT NULL)"); 
            stmt.executeUpdate(sql);         
            stmt.close();
            JOptionPane.showMessageDialog(null,"Player Log Created!");
            connection.close();
            

      } 
      catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }    
            
   }
    
    public static int dbGetNumOfRowsInTable(String table){
        int numOfRows = 0;
        try{
            Connection connection = dbConnect();
            Statement stmt = connection.createStatement();
            ResultSet count = stmt.executeQuery("SELECT COUNT(*)AS rowCount FROM " + table);
            count.next();
            numOfRows = count.getInt("rowCount");
            count.close();
            connection.close();
        }
              
        catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
        }    
        
        return numOfRows;
    }
    
    /** Saves a player’s status.  Saves score and level to All Players Table  and creates an end log event. */
    public static void dbSaveCurrentStatus(Player p, long score, int Level) throws ClassNotFoundException {
	dbConnect();
      //  dbLogEndEvent(p); 
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
    
    public static void dbFailedLogin(Player p) {  
        String logTableNameAsString = String.format("Player_%d_Log_Table", p.playerID);
        int logRow = dbGetNumOfRowsInTable(logTableNameAsString);
        try {
                
            Connection connection = dbConnect();
            Statement stmt = connection.createStatement();
            
            ResultSet priorAttempts = stmt.executeQuery("SELECT FailedLoginAttempts FROM " + logTableNameAsString + 
                    " WHERE RowID = " + Integer.toString(logRow));
            int priorFailedAttempts = priorAttempts.getInt("FailedLoginAttempts");
            
            String updateFailedLogin = "UPDATE " + logTableNameAsString + " SET FailedLoginAttempts = ? , "     
                    + "WHERE RowID = " + Integer.toString(logRow);
            
            try (PreparedStatement pst = connection.prepareStatement(updateFailedLogin)) {
                pst.setInt(1, priorFailedAttempts + 1); 
                              
                pst.execute();
                pst.close();
            }
            connection.close(); 
        }
                catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         JOptionPane.showMessageDialog(null,"Problem in maneDB failed login");
         System.exit(0);
      }   
            
        //code to view log table
    }
    
    /** Updates the player’s log table LastLogin field with Date/Time.Now */
    public static void dbLogBeginEvent(int playerNum) throws ClassNotFoundException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        String logTableNameAsString = String.format("Player_%d_Log_Table", playerNum);
        int lastLog = dbGetNumOfRowsInTable(logTableNameAsString);
        String previousTotalTime = "00:00:00";
        int failedLoginAttempts = 0;
        try {
                
            Connection connection = dbConnect();
            Statement stmt = connection.createStatement();
           // String logTableNameAsString = String.format("Player_%d_Log_Table", playerNum);
            String query = "INSERT INTO " + logTableNameAsString + " (RowID,LastLogin,"
                    + "FailedLoginAttempts,LastGamePlayTime,TotalGamePlayTime)"       
                    + "VALUES (?,?,?,?,?)" ;
            if (lastLog > 0){
            ResultSet getPriorLog = stmt.executeQuery("SELECT FailedLoginAttempts, TotalGamePlayTime FROM " + logTableNameAsString + 
                    " WHERE RowID = " + Integer.toString(lastLog));
                previousTotalTime = getPriorLog.getString("TotalGamePlayTime");
                failedLoginAttempts = getPriorLog.getInt("FailedLoginAttempts");
            }

            
            try (PreparedStatement pst = connection.prepareStatement(query)) {
                pst.setInt(1, (dbGetNumOfRowsInTable(logTableNameAsString) + 1)); 
                pst.setString(2, dateFormatter.format(date));
                pst.setInt(3, failedLoginAttempts); 
                pst.setString(4, "TBD");
                pst.setString(5, previousTotalTime);
                              
                pst.execute();
                pst.close();
            }
            connection.close();                
        }               
        catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }        
    } 
    
    /** Update LastGamePlay field of log table with (Current time – LastLoginTime) sums Total Game Play.*/
    public static void dbLogEndEvent(Player p, String gameTime) throws ClassNotFoundException {

        
        String[] gameTimeArray = gameTime.split(":");
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        String logTableNameAsString = String.format("Player_%d_Log_Table", p.playerID);
        int lastLog = dbGetNumOfRowsInTable(logTableNameAsString);
        try {
                
            Connection connection = dbConnect();
            Statement stmt = connection.createStatement();

            ResultSet getTotalTime = stmt.executeQuery("SELECT TotalGamePlayTime FROM " + logTableNameAsString + 
                    " WHERE RowID = " + Integer.toString(lastLog));
            //JOptionPane.showMessageDialog(null,getTotalTime.getString("TotalGamePlayTime"));
            
            
            String[] totalTimeArray = getTotalTime.getString("TotalGamePlayTime").split(":");
   
            hours = Integer.parseInt(gameTimeArray[0]) 
                + Integer.parseInt(totalTimeArray[0]) ;
                
            minutes = Integer.parseInt(gameTimeArray[1]) 
                + Integer.parseInt(totalTimeArray[1]) ;

            seconds = Integer.parseInt(gameTimeArray[2]) 
                + Integer.parseInt(totalTimeArray[2]) ;
   
            if (seconds > 59) {
                minutes += seconds/60;
                seconds = seconds % 60;
            }
            
            if (minutes > 59) {
                hours += minutes/60;
                minutes = minutes % 60;
            }
            String totalToLog = Integer.toString(hours) + ":" 
                + StringUtils.leftPad(Integer.toString(minutes), 2, "0") + ":" 
                + StringUtils.leftPad(Integer.toString(seconds), 2, "0");
            
            JOptionPane.showMessageDialog(null,totalToLog);
            
            String updateQuery = "UPDATE " + logTableNameAsString + " SET LastGamePlayTime = ? , "
                    + "TotalGamePlayTime = ? "      
                    + "WHERE RowID = " + Integer.toString(lastLog);
            
            try (PreparedStatement pst = connection.prepareStatement(updateQuery)) {
                pst.setString(1, gameTime); 
                pst.setString(2, totalToLog);
                              
                pst.execute();
                pst.close();
            }
            connection.close();    

        }               
        catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         JOptionPane.showMessageDialog(null,"problem in ManeDB end log method \n you are trying to update row " + Integer.toString(lastLog));
         System.exit(0);
      }    
        
         
    } 
}


    