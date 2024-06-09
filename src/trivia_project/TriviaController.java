/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author abbys
 */
public class TriviaController {

    private static TriviaModel model;
    private TriviaView view;

    public TriviaController(TriviaModel model, TriviaView view) {
        this.model = TriviaModel.getModelInstance();
        this.view = view;

        //creates new listeners for each button and text field
        ActionListener switchToMainListener = new SwitchToMainActionListener();
        ActionListener exitListener = new exitActionListener();
        ActionListener switchToHowTo2Listener = new SwitchToHowTo2ActionListener();
        ActionListener switchToAnswerListener = new SwitchToAnswers();
        ActionListener switchToCustomListener = new SwitchToCustomiseListener();
        ActionListener switchToNewGameListener = new SwitchToNewGameListener();
        ActionListener saveGameListener = new SaveGameListener();

        view.addActionListenerToButton(view.getToMain(), switchToMainListener);
        view.addActionListenerToButton(view.getToStart(), new SwitchToStartListener());

        view.addActionListenerToButton(view.getExit(), exitListener);
        view.addActionListenerToButton(view.getExit1(), exitListener);
        view.addActionListenerToButton(view.getExit2(), exitListener);
        view.addActionListenerToButton(view.getExit3(), exitListener);
        view.addActionListenerToButton(view.getExit4(), exitListener);
        view.addActionListenerToButton(view.getExit5(), exitListener);
        view.addActionListenerToButton(view.getExit6(), exitListener);
        view.addActionListenerToButton(view.getExit7(), exitListener);
        view.addActionListenerToButton(view.getExit8(), exitListener);
        view.addActionListenerToButton(view.getExit9(), exitListener);
        view.addActionListenerToButton(view.getExit10(), exitListener);
        view.addActionListenerToButton(view.getExit11(), exitListener);
        view.addActionListenerToButton(view.getExit12(), exitListener);
        view.addActionListenerToButton(view.getExit13(), exitListener);
        view.addActionListenerToButton(view.getExit14(), saveGameListener);
        view.addActionListenerToButton(view.getExit15(), exitListener);
        view.addActionListenerToButton(view.getExit22(), saveGameListener);

        view.addActionListenerToButton(view.getHowTo(), new SwitchToHowToListener());
        view.addActionListenerToButton(view.getNewGame(), switchToNewGameListener);
        view.addActionListenerToButton(view.getToHighScores(), new SwitchToHighScoresListener());
        view.addActionListenerToButton(view.getCustomise(), switchToCustomListener);
        view.addActionListenerToButton(view.getReset(), new SwitchToResetListener());
        view.addActionListenerToButton(view.getAns1(), switchToHowTo2Listener);
        view.addActionListenerToButton(view.getAns2(), switchToHowTo2Listener);
        view.addActionListenerToButton(view.getAns3(), switchToHowTo2Listener);
        view.addActionListenerToButton(view.getAns4(), switchToHowTo2Listener);

        view.addActionListenerToButton(view.getToMainHowTo(), switchToMainListener);

        view.addActionListenerToButton(view.getSubmitHowToSpecial(), new SwitchToHowTo3Listener());
        view.addActionListenerToButton(view.getToMainHowTo1(), switchToMainListener);

        view.addActionListenerToButton(view.getGoodLuckToMain(), switchToMainListener);

        view.addActionListenerToButton(view.getToMainHS1(), switchToMainListener);

        view.addActionListenerToButton(view.getToMainHS2(), switchToMainListener);

        view.addActionListenerToButton(view.getToMainC(), switchToMainListener);

        view.addActionListenerToButton(view.getYesQs(), switchToAnswerListener);
        view.addActionListenerToButton(view.getNoQs(), new SwitchToQuestions());
        view.addActionListenerToButton(view.getToMainC1(), switchToMainListener);

        view.addActionListenerToButton(view.getToMainC2(), switchToMainListener);

        view.addActionListenerToButton(view.getYesAs(), new SwitchToWrong());
        view.addActionListenerToButton(view.getNoAs(), switchToAnswerListener);
        view.addActionListenerToButton(view.getToMainC3(), switchToMainListener);

        view.addActionListenerToButton(view.getAddAnother(), switchToCustomListener);
        view.addActionListenerToButton(view.getBackToMain(), switchToMainListener);

        view.addActionListenerToButton(view.getSinglePlayerOption(), new SwitchToSinglePlayerOptionListener());
        view.addActionListenerToButton(view.getMultiplayerOption(), new SwitchToMultiplayerNamesListener());
        view.addActionListenerToButton(view.getToMainNG(), switchToMainListener);

        view.addActionListenerToButton(view.getRandomQsS(), new SwitchToSingleGameRandomListener());
        view.addActionListenerToButton(view.getCustomQsS(), new SwitchToCustomOptionsListener());
        view.addActionListenerToButton(view.getToMainS(), switchToMainListener);

        view.addActionListenerToButton(view.getAns5(), new Ans5Listener());
        view.addActionListenerToButton(view.getAns6(), new Ans6Listener());
        view.addActionListenerToButton(view.getAns7(), new Ans7Listener());
        view.addActionListenerToButton(view.getAns8(), new Ans8Listener());
        view.addActionListenerToButton(view.getToStartEnd(), switchToMainListener);
        view.addActionListenerToButton(view.getReplayS(), switchToNewGameListener);

        view.addActionListenerToButton(view.getExit16(), exitListener);
        view.addActionListenerToButton(view.getScienceS(), new SelectedScienceS());
        view.addActionListenerToButton(view.getHistoryS(), new SelectedHistoryS());
        view.addActionListenerToButton(view.getArtsS(), new SelectedArtsS());
        view.addActionListenerToButton(view.getSportsS(), new SelectedSportsS());
        view.addActionListenerToButton(view.getGeographyS(), new SelectedGeographyS());
        view.addActionListenerToButton(view.getCustomS(), new SelectedCustomS());
        view.addActionListenerToButton(view.getToMainS1(), switchToMainListener);

        view.addActionListenerToButton(view.getToMainM(), switchToMainListener);
        view.addActionListenerToButton(view.getExit17(), exitListener);
        view.addActionListenerToButton(view.getEnterPlayerNames(), new EnterPlayerNamesListener());

        view.addActionListenerToButton(view.getRandomQsM(), new SwitchToMultiGameRandomListener());
        view.addActionListenerToButton(view.getCustomQsM(), new SwitchToMultiCustomOptionsListener());
        view.addActionListenerToButton(view.getToMainM3(), switchToMainListener);
        view.addActionListenerToButton(view.getExit19(), exitListener);

        view.addActionListenerToButton(view.getExit20(), exitListener);
        view.addActionListenerToButton(view.getArtsM(), new SelectedArtsM());
        view.addActionListenerToButton(view.getHistoryM(), new SelectedHistoryM());
        view.addActionListenerToButton(view.getSportsM(), new SelectedSportsM());
        view.addActionListenerToButton(view.getScienceM(), new SelectedScienceM());
        view.addActionListenerToButton(view.getGeographyM(), new SelectedGeographyM());
        view.addActionListenerToButton(view.getCustomM(), new SelectedCustomM());
        view.addActionListenerToButton(view.getToMainM1(), switchToMainListener);

        view.addActionListenerToButton(view.getExit18(), saveGameListener);
        view.addActionListenerToButton(view.getAns9(), new Ans9Listener());
        view.addActionListenerToButton(view.getAns10(), new Ans10Listener());
        view.addActionListenerToButton(view.getAns11(), new Ans11Listener());
        view.addActionListenerToButton(view.getAns12(), new Ans12Listener());

        view.addActionListenerToButton(view.getExit21(), exitListener);
        view.addActionListenerToButton(view.getToStartEndM(), switchToMainListener);
        view.addActionListenerToButton(view.getReplayM(), switchToNewGameListener);

        view.addActionListenerToButton(view.getContinueGame(), new ContinueGameListener());

        view.addKeyListenerToTextField(view.getHowToSpecial(), new PracticeKeyListener());

        view.addKeyListenerToTextField(view.getFindHS(), new FindHSKeyListener());
        view.addKeyListenerToTextField(view.getFindHS1(), new FindHS1KeyListener());

        view.addKeyListenerToTextField(view.getQuestionField(), new CustomQuestionFieldKeyListener());
        view.addKeyListenerToTextField(view.getAnswerField(), new CustomAnswerFieldKeyListener());
        view.addKeyListenerToTextField(view.getWrongAnswerField(), new CustomWrongAnswerFieldKeyListener());

        view.addKeyListenerToTextField(view.getPlayerNameField(), new PlayerNamesFieldKeyListener());
        view.addKeyListenerToTextField(view.getSpecialAnswerField(), new SpecialQFieldKeyListener());

    }
    
