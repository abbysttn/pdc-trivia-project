/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author abbys
 */
public class customisations {

    public static void gameCustomisationsSingle() { //lets users choose what topics they want in their game
        importQuestions iq = new importQuestions();
        iq.importCustomQuestions();
        List<String> topics;
        List<String> removed = new ArrayList<>(); // keeps track of all chosen topics

        if (iq.customQuestions.size() >= 5) {
            topics = new ArrayList<>(Arrays.asList("History (h)", "Arts (a)", "Science (s)", "Sports (p)", "Geography (g)", "Custom (c)"));
        } else {
            topics = new ArrayList<>(Arrays.asList("History (h)", "Arts (a)", "Science (s)", "Sports (p)", "Geography (g)"));
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please select one of the following letters for the options.");
        System.out.println("Custom game (c)         Randomised game (r)");
        String gameMode = scan.nextLine();

        boolean run = true;

        while (run) {
            if (gameMode.equalsIgnoreCase("x")) {
                runGame.quitProgram();
            } else if (gameMode.equalsIgnoreCase("c")) {

                for (int i = 0; i < 4; i++) {
                    System.out.println("\n\nPlease select your number " + (i + 1) + " category for the custom game:\n");
                    for (String topic : topics) {
                        System.out.print(topic + "          ");
                    }
                    System.out.println("\n");
                    String choice = scan.nextLine();

                    if (choice.equalsIgnoreCase("x")) {
                        runGame.quitProgram();
                    } else if (choice.equalsIgnoreCase("h") && !removed.contains("History (h)")) {
                        importQuestions.customImportHistory();
                        topics.remove("History (h)");
                        removed.add("History (h)");
                    } else if (choice.equalsIgnoreCase("a") && !removed.contains("Arts (a)")) {
                        importQuestions.customImportArts();
                        topics.remove("Arts (a)");
                        removed.add("Arts (a)");
                    } else if (choice.equalsIgnoreCase("s") && !removed.contains("Science (s)")) {
                        importQuestions.customImportScience();
                        topics.remove("Science (s)");
                        removed.add("Science (s)");
                    } else if (choice.equalsIgnoreCase("g") && !removed.contains("Geography (g)")) {
                        importQuestions.customImportGeography();
                        topics.remove("Geography (g)");
                        removed.add("Geography (g)");
                    } else if (choice.equalsIgnoreCase("p") && !removed.contains("Sports (p)")) {
                        importQuestions.customImportSports();
                        topics.remove("Sports (p)");
                        removed.add("Sports (p)");
                    } else if (choice.equalsIgnoreCase("c") && !removed.contains("Custom (c)")) {
                        importQuestions.customImportCustom();
                        topics.remove("Custom (c)");
                        removed.add("Custom (c)");

                    } else {
                        System.out.println("\nInvalid input or option already added.\nPlease select one of the following letters for the options.\n");
                        i--;
                        continue;
                    }
                }
                run = false;
                importQuestions.exportQuestions(); //imports chosen questions
                singlePlayerGame.startSinglePlayerCustomGame(); //starts game
            } else if (gameMode.equalsIgnoreCase("r")) {
                singlePlayerGame.startSinglePlayerGame(); //starts game with random questions
            } else {
                gameCustomisationsSingle();
            }
        }
    }

    public static void customiseQuestions() { //asks users if they want to add questions
        Scanner scan = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("\n\nWould you like to add a custom question? (y/n)\nNote: If you would like to use these questions in game, please enter at least 5.");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("x")) {
                run = false;
                runGame.quitProgram();
            } else if (answer.equalsIgnoreCase("y")) {
                addToCustom();
                customiseQuestions();
            } else if (answer.equalsIgnoreCase("n")) {
                run = false;
                System.out.println("Going back to the main page...\n\n");
                mainPage.runMainPage();
            } else {
                System.out.println("\nInvalid input. Please enter eith y or n.");
            }
        }
    }

    private static void addToCustom() { //lets users add their own questions and imports them into the CustomQs file
        importQuestions.customQuestions.clear();
        importQuestions imp = new importQuestions();
        imp.importCustomQuestions();
        Scanner scan = new Scanner(System.in);
        List<String> options = new ArrayList<>();
        System.out.println("\nPlease input the question of your choosing or press 'm' to go back to the main page:");
        String question = scan.nextLine();

        if (question.equalsIgnoreCase("x")) {
            runGame.quitProgram();
            addToCustom();
        } else if (question.equalsIgnoreCase("m")) {
            mainPage.runMainPage();
        }

        boolean run = true;

        while (run) {
            System.out.println("\n\nThe question you submitted is: " + question);
            System.out.println("Is this correct? (y/n)");
            String check = scan.nextLine();

            if (check.equalsIgnoreCase("y")) {
                System.out.println("\nPlease input the correct answer to this question:");
                String answer = scan.nextLine();

                System.out.println("\n\nThe answer you submitted is: " + answer);
                System.out.println("Is this correct? (y/n)");
                String checkAnswer = scan.nextLine();

                if (checkAnswer.equalsIgnoreCase("y")) {
                    run = false;
                    options.add(answer);
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Please enter the #" + (i + 1) + " wrong answer for this question.");
                        String option = scan.nextLine();
                        options.add(option);
                    }

                    importQuestions.customQuestions.put(question, options);
                    importQuestions.exportCustomQuestions();
                    customiseQuestions();
                }
            } else if (check.equalsIgnoreCase("n")) {
                addToCustom();
            } else if (check.equalsIgnoreCase("x")) {
                runGame.quitProgram();
            } else {
                System.out.println("\nInvalid input. Please enter either y or n.");
            }
        }
    }

    public static void gameCustomisationsMulti() { //lets users choose what topics they want in their game but starts a multiplayer game instead
        importQuestions iq = new importQuestions();
        iq.importCustomQuestions();
        List<String> topics;
        List<String> removed = new ArrayList<>(); // keeps track of all chosen topics

        if (iq.customQuestions.size() >= 5) {
            topics = new ArrayList<>(Arrays.asList("History (h)", "Arts (a)", "Science (s)", "Sports (p)", "Geography (g)", "Custom (c)"));
        } else {
            topics = new ArrayList<>(Arrays.asList("History (h)", "Arts (a)", "Science (s)", "Sports (p)", "Geography (g)"));
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please select one of the following letters for the options.");
        System.out.println("Custom game (c)         Randomised game (r)");
        String gameMode = scan.nextLine();

        boolean run = true;

        while (run) {
            if (gameMode.equalsIgnoreCase("x")) {
                runGame.quitProgram();
            } else if (gameMode.equalsIgnoreCase("c")) {

                for (int i = 0; i < 4; i++) {
                    System.out.println("\n\nPlease select your number " + (i + 1) + " category for the custom game:\n");
                    for (String topic : topics) {
                        System.out.print(topic + "          ");
                    }
                    System.out.println("\n");
                    String choice = scan.nextLine();

                    if (choice.equalsIgnoreCase("x")) {
                        runGame.quitProgram();
                    } else if (choice.equalsIgnoreCase("h") && !removed.contains("History (h)")) {
                        importQuestions.customImportHistory();
                        topics.remove("History (h)");
                        removed.add("History (h)");
                    } else if (choice.equalsIgnoreCase("a") && !removed.contains("Arts (a)")) {
                        importQuestions.customImportArts();
                        topics.remove("Arts (a)");
                        removed.add("Arts (a)");
                    } else if (choice.equalsIgnoreCase("s") && !removed.contains("Science (s)")) {
                        importQuestions.customImportScience();
                        topics.remove("Science (s)");
                        removed.add("Science (s)");
                    } else if (choice.equalsIgnoreCase("g") && !removed.contains("Geography (g)")) {
                        importQuestions.customImportGeography();
                        topics.remove("Geography (g)");
                        removed.add("Geography (g)");
                    } else if (choice.equalsIgnoreCase("p") && !removed.contains("Sports (p)")) {
                        importQuestions.customImportSports();
                        topics.remove("Sports (p)");
                        removed.add("Sports (p)");
                    } else if (choice.equalsIgnoreCase("c") && !removed.contains("Custom (c)")) {
                        importQuestions.customImportCustom();
                        topics.remove("Custom (c)");
                        removed.add("Custom (c)");

                    } else {
                        System.out.println("\nInvalid input or option already added.\nPlease select one of the following letters for the options.\n");
                        i--;
                        continue;
                    }
                }
                run = false;
                importQuestions.exportQuestions(); //imports chosen questions
                multiplayerGame.startCustomMultiPlayerGame(); //starts game
            } else if (gameMode.equalsIgnoreCase("r")) {
                multiplayerGame.startMultiPlayerGame(); //starts game with random questions
            } else {
                gameCustomisationsMulti();
            }
        }
    }
}
