/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;


/**
 *
 * @author abbys
 */
import java.util.Scanner;

public class runGame {

    public static void main(String[] args) { //loads all highscores into the game and runs the main page
        DBManager dbManager = new DBManager(); //connect database
        dbManager.getConnection();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriviaFrame().setVisible(true);
            }
        });
        
        highScores.loadHighScores();
        mainPage.runMainPage();
        
        

    }

    public static void quitProgram() { //checks with user if they wish to quit and exits the program
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\nAre you sure you would like to leave? (y/n)");
            String endGame = scan.nextLine();

            if (endGame.equalsIgnoreCase("y")) {
                System.out.println("Leaving Game...");
                System.exit(0);
            } else if (endGame.equalsIgnoreCase("n")) {
                return;
            } else {
                System.out.println("Invalid response. Please enter either y or n.");
            }
        }
    }

    public static void quitTriviaGame() { //checks with user if they wish to quit and/or save their game and exits the program
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\nAre you sure you would like to leave? (y/n)");
            String endGame = scan.nextLine();

            if (endGame.equalsIgnoreCase("y")) {
                System.out.println("Would you like to save your game? (y/n)");
                String saveScore = scan.nextLine();

                if (saveScore.equalsIgnoreCase("y")) {
                    singlePlayerGame game = new singlePlayerGame();
                    game.savePosition(playerScore.scores);
                    System.out.println("Saving Game...");
                    System.exit(0);
                } else if (saveScore.equalsIgnoreCase("n")) {
                    System.out.println("Leaving Game...");
                    System.exit(0);
                }

            } else if (endGame.equalsIgnoreCase("n")) {
                return;
            } else {
                System.out.println("Invalid response. Please enter either y or n.");
            }
        }

    }
    
    public static void quitTriviaGameMulti() { //checks with user if they wish to quit and/or save their game with all multiplayer scores and names, and exits the program
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\nAre you sure you would like to leave? (y/n)");
            String endGame = scan.nextLine();

            if (endGame.equalsIgnoreCase("y")) {
                System.out.println("Would you like to save your game? (y/n)");
                String saveScore = scan.nextLine();

                if (saveScore.equalsIgnoreCase("y")) {
                    multiplayerGame game = multiplayerGame.getGameInstance();
                    game.savePosition(playerScore.scores);
                    System.out.println("Saving Game...");
                    System.exit(0);
                } else if (saveScore.equalsIgnoreCase("n")) {
                    System.out.println("Leaving Game...");
                    System.exit(0);
                }

            } else if (endGame.equalsIgnoreCase("n")) {
                return;
            } else {
                System.out.println("Invalid response. Please enter either y or n.");
            }
        }

    }
}
