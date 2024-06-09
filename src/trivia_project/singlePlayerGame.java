/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author abbys
 */
public class singlePlayerGame extends Game { //subclass of Game

    private Statement statement;
    private final DBManager dbManager;
    private final Connection conn;

    public singlePlayerGame() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }

    @Override
    public void savePosition(List<Integer> scores, int currentQuestionIndex) { // saves the games curent position as well as the score for future pickup
        try {
            statement = conn.createStatement();

            clearTable();

            String getQs = "SELECT * FROM CURRENTGAMEQS";

            int count = 1;

            ResultSet resultSet = statement.executeQuery(getQs);

            while (resultSet.next()) {
                if (count < currentQuestionIndex) {
                    count++;
                } else {
                    int id = resultSet.getInt("QUESTIONID");
                    insertQs(id);
                    count++;
                }
            }

            String insertQ = "INSERT INTO SAVEDGAMEPLAYER (playerName, score) VALUES (\'single Player\', " + scores.get(0) + ")";
            statement.executeUpdate(insertQ);

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    private void insertQs(int id) { //inserts the questions from the current game into the saved game
        try {
            statement = conn.createStatement();

            String insertQ = "INSERT INTO SAVEDGAMEQS (questionID) VALUES (" + id + ")";
            statement.executeUpdate(insertQ);
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    
}
