/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author abbys
 */
public class TriviaController {

    private TriviaModel model;
    private TriviaView view;

    public TriviaController(TriviaModel model, TriviaView view) {
        this.model = model;
        this.view = view;

        ActionListener switchToMainListener = new SwitchToMainActionListener();
        ActionListener exitListener = new exitActionListener();
        ActionListener switchToHowTo2Listener = new SwitchToHowTo2ActionListener();
        ActionListener switchToAnswerListener = new SwitchToAnswers();
        ActionListener switchToCustomListener = new SwitchToCustomiseListener();
        //ActionListener newQuestionSingleListener = new NewQuestionSingleListener();
        ActionListener switchToNewGameListener = new SwitchToNewGameListener();

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
        view.addActionListenerToButton(view.getExit14(), exitListener);
        view.addActionListenerToButton(view.getExit15(), exitListener);

        view.addActionListenerToButton(view.getHowTo(), new SwitchToHowToListener());
        view.addActionListenerToButton(view.getNewGame(), switchToNewGameListener);
        view.addActionListenerToButton(view.getToHighScores(), new SwitchToHighScoresListener());
        view.addActionListenerToButton(view.getCustomise(), switchToCustomListener);
        //view.addActionListenerToButton(view.getReset(), new SwitchToResetListener());
        view.addActionListenerToButton(view.getAns1(), switchToHowTo2Listener);
        view.addActionListenerToButton(view.getAns2(), switchToHowTo2Listener);
        view.addActionListenerToButton(view.getAns3(), switchToHowTo2Listener);
        view.addActionListenerToButton(view.getAns4(), switchToHowTo2Listener);

        view.addActionListenerToButton(view.getToMainHowTo(), switchToMainListener);
        view.addActionListenerToButton(view.getAns1(), exitListener);

        view.addActionListenerToButton(view.getSubmitHowToSpecial(), new SwitchToHowTo3Listener());
        view.addActionListenerToButton(view.getToMainHowTo1(), switchToMainListener);
        view.addActionListenerToButton(view.getExit1(), exitListener);

        view.addActionListenerToButton(view.getGoodLuckToMain(), switchToMainListener);
        view.addActionListenerToButton(view.getExit3(), exitListener);

        view.addActionListenerToButton(view.getToMainHS1(), switchToMainListener);
        view.addActionListenerToButton(view.getExit4(), exitListener);

        view.addActionListenerToButton(view.getToMainHS2(), switchToMainListener);
        view.addActionListenerToButton(view.getExit5(), exitListener);

        view.addActionListenerToButton(view.getToMainC(), switchToMainListener);
        view.addActionListenerToButton(view.getExit7(), switchToMainListener);

        view.addActionListenerToButton(view.getYesQs(), switchToAnswerListener);
        view.addActionListenerToButton(view.getNoQs(), new SwitchToQuestions());
        view.addActionListenerToButton(view.getToMainC1(), switchToMainListener);
        view.addActionListenerToButton(view.getExit6(), exitListener);

        view.addActionListenerToButton(view.getToMainC2(), switchToMainListener);
        view.addActionListenerToButton(view.getExit8(), exitListener);

        view.addActionListenerToButton(view.getYesAs(), new SwitchToWrong());
        view.addActionListenerToButton(view.getNoAs(), switchToAnswerListener);
        view.addActionListenerToButton(view.getToMainC3(), switchToMainListener);
        view.addActionListenerToButton(view.getExit9(), exitListener);

        view.addActionListenerToButton(view.getExit10(), exitListener);

        view.addActionListenerToButton(view.getAddAnother(), switchToCustomListener);
        view.addActionListenerToButton(view.getBackToMain(), switchToMainListener);
        view.addActionListenerToButton(view.getExit11(), exitListener);

        view.addActionListenerToButton(view.getSinglePlayerOption(), new SwitchToSinglePlayerOptionListener());
        //view.addActionListenerToButton(view.getMultiplayerOption(), new SwitchToMultiplayerOptionListener());
        view.addActionListenerToButton(view.getToMainNG(), switchToMainListener);
        view.addActionListenerToButton(view.getExit12(), exitListener);

        view.addActionListenerToButton(view.getRandomQsS(), new SwitchToSingleGameRandomListener());
        view.addActionListenerToButton(view.getCustomQsS(), new SwitchToCustomOptionsListener());
        view.addActionListenerToButton(view.getToMainS(), switchToMainListener);
        view.addActionListenerToButton(view.getExit13(), exitListener);

        //view.addActionListenerToButton(view.getAns5(), newQuestionSingleListener);
        //view.addActionListenerToButton(view.getAns6(), newQuestionSingleListener);
        //view.addActionListenerToButton(view.getAns7(), newQuestionSingleListener);
        //view.addActionListenerToButton(view.getAns8(), newQuestionSingleListener);
        //view.addActionListenerToButton(view.getExit14(), exitListener);

        view.addActionListenerToButton(view.getToStartEnd(), switchToMainListener);
        view.addActionListenerToButton(view.getReplayS(), switchToNewGameListener);
        view.addActionListenerToButton(view.getExit15(), exitListener);

        view.addActionListenerToButton(view.getExit16(), exitListener);
        //view.addActionListenerToButton(view.getScienceS(), new SelectedScienceS());
        //view.addActionListenerToButton(view.getHistoryS(), new SelectedHistoryS());
        //view.addActionListenerToButton(view.getArtsS(), new SelectedArtsS());
        //view.addActionListenerToButton(view.getSportsS(), new SelectedSportsS());
        //view.addActionListenerToButton(view.getGeographyS(), new SelectedGeographyS());
        //view.addActionListenerToButton(view.getCustomS(), new SelectedCustomS());
        view.addActionListenerToButton(view.getToMainS1(), switchToMainListener);

    }

    class SwitchToMainActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToMain();
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
            view.switchToHighscores();
        }
    }

    class SwitchToHowTo3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToHowToInstruct3();
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
            view.goBackToQuestionsAdd();
        }
    }

    class SwitchToWrong implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
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
            //call random questions thing
            view.switchToSingleGame();
        }
    }

    class SwitchToCustomOptionsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            view.switchToSingleCustomOptions();
        }
    }

}
