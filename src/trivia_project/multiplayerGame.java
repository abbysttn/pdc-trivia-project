/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbys
 */
public class multiplayerGame extends Game { //subclass of Game

    private List<String> multiPlayers = new ArrayList<>();

    private static multiplayerGame gameInstance;

    private Statement statement;
    private final DBManager dbManager;
    private final Connection conn;

    public multiplayerGame() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }

    public static multiplayerGame getGameInstance() { //ensures only one instance of multiplayer is created and shared across the class
        if (gameInstance == null) {
            gameInstance = new multiplayerGame();
        }

        return gameInstance;
    }

    public List<String> getPlayers() { //gets the list of players
        return multiPlayers;
    }

    public void setPlayers(List<String> players) { //sets the list of players
        this.multiPlayers = players;
    }

    @Override
    public void savePosition(List<Integer> scores, int currentQuestionIndex) { //saves the position of the game, scores, and players for future pickup
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

            TriviaModel model = TriviaModel.getModelInstance();

            List<String> players = model.getPlayerNames();
            
            int playerIndex = 0;

            for (String player : players) {
                String insertQ = "INSERT INTO SAVEDGAMEPLAYER (playerName, score) VALUES (\'" + player + "\', " + scores.get(playerIndex) + ")";
                statement.executeUpdate(insertQ);
                playerIndex++;
            }

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    private void insertQs(int id) { //inserts the current game questions into the saved table
        try {
            statement = conn.createStatement();

            String insertQ = "INSERT INTO SAVEDGAMEQS (questionID) VALUES (" + id + ")";
            statement.executeUpdate(insertQ);
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

}
