/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author abbys
 */
public class TriviaModel {

    private String customQuestion;
    private int wrongAnsrNum = 3;
    
    private int playerIndex = 0;

    private List<Integer> questionIds;
    private List<String> answers;
    
    private Map<String, Integer> playersOnStreak = new HashMap<>();

    private int currentQuestionIndex = 0;
    private int streak = 0;
    private List<Integer> streaks = new ArrayList<>();

    private int customCats = 1;
    private List<String> selectedTopics = new ArrayList<>();
    
    private List<String> playerNames = new ArrayList<>();
    private int playerAmount = 0;
    
    private int specialQuestionNum = 0;
    
    private final Random rand = new Random();
    private final int randomNumber = rand.nextInt(10) + 5;
    
    public static TriviaModel model;
    
    
    public static TriviaModel getModelInstance() { //ensures only one instance of model is created and shared
        if (model == null) {
            model = new TriviaModel();
        }

        return model;
    }
    
    
    //methods for getting and setting variables needed for the GUI
    public int getRandomNumber() {
        return randomNumber;
    }
    
    public int getSpecialQuestionNum() {
        return specialQuestionNum;
    }
    
    public void setSpecialQuestionNum(int specialQuestionNum) {
        this.specialQuestionNum = specialQuestionNum;
    }
    
    public void increaseSpecialQuestionNum(int specialQuestionNum) {
        this.specialQuestionNum = specialQuestionNum + 1;
    }
    
    public Map<String, Integer> getPlayersOnStreak() {
        return playersOnStreak;
    }
    
    public void setPlayersOnStreak(Map<String, Integer> playersOnStreak) {
        this.playersOnStreak = playersOnStreak;
    }
    
    public void removePlayerOnStreak(Map<String, Integer> playersOnStreak, int index, String player) {
        playersOnStreak.remove(player, index);
        this.playersOnStreak = playersOnStreak;
    }
    
    public int getPlayerIndex() {
        return playerIndex;
    }
    
    public void setPlayerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }
    
    public void addStreaks() {
        for(int i = 0; i < playerAmount; i++) {
            streaks.add(0);
        }
    }
    
    public List<Integer> getStreaks() {
        return streaks;
    }
    
    public void setStreaks(List<Integer> streaks) {
        this.streaks = streaks;
    }
    
    public int getPlayerAmount() {
        return playerAmount;
    }
    
    public void setPlayerAmount(int playerAmount) {
        this.playerAmount = playerAmount;
    }
    
    public List<String> getPlayerNames() {
        return playerNames;
    }
    
    public void setPlayerNames(List<String> playerNames) {
        this.playerNames = playerNames;
    }

    public String getCustomQuestion() {
        return customQuestion;
    }
    
    public void setCustomQuestion(String customQuestion) {
        this.customQuestion = customQuestion;
    }
    
    public int getWrongAnsrNum() {
        return wrongAnsrNum;
    }
    
    public void setWrongAnsrNum(int wrongAnsrNum) {
        this.wrongAnsrNum = wrongAnsrNum;
    }
    
    public List<Integer> getQuestionIds() {
        return questionIds;
    }

    public void setQuestionIds(List<Integer> questionIds) {
        this.questionIds = questionIds;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    public void setCurrentQuestionIndex(int currentQuestionIndex) {
        this.currentQuestionIndex = currentQuestionIndex;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getCustomCats() {
        return customCats;
    }

    public void setCustomCats(int customCats) {
        this.customCats = customCats;
    }

    public List<String> getSelectedTopics() {
        return selectedTopics;
    }

    public void setSelectedTopics(List<String> selectedTopics) {
        this.selectedTopics = selectedTopics;
    }

}
