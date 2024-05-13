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
public class howTo {
    public static void instructions() { //provides instructions for new users on how to play the game
        System.out.println("            How to play Trivia:");
        System.out.println("To answer a question, type in a/b/c/d and press enter.\n\n");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("This game is called:");
        System.out.println("a. Trivia");
        System.out.println("b. Chess");
        System.out.println("c. Cards");
        System.out.println("d. Go");
        
        boolean run = true;
        
        while (run) {
        String answer = scan.nextLine();
        if (answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c") || answer.equalsIgnoreCase("d")) {
            run = false;
            break;
        } else {
            System.out.println("\nWrong input. Try writing a/b/c/d and pressing enter.");
        }
        }
        
        
        System.out.println("\n\nOnce a game, you'll come across a special question. When playing Multiplayer, one player has the chance to get this.");
        System.out.println("To answer this question, type in the answer e.g. 'Eggs' and press enter.\n\n");
        
        System.out.println("            Special Question");
        System.out.println("What section is this called?");
        scan.nextLine();
        
        System.out.println("\n\nIf you answer 3 or more questions in a row, you get extra points!");
        
        System.out.println("Good luck!");
        
        mainPage.runMainPage(); 
    }
}
