/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static trivia_project.highScores.topHighScores;

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

    public abstract void savePosition(List<Integer> scores);

    public abstract void askQuestions();

    public abstract boolean checkAnswer(String correctAnswer);

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
    
    public String getCorrectAnswer(int id) {
        String answer = "";
        
        try {
            statement = conn.createStatement();
            String getCategory = "SELECT * FROM ANSWERS WHERE QUESTIONID = " + id + " AND ISCORRECT = TRUE";
            
            ResultSet resultSet = statement.executeQuery(getCategory);
            
            if (resultSet.next()) {
            answer += resultSet.getString("ANSWERTEXT");
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
        return answer;
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

        if (checkCustomQuestions()) { //checks to see if there are enough custom questions for the game
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

        /*importQuestions iq = new importQuestions();
        iq.importCustomQuestions();
        int totalQuestions = 0;

        List<String> topics = new ArrayList<>(Arrays.asList("history", "arts", "science", "sports", "geography"));

        if (iq.customQuestions.size() >= 5) { //checks to see if there are enough custom questions for the game
            topics.add("custom");
        }

        Collections.shuffle(topics); //randomises the topics
        List<String> selectedTopics = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            selectedTopics.add(topics.get(i));
        }

        for (String topic : selectedTopics) {
            int questionAddedFromTopic = 0;

            switch (topic) {
                case "history":
                    iq.importHistoryQuestions(); // imports the questions into the hashmap
                    List<String> hist = new ArrayList<>(iq.historyQuestions.keySet());
                    Collections.shuffle(hist); //randomises all the questions

                    for (String str : hist) {
                        if (totalQuestions >= 20 || questionAddedFromTopic >= 5) {
                            break;
                        }
                        randomGameQuestions.put(str, iq.historyQuestions.get(str));
                        totalQuestions++;
                        questionAddedFromTopic++;
                    }

                    break;

                case "arts":
                    iq.importArtsQuestions();
                    List<String> art = new ArrayList<>(iq.artsQuestions.keySet());
                    Collections.shuffle(art);

                    for (String str : art) {
                        if (totalQuestions >= 20 || questionAddedFromTopic >= 5) {
                            break;
                        }
                        randomGameQuestions.put(str, iq.artsQuestions.get(str));
                        totalQuestions++;
                        questionAddedFromTopic++;
                    }

                    break;

                case "science":
                    iq.importScienceQuestions();
                    List<String> sci = new ArrayList<>(iq.scienceQuestions.keySet());
                    Collections.shuffle(sci);

                    for (String str : sci) {
                        if (totalQuestions >= 20 || questionAddedFromTopic >= 5) {
                            break;
                        }
                        randomGameQuestions.put(str, iq.scienceQuestions.get(str));
                        totalQuestions++;
                        questionAddedFromTopic++;
                    }

                    break;

                case "sports":
                    iq.importSportsQuestions();
                    List<String> sprt = new ArrayList<>(iq.sportsQuestions.keySet());
                    Collections.shuffle(sprt);

                    for (String str : sprt) {
                        if (totalQuestions >= 20 || questionAddedFromTopic >= 5) {
                            break;
                        }
                        randomGameQuestions.put(str, iq.sportsQuestions.get(str));
                        totalQuestions++;
                        questionAddedFromTopic++;
                    }
                    break;

                case "geography":
                    iq.importGeographyQuestions();
                    List<String> geo = new ArrayList<>(iq.geographyQuestions.keySet());
                    Collections.shuffle(geo);

                    for (String str : geo) {
                        if (totalQuestions >= 20 || questionAddedFromTopic >= 5) {
                            break;
                        }
                        randomGameQuestions.put(str, iq.geographyQuestions.get(str));
                        totalQuestions++;
                        questionAddedFromTopic++;
                    }

                    break;

                case "custom":
                    iq.importGeographyQuestions();
                    List<String> cust = new ArrayList<>(iq.customQuestions.keySet());
                    Collections.shuffle(cust);

                    for (String str : cust) {
                        if (totalQuestions >= 20 || questionAddedFromTopic >= 5) {
                            break;
                        }
                        randomGameQuestions.put(str, iq.customQuestions.get(str));
                        totalQuestions++;
                        questionAddedFromTopic++;
                    }

                    break;

            }
        }

        try ( // writes the random questions from the random topics to a file
                 FileWriter fw = new FileWriter("./resources/TriviaGameQandA.txt")) {
            for (Map.Entry<String, List<String>> entry : randomGameQuestions.entrySet()) {
                StringBuilder line = new StringBuilder(entry.getKey() + " | ");
                List<String> answers = entry.getValue();
                for (String ans : answers) {
                    line.append(ans).append(" | ");
                }
                line.delete(line.length() - 3, line.length());
                fw.write(line.toString() + "\n");
            }

        } catch (IOException e) {
            System.out.println("Error writing to file ");
        }
         */
    }

    public static void gameFinished(List<Integer> scores) { //gives the player/s their score/s at the end of the game and gives them options for what they wish to do next

        int highScore = 0;

        for (int score : scores) { //checks to see who has the highest score (if multiplayer)

            if (score > highScore) {
                highScore = score;
            }
        }
        Scanner scan = new Scanner(System.in);

        resetTriviaGame.clearAll(); //clears all questions from the hashmaps to ensure all answers remain accurate the next round

        boolean run = true;

        while (run) {
            System.out.println("\n      Please select one of the following letters for the option.");
            System.out.println("New Game (n)          Main Page (m)");
            String option = scan.nextLine();

            switch (option) {
                case "n":
                case "N":
                    boolean choosing = true;

                    while (choosing) {
                        System.out.println("What kind of game would you like to start:");
                        System.out.println("New Single Player game (s)              New Multiplayer Game (m)");
                        String choice = scan.nextLine();

                        switch (choice) {
                            case "s":
                            case "S":
                                playerScore.newSingleScore(); //adds a new score to the score array
                                System.out.println("        Setting up new Trivia game...\n");
                                //customisations.gameCustomisationsSingle(); //asks users what type of game they want to play
                                break;

                            case "m":
                            case "M":
                                System.out.println("        Setting up new Trivia game...\n");
                                multiplayerGame.startMultiPlayerGame();
                                break;

                            case "x":
                            case "X":
                                runGame.quitProgram(); //checks with user if they want to leave the program
                                break;
                        }
                    }
                    break;

                case "m":
                case "M":
                    //mainPage.runMainPage(); //runs the main page
                    break;

                case "x":
                case "X":
                    runGame.quitProgram();//checks with user if they want to leave the program
                    break;

                default:
                    break;
            }
        }
    }

}
