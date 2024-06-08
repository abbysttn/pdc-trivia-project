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

/**
 *
 * @author abbys
 */
public class singlePlayerGame extends Game { //subclass of Game
    
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
}
