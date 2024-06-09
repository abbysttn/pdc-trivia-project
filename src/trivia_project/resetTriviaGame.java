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

    public void clearFromDatabase() {
        clearSavedGameQs();
        clearSavedPlayers();
        clearCustomAs();
        clearCustomQs();
        clearHighscores();
        clearCurrentGameQs();
    }

    private void clearCustomQs() {
        try {
            statement = conn.createStatement();
            String deleteQs = "DELETE FROM QUESTIONS WHERE QUESTIONTYPE = \'Custom\'";

            statement.executeUpdate(deleteQs);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    private List<Integer> getCustomQsId() {
        List<Integer> ids = new ArrayList<>();
        try {
            statement = conn.createStatement();
            String getQs = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'Custom\'";

            ResultSet rs = statement.executeQuery(getQs);

            while (rs.next()) {
                int id = rs.getInt("ID");
                ids.add(id);
            }

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        return ids;
    }

    public void clearSavedGameQs() {
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM SAVEDGAMEQS";
            statement.executeUpdate(clearTable);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public void clearCurrentGameQs() {
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM CURRENTGAMEQS";
            statement.executeUpdate(clearTable);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    private void clearHighscores() {
        try {
            statement = conn.createStatement();
            String clearHS = "DELETE FROM HIGH_SCORES";
            statement.executeUpdate(clearHS);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void clearSavedPlayers() {
        try {
            statement = conn.createStatement();
            String clearPlayers = "DELETE FROM SAVEDGAMEPLAYER";
            statement.executeUpdate(clearPlayers);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    private void clearCustomAs() {
        List<Integer> ids = getCustomQsId();

        try {
            statement = conn.createStatement();

            for (int id : ids) {
                String deleteA = "DELETE FROM ANSWERS WHERE QUESTIONID = " + id;
                statement.executeUpdate(deleteA);
            }

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
}
