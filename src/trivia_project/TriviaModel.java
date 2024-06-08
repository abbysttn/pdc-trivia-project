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
public class TriviaModel {

    private String customQuestion;
    private int wrongAnsrNum = 3;

    private List<Integer> questionIds;
    private List<String> answers;

    private int currentQuestionIndex = 0;
    private int streak = 0;

    private int customCats = 1;
    private List<String> selectedTopics = new ArrayList<>();

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
