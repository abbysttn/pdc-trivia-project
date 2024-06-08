/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abbys
 */
public class playerScore {
    static List<Integer> scores = new ArrayList<>();
    
    public static void newSingleScore() { //creates a new score in the scores array
        scores.clear();
        scores.add(0);
    }
    
    public static void newMultiScore(int size) { //creates multiple new scores in the scores array
        for (int i = 0; i<size; i++) {
            scores.add(0);
        }
    }
    
    public static void addToScoreSingle() { //adds 10 points to the single players score
        scores.set(0, scores.get(0) + 10);
    }
    
    public static void addToScoreSingleStreak() { //adds 30 points to the single players score after a streak of 3 has been achieved
        scores.set(0, scores.get(0) + 30);
    }
    
    public static void addToScoreSingleSpecial() { //adds 100 points to the players score for getting the written question correct
        scores.set(0, scores.get(0) + 100);
    }
    
    public static void addToMultiScore(int index) { // adds 10 points to the current players score
        scores.set(index, scores.get(index) + 10);
    }
    
    public static void addToMultiScoreStreak(int index) { //adds 30 points to the current players score after a streak of 3 has been achieved
        scores.set(index, scores.get(index) + 30);
    }
    
    public static void addToMultiScoreSpecial(int index) { //adds 100 points to the current players score after getting the written question correct
        scores.set(index, scores.get(index) + 100);
    }
    
    public static void minusScore() { //removes 10 points from the single players score
        
        if (scores.get(0) != 0) {
        scores.set(0, scores.get(0) - 10);
        } else {
            scores.set(0, 0);
        }
    }
    
    public static void minusScoreMulti(int index) { //removes 10 points from the current players score
        
        if (scores.get(index) != 0) {
        scores.set(index, scores.get(index) - 10);
        } else {
            scores.set(index, 0);
        }
    }
}