    //buttons and textfields implementation

    class ContinueGameListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            gameContinue gc = new gameContinue();
            String gameType = gc.getGameType();

            JOptionPane.showMessageDialog(view, "You have a " + gameType + " game saved.", "Info", JOptionPane.INFORMATION_MESSAGE);
            int response = JOptionPane.showConfirmDialog(view, "Would you like to continue this game?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(view, "Importing Game...", "Info", JOptionPane.INFORMATION_MESSAGE);
                gc.importGame();
                if (gameType.equals("Single Player")) {
                    startSavedSingle();
                } else {
                    startSavedMulti();
                }
            }
        }
    }

    class SpecialQFieldKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            singlePlayerGame game = new singlePlayerGame();

            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String answer = view.getSpecialAnswerField().getText();

                if (Game.checkAnswerLength(answer)) {
                    if (game.checkSpecialAnswer(view.getSpecialQ().getText(), answer)) {
                        if (!model.getPlayerNames().isEmpty()) {
                            playerScore.addToMultiScoreSpecial(model.getPlayerIndex());
                            showScoresMulti();
                            view.switchToMultiGame();
                        } else {
                            playerScore.addToScoreSingleSpecial();
                            view.getScore().setText("Score: " + playerScore.scores.get(0));
                            view.switchToSingleGame();
                        }
                        model.increaseSpecialQuestionNum(model.getSpecialQuestionNum());
                    } else {
                        if (!model.getPlayerNames().isEmpty()) {
                            view.switchToMultiGame();
                        } else {
                            view.switchToSingleGame();
                        }
                        model.increaseSpecialQuestionNum(model.getSpecialQuestionNum());
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "Please enter an answer between 3 and 250 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                view.getSpecialAnswerField().setText("Answer here and press enter!");
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    class SwitchToResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            int response = JOptionPane.showConfirmDialog(view, "Are you sure want to reset?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(view, "The game has been reset.", "Info", JOptionPane.INFORMATION_MESSAGE);
                resetTriviaGame rtg = new resetTriviaGame();
                rtg.clearFromDatabase();
            }
        }
    }

    class SwitchToMultiCustomOptionsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToMultiCustomOptions();
        }
    }

    class SaveGameListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            singlePlayerGame game = new singlePlayerGame();
            multiplayerGame mGame = multiplayerGame.getGameInstance();

            int response = JOptionPane.showConfirmDialog(view, "Are you sure want to leave?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.NO_OPTION) {
                return;
            }

            if (!model.getPlayerNames().isEmpty()) {
                mGame.savePosition(playerScore.scores, model.getCurrentQuestionIndex());
                System.exit(0);
            } else {
                game.savePosition(playerScore.scores, model.getCurrentQuestionIndex());
                System.exit(0);
            }
        }
    }

    class SwitchToMultiGameRandomListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            multiplayerGame game = multiplayerGame.getGameInstance();
            game.randomGamesQuestions();
            startMulti();
        }
    }

    class PlayerNamesFieldKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                if (highScores.checkNameLength(view.getPlayerNameField().getText())) {
                    model.setPlayerAmount(model.getPlayerAmount() + 1);

                    if (model.getPlayerAmount() == 2) {
                        model.getPlayerNames().add(view.getPlayerNameField().getText());
                        view.addMultiNameOk();
                    } else if (model.getPlayerAmount() <= 3) {
                        model.getPlayerNames().add(view.getPlayerNameField().getText());
                    } else {
                        model.getPlayerNames().add(view.getPlayerNameField().getText());
                        multiplayerGame game = multiplayerGame.getGameInstance();
                        game.setPlayers(model.getPlayerNames());
                        view.switchToMultiOptions();
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "Please enter a name between 2 and 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                view.getPlayerNameField().setText("Enter the player name here!");
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    class EnterPlayerNamesListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToMultiOptions();
        }
    }

    class SwitchToMultiplayerNamesListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToMultiNames();
        }
    }

    class SwitchToMainActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToMain();
            gameContinue gc = new gameContinue();
            if (gc.checkGame()) {
                view.showContinueGame();
            } else {
                view.hideContinueGame();
            }
        }
    }

    class SwitchToStartListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToStart();
        }
    }

    class exitActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            System.exit(0);
        }

    }

    class SwitchToHowToListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToHowToPlay();
        }
    }

    class SwitchToNewGameListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToNewGameOptions();
        }
    }

    class SwitchToHighScoresListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            updateHighScores();
            view.switchToHighscores();
        }
    }

    class SwitchToHowTo3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToHowToInstruct3();
        }
    }

    class PracticeKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                view.switchToHowToInstruct3();
                view.getHowToSpecial().setText("Answer here and press enter!");
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    class FindHSKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                if (highScores.checkNameLength(view.getFindHS().getText())) {
                    findHighScores(view.getFindHS().getText());
                    view.switchToSearchHS();
                } else {
                    JOptionPane.showMessageDialog(view, "Please enter a name between 2 and 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                view.getFindHS().setText("Search for another score?");
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    class FindHS1KeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (highScores.checkNameLength(view.getFindHS().getText())) {
                    findHighScores(view.getFindHS().getText());
                    view.switchToSearchHS();
                } else {
                    JOptionPane.showMessageDialog(view, "Please enter a name between 2 and 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                view.getFindHS().setText("Search for another score?");
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    class CustomQuestionFieldKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                if (Game.checkQuestionLength(view.getQuestionField().getText())) {
                    view.getInputtedQ().setText(view.getQuestionField().getText());
                    model.setCustomQuestion(view.getQuestionField().getText());
                    view.switchToQuestionsCheck();
                } else {
                    JOptionPane.showMessageDialog(view, "Please enter a question between 20 and 250 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                view.getQuestionField().setText("Enter the Question here!");
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    class CustomAnswerFieldKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                if (Game.checkAnswerLength(view.getAnswerField().getText())) {
                    view.getInputtedA().setText(view.getAnswerField().getText());
                    view.switchToAnswerCheck();
                    model.setWrongAnsrNum(3);
                } else {
                    JOptionPane.showMessageDialog(view, "Please enter an answer between 3 and 250 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                view.getAnswerField().setText("Enter the correct answer here!");
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    class CustomWrongAnswerFieldKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (Game.checkAnswerLength(view.getWrongAnswerField().getText())) {
                    model.setWrongAnsrNum(model.getWrongAnsrNum() - 1);

                    if (model.getWrongAnsrNum() >= 1) {
                        customisations custom = new customisations();
                        custom.addAnswerToCustom(model.getCustomQuestion(), view.getWrongAnswerField().getText(), false);
                    } else {
                        customisations custom = new customisations();
                        custom.addAnswerToCustom(model.getCustomQuestion(), view.getWrongAnswerField().getText(), false);
                        view.switchToFullyAddedQandA();
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "Please enter an answer between 3 and 250 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                view.getWrongAnswerField().setText("Enter the wrong answer here!");
                view.getWrongAs().setText("Enter " + model.getWrongAnsrNum() + " wrong answers for your question.");
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    class SwitchToHowTo2ActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToHowToInstruct2();
        }
    }

    class SwitchToAnswers implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.goBackToAnswersAdd();
        }
    }

    class SwitchToCustomiseListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToCustomisationsQs();
        }
    }

    class SwitchToQuestions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            model.setCustomQuestion(view.getQuestionField().getText());
            view.goBackToQuestionsAdd();
        }
    }

    class SwitchToWrong implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            customisations custom = new customisations();
            custom.addQtoCustom(model.getCustomQuestion());
            custom.addAnswerToCustom(model.getCustomQuestion(), view.getAnswerField().getText(), true);
            view.switchToAnswerWrong();
        }
    }

    class SwitchToSinglePlayerOptionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToSinglePlayerGameOptions();
        }
    }

    class SwitchToSingleGameRandomListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            singlePlayerGame game = new singlePlayerGame();
            game.randomGamesQuestions();
            startSingle();
        }
    }

    class SwitchToCustomOptionsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToSingleCustomOptions();
            model.setCustomCats(1);
        }
    }

    class Ans5Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            checkAnswerSingle(0);
        }
    }

    class Ans6Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            checkAnswerSingle(1);
        }
    }

    class Ans7Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            checkAnswerSingle(2);
        }
    }

    class Ans8Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            checkAnswerSingle(3);
        }
    }

    class Ans9Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            increasePlayerIndex();
            checkAnswerMulti(0, model.getPlayerIndex());
        }
    }

    class Ans10Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            increasePlayerIndex();
            checkAnswerMulti(1, model.getPlayerIndex());
        }
    }

    class Ans11Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            increasePlayerIndex();
            checkAnswerMulti(2, model.getPlayerIndex());
        }
    }

    class Ans12Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            increasePlayerIndex();
            checkAnswerMulti(3, model.getPlayerIndex());
        }
    }

    class SelectedScienceS implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQ("Science");
            view.removeFromCustomS(view.getScienceS());
        }
    }

    class SelectedHistoryS implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQ("History");
            view.removeFromCustomS(view.getHistoryS());
        }
    }

    class SelectedArtsS implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQ("Arts");
            view.removeFromCustomS(view.getArtsS());
        }
    }

    class SelectedSportsS implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQ("Sports");
            view.removeFromCustomS(view.getSportsS());
        }
    }

    class SelectedGeographyS implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQ("Geography");
            view.removeFromCustomS(view.getGeographyS());
        }
    }

    class SelectedCustomS implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQ("Custom");
            view.removeFromCustomS(view.getCustomS());
        }
    }

    class SelectedScienceM implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQM("Science");
            view.removeFromCustomM(view.getScienceM());
        }
    }

    class SelectedHistoryM implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQM("History");
            view.removeFromCustomM(view.getHistoryM());
        }
    }

    class SelectedArtsM implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQM("Arts");
            view.removeFromCustomM(view.getArtsM());
        }
    }

    class SelectedSportsM implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQM("Sports");
            view.removeFromCustomM(view.getSportsM());
        }
    }

    class SelectedGeographyM implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQM("Geography");
            view.removeFromCustomM(view.getGeographyM());
        }
    }

    class SelectedCustomM implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            importQM("Custom");
            view.removeFromCustomM(view.getCustomM());
        }
    }
    
    //methods for switching and adding to GUI

    private void findHighScores(String name) {
        highScores hs = new highScores();

        if (hs.findHighScore(name) == -1) {
            view.getFoundHS().setText("No score found for that name.");
            view.getSearchedHS().setText("-");
        } else {
            int score = hs.findHighScore(name);

            view.getFoundHS().setText("Here is the score found for " + name);
            view.getSearchedHS().setText(name + ": " + score);
        }
    }

    private void updateHighScores() {
        highScores hs = new highScores();
        hs.getHighScores();

        int index = 1;

        for (Map.Entry<Integer, String> entry : highScores.topHighScores.entrySet()) {
            if (index <= 5) {
                int score = entry.getKey();
                String playerName = entry.getValue();

                JLabel label = getJLabelForIndex(index);

                label.setText(index + ". " + playerName + ": " + score);

                index++;
            } else {
                break;
            }
        }
    }

    private JLabel getJLabelForIndex(int index) {
        switch (index) {
            case 1:
                return view.getHS1();

            case 2:
                return view.getHS2();

            case 3:
                return view.getHS3();

            case 4:
                return view.getHS4();

            case 5:
                return view.getHS5();

            default:
                return null;
        }
    }

    private void newQuestion() {
        singlePlayerGame game = new singlePlayerGame();

        if (model.getSpecialQuestionNum() == model.getRandomNumber()) {
            view.switchToSpecial();
            view.getSpecialQuestionGame().setText("SPECIAL QUESTION!!");
            String q = game.getSpecialQuestion();
            view.getSpecialQ().setText(q);
            return;
        }

        if (model.getQuestionIds().size() != model.getCurrentQuestionIndex()) {
            model.setAnswers(game.getAnswers(model.getQuestionIds().get(model.getCurrentQuestionIndex())));

            String question = game.getQuestion(model.getQuestionIds().get(model.getCurrentQuestionIndex()));

            if (question.length() >= 70) {
                List<String> questionParts = splitQuestion(question);
                view.getSingleQuestion().setText(questionParts.get(0));
                view.getSingleQuestion1().setText(questionParts.get(1));
                view.showSecondQuestionPartS();
            } else {
                view.hideSecondQuestionPartS();
                view.getSingleQuestion().setText(game.getQuestion(model.getQuestionIds().get(model.getCurrentQuestionIndex())));
            }
            view.getCategoryName().setText("The category is: " + game.getCategory(model.getQuestionIds().get(model.getCurrentQuestionIndex())));

            view.getAns5().setText(model.getAnswers().get(0));
            view.getAns6().setText(model.getAnswers().get(1));
            view.getAns7().setText(model.getAnswers().get(2));
            view.getAns8().setText(model.getAnswers().get(3));

            model.setCurrentQuestionIndex(model.getCurrentQuestionIndex() + 1);
            model.increaseSpecialQuestionNum(model.getSpecialQuestionNum());
        } else {
            view.switchToEndSingleGame();
            view.getFinalScoreSingle().setText("Your final score is: " + playerScore.scores.get(0));
            String name = JOptionPane.showInputDialog(view, "What name would you like to use for your highscore?", null);
            if (highScores.checkNameLength(view.getFindHS().getText())) {
                highScores hs = new highScores();
                hs.newHighScore(name, playerScore.scores.get(0));
            } else {
                JOptionPane.showMessageDialog(view, "Please enter a name between 2 and 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void checkAnswerSingle(int index) {
        singlePlayerGame game = new singlePlayerGame();

        if (game.checkAnswer(model.getAnswers().get(index))) {
            if (model.getStreak() >= 3) {
                playerScore.addToScoreSingleStreak();
                model.setStreak(model.getStreak() + 1);
            } else {
                playerScore.addToScoreSingle();
                model.setStreak(model.getStreak() + 1);
            }
        } else {
            playerScore.minusScore();
            model.setStreak(0);
        }

        view.getScore().setText("Score: " + playerScore.scores.get(0));
        newQuestion();
    }

    private void checkAnswerMulti(int index, int playerIndex) {
        multiplayerGame game = multiplayerGame.getGameInstance();

        if (game.checkAnswer(model.getAnswers().get(index))) {
            if (model.getStreaks().get(playerIndex) == 3) {
                playerScore.addToMultiScoreStreak(playerIndex);
                model.getStreaks().set(playerIndex, model.getStreaks().get(playerIndex) + 1);
                model.getPlayersOnStreak().add(model.getPlayerNames().get(playerIndex));
            } else if (model.getStreaks().get(playerIndex) >= 3) {
                playerScore.addToMultiScoreStreak(playerIndex);
                model.getStreaks().set(playerIndex, model.getStreaks().get(playerIndex) + 1);
            } else {
                playerScore.addToMultiScore(playerIndex);
                model.getStreaks().set(playerIndex, model.getStreaks().get(playerIndex) + 1);
                model.getPlayersOnStreak().remove(model.getPlayerNames().get(playerIndex));
            }
        } else {
            playerScore.minusScoreMulti(playerIndex);
            model.getStreaks().set(playerIndex, 0);
        }

        showScoresMulti();
        newQuestionMulti();
    }

    private void increasePlayerIndex() {
        if (model.getPlayerIndex() == model.getPlayerAmount() - 1) {
            model.setPlayerIndex(0);
        } else {
            model.setPlayerIndex(model.getPlayerIndex() + 1);
        }
    }

    private void startSingle() {
        singlePlayerGame game = new singlePlayerGame();
        view.switchToSingleGame();
        view.getScore().setText("Score: 0");

        model.setStreak(0);
        model.setCurrentQuestionIndex(0);
        model.setQuestionIds(game.getQuestionID());

        playerScore.newSingleScore();
        newQuestion();
    }

    private void startSavedSingle() {
        singlePlayerGame game = new singlePlayerGame();
        view.switchToSingleGame();
        view.getScore().setText("Score: " + playerScore.scores.get(0));

        model.setStreak(0);
        model.setCurrentQuestionIndex(0);
        model.setQuestionIds(game.getQuestionID());

        newQuestion();
    }

    private void startMulti() {
        multiplayerGame game = multiplayerGame.getGameInstance();
        view.switchToMultiGame();

        model.addStreaks();
        model.setCurrentQuestionIndex(0);
        model.setQuestionIds(game.getQuestionID());

        playerScore.newMultiScore(model.getPlayerAmount());
        showScoresMulti();
        newQuestionMulti();
    }

    private void startSavedMulti() {
        multiplayerGame game = multiplayerGame.getGameInstance();
        view.switchToMultiGame();

        model.addStreaks();
        model.setCurrentQuestionIndex(0);
        model.setQuestionIds(game.getQuestionID());

        showScoresMulti();
        newQuestionMulti();
    }

    private void showScoresMulti() {
        List<String> players = model.getPlayerNames();

        String names = "";

        for (String name : model.getPlayersOnStreak()) {
            names += name + ", ";
        }

        view.getPlayersOnStreak().setText("Players on a streak: " + names);

        switch (model.getPlayerAmount()) {
            case 2:
                view.getScore1().setText(players.get(0) + ": " + playerScore.scores.get(0));
                view.getScore2().setText(players.get(1) + ": " + playerScore.scores.get(1));
                view.getScore3().setText("");
                view.getScore4().setText("");
                break;
            case 3:
                view.getScore1().setText(players.get(0) + ": " + playerScore.scores.get(0));
                view.getScore2().setText(players.get(1) + ": " + playerScore.scores.get(1));
                view.getScore3().setText(players.get(2) + ": " + playerScore.scores.get(2));
                view.getScore4().setText("");
                break;
            case 4:
                view.getScore1().setText(players.get(0) + ": " + playerScore.scores.get(0));
                view.getScore2().setText(players.get(1) + ": " + playerScore.scores.get(1));
                view.getScore3().setText(players.get(2) + ": " + playerScore.scores.get(2));
                view.getScore4().setText(players.get(3) + ": " + playerScore.scores.get(3));
                break;
            default:
                break;
        }
    }

    private void newQuestionMulti() {
        multiplayerGame game = multiplayerGame.getGameInstance();

        List<String> playerNames = model.getPlayerNames();

        if (model.getSpecialQuestionNum() == model.getRandomNumber()) {
            view.switchToSpecial();
            view.getSpecialQuestionGame().setText("SPECIAL QUESTION FOR " + playerNames.get(model.getPlayerIndex()) + "!!");
            String q = game.getSpecialQuestion();
            view.getSpecialQ().setText(q);
            return;
        }

        if (model.getQuestionIds().size() != model.getCurrentQuestionIndex()) {
            model.setAnswers(game.getAnswers(model.getQuestionIds().get(model.getCurrentQuestionIndex())));

            String question = game.getQuestion(model.getQuestionIds().get(model.getCurrentQuestionIndex()));

            if (question.length() >= 70) {
                List<String> questionParts = splitQuestion(question);
                view.getMultiQuestion().setText(questionParts.get(0));
                view.getMultiQuestion1().setText(questionParts.get(1));
                view.showSecondQuestionPartM();
            } else {
                view.hideSecondQuestionPartM();
                view.getMultiQuestion().setText(game.getQuestion(model.getQuestionIds().get(model.getCurrentQuestionIndex())));
            }
            view.getCategoryNameM().setText("The category is: " + game.getCategory(model.getQuestionIds().get(model.getCurrentQuestionIndex())) + " - It is " + playerNames.get(model.getPlayerIndex()) + "'s turn!");

            view.getAns9().setText(model.getAnswers().get(0));
            view.getAns10().setText(model.getAnswers().get(1));
            view.getAns11().setText(model.getAnswers().get(2));
            view.getAns12().setText(model.getAnswers().get(3));

            model.setCurrentQuestionIndex(model.getCurrentQuestionIndex() + 1);
            model.increaseSpecialQuestionNum(model.getSpecialQuestionNum());
        } else {
            view.switchToEndMulti();
            printPlayerScores();

            List<Integer> playerAndScore = getHighScore();

            int response = JOptionPane.showConfirmDialog(view, playerNames.get(playerAndScore.get(0)) + " has the highest score. Would you like to added to the highscore board?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(view, "The score has been saved!", "Info", JOptionPane.INFORMATION_MESSAGE);
                highScores hs = new highScores();
                hs.newHighScore(playerNames.get(playerAndScore.get(0)), playerAndScore.get(1));
            }
            model.setPlayerAmount(0);
            model.getPlayerNames().removeAll(playerNames);
        }
    }

    private List<String> splitQuestion(String question) {
        List<String> result = new ArrayList<>();
        int maxLength = 70;
        int start = 0;

        while (start < question.length()) {
            int end = Math.min(question.length(), start + maxLength);

            if (end < question.length()) {
                int lastSpace = question.lastIndexOf(' ', end);
                if (lastSpace > start) {
                    end = lastSpace;
                }
            }

            result.add(question.substring(start, end).trim());
            start = end + 1;
        }

        return result;
    }

    private List<Integer> getHighScore() {
        List<Integer> playerAndScore = new ArrayList<>();
        int highScore = 0;
        int index = 0;
        int highestIndex = 0;
        for (int score : playerScore.scores) {
            if (score > 0) {
                highScore = score;
                highestIndex = index;
            }
            index++;
        }

        playerAndScore.add(highestIndex);
        playerAndScore.add(highScore);

        return playerAndScore;
    }

    private void printPlayerScores() {
        List<String> players = model.getPlayerNames();

        switch (model.getPlayerAmount()) {
            case 2:
                view.getScore1M().setText(players.get(0) + ": " + playerScore.scores.get(0));
                view.getScore2M().setText(players.get(1) + ": " + playerScore.scores.get(1));
                view.getScore3M().setText("");
                view.getScore4M().setText("");
                break;
            case 3:
                view.getScore1M().setText(players.get(0) + ": " + playerScore.scores.get(0));
                view.getScore2M().setText(players.get(1) + ": " + playerScore.scores.get(1));
                view.getScore3M().setText(players.get(2) + ": " + playerScore.scores.get(2));
                view.getScore4M().setText("");
                break;
            case 4:
                view.getScore1M().setText(players.get(0) + ": " + playerScore.scores.get(0));
                view.getScore2M().setText(players.get(1) + ": " + playerScore.scores.get(1));
                view.getScore3M().setText(players.get(2) + ": " + playerScore.scores.get(2));
                view.getScore4M().setText(players.get(3) + ": " + playerScore.scores.get(3));
                break;
            default:
                break;
        }
    }

    private void importQ(String category) {
        importQuestions iq = new importQuestions();
        if (model.getCustomCats() < 4) {
            model.getSelectedTopics().add(category);
            model.setCustomCats(model.getCustomCats() + 1);
        } else if (model.getCustomCats() == 4) {
            model.getSelectedTopics().add(category);
            iq.importCategory(model.getSelectedTopics());
            model.setCustomCats(model.getCustomCats() + 1);
            iq.importQuestions();
            startSingle();
        }
    }

    private void importQM(String category) {
        importQuestions iq = new importQuestions();
        if (model.getCustomCats() < 4) {
            model.getSelectedTopics().add(category);
            model.setCustomCats(model.getCustomCats() + 1);
        } else if (model.getCustomCats() == 4) {
            model.getSelectedTopics().add(category);
            iq.importCategory(model.getSelectedTopics());
            model.setCustomCats(model.getCustomCats() + 1);
            iq.importQuestions();
            startMulti();
        }
    }
}
