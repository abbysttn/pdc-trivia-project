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
public class gameContinue {

    private Statement statement;
    private final DBManager dbManager;
    private final Connection conn;

    public gameContinue() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }

    public boolean checkGame() {
        boolean questionsFound = false;
        try {
            statement = conn.createStatement();
            String getQs = "SELECT * FROM SAVEDGAMEQS";

            ResultSet resultSet = statement.executeQuery(getQs);

            if (resultSet.next()) {
                questionsFound = true;
            } else {
                questionsFound = false;
            }

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        return questionsFound;
    }

    public void importGame() {
        try {
            statement = conn.createStatement();

            resetTriviaGame rtg = new resetTriviaGame();
            rtg.clearCurrentGameQs();

            String getQs = "SELECT * FROM SAVEDGAMEQS";

            ResultSet resultSet = statement.executeQuery(getQs);

            System.out.println("sleected");

            List<Integer> questionIDs = new ArrayList<>();

            while (resultSet.next()) {
                int question = resultSet.getInt("QUESTIONID");
                questionIDs.add(question);
            }

            for (int id : questionIDs) {
                String importQs = "INSERT INTO CURRENTGAMEQS (QUESTIONID) VALUES (" + id + ")";
                statement.executeUpdate(importQs);
                System.out.println("added");
            }

            System.out.println("end add");
            String getPlayers = "SELECT * FROM SAVEDGAMEPLAYER";

            ResultSet rs = statement.executeQuery(getPlayers);

            System.out.println("select players");

            List<String> players = new ArrayList<>();
            List<Integer> scores = new ArrayList<>();

            while (rs.next()) {
                String player = rs.getString("PLAYERNAME");
                int score = rs.getInt("SCORE");

                players.add(player);
                scores.add(score);
                System.out.println("sdd stuff");
            }

            System.out.println("end add stuff");

            if (players.size() >= 2) {
                importMultiGame(players, scores);
            } else {
                importSingleGame(scores.get(0));
            }

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    private void importSingleGame(int score) {
        playerScore.newSingleScore();
        playerScore.scores.set(0, score);
    }

    private void importMultiGame(List<String> players, List<Integer> scores) {
        TriviaModel model = TriviaModel.getModelInstance();
        model.setPlayerNames(players);
        playerScore.newMultiScore(scores.size());

        int index = 0;
        for (int score : scores) {
            playerScore.scores.set(index, score);
            index++;
        }
    }

    public String getGameType() {
        try {
            statement = conn.createStatement();
            String getQs = "SELECT * FROM SAVEDGAMEPLAYER";

            ResultSet resultSet = statement.executeQuery(getQs);

            if (resultSet.next()) {
                String type = resultSet.getString("PLAYERNAME");
                if (type.equals("single Player")) {
                    return "Single Player";
                }
            }

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        return "Multi Player";
    }
}
