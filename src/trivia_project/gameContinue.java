/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author abbys
 */
public class gameContinue {

    public static void replaySingleGame() { //allows users to start a game they had left during a previous build
        Scanner scan = new Scanner(System.in);
        singlePlayerGame game = new singlePlayerGame();

        if (importQuestions.fileStatus() == false) {

            importQuestions.importContinueGameQuestions();
            System.out.println("\n\nThe current ongoing game has " + Game.randomGameQuestions.size() + " questions left to answer.");
            System.out.println("The current score is " + playerScore.scores.get(0) + " points.\n");

            boolean run = true;

            while (run) {

                System.out.println("Would you like to continue this game? (y/n)");
                String answer = scan.nextLine();
                if (answer.equalsIgnoreCase("x")) {
                    runGame.quitProgram();
                } else if (answer.equalsIgnoreCase("y")) {
                    System.out.println("\n\nContinuing game...\n\n");
                    importQuestions.clearFile("./resources/TriviaGameContinue.txt");
                    run = false;
                    game.askQuestions();
                } else if (answer.equalsIgnoreCase("n")) {
                    System.out.println("Going back to the main page...\n");
                    run = false;
                    //mainPage.runMainPage();
                } else {
                    System.out.println("Invalid response. Please answer with either y or n.");
                }
            }
        } else {
            System.out.println("\n\nThere is currently no saved game to continue.");
            System.out.println("Going back to the main page...\n");
            //mainPage.runMainPage();
        }
    }
    
    public static void replayMultiGame() { //allows players to start a multiplayer game they had lleft during a previous build
        Scanner scan = new Scanner(System.in);
        multiplayerGame game = multiplayerGame.getGameInstance();

        if (importQuestions.fileStatus() == false) {

            importQuestions.importContinueGameQuestions();
            List<String> players = multiplayerGame.getGameInstance().getPlayers();
            List<Integer> scores = playerScore.scores;
            
            System.out.println("\n\nThe current ongoing game has " + Game.randomGameQuestions.size() + " questions left to answer.");
            System.out.println("The current scores are:\n");
            
            for (int i = 0; i < players.size(); i++) {
                String player = players.get(i);
                int score = scores.get(i);
                
                System.out.println(player + ": " + score);
            }

            boolean run = true;

            while (run) {

                System.out.println("\nWould you like to continue this game? (y/n)");
                String answer = scan.nextLine();
                if (answer.equalsIgnoreCase("x")) {
                    runGame.quitProgram();
                } else if (answer.equalsIgnoreCase("y")) {
                    System.out.println("\n\nContinuing game...\n\n");
                    importQuestions.clearFile("./resources/TriviaGameContinue.txt");
                    run = false;
                    game.askQuestions();
                } else if (answer.equalsIgnoreCase("n")) {
                    System.out.println("Going back to the main page...\n");
                    run = false;
                    //mainPage.runMainPage();
                } else {
                    System.out.println("Invalid response. Please answer with either y or n.");
                }
            }
        } else {
            System.out.println("\n\nThere is currently no saved game to continue.");
            System.out.println("Going back to the main page...\n");
            //mainPage.runMainPage();
        }
    }

    
    public static char checkGame() { //checks what type of game is saved in the file
        try {
            FileReader fr = new FileReader("./resources/TriviaGameContinue.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;
            
            line = inputStream.readLine();
            if (line != null && line.startsWith("Multiplayer")) {
                return 'm';
            } else if (line != null && line.startsWith("Single Player")) {
                return 's';
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
        
        return 'x';
    }
}
