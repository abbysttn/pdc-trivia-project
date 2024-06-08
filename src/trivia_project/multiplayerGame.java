/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static trivia_project.Game.askedQs;
import static trivia_project.Game.randomGameQuestions;

/**
 *
 * @author abbys
 */
public class multiplayerGame extends Game { //subclass of Game
    
    private List<String> multiPlayers = new ArrayList<>();
    
    private HashMap<String, Integer> streaks = new HashMap<>();
    
    private int currentPlayerIndex = 0;
    
    private static multiplayerGame gameInstance;
    
    public static multiplayerGame getGameInstance() { //ensures only one instance of multiplayer is created and shared across the class
        if (gameInstance == null) {
            gameInstance = new multiplayerGame();
        }
        
        return gameInstance;
    }
    
    public List<String> getPlayers() { //gets the list of players
        return multiPlayers;
    }
    
    public void setPlayers(List<String> players) { //sets the list of players
        this.multiPlayers = players;
    }
    
    
    @Override
    public void savePosition(List<Integer> scores, int id) { //saves the position of the game, scores, and players for future pickup
        multiplayerGame game = getGameInstance();
        List<String> players = game.getPlayers();
        int playerIndex = 0;
        try (
                 FileWriter fw = new FileWriter("./resources/TriviaGameContinue.txt")) {
            
            fw.write("Multiplayer\n");
            
            for (int score : scores) {
                fw.write("Score:" + players.get(playerIndex) + "|" + score + "\n");
                
                playerIndex++;
            }
            
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
