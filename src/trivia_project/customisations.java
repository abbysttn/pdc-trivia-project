/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author abbys
 */
public class customisations {

    private Statement statement;
    private final DBManager dbManager;
    private final Connection conn;

    public customisations() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }

    public void addQtoCustom(String question) { //lets users add their own questions and imports them into the CustomQs table
        try {
            statement = conn.createStatement();
            String insertQ = "INSERT INTO questions (questionText, questionType) VALUES (\'" + question + "\', \'Custom\')";

            statement.executeUpdate(insertQ);

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public boolean checkCustomQuestions() { //checks if there are enough custom questions for the game

        int customQs = 0;

        try {
            statement = conn.createStatement();
            String getCustom = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'Custom\'";

            ResultSet resultSet = statement.executeQuery(getCustom);

            while (resultSet.next()) {
                customQs++;
            }
            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        return customQs >= 5;
    }

    private int getQuestionID(String question) { //gets the id of the question
        try {
            statement = conn.createStatement();
            String getQID = "SELECT * FROM questions WHERE questionText = \'" + question + "\'";

            ResultSet resultSet = statement.executeQuery(getQID);

            
            if (resultSet.next()) {
                return resultSet.getInt("id");
            }
            statement.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        return 0;
    }

    public void addAnswerToCustom(String question, String answer, boolean isCorrect) { //adds answers to the custom question
        int qID = getQuestionID(question);

        try {
            statement = conn.createStatement();
            String insertA = "INSERT INTO answers (questionID, answerText, isCorrect) VALUES (" + qID + ", \'" + answer + "\', " + isCorrect + ")";

            statement.executeUpdate(insertA);

            statement.close();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

}
