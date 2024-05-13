/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author abbys
 */
public class writtenQuestion {

    static HashMap<String, String> writtenQuestion = new HashMap();

    public static void chooseWrittenQuestion() { //imports written questions and chooses a random one for the game
        importQuestions.importWrittenQuestions();
        importQuestions iq = new importQuestions();

        List<String> written = new ArrayList<>(iq.writtenQuestions.keySet());
        Collections.shuffle(written);
        String randomQuestion = written.get(0);
        String randomAnswer = iq.writtenQuestions.get(randomQuestion);

        writtenQuestion.put(randomQuestion, randomAnswer);
    }
    
    public static void askWrittenQuestion() { //asks the written quesiton and checks if correct
        Scanner scan = new Scanner(System.in);
        System.out.println("            Special Question!");
        System.out.println("Please answer by typing out your answer:");
        chooseWrittenQuestion();
        
        for (String q : writtenQuestion.keySet()) {
            System.out.println(q);
            String correctAnswer = writtenQuestion.get(q);
            String answer = scan.nextLine().toLowerCase();
            
            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Congrats your answer is correct!");
                System.out.println("+100 points.");
                playerScore.addToScoreSingleSpecial();
            } else if (answer.equalsIgnoreCase("x")){
                runGame.quitTriviaGame();
            } else {
                System.out.println("Sorry, that is incorrect.");
            }
        }
        
    }
    
    public static void askWrittenQuestionMulti(int playerIndex, String player) { //asks the current player the written question and checks if correct
        Scanner scan = new Scanner(System.in);
        System.out.println("            Special Question for " + player + "!");
        System.out.println("Please answer by typing out your answer:");
        chooseWrittenQuestion();
        
        for (String q : writtenQuestion.keySet()) {
            System.out.println(q);
            String correctAnswer = writtenQuestion.get(q);
            String answer = scan.nextLine().toLowerCase();
            
            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Congrats, " + player + "'s answer is correct!");
                System.out.println("+100 points.");
                playerScore.addToMultiScoreSpecial(playerIndex, player);
            } else if (answer.equalsIgnoreCase("x")){
                runGame.quitTriviaGame();
            } else {
                System.out.println("Sorry, that is incorrect.");
            }
        }
        
    }
}
