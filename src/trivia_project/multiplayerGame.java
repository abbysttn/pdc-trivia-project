/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import static trivia_project.Game.askedQs;
import static trivia_project.Game.randomGameQuestions;

/**
 *
 * @author abbys
 */
public class multiplayerGame extends Game { //subclass of Game
    
    private List<String> multiPlayers = new ArrayList<>();
    
    private HashMap<String, Integer> streaks = new HashMap<>();
    
    private int currentPlayerIndex = 0;
    
    private static multiplayerGame gameInstance;
    
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
    
    private String getCurrentPlayer() { //gets the name of the current player
        return multiPlayers.get(currentPlayerIndex);
    }
    
    public static void startMultiPlayerGame() { //starts a randomised multiplayer game
        multiplayerGame game = getGameInstance();
        
        System.out.println("            A new Trivia Game is starting...\n");
        System.out.println("To answer a question type in the letter of the answer (a/b/c/d). Press 'x' at any time to leave the game.\n\n");
        
        game.setPlayers(game.players());
        
        playerScore.newMultiScore(game.getPlayers().size());
        
        game.randomGamesQuestions();
        game.askQuestions();
    }
    
    public static void startCustomMultiPlayerGame() { //starts a custom multiplayer game
        multiplayerGame game = getGameInstance();
        
        System.out.println("            A new Trivia Game is starting...\n");
        System.out.println("To answer a question type in the letter of the answer (a/b/c/d). Press 'x' at any time to leave the game.\n\n");
        
        game.setPlayers(game.players());
        
        playerScore.newMultiScore(game.getPlayers().size());
        
        game.askQuestions();
    }
    
    private List<String> players() { //returns the list of user inputted players
        Scanner scan = new Scanner(System.in);
        List<String> players = new ArrayList<>();
        System.out.println("Please enter the name of the first player:");
        String user1 = scan.nextLine();
        players.add(user1);
        
        System.out.println("Please enter the name of the second player:");
        String user2 = scan.nextLine();
        players.add(user2);
        
        System.out.println("Please enter the name of the third player or press e to start the game:");
        String user3 = scan.nextLine();
        
        if (user3.equalsIgnoreCase("e")) {
            return players;
        } else {
            players.add(user3);
            System.out.println("Please enter the name of the fourth player or press e to start the game:");
            String user4 = scan.nextLine();
            if (user4.equalsIgnoreCase("e")) {
                return players;
                
            } else {
                players.add(user4);
                return players;
                
            }
        }
    }
    
    @Override
    public void savePosition(List<Integer> scores) { //saves the position of the game, scores, and players for future pickup
        multiplayerGame game = getGameInstance();
        List<String> players = game.getPlayers();
        int playerIndex = 0;
        try (
                 FileWriter fw = new FileWriter("./resources/TriviaGameContinue.txt")) {
            
            fw.write("Multiplayer\n");
            
            for (int score : scores) {
                fw.write("Score:" + players.get(playerIndex) + "|" + score + "\n");
                
                playerIndex++;
            }
            
            for (String askedQuestions : askedQs.keySet()) {
                randomGameQuestions.remove(askedQuestions);
            }
            
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
    }
    
    @Override
    public void askQuestions() { // asks each player the questions
        multiplayerGame game = getGameInstance();
        List<String> player = game.getPlayers();
        for (String playerName : player) {
            game.streaks.put(playerName, 0);
        }
        Random rand = new Random();
        char[] choice = {'a', 'b', 'c', 'd'};
        int number = 0;
        int randomNumber = rand.nextInt(17) + 5;
        
        List<String> players = game.getPlayers();
        
        String currentPlayer;
        
        for (String q : randomGameQuestions.keySet()) {
            List<String> op = randomGameQuestions.get(q);
            currentPlayer = players.get(currentPlayerIndex);
            String answer = op.get(0);
            Collections.shuffle(op);
            int correctAnswerIndex = op.indexOf(answer);
            
            System.out.println("It is " + currentPlayer + "'s turn to answer: \n");
            System.out.println(q);
            
            int i = 0;
            for (; i < op.size(); i++) {
                System.out.println((choice[i]) + ". " + op.get(i));
            }
            String correctAnswer = String.valueOf(choice[correctAnswerIndex]);
            if (checkAnswer(correctAnswer) == true) {
                askedQs.put(q, op);
            }
            
            number++;
            
            if (number == randomNumber) {
                writtenQuestion.askWrittenQuestionMulti(currentPlayerIndex, currentPlayer);
            }
            
            if (currentPlayerIndex == players.size() - 1) {
                currentPlayerIndex = 0;
            } else {
                currentPlayerIndex++;
            }
            
        }
        
        System.out.println("\n\n            Final Scores:\n");
        for (int i = 0; i < players.size(); i++) {
            String playerName = players.get(i);
            int score = playerScore.scores.get(i);
            System.out.println(playerName + "'s final score is: " + score);
        }
        gameFinished(playerScore.scores);
    }
    
    @Override
    public boolean checkAnswer(String correctAnswer) { //checks if the answer inputted is correct
        Scanner scan = new Scanner(System.in);
        
        boolean run = true;
        
        while (run) {
            String userAnswer = scan.nextLine();
            
            if (userAnswer.equalsIgnoreCase("x")) {
                runGame.quitTriviaGameMulti();
                System.out.println("Please enter your answer to the question.\n");
                checkAnswer(correctAnswer);
                
            } else if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                String currentPlayer = getCurrentPlayer();
                int currentStreak = streaks.get(currentPlayer);
                currentStreak++;
                streaks.put(currentPlayer, currentStreak);
                
                if (currentStreak >= 3) {
                    System.out.println("You are on a streak of " + currentStreak + "!");
                    System.out.println("+30 points!\n");
                    playerScore.addToMultiScoreStreak(currentPlayerIndex, currentPlayer);
                } else {
                    System.out.println("\nThat is correct!\n+10 points!\n");
                    playerScore.addToMultiScore(currentPlayerIndex, currentPlayer);
                }
                return true;
            } else if (userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d")) {
                System.out.println("\nThat is incorrect.\nThe correct answer was " + correctAnswer + "\n-10 points.\n");
                playerScore.minusScoreMulti(currentPlayerIndex, getCurrentPlayer());
                streaks.put(getCurrentPlayer(), 0);
                return false;
            } else {
                System.out.println("\nInvalid response. Please answer with a, b, c, or d.\n");
            }
        }
        return false;
    }
    
    
    
}
