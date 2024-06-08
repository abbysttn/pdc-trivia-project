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
import java.util.Collections;
import java.util.List;

/**
 *
 * @author abbys
 */
public class importQuestions {

    private Statement statement;
    private final DBManager dbManager;
    private final Connection conn;
    
    private final List<String> selectedTopics = new ArrayList<>();

    public importQuestions() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }

    public void importCategory(List<String> categorys) {
        for (String category : categorys) {
        selectedTopics.add(category);
        }
    }

    public void importQuestions() { //imports the history questions into the historyQuestions hashmap
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM CURRENTGAMEQS";
            statement.executeUpdate(clearTable);

            for (String category : selectedTopics) {
                String getQs = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'" + category + "\'";
                
                ResultSet resultSet = statement.executeQuery(getQs);
                
                List<Integer> questions = new ArrayList<>();
                
                while (resultSet.next()) {
                    int questionID = resultSet.getInt("id");
                    
                    questions.add(questionID);
                }
                
                Collections.shuffle(questions);
                
                for (int i = 0; i < 5; i++) {
                    String importQs = "INSERT INTO CURRENTGAMEQS (QUESTIONID) VALUES (" + questions.get(i) + ")";
                    statement.executeUpdate(importQs);
                }
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void importArtsQuestions() { //imports the arts questions into the artsQuestions hashmap
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM CURRENTGAMEQS";
            statement.executeUpdate(clearTable);
            String getQs = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'Arts\'";

            ResultSet resultSet = statement.executeQuery(getQs);

            List<Integer> questions = new ArrayList<>();

            while (resultSet.next()) {
                int questionID = resultSet.getInt("id");

                questions.add(questionID);
            }

            Collections.shuffle(questions);

            for (int i = 0; i < 5; i++) {
                String importQs = "INSERT INTO CURRENTGAMEQS (QUESTIONID) VALUES (" + questions.get(i) + ")";
                statement.executeUpdate(importQs);

            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void importScienceQuestions() { //imports the science questions into the scienceQuestions hashmap
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM CURRENTGAMEQS";
            statement.executeUpdate(clearTable);
            String getQs = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'Science\'";

            ResultSet resultSet = statement.executeQuery(getQs);

            List<Integer> questions = new ArrayList<>();

            while (resultSet.next()) {
                int questionID = resultSet.getInt("id");

                questions.add(questionID);
            }

            Collections.shuffle(questions);

            for (int i = 0; i < 5; i++) {
                String importQs = "INSERT INTO CURRENTGAMEQS (QUESTIONID) VALUES (" + questions.get(i) + ")";
                statement.executeUpdate(importQs);

            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void importSportsQuestions() { //imports the sports questions into the sportsQuestions hashmap
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM CURRENTGAMEQS";
            statement.executeUpdate(clearTable);
            String getQs = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'Sports\'";

            ResultSet resultSet = statement.executeQuery(getQs);

            List<Integer> questions = new ArrayList<>();

            while (resultSet.next()) {
                int questionID = resultSet.getInt("id");

                questions.add(questionID);
            }

            Collections.shuffle(questions);

            for (int i = 0; i < 5; i++) {
                String importQs = "INSERT INTO CURRENTGAMEQS (QUESTIONID) VALUES (" + questions.get(i) + ")";
                statement.executeUpdate(importQs);

            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void importGeographyQuestions() { //imports the geography questions into the geographyQuestions hashmap
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM CURRENTGAMEQS";
            statement.executeUpdate(clearTable);
            String getQs = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'Geography\'";

            ResultSet resultSet = statement.executeQuery(getQs);

            List<Integer> questions = new ArrayList<>();

            while (resultSet.next()) {
                int questionID = resultSet.getInt("id");

                questions.add(questionID);
            }

            Collections.shuffle(questions);

            for (int i = 0; i < 5; i++) {
                String importQs = "INSERT INTO CURRENTGAMEQS (QUESTIONID) VALUES (" + questions.get(i) + ")";
                statement.executeUpdate(importQs);

            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void importCustomQuestions() { //imports the custom questions into the customQuestions hashmap
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM CURRENTGAMEQS";
            statement.executeUpdate(clearTable);
            String getQs = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'Custom\'";

            ResultSet resultSet = statement.executeQuery(getQs);

            List<Integer> questions = new ArrayList<>();

            while (resultSet.next()) {
                int questionID = resultSet.getInt("id");

                questions.add(questionID);
            }

            Collections.shuffle(questions);

            for (int i = 0; i < 5; i++) {
                String importQs = "INSERT INTO CURRENTGAMEQS (QUESTIONID) VALUES (" + questions.get(i) + ")";
                statement.executeUpdate(importQs);

            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void getWrittenQuestion() {
        try {
            statement = conn.createStatement();
            String clearTable = "DELETE FROM CURRENTGAMEQS";
            statement.executeUpdate(clearTable);
            String getQs = "SELECT * FROM QUESTIONS WHERE QUESTIONTYPE = \'Written\'";

            ResultSet resultSet = statement.executeQuery(getQs);

            List<Integer> questions = new ArrayList<>();

            while (resultSet.next()) {
                int questionID = resultSet.getInt("id");

                questions.add(questionID);
            }

            Collections.shuffle(questions);

            String importQs = "INSERT INTO CURRENTGAMEQS (QUESTIONID) VALUES (" + questions.get(0) + ")";
            statement.executeUpdate(importQs);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
}
