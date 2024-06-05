/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author abbys
 */
public class singlePlayerGame extends Game { //subclass of Game
    
    private int streak = 1;

    public static void startSinglePlayerGame() { //starts a randomised singleplayer game
        singlePlayerGame game = new singlePlayerGame();
        System.out.println("            A new Trivia Game is starting...\n");
        System.out.println("To answer a question type in the letter of the answer (a/b/c/d). Press 'x' at any time to leave the game.\n\n");
        game.randomGamesQuestions();
        game.askQuestions();
    }

    public static void startSinglePlayerCustomGame() { //starts a custom singleplayer game
        singlePlayerGame game = new singlePlayerGame();
        System.out.println("            A new Trivia Game is starting...\n");
        System.out.println("To answer a question type in the letter of the answer (a/b/c/d). Press 'x' at any time to leave the game.\n\n");
        game.askQuestions();
    }

    @Override
    public void savePosition(List<Integer> scores) { // saves the games curent position as well as the score for future pickup
        try (
                 FileWriter fw = new FileWriter("./resources/TriviaGameContinue.txt")) {

            fw.write("Single Player\n");
            fw.write("Score: " + scores.get(0) + "\n");

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
    public void askQuestions() { //asks the user the questions
        Random rand = new Random();
        char[] choice = {'a', 'b', 'c', 'd'};
        int number = 0;
        int randomNumber = rand.nextInt(10) + 5;
        

        for (String q : randomGameQuestions.keySet()) {
            System.out.println(q);
            List<String> op = randomGameQuestions.get(q);
            String answer = op.get(0);
            Collections.shuffle(op);
            int correctAnswerIndex = op.indexOf(answer);
            int i = 0;
            for (; i < op.size(); i++) {
                System.out.println((choice[i]) + ". " + op.get(i));
            }
            String correctAnswer = String.valueOf(choice[correctAnswerIndex]);
            checkAnswer(correctAnswer);
            askedQs.put(q, op);
            
            number++;
            
            if (number == randomNumber) {
                writtenQuestion.askWrittenQuestion();
            }
        }

        System.out.println("\nYour final score is: " + playerScore.scores.get(0));

        gameFinished(playerScore.scores);
    }

    /*@Override
    public boolean checkAnswer(String correctAnswer) { // checks if the user inputted answer is correct
        Scanner scan = new Scanner(System.in);

        
        String userAnswer = scan.nextLine();

        if (userAnswer.equalsIgnoreCase("x")) {
            runGame.quitTriviaGame();
            System.out.println("Please enter your answer to the question.\n");
            checkAnswer(correctAnswer);

        } else if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            if (streak >=3) {
                System.out.println("You are on a streak of " + streak + "!");
                System.out.println("+30 points!\n");
                playerScore.addToScoreSingleStreak();
            } else {
            System.out.println("\nThat is correct!\n+10 points!\n");
            playerScore.addToScoreSingle();
            }
            streak++;
            
            return true;
        } else if (userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d")) {
            System.out.println("\nThat is incorrect.\nThe correct answer was " + correctAnswer + "\n-10 points.\n");
            streak = 1;
            playerScore.minusScore();
            return false;
        } else {
            System.out.println("\nInvalid response. Please answer with a, b, c, or d.\n");
            checkAnswer(correctAnswer);
        }
        return false;
    }*/
}
