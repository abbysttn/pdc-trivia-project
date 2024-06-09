/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package trivia_project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author abbys
 */
public class TriviaControllerTest {

    private Connection conn;
    private highScores hs;
    private customisations custom;

    @Before
    public void setUp() throws SQLException {
        DBManager dbManager = new DBManager();
        conn = dbManager.getConnection();
        hs = new highScores();
        custom = new customisations();
        clearHighScoresTable();
    }

    @After
    public void tearDown() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    @Test
    public void testAddHighScore() {
        String playerName = "Test Player";
        int score = 1100;

        hs.newHighScore(playerName, score);

        try {
            Statement statement = conn.createStatement();
            String getHS = "SELECT * FROM high_scores WHERE name = \'" + playerName + "\'";
            ResultSet resultSet = statement.executeQuery(getHS);

            assertTrue(resultSet.next());
            assertEquals(playerName, resultSet.getString("name"));
            assertEquals(score, resultSet.getInt("score"));
            assertFalse(resultSet.next());
        } catch (SQLException e) {
            fail("SQLException: " + e.getMessage());
        }
    }

    @Test
    public void testAddHighScoreWithShortName() {
        String playerName = "Ab";
        int score = 1100;

        hs.newHighScore(playerName, score);

        try {
            Statement statement = conn.createStatement();
            String getHS = "SELECT * FROM high_scores WHERE name = \'" + playerName + "\'";
            ResultSet resultSet = statement.executeQuery(getHS);

            assertTrue(resultSet.next());
            assertEquals(playerName, resultSet.getString("name"));
            assertEquals(score, resultSet.getInt("score"));
            assertFalse(resultSet.next());
        } catch (SQLException e) {
            fail("SQLException: " + e.getMessage());
        }
    }

    @Test
    public void testAddHighScoreWithLongName() throws SQLException {
        String playerName = "LongNameLongNameLongNameLongNameLongNameLongNameLongNameLongNameLongNameLongNameLongNameLongName";
        int score = 1100;

        hs.newHighScore(playerName, score);

        try {
            Statement statement = conn.createStatement();
            String getHS = "SELECT * FROM high_scores WHERE name = \'" + playerName + "\'";
            ResultSet resultSet = statement.executeQuery(getHS);

            assertTrue(resultSet.next());
            assertEquals(playerName, resultSet.getString("name"));
            assertEquals(score, resultSet.getInt("score"));
            assertFalse(resultSet.next());
        } catch (SQLException e) {
            fail("SQLException: " + e.getMessage());
        }
    }

    private void clearHighScoresTable() throws SQLException {
        try ( Statement statement = conn.createStatement()) {
            statement.executeUpdate("DELETE FROM high_scores WHERE score > 1000");
        }
    }

    @Test
    public void testAddQuestionAndAnswer() {
        String question = "What is the capital of France?";
        custom.addQtoCustom(question);

        String correctAnswer = "Paris";
        custom.addAnswerToCustom(question, correctAnswer, true);

        String wrongAnswer1 = "Berlin";
        custom.addAnswerToCustom(question, wrongAnswer1, false);

        String wrongAnswer2 = "London";
        custom.addAnswerToCustom(question, wrongAnswer2, false);

        String wrongAnswer3 = "Madrid";
        custom.addAnswerToCustom(question, wrongAnswer3, false);

        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM questions WHERE questionText = '" + question + "'");
            assertTrue(resultSet.next());

            int questionID = resultSet.getInt("ID");

            resultSet = statement.executeQuery("SELECT * FROM ANSWERS WHERE QUESTIONID = " + questionID);
            int count = 0;
            while (resultSet.next()) {
                count++;
                String answerText = resultSet.getString("answerText");
                boolean isCorrect = resultSet.getBoolean("isCorrect");
                if (answerText.equals(correctAnswer)) {
                    assertTrue(isCorrect);
                } else {
                    assertFalse(isCorrect);
                }
            }
            assertEquals(4, count);
            removeAdded(questionID);
        } catch (SQLException e) {
            fail("SQLException: " + e.getMessage());
        }

    }

    private void removeAdded(int id) throws SQLException {
        try ( Statement statement = conn.createStatement()) {
            statement.executeUpdate("DELETE FROM answers WHERE questionID = " + id);
            statement.executeUpdate("DELETE FROM questions WHERE ID = " + id);
        }
    }

}
