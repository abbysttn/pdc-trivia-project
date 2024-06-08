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

    public void addQtoCustom(String question) { //lets users add their own questions and imports them into the CustomQs file
        try {
            statement = conn.createStatement();
            String insertQ = "INSERT INTO questions (questionText, questionType) VALUES (\'" + question + "\', \'Custom\')";

            statement.executeUpdate(insertQ);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
    public boolean checkCustomQuestions() {

        int customQs = 0;

        try {
            statement = conn.createStatement();
            String getCustom = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'CUSTOM\'";

            ResultSet resultSet = statement.executeQuery(getCustom);

            while (resultSet.next()) {
                customQs++;
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        if (customQs >= 5) {
            return true;
        } else {
            return false;
        }
    }

    private int getQuestionID(String question) {
        try {
            statement = conn.createStatement();
            String getQID = "SELECT * FROM questions WHERE questionText = \'" + question + "\'";

            ResultSet resultSet = statement.executeQuery(getQID);

            
            if (resultSet.next()) {
                return resultSet.getInt("id");
            }

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        return 0;
    }

    public void addAnswerToCustom(String question, String answer, boolean isCorrect) {
        int qID = getQuestionID(question);

        try {
            statement = conn.createStatement();
            String insertA = "INSERT INTO answers (questionID, answerText, isCorrect) VALUES (" + qID + ", \'" + answer + "\', " + isCorrect + ")";

            statement.executeUpdate(insertA);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

}
