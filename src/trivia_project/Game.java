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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author abbys
 */
public abstract class Game { //superclass for multiplayer and singleplayer games

    private Statement statement;
    private final DBManager dbManager;
    private final Connection conn;

    public Game() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }

    static HashMap<String, List<String>> randomGameQuestions = new HashMap<>();
    static HashMap<String, List<String>> askedQs = new HashMap<>();

    public abstract void savePosition(List<Integer> scores, int currentQuestionIndex);
    
    public String getQuestion(int id) {
        String question = "";
        
        try {
            statement = conn.createStatement();
            String getQ = "SELECT * FROM QUESTIONS WHERE ID = " + id;
            
            ResultSet resultSet = statement.executeQuery(getQ);
            
            if (resultSet.next()) {
            question += resultSet.getString("QUESTIONTEXT");
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
        return question;
    }
    
    public List<String> getAnswers(int id) {
        List<String> answers = new ArrayList<>();
        
        try {
            statement = conn.createStatement();
            String getCategory = "SELECT * FROM ANSWERS WHERE QUESTIONID = " + id;
            
            ResultSet resultSet = statement.executeQuery(getCategory);
            
            while (resultSet.next()) {
            answers.add(resultSet.getString("ANSWERTEXT"));
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
        Collections.shuffle(answers);
        return answers;
    }
    
    public boolean checkAnswer(String answer) {
        boolean isCorrect = false;
        
        try {
            statement = conn.createStatement();
            String getCategory = "SELECT * FROM ANSWERS WHERE ANSWERTEXT = \'" + answer + "\'";
            
            ResultSet resultSet = statement.executeQuery(getCategory);
            
            if (resultSet.next()) {
            isCorrect = resultSet.getBoolean("ISCORRECT");
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
        return isCorrect;
    }
    
    public String getCategory(int id) {
        String category = "";
        
        try {
            statement = conn.createStatement();
            String getCategory = "SELECT * FROM QUESTIONS WHERE ID = " + id;
            
            ResultSet resultSet = statement.executeQuery(getCategory);
            
            if (resultSet.next()) {
            category += resultSet.getString("QUESTIONTYPE");
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
        return category;
    }
    
    public List<Integer> getQuestionID() {
        List<Integer> questionIDs = new ArrayList<>();
        
        try {
            statement = conn.createStatement();
            String getIDs = "SELECT * FROM CURRENTGAMEQS";
            
            ResultSet resultSet = statement.executeQuery(getIDs);
            
            while (resultSet.next()) {
                int id = resultSet.getInt("QUESTIONID");
                
                questionIDs.add(id);
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
        return questionIDs;
    }

    public void randomGamesQuestions() { //gives random questions for random topics
        
        List<String> topics = new ArrayList<>(Arrays.asList("History", "Arts", "Science", "Sports", "Geography"));
        customisations custom = new customisations();

        if (custom.checkCustomQuestions()) { //checks to see if there are enough custom questions for the game
            topics.add("Custom");
        }

        Collections.shuffle(topics); //randomises the topics
        List<String> selectedTopics = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            selectedTopics.add(topics.get(i));
        }

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
}
