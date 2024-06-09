/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbys
 */
public class resetTriviaGame {

    private Statement statement;
    private final DBManager dbManager;
    private final Connection conn;

    public resetTriviaGame() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }

    public void clearFromDatabase() { //resets all customised tables
        clearSavedGameQs();
        clearSavedPlayers();
        clearCustomAs();
        clearHighscores();
        clearCurrentGameQs();
        clearCustomQs();
    }

    private void clearCustomQs() { //clears the custom questions from the questions table
        try {
            statement = conn.createStatement();
            String deleteQs = "DELETE FROM QUESTIONS WHERE QUESTIONTYPE = \'Custom\'";

            statement.executeUpdate(deleteQs);

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    private List<Integer> getCustomQsId() { //gets the custom questions id
        List<Integer> ids = new ArrayList<>();
        try {
            statement = conn.createStatement();
            String getQs = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'Custom\'";

            ResultSet rs = statement.executeQuery(getQs);

            while (rs.next()) {
                int id = rs.getInt("ID");
                ids.add(id);
            }
            
            statement.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        return ids;
    }

    public void clearSavedGameQs() { //clears the saved game questions
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM SAVEDGAMEQS";
            statement.executeUpdate(clearTable);

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void clearCurrentGameQs() { //clears the current game questions
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM CURRENTGAMEQS";
            statement.executeUpdate(clearTable);

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    private void clearHighscores() { //clears all highscores
        highScores.topHighScores.clear();
        try {
            statement = conn.createStatement();
            String clearHS = "DELETE FROM HIGH_SCORES";
            statement.executeUpdate(clearHS);

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void clearSavedPlayers() { //clears the saved game players
        try {
            statement = conn.createStatement();
            String clearPlayers = "DELETE FROM SAVEDGAMEPLAYER";
            statement.executeUpdate(clearPlayers);

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    private void clearCustomAs() { //clears the custom answers
        List<Integer> ids = getCustomQsId();       

        try {
            statement = conn.createStatement();

            for (int id : ids) {
                String deleteA = "DELETE FROM ANSWERS WHERE QUESTIONID = " + id;
                statement.executeUpdate(deleteA);
            }

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
}
