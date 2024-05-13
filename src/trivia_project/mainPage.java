/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.util.Scanner;

/**
 *
 * @author abbys
 */
public class mainPage {

    public static void runMainPage() { // runs the main page of the game with all options shown
        Scanner option = new Scanner(System.in);
        System.out.println("\n            Welcome to Trivia. Press 'x' at any time to leave the game.\n");
        System.out.println("Please select one of the following letters for the options.");
        System.out.println("Single Player (s)           Multiplayer (m)         Customisations (c)            Highscores (h)            Continue Game (g)           Reset Trivia (r)            How to play (p)");
        String playerChoice = option.nextLine();

        switch (playerChoice) {
            case "s":
            case "S":
                playerScore.newSingleScore();
                System.out.println("        Setting up new Trivia game...\n");
                customisations.gameCustomisationsSingle();
                break;

            case "m":
            case "M":
                System.out.println("        Setting up new Trivia game...\n");
                customisations.gameCustomisationsMulti();
                break;

            case "c":
            case "C":
                customisations.customiseQuestions();
                break;

            case "h":
            case "H":
                highScores.highScoreOptions();
                break;

            case "g":
            case "G":
                char gameType = gameContinue.checkGame();
                
                switch (gameType) {
                    case 'm':
                        gameContinue.replayMultiGame();
                        break;
                        
                    case 's':
                        gameContinue.replaySingleGame();
                        break;
                        
                    case 'x':
                        gameContinue.replaySingleGame();
                        break;
                        
                    default:
                        runMainPage();
                }
                break;

            case "x":
            case "X":
                runGame.quitProgram();
                
            case "R":
            case "r":
                resetTriviaGame.resetPage();
                break;
                
            case "p":
            case "P":
                howTo.instructions();
                break;
                
            default:
                runMainPage();
        }
    }
}
