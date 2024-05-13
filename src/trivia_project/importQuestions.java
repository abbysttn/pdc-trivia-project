/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static trivia_project.Game.randomGameQuestions;

/**
 *
 * @author abbys
 */
public class importQuestions {

    static HashMap<String, List<String>> historyQuestions = new HashMap();
    static HashMap<String, List<String>> artsQuestions = new HashMap();
    static HashMap<String, List<String>> scienceQuestions = new HashMap();
    static HashMap<String, List<String>> sportsQuestions = new HashMap();
    static HashMap<String, List<String>> geographyQuestions = new HashMap();
    static HashMap<String, List<String>> customQuestions = new HashMap();
    static HashMap<String, String> writtenQuestions = new HashMap();

    public void importHistoryQuestions() { //imports the history questions into the historyQuestions hashmap
        try {
            FileReader fr = new FileReader("./resources/HistoryQs.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;

            while ((line = inputStream.readLine()) != null) {
                String[] questionAndAnswers = line.split("\\|");
                String question = questionAndAnswers[0];
                List<String> options = new ArrayList<>();
                for (int i = 1; i < questionAndAnswers.length; i++) {
                    options.add(questionAndAnswers[i]);
                }

                historyQuestions.put(question, options);
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }

    public void importArtsQuestions() { //imports the arts questions into the artsQuestions hashmap
        try {
            FileReader fr = new FileReader("./resources/ArtsQs.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;

            while ((line = inputStream.readLine()) != null) {
                String[] questionAndAnswers = line.split("\\|");
                String question = questionAndAnswers[0];
                List<String> options = new ArrayList<>();
                for (int i = 1; i < questionAndAnswers.length; i++) {
                    options.add(questionAndAnswers[i]);
                }

                artsQuestions.put(question, options);
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }

    public void importScienceQuestions() { //imports the science questions into the scienceQuestions hashmap
        try {
            FileReader fr = new FileReader("./resources/ScienceQs.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;

            while ((line = inputStream.readLine()) != null) {
                String[] questionAndAnswers = line.split("\\|");
                String question = questionAndAnswers[0];
                List<String> options = new ArrayList<>();
                for (int i = 1; i < questionAndAnswers.length; i++) {
                    options.add(questionAndAnswers[i]);
                }

                scienceQuestions.put(question, options);
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }

    public void importSportsQuestions() { //imports the sports questions into the sportsQuestions hashmap
        try {
            FileReader fr = new FileReader("./resources/SportsQs.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;

            while ((line = inputStream.readLine()) != null) {
                String[] questionAndAnswers = line.split("\\|");
                String question = questionAndAnswers[0];
                List<String> options = new ArrayList<>();
                for (int i = 1; i < questionAndAnswers.length; i++) {
                    options.add(questionAndAnswers[i]);
                }

                sportsQuestions.put(question, options);
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }

    public void importGeographyQuestions() { //imports the geography questions into the geographyQuestions hashmap
        try {
            FileReader fr = new FileReader("./resources/GeographyQs.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;

            while ((line = inputStream.readLine()) != null) {
                String[] questionAndAnswers = line.split("\\|");
                String question = questionAndAnswers[0];
                List<String> options = new ArrayList<>();
                for (int i = 1; i < questionAndAnswers.length; i++) {
                    options.add(questionAndAnswers[i]);
                }

                geographyQuestions.put(question, options);
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }

    public void importCustomQuestions() { //imports the custom questions into the customQuestions hashmap
        try {
            FileReader fr = new FileReader("./resources/CustomQs.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;

            while ((line = inputStream.readLine()) != null) {
                String[] questionAndAnswers = line.split("\\|");
                String question = questionAndAnswers[0].trim();
                List<String> options = new ArrayList<>();
                for (int i = 1; i < questionAndAnswers.length; i++) {
                    options.add(questionAndAnswers[i].trim());
                }

                customQuestions.put(question, options);
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }
    
        public static void importWrittenQuestions() { //imports all written quesitons
        try {
            FileReader fr = new FileReader("./resources/TriviaHardQs.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;

            while ((line = inputStream.readLine()) != null) {
                String[] questionAndAnswers = line.split("\\| ");
                String question = questionAndAnswers[0];
                String answer = questionAndAnswers[1];
                

                writtenQuestions.put(question, answer);
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }
    
    public static void exportCustomQuestions() {  //exports the custom questions to the CustomQs file
        try (
                 FileWriter fw = new FileWriter("./resources/CustomQs.txt")) {
            for (Map.Entry<String, List<String>> entry : customQuestions.entrySet()) {
                StringBuilder line = new StringBuilder(entry.getKey() + " | ");
                List<String> answers = entry.getValue();
                for (String ans : answers) {
                    line.append(ans).append(" | ");
                }
                line.delete(line.length() - 3, line.length());
                fw.write(line.toString() + "\n");
            }
            
            importQuestions.customQuestions.clear();

        } catch (IOException e) {
            System.out.println("Error writing to file ");
        }
    }
    
    public static void customImportHistory() { //imports random history questions into the randomGameQuestions hashmap
        importQuestions iq = new importQuestions();
        iq.importHistoryQuestions();
        List<String> hist = new ArrayList<>(historyQuestions.keySet());
        Collections.shuffle(hist);

        int qCount = 0;

        for (String str : hist) {
            if (qCount == 5) {
                break;
            }
            randomGameQuestions.put(str, historyQuestions.get(str));
            qCount++;
        }
    }

    public static void customImportArts() { //imports random arts questions into the randomGameQuestions hashmap
        importQuestions iq = new importQuestions();
        iq.importArtsQuestions();
        List<String> art = new ArrayList<>(artsQuestions.keySet());
        Collections.shuffle(art);

        int qCount = 0;

        for (String str : art) {
            if (qCount == 5) {
                break;
            }
            randomGameQuestions.put(str, artsQuestions.get(str));
            qCount++;
        }
    }

    public static void customImportScience() { //imports random science questions into the randomGameQuestions hashmap
        importQuestions iq = new importQuestions();
        iq.importScienceQuestions();
        List<String> sci = new ArrayList<>(scienceQuestions.keySet());
        Collections.shuffle(sci);

        int qCount = 0;

        for (String str : sci) {
            if (qCount == 5) {
                break;
            }
            randomGameQuestions.put(str, scienceQuestions.get(str));
            qCount++;
        }
    }

    public static void customImportSports() { //imports random sports questions into the randomGameQuestions hashmap
        importQuestions iq = new importQuestions();
        iq.importSportsQuestions();
        List<String> sprt = new ArrayList<>(sportsQuestions.keySet());
        Collections.shuffle(sprt);

        int qCount = 0;

        for (String str : sprt) {
            if (qCount == 5) {
                break;
            }
            randomGameQuestions.put(str, sportsQuestions.get(str));
            qCount++;
        }
    }

    public static void customImportGeography() { //imports random geography questions into the randomGameQuestions hashmap
        importQuestions iq = new importQuestions();
        iq.importGeographyQuestions();
        List<String> geo = new ArrayList<>(geographyQuestions.keySet());
        Collections.shuffle(geo);

        int qCount = 0;

        for (String str : geo) {
            if (qCount == 5) {
                break;
            }
            randomGameQuestions.put(str, geographyQuestions.get(str));
            qCount++;
        }
    }
    
    
    public static void customImportCustom() { //imports random custom questions into the randomGameQuestions hashmap
        importQuestions iq = new importQuestions();
        iq.importCustomQuestions();
        List<String> cust = new ArrayList<>(customQuestions.keySet());
        Collections.shuffle(cust);

        int qCount = 0;

        for (String str : cust) {
            if (qCount == 5) {
                break;
            }
            randomGameQuestions.put(str, customQuestions.get(str));
            qCount++;
        }
    }
    
    public static void importContinueGameQuestions() { //imports the questions from the saved game and checks if the game is multiplayer or singleplayer
        try {
            FileReader fr = new FileReader("./resources/TriviaGameContinue.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;
            
            line = inputStream.readLine();
            if (line != null && line.startsWith("Multiplayer")) {
                multiplayerSetUp();
            } else if (line != null && line.startsWith("Single Player")) {
                singlePlayerSetUp();
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }
    
    private static void singlePlayerSetUp() { //imports the questions from the saved game for singleplayer and writes them into the current game file questions
        try {
            FileReader fr = new FileReader("./resources/TriviaGameContinue.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;
            
            inputStream.readLine();
            line = inputStream.readLine();
            
            if (line != null && line.startsWith("Score:")) {
                playerScore.newSingleScore();
                playerScore.scores.set(0, Integer.parseInt(line.substring("Score: ".length())));
            }

            while ((line = inputStream.readLine()) != null) {
                String[] questionAndAnswers = line.split("\\|");
                String question = questionAndAnswers[0];
                List<String> options = new ArrayList<>();
                for (int i = 1; i < questionAndAnswers.length; i++) {
                    options.add(questionAndAnswers[i]);
                }

                randomGameQuestions.put(question, options);
            }

            inputStream.close();
            exportQuestions();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }
    
    private static void multiplayerSetUp() { //imports the questions from the saved game for multiplayer and writes them into the current game file questions
        try {
            FileReader fr = new FileReader("./resources/TriviaGameContinue.txt");
            BufferedReader inputStream = new BufferedReader(fr);
            String line;
            
            inputStream.readLine();
            
            List<String> players = new ArrayList<>();
            multiplayerGame game = multiplayerGame.getGameInstance();

            while ((line = inputStream.readLine()) != null && line.startsWith("Score:")) {
                String[] playerInfo = line.split("\\|");
                String player = playerInfo[0].substring("Score:".length());
                int score = Integer.parseInt(playerInfo[1]);
                
                players.add(player);
                playerScore.scores.add(score);
            }
            
            game.setPlayers(players);
            
            while ((line = inputStream.readLine()) != null) {
                String[] questionAndAnswers = line.split("\\|");
                String question = questionAndAnswers[0];
                List<String> options = new ArrayList<>();
                for (int i = 1; i < questionAndAnswers.length; i++) {
                    options.add(questionAndAnswers[i]);
                }

                randomGameQuestions.put(question, options);
            }

            inputStream.close();
            exportQuestions();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file ");
        }
    }
    
    public static void clearFile(String filePath) { //clears the specified file
        try {
            FileWriter fw = new FileWriter(filePath, false);
            fw.close();
        } catch (IOException e) {
            System.out.println("Error clearing the file: " + e.getMessage());
        }
    }
    
    public static boolean fileStatus() { //checks if the previous game file is empty
        File file = new File("./resources/TriviaGameContinue.txt");
        
        return file.exists() && file.length() == 0;
    }
    
    public static void exportQuestions() { //writes the questions within randomGameQuestions to the current game file
        try (
                 FileWriter fw = new FileWriter("./resources/TriviaGameQandA.txt")) {
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
