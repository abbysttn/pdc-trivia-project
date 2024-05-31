/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author abbys
 */
public class resetTriviaGame {

    public static void resetPage() { //confirms with user if they want to reset the trivia game
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\n\nWould you like to restart Trivia? (y/n)");
            System.out.println("Note: This gets rid of all highscores, custom questions, and replay game memory.");
            String reset = input.nextLine();

            if (reset.equalsIgnoreCase("x")) {
                runGame.quitProgram();
            } else if (reset.equalsIgnoreCase("y")) {
                System.out.println("\nPlease enter y again to confirm reset.");
                String confirm = input.nextLine();

                boolean confirmation = true;

                while (confirmation) {
                    if (confirm.equalsIgnoreCase("x")) {
                        runGame.quitProgram();
                    } else if (confirm.equalsIgnoreCase("y")) {
                        if (resetHighscores() && resetQuestions() && resetSavedGame()) {
                            clearAll();
                            System.out.println("\n\nTrivia has been reset.");
                            System.out.println("Going back to the main page...\n\n");
                            //mainPage.runMainPage();
                        } else {
                            System.out.println("There has been an error in restarting Trivia, please try again later.");
                            //mainPage.runMainPage();
                        }
                    } else if (confirm.equalsIgnoreCase("n")) {
                        System.out.println("Going back to the main page...\n\n");
                        run = false;
                        //mainPage.runMainPage();
                    } else {
                        System.out.println("Invalid input. Please enter either y or n.");
                    }
                }
            } else if (reset.equalsIgnoreCase("n")) {
                System.out.println("Going back to the main page...\n\n");
                run = false;
                //mainPage.runMainPage();
            } else {
                System.out.println("Invalid input. Please enter either y or n.");
            }
        }

    }

    private static boolean resetHighscores() { //resets the highscore file 
        try {
            FileWriter fw = new FileWriter("./resources/highScores.txt", false);
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error clearing the file: " + e.getMessage());
            return false;
        }
    }

    private static boolean resetQuestions() { //resets the custom questions file
        try {
            FileWriter fw = new FileWriter("./resources/CustomQs.txt", false);
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error clearing the file: " + e.getMessage());
            return false;
        }
    }

    private static boolean resetSavedGame() { //resets the saved game file
        try {
            FileWriter fw = new FileWriter("./resources/TriviaGameContinue.txt", false);
            fw.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error clearing the file: " + e.getMessage());
            return false;
        }
    }
    
    public static void clearAll() { //clears all hashmaps of questions and scores
        Game.askedQs.clear();
        Game.randomGameQuestions.clear();
        importQuestions.artsQuestions.clear();
        importQuestions.customQuestions.clear();
        importQuestions.geographyQuestions.clear();
        importQuestions.historyQuestions.clear();
        importQuestions.scienceQuestions.clear();
        importQuestions.sportsQuestions.clear();
        importQuestions.writtenQuestions.clear();
        playerScore.scores.clear();
    }
}
