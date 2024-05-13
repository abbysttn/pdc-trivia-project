/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.util.*;
import java.io.*;

/**
 *
 * @author abbys
 */
public class highScores {

    static TreeMap<Integer, String> highScores = new TreeMap<>(Collections.reverseOrder());

    public static void highScoreOptions() { //shows all options that users can do within the highscore area
        Scanner scan = new Scanner(System.in);
        System.out.println("\n            Trivia High Scores:\n");
        printHighScores();
        System.out.println("\nPress 'l' to find a High Score, 'r' to return to the main page, or 'x' to end the game");
        String option = scan.nextLine();

        if (option.equalsIgnoreCase("l")) {
            highScores hs = new highScores();
            hs.findHighScore();

        } else if (option.equalsIgnoreCase("r")) {
            mainPage.runMainPage();
            System.out.println("run");
        } else if (option.equalsIgnoreCase("x")) {

            boolean run = true;

            while (run) {
                System.out.println("Are you sure you would like to leave? (y/n)");
                String endGame = scan.nextLine();

                if (endGame.equalsIgnoreCase("y")) {
                    System.out.println("Leaving Game...");
                    System.exit(0);
                } else if (endGame.equalsIgnoreCase("n")) {
                    run = false;
                    highScoreOptions();
                } else {
                    System.out.println("Invalid response. Please enter either y or n.");

                }
            }
        } else {
            highScoreOptions();
        }
    }

    public static void newHighScore(int score) { //adds a new highscore for users
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a name for the highscore.");
        String name = scan.nextLine();

        highScores.put(score, name);

        try (
                 FileWriter fw = new FileWriter("./resources/highScores.txt")) {
            for (Map.Entry<Integer, String> entry : highScores.entrySet()) {
                fw.write(entry.getValue() + ": " + entry.getKey() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file ");
        }

        printHighScores();
    }

    public static void printHighScores() { //prints the top 5 highscores in order
        try {
            FileReader fr = new FileReader("./resources/highScores.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line = null;

            System.out.println("Top High Scores:");

            while ((line = inputStream.readLine()) != null) {
                String[] nameAndScore = line.split("\\: ");
                String name = nameAndScore[0];
                String scoreString = nameAndScore[1].trim();

                try {
                    int score = Integer.parseInt(scoreString);
                    highScores.put(score, name);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid score format for entry: " + line);
                }
            }
            System.out.print("\n");
            inputStream.close();

            if (highScores.isEmpty()) {
                System.out.println("No highscores recorded yet.\n");
            } else {
                int count = 0;
                Iterator<Map.Entry<Integer, String>> iterator = highScores.entrySet().iterator();
                while (iterator.hasNext() && count < 5) {
                    Map.Entry<Integer, String> entry = iterator.next();
                    System.out.println(entry.getValue() + ": " + entry.getKey());
                    count++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }

    public static void loadHighScores() { //loads the highscores into the game
        try {
            FileReader fr = new FileReader("./resources/highScores.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line = null;

            while ((line = inputStream.readLine()) != null) {
                String[] nameAndScore = line.split("\\: ");
                String name = nameAndScore[0];
                String scoreString = nameAndScore[1];

                try {
                    int score = Integer.parseInt(scoreString);
                    highScores.put(score, name);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid score format");
                }
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }

    public void findHighScore() { //allows users to find a highscore by the name

        Scanner scan = new Scanner(System.in);

        System.out.println("\nPlease input a name to find the High Score:");
        String nameToFind = scan.nextLine();

        boolean found = false;

        for (Map.Entry<Integer, String> entry : highScores.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(nameToFind)) {
                int userScore = entry.getKey();
                System.out.println("\n" + nameToFind + "'s High Score is " + userScore);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo High Score found for " + nameToFind + "\n");
        }

        highScoreOptions();
    }
}
