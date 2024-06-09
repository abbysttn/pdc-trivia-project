/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.util.*;
import java.sql.*;

/**
 *
 * @author abbys
 */
public class highScores {

    static TreeMap<Integer, String> topHighScores = new TreeMap<>(Collections.reverseOrder());
    private Statement statement;
    private final DBManager dbManager;
    private final Connection conn;

    public highScores() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();

    }

    public void newHighScore(String name, int score) { //adds a new highscore for users
        String insert = "INSERT INTO high_scores (name, score) VALUES (?, ?)";

        try ( PreparedStatement ps = conn.prepareStatement(insert)) {
            ps.setString(1, name);
            ps.setInt(2, score);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void getHighScores() { //gets the top 5 highscores from the database
        try {
            statement = conn.createStatement();
            String getTop = "SELECT * FROM HIGH_SCORES ORDER BY score DESC";
            
            ResultSet resultSet = statement.executeQuery(getTop);
            
            int num = 0;
            
            while (resultSet.next() && num != 5) {
                String playerName = resultSet.getString("name");
                int score = resultSet.getInt("score");
                
                topHighScores.put(score, playerName);
                
                num++;
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public int findHighScore(String name) { //allows users to find a highscore by the name, returns the score for the gui
        try {
            statement = conn.createStatement();
            String allScores = "SELECT * FROM HIGH_SCORES";
            
            ResultSet resultSet = statement.executeQuery(allScores);
            
            while (resultSet.next()) {
                if (resultSet.getString("name").equalsIgnoreCase(name)) {
                    return resultSet.getInt("score");
                }
            }
            
            return -1;
            
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
        return -1;
    }
    
    public static boolean checkNameLength(String name) { //checks if the inpputted name is within the bounds of the table
        if (name.length() >= 99 || name.length() <= 1) {
            return false;
        }
        
        return true;
    }
}
