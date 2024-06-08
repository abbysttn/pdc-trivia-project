/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trivia_project;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author abbys
 */
public class TriviaView extends javax.swing.JFrame {

    /**
     * Creates new form TriviaFrame
     */
    public TriviaView() {
        initComponents();
        setupInitialPanel();
    }

    public void setupInitialPanel() {
        main.setBounds(0, 0, 650, 365); // Set the size of the main panel
        getContentPane().add(main);
    }

    public JPanel getMainPage() {
        return mainPage;
    }

    public JPanel getStartPage() {
        return startPage;
    }

    public JPanel getHowToPlay() {
        return howToPlay;
    }

    public JPanel getHowToInstruct1() {
        return howToInstruct1;
    }

    public JPanel getHowToInstruct2() {
        return howToInstruct2;
    }

    public JPanel getHowToInstruct3() {
        return howToInstruct3;
    }

    public JPanel getHighscores() {
        return highscores;
    }

    public JPanel getSearchHS() {
        return searchHS;
    }

    public JPanel getCustomisationsQs() {
        return customisationsQs;
    }

    public JPanel getQuestionsAdd() {
        return questionsAdd;
    }

    public JPanel getQuestionsCheck() {
        return questionsCheck;
    }

    public JPanel getAnswersAdd() {
        return answersAdd;
    }

    public JPanel getAnswerCheck() {
        return answerCheck;
    }

    public JPanel getAnswerWrong() {
        return answerWrong;
    }

    public JPanel getFullyAddedQandA() {
        return fullyAddedQandA;
    }

    public JPanel getNewGameOptions() {
        return newGameOptions;
    }

    public JPanel getSinglePlayerGameOptions() {
        return singlePlayerGameOptions;
    }

    public JPanel getSingleGame() {
        return singleGame;
    }

    public JPanel getEndSingleGame() {
        return endSingleGame;
    }

    public JPanel getSingleCustomOptions() {
        return singleCustomOptions;
    }
    
    
    public JButton getToMain() {
        return toMain;
    }
    
    public JButton getToStart() {
       return toStart;
    }
    
    public JButton getExit() {
       return exit;
    }
    
    public JButton getHowTo() {
       return HowTo;
    }
    
    public JButton getNewGame() {
       return newGame;
    }
    
    public JButton getToHighScores() {
       return toHighScores;
    }
    
    public JButton getCustomise() {
       return customise;
    }
    
    public JButton getReset() {
       return reset;
    }
    
    
    
    public JButton getAns1() {
       return ans1;
    }
    
    public JButton getAns2() {
       return ans2;
    }
    
    public JButton getAns3() {
       return ans3;
    }
    
    public JButton getAns4() {
       return ans4;
    }
    
    public JButton getToMainHowTo() {
       return toMainHowTo;
    }
    
    public JButton getExit2() {
       return exit2;
    }
    
    
    public JButton getSubmitHowToSpecial() {
       return submitHowToSpecial;
    }
    
    public JButton getToMainHowTo1() {
       return toMainHowTo1;
    }
    
    public JButton getExit1() {
       return exit1;
    }
    
    
    
    public JButton getGoodLuckToMain() {
       return goodLuckToMain;
    }
    
    public JButton getExit3() {
       return exit3;
    }
    
    
    
    public JButton getToMainHS1() {
       return toMainHS1;
    }
    
    public JButton getExit4() {
       return exit4;
    }
    
    
    
    public JButton getToMainHS2() {
       return toMainHS2;
    }
    
    public JButton getExit5() {
       return exit5;
    }
    
    
    public JButton getToMainC() {
       return toMainC;
    }
    
    public JButton getExit7() {
       return exit7;
    }
    
    
    public JButton getYesQs() {
       return YesQs;
    }
    
    public JButton getNoQs() {
       return NoQs;
    }
    
    public JButton getToMainC1() {
       return toMainC1;
    }
    
    public JButton getExit6() {
       return exit6;
    }
    
    
    
    public JButton getToMainC2() {
       return toMainC2;
    }
    
    public JButton getExit8() {
       return exit8;
    }
    
    
    
    public JButton getYesAs() {
       return YesAs;
    }
    
    public JButton getNoAs() {
       return NoAs;
    }
    
    public JButton getToMainC3() {
       return toMainC3;
    }
    
    public JButton getExit9() {
       return exit9;
    }
    
    
    
    public JButton getExit10() {
       return exit10;
    }
    
    
    public JButton getAddAnother() {
       return addAnother;
    }
    
    public JButton getBackToMain() {
       return backToMain;
    }
    
    public JButton getExit11() {
       return exit11;
    }
    
    
    
    public JButton getSinglePlayerOption() {
       return singlePlayerOption;
    }
    
    public JButton getMultiplayerOption() {
       return multiplayerOption;
    }
    
    public JButton getToMainNG() {
       return toMainNG;
    }
    
    public JButton getExit12() {
       return exit12;
    }
    
    
    
    public JButton getRandomQsS() {
       return randomQsS;
    }
    
    public JButton getCustomQsS() {
       return customQsS;
    }
    
    public JButton getToMainS() {
       return toMainS;
    }
    
    public JButton getExit13() {
       return exit13;
    }
    
    
    
    public JButton getAns5() {
       return ans5;
    }
    
    public JButton getAns6() {
       return ans6;
    }
    
    public JButton getAns7() {
       return ans7;
    }
    
    public JButton getAns8() {
       return ans8;
    }
    
    public JButton getExit14() {
       return exit14;
    }
    
    
    
    public JButton getToStartEnd() {
       return toStartEnd;
    }
    
    public JButton getReplayS() {
       return replayS;
    }
    
    public JButton getExit15() {
       return exit15;
    }
    
    
    
    public JButton getExit16() {
       return exit16;
    }
    
    public JButton getScienceS() {
       return scienceS;
    }
    
    public JButton getHistoryS() {
       return historyS;
    }
    
    public JButton getArtsS() {
       return artsS;
    }
    
    public JButton getSportsS() {
       return sportsS;
    }
    
    public JButton getGeographyS() {
       return geographyS;
    }
    
    public JButton getCustomS() {
       return customS;
    }

    public JButton getToMainS1() {
       return toMainS1;
    }
    
    
    
    public JTextField getHowToSpecial() {
        return howToSpecial;
    }
    
    public JTextField getFindHS() {
        return findHS;
    }
    
    public JTextField getFindHS1() {
        return findHS1;
    }
    
    public JTextField getQuestionField() {
        return questionField;
    }
    
    public JTextField getAnswerField() {
        return answerField;
    }
    
    public JTextField getWrongAnswerField() {
        return wrongAnswerField;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        startPage = new javax.swing.JPanel();
        TriviaTrek = new javax.swing.JLabel();
        howMuch = new javax.swing.JLabel();
        toMain = new javax.swing.JButton();
        mainPage = new javax.swing.JPanel();
        toStart = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        HowTo = new javax.swing.JButton();
        newGame = new javax.swing.JButton();
        toHighScores = new javax.swing.JButton();
        customise = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        howToPlay = new javax.swing.JPanel();
        howToInstruct1 = new javax.swing.JPanel();
        normalQuestion = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        ans1 = new javax.swing.JButton();
        ans2 = new javax.swing.JButton();
        ans3 = new javax.swing.JButton();
        ans4 = new javax.swing.JButton();
        toMainHowTo = new javax.swing.JButton();
        howTo3 = new javax.swing.JLabel();
        exit2 = new javax.swing.JButton();
        howToInstruct2 = new javax.swing.JPanel();
        howTo1 = new javax.swing.JLabel();
        normalQuestion1 = new javax.swing.JLabel();
        normalQuestion2 = new javax.swing.JLabel();
        normalQuestion3 = new javax.swing.JLabel();
        question1 = new javax.swing.JLabel();
        howToSpecial = new javax.swing.JTextField();
        question2 = new javax.swing.JLabel();
        submitHowToSpecial = new javax.swing.JButton();
        toMainHowTo1 = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        howToInstruct3 = new javax.swing.JPanel();
        howTo2 = new javax.swing.JLabel();
        normalQuestion4 = new javax.swing.JLabel();
        goodLuckToMain = new javax.swing.JButton();
        exit3 = new javax.swing.JButton();
        highscores = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        topHighScores = new javax.swing.JLabel();
        HS1 = new javax.swing.JLabel();
        HS2 = new javax.swing.JLabel();
        HS3 = new javax.swing.JLabel();
        HS4 = new javax.swing.JLabel();
        HS5 = new javax.swing.JLabel();
        findHS = new javax.swing.JTextField();
        toMainHS1 = new javax.swing.JButton();
        exit4 = new javax.swing.JButton();
        searchHS = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        foundHS = new javax.swing.JLabel();
        toMainHS2 = new javax.swing.JButton();
        searchedHS = new javax.swing.JLabel();
        findHS1 = new javax.swing.JTextField();
        exit5 = new javax.swing.JButton();
        customisationsQs = new javax.swing.JPanel();
        questionsAdd = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        customNote = new javax.swing.JLabel();
        questionField = new javax.swing.JTextField();
        toMainC = new javax.swing.JButton();
        CustomQs = new javax.swing.JLabel();
        exit7 = new javax.swing.JButton();
        questionsCheck = new javax.swing.JPanel();
        inputQ = new javax.swing.JLabel();
        inputtedQ = new javax.swing.JLabel();
        YesQs = new javax.swing.JButton();
        NoQs = new javax.swing.JButton();
        title4 = new javax.swing.JLabel();
        continueQ = new javax.swing.JLabel();
        toMainC1 = new javax.swing.JButton();
        exit6 = new javax.swing.JButton();
        answersAdd = new javax.swing.JPanel();
        title5 = new javax.swing.JLabel();
        CustomAs = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        toMainC2 = new javax.swing.JButton();
        exit8 = new javax.swing.JButton();
        answerCheck = new javax.swing.JPanel();
        title6 = new javax.swing.JLabel();
        answerCheckCorrect = new javax.swing.JLabel();
        inputtedA = new javax.swing.JLabel();
        inputA = new javax.swing.JLabel();
        YesAs = new javax.swing.JButton();
        NoAs = new javax.swing.JButton();
        toMainC3 = new javax.swing.JButton();
        exit9 = new javax.swing.JButton();
        answerWrong = new javax.swing.JPanel();
        title7 = new javax.swing.JLabel();
        wrongAs = new javax.swing.JLabel();
        wrongAnswerField = new javax.swing.JTextField();
        exit10 = new javax.swing.JButton();
        fullyAddedQandA = new javax.swing.JPanel();
        title8 = new javax.swing.JLabel();
        wrongAs1 = new javax.swing.JLabel();
        addAnother = new javax.swing.JButton();
        backToMain = new javax.swing.JButton();
        exit11 = new javax.swing.JButton();
        newGameOptions = new javax.swing.JPanel();
        title9 = new javax.swing.JLabel();
        question3 = new javax.swing.JLabel();
        singlePlayerOption = new javax.swing.JButton();
        multiplayerOption = new javax.swing.JButton();
        toMainNG = new javax.swing.JButton();
        exit12 = new javax.swing.JButton();
        singlePlayerGameOptions = new javax.swing.JPanel();
        title10 = new javax.swing.JLabel();
        question4 = new javax.swing.JLabel();
        randomQsS = new javax.swing.JButton();
        customQsS = new javax.swing.JButton();
        toMainS = new javax.swing.JButton();
        exit13 = new javax.swing.JButton();
        singleGame = new javax.swing.JPanel();
        singleQuestion = new javax.swing.JLabel();
        categoryName = new javax.swing.JLabel();
        ans5 = new javax.swing.JButton();
        ans6 = new javax.swing.JButton();
        ans7 = new javax.swing.JButton();
        ans8 = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        streakSingle = new javax.swing.JLabel();
        exit14 = new javax.swing.JButton();
        endSingleGame = new javax.swing.JPanel();
        finalScoreSingle = new javax.swing.JLabel();
        question5 = new javax.swing.JLabel();
        toStartEnd = new javax.swing.JButton();
        replayS = new javax.swing.JButton();
        exit15 = new javax.swing.JButton();
        singleCustomOptions = new javax.swing.JPanel();
        title11 = new javax.swing.JLabel();
        exit16 = new javax.swing.JButton();
        question6 = new javax.swing.JLabel();
        scienceS = new javax.swing.JButton();
        historyS = new javax.swing.JButton();
        artsS = new javax.swing.JButton();
        geographyS = new javax.swing.JButton();
        sportsS = new javax.swing.JButton();
        customS = new javax.swing.JButton();
        toMainS1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 0, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Microsoft YaHei Light", 0, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(650, 400));
        getContentPane().setLayout(null);

        main.setBackground(new java.awt.Color(247, 237, 226));
        main.setInheritsPopupMenu(true);
        main.setMinimumSize(new java.awt.Dimension(650, 365));
        main.setPreferredSize(new java.awt.Dimension(650, 365));
        main.setLayout(new java.awt.CardLayout());

        startPage.setBackground(new java.awt.Color(247, 237, 226));
        startPage.setMinimumSize(new java.awt.Dimension(650, 365));
        startPage.setPreferredSize(new java.awt.Dimension(650, 365));

        TriviaTrek.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        TriviaTrek.setForeground(new java.awt.Color(61, 82, 77));
        TriviaTrek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TriviaTrek.setText("Trivia Trekker");

        howMuch.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        howMuch.setForeground(new java.awt.Color(132, 165, 157));
        howMuch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        howMuch.setText(" How much do you really know...");

        toMain.setBackground(new java.awt.Color(246, 189, 96));
        toMain.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        toMain.setForeground(new java.awt.Color(51, 51, 51));
        toMain.setText("Play?");
        toMain.setBorderPainted(false);

        javax.swing.GroupLayout startPageLayout = new javax.swing.GroupLayout(startPage);
        startPage.setLayout(startPageLayout);
        startPageLayout.setHorizontalGroup(
            startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TriviaTrek, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(howMuch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(startPageLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(toMain)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        startPageLayout.setVerticalGroup(
            startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPageLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(TriviaTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(howMuch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toMain)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        main.add(startPage, "card5");

        mainPage.setBackground(new java.awt.Color(247, 237, 226));
        mainPage.setMinimumSize(new java.awt.Dimension(650, 365));
        mainPage.setPreferredSize(new java.awt.Dimension(650, 365));

        toStart.setBackground(new java.awt.Color(255, 204, 102));
        toStart.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toStart.setForeground(new java.awt.Color(132, 165, 157));
        toStart.setText("<");
        toStart.setBorderPainted(false);
        toStart.setContentAreaFilled(false);

        title.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title.setForeground(new java.awt.Color(61, 82, 77));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Trivia Trekker");

        exit.setForeground(new java.awt.Color(132, 165, 157));
        exit.setText("X");
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);

        HowTo.setBackground(new java.awt.Color(245, 202, 195));
        HowTo.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        HowTo.setForeground(new java.awt.Color(61, 82, 77));
        HowTo.setText("How To Play");
        HowTo.setBorderPainted(false);
        HowTo.setMaximumSize(new java.awt.Dimension(120, 40));
        HowTo.setMinimumSize(new java.awt.Dimension(120, 40));
        HowTo.setPreferredSize(new java.awt.Dimension(120, 40));

        newGame.setBackground(new java.awt.Color(246, 189, 96));
        newGame.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        newGame.setForeground(new java.awt.Color(61, 82, 77));
        newGame.setText("New Game");
        newGame.setBorderPainted(false);
        newGame.setMaximumSize(new java.awt.Dimension(120, 40));
        newGame.setMinimumSize(new java.awt.Dimension(120, 40));
        newGame.setPreferredSize(new java.awt.Dimension(120, 40));

        toHighScores.setBackground(new java.awt.Color(245, 202, 195));
        toHighScores.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        toHighScores.setForeground(new java.awt.Color(61, 82, 77));
        toHighScores.setText("High Scores");
        toHighScores.setBorderPainted(false);
        toHighScores.setMaximumSize(new java.awt.Dimension(120, 40));
        toHighScores.setMinimumSize(new java.awt.Dimension(120, 40));
        toHighScores.setPreferredSize(new java.awt.Dimension(120, 40));

        customise.setBackground(new java.awt.Color(245, 202, 195));
        customise.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        customise.setForeground(new java.awt.Color(61, 82, 77));
        customise.setText("Customise");
        customise.setBorderPainted(false);
        customise.setMaximumSize(new java.awt.Dimension(120, 40));
        customise.setMinimumSize(new java.awt.Dimension(120, 40));
        customise.setPreferredSize(new java.awt.Dimension(120, 40));

        reset.setBackground(new java.awt.Color(245, 202, 195));
        reset.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(61, 82, 77));
        reset.setText("Reset Game");
        reset.setBorderPainted(false);
        reset.setMaximumSize(new java.awt.Dimension(120, 40));
        reset.setMinimumSize(new java.awt.Dimension(120, 40));
        reset.setPreferredSize(new java.awt.Dimension(120, 40));

        javax.swing.GroupLayout mainPageLayout = new javax.swing.GroupLayout(mainPage);
        mainPage.setLayout(mainPageLayout);
        mainPageLayout.setHorizontalGroup(
            mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPageLayout.createSequentialGroup()
                        .addComponent(customise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(toHighScores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPageLayout.createSequentialGroup()
                        .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(HowTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPageLayout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)))
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        mainPageLayout.setVerticalGroup(
            mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toStart)
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HowTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(mainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toHighScores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        main.add(mainPage, "card3");

        howToPlay.setBackground(new java.awt.Color(247, 237, 226));
        howToPlay.setMinimumSize(new java.awt.Dimension(650, 365));
        howToPlay.setPreferredSize(new java.awt.Dimension(650, 365));
        howToPlay.setLayout(new java.awt.CardLayout());

        howToInstruct1.setMinimumSize(new java.awt.Dimension(650, 365));
        howToInstruct1.setOpaque(false);
        howToInstruct1.setPreferredSize(new java.awt.Dimension(650, 365));

        normalQuestion.setBackground(new java.awt.Color(132, 165, 157));
        normalQuestion.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        normalQuestion.setForeground(new java.awt.Color(132, 165, 157));
        normalQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        normalQuestion.setText("To answer a question, click the button that you think is the answer.");

        question.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        question.setForeground(new java.awt.Color(61, 82, 77));
        question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question.setText("This game is called:");

        ans1.setBackground(new java.awt.Color(245, 202, 195));
        ans1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        ans1.setForeground(new java.awt.Color(61, 82, 77));
        ans1.setText("Cards");
        ans1.setBorderPainted(false);
        ans1.setMaximumSize(new java.awt.Dimension(120, 40));
        ans1.setMinimumSize(new java.awt.Dimension(120, 40));
        ans1.setPreferredSize(new java.awt.Dimension(120, 40));

        ans2.setBackground(new java.awt.Color(245, 202, 195));
        ans2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        ans2.setForeground(new java.awt.Color(61, 82, 77));
        ans2.setText("Chess");
        ans2.setBorderPainted(false);
        ans2.setMaximumSize(new java.awt.Dimension(120, 40));
        ans2.setMinimumSize(new java.awt.Dimension(120, 40));
        ans2.setPreferredSize(new java.awt.Dimension(120, 40));

        ans3.setBackground(new java.awt.Color(245, 202, 195));
        ans3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        ans3.setForeground(new java.awt.Color(61, 82, 77));
        ans3.setText("Go");
        ans3.setBorderPainted(false);
        ans3.setMaximumSize(new java.awt.Dimension(120, 40));
        ans3.setMinimumSize(new java.awt.Dimension(120, 40));
        ans3.setPreferredSize(new java.awt.Dimension(120, 40));

        ans4.setBackground(new java.awt.Color(245, 202, 195));
        ans4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        ans4.setForeground(new java.awt.Color(61, 82, 77));
        ans4.setText("Trivia Trekker");
        ans4.setBorderPainted(false);
        ans4.setMaximumSize(new java.awt.Dimension(120, 40));
        ans4.setMinimumSize(new java.awt.Dimension(120, 40));
        ans4.setPreferredSize(new java.awt.Dimension(120, 40));

        toMainHowTo.setBackground(new java.awt.Color(255, 204, 102));
        toMainHowTo.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainHowTo.setForeground(new java.awt.Color(132, 165, 157));
        toMainHowTo.setText("<");
        toMainHowTo.setBorderPainted(false);
        toMainHowTo.setContentAreaFilled(false);

        howTo3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        howTo3.setForeground(new java.awt.Color(61, 82, 77));
        howTo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        howTo3.setText("How To Play");

        exit2.setForeground(new java.awt.Color(132, 165, 157));
        exit2.setText("X");
        exit2.setBorderPainted(false);
        exit2.setContentAreaFilled(false);

        javax.swing.GroupLayout howToInstruct1Layout = new javax.swing.GroupLayout(howToInstruct1);
        howToInstruct1.setLayout(howToInstruct1Layout);
        howToInstruct1Layout.setHorizontalGroup(
            howToInstruct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(question, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(howToInstruct1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(howToInstruct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(howToInstruct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ans4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(howToInstruct1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(howToInstruct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(normalQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, howToInstruct1Layout.createSequentialGroup()
                        .addComponent(toMainHowTo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(howTo3)
                        .addGap(162, 162, 162)
                        .addComponent(exit2)))
                .addContainerGap())
        );
        howToInstruct1Layout.setVerticalGroup(
            howToInstruct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(howToInstruct1Layout.createSequentialGroup()
                .addGroup(howToInstruct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(howTo3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(howToInstruct1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(howToInstruct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit2)
                            .addComponent(toMainHowTo))))
                .addGap(12, 12, 12)
                .addComponent(normalQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(question)
                .addGap(18, 18, 18)
                .addGroup(howToInstruct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(howToInstruct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        howToPlay.add(howToInstruct1, "card3");

        howToInstruct2.setMinimumSize(new java.awt.Dimension(650, 365));
        howToInstruct2.setOpaque(false);
        howToInstruct2.setPreferredSize(new java.awt.Dimension(650, 365));

        howTo1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        howTo1.setForeground(new java.awt.Color(61, 82, 77));
        howTo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        howTo1.setText("How To Play");

        normalQuestion1.setBackground(new java.awt.Color(132, 165, 157));
        normalQuestion1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        normalQuestion1.setForeground(new java.awt.Color(132, 165, 157));
        normalQuestion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        normalQuestion1.setText("Once a game, you'll come across a special question.");

        normalQuestion2.setBackground(new java.awt.Color(132, 165, 157));
        normalQuestion2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        normalQuestion2.setForeground(new java.awt.Color(132, 165, 157));
        normalQuestion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        normalQuestion2.setText("When playing Multiplayer, one player has the chance to get this.");

        normalQuestion3.setBackground(new java.awt.Color(132, 165, 157));
        normalQuestion3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        normalQuestion3.setForeground(new java.awt.Color(132, 165, 157));
        normalQuestion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        normalQuestion3.setText("To answer this question, type in the answer e.g. 'Eggs' and click \"Ok\".");

        question1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        question1.setForeground(new java.awt.Color(61, 82, 77));
        question1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question1.setText("Special Question!");

        howToSpecial.setBackground(new java.awt.Color(245, 202, 195));
        howToSpecial.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        howToSpecial.setForeground(new java.awt.Color(61, 82, 77));
        howToSpecial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        howToSpecial.setText("Answer here!");
        howToSpecial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 1, true));

        question2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        question2.setForeground(new java.awt.Color(61, 82, 77));
        question2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question2.setText("What section is this called?");

        submitHowToSpecial.setBackground(new java.awt.Color(255, 204, 102));
        submitHowToSpecial.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        submitHowToSpecial.setForeground(new java.awt.Color(61, 82, 77));
        submitHowToSpecial.setText("Ok");
        submitHowToSpecial.setBorderPainted(false);

        toMainHowTo1.setBackground(new java.awt.Color(255, 204, 102));
        toMainHowTo1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainHowTo1.setForeground(new java.awt.Color(132, 165, 157));
        toMainHowTo1.setText("<");
        toMainHowTo1.setBorderPainted(false);
        toMainHowTo1.setContentAreaFilled(false);

        exit1.setForeground(new java.awt.Color(132, 165, 157));
        exit1.setText("X");
        exit1.setBorderPainted(false);
        exit1.setContentAreaFilled(false);

        javax.swing.GroupLayout howToInstruct2Layout = new javax.swing.GroupLayout(howToInstruct2);
        howToInstruct2.setLayout(howToInstruct2Layout);
        howToInstruct2Layout.setHorizontalGroup(
            howToInstruct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(howToInstruct2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(howToInstruct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(normalQuestion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(normalQuestion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(normalQuestion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, howToInstruct2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(howToSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
            .addGroup(howToInstruct2Layout.createSequentialGroup()
                .addGroup(howToInstruct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(howToInstruct2Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(submitHowToSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(howToInstruct2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(toMainHowTo1)
                        .addGap(153, 153, 153)
                        .addComponent(howTo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit1)))
                .addContainerGap())
        );
        howToInstruct2Layout.setVerticalGroup(
            howToInstruct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(howToInstruct2Layout.createSequentialGroup()
                .addGroup(howToInstruct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(howTo1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(howToInstruct2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(howToInstruct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit1)
                            .addComponent(toMainHowTo1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(normalQuestion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(normalQuestion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(normalQuestion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(howToSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitHowToSpecial)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        howToPlay.add(howToInstruct2, "card3");

        howToInstruct3.setMinimumSize(new java.awt.Dimension(650, 365));
        howToInstruct3.setOpaque(false);
        howToInstruct3.setPreferredSize(new java.awt.Dimension(650, 365));

        howTo2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        howTo2.setForeground(new java.awt.Color(61, 82, 77));
        howTo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        howTo2.setText("How To Play");

        normalQuestion4.setBackground(new java.awt.Color(132, 165, 157));
        normalQuestion4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        normalQuestion4.setForeground(new java.awt.Color(132, 165, 157));
        normalQuestion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        normalQuestion4.setText("If you answer 3 or more questions in a row, you get extra points!");

        goodLuckToMain.setBackground(new java.awt.Color(255, 204, 102));
        goodLuckToMain.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        goodLuckToMain.setForeground(new java.awt.Color(61, 82, 77));
        goodLuckToMain.setText("Good Luck!");
        goodLuckToMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        goodLuckToMain.setBorderPainted(false);
        goodLuckToMain.setMaximumSize(new java.awt.Dimension(120, 40));
        goodLuckToMain.setMinimumSize(new java.awt.Dimension(120, 40));
        goodLuckToMain.setPreferredSize(new java.awt.Dimension(120, 40));

        exit3.setForeground(new java.awt.Color(132, 165, 157));
        exit3.setText("X");
        exit3.setBorderPainted(false);
        exit3.setContentAreaFilled(false);

        javax.swing.GroupLayout howToInstruct3Layout = new javax.swing.GroupLayout(howToInstruct3);
        howToInstruct3.setLayout(howToInstruct3Layout);
        howToInstruct3Layout.setHorizontalGroup(
            howToInstruct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(howToInstruct3Layout.createSequentialGroup()
                .addGroup(howToInstruct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(howToInstruct3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(normalQuestion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(howToInstruct3Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(goodLuckToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(howToInstruct3Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(howTo2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit3)))
                .addContainerGap())
        );
        howToInstruct3Layout.setVerticalGroup(
            howToInstruct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(howToInstruct3Layout.createSequentialGroup()
                .addGroup(howToInstruct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(howTo2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(howToInstruct3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit3)))
                .addGap(72, 72, 72)
                .addComponent(normalQuestion4)
                .addGap(33, 33, 33)
                .addComponent(goodLuckToMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 123, Short.MAX_VALUE))
        );

        howToPlay.add(howToInstruct3, "card4");

        main.add(howToPlay, "card4");

        highscores.setBackground(new java.awt.Color(247, 237, 226));
        highscores.setMinimumSize(new java.awt.Dimension(650, 365));
        highscores.setPreferredSize(new java.awt.Dimension(650, 365));

        title1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title1.setForeground(new java.awt.Color(61, 82, 77));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("High Scores");

        topHighScores.setBackground(new java.awt.Color(132, 165, 157));
        topHighScores.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        topHighScores.setForeground(new java.awt.Color(132, 165, 157));
        topHighScores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topHighScores.setText("Top 5 High Scores:");

        HS1.setBackground(new java.awt.Color(61, 82, 77));
        HS1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        HS1.setForeground(new java.awt.Color(61, 82, 77));
        HS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HS1.setText("1. ");

        HS2.setBackground(new java.awt.Color(61, 82, 77));
        HS2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        HS2.setForeground(new java.awt.Color(61, 82, 77));
        HS2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HS2.setText("2. ");

        HS3.setBackground(new java.awt.Color(61, 82, 77));
        HS3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        HS3.setForeground(new java.awt.Color(61, 82, 77));
        HS3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HS3.setText("3. ");

        HS4.setBackground(new java.awt.Color(61, 82, 77));
        HS4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        HS4.setForeground(new java.awt.Color(61, 82, 77));
        HS4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HS4.setText("4. ");

        HS5.setBackground(new java.awt.Color(61, 82, 77));
        HS5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        HS5.setForeground(new java.awt.Color(61, 82, 77));
        HS5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HS5.setText("5. ");

        findHS.setBackground(new java.awt.Color(246, 189, 96));
        findHS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        findHS.setForeground(new java.awt.Color(61, 82, 77));
        findHS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        findHS.setText("Search for score here!");
        findHS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        findHS.setMinimumSize(new java.awt.Dimension(150, 40));
        findHS.setPreferredSize(new java.awt.Dimension(150, 40));

        toMainHS1.setBackground(new java.awt.Color(255, 204, 102));
        toMainHS1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainHS1.setForeground(new java.awt.Color(132, 165, 157));
        toMainHS1.setText("<");
        toMainHS1.setBorderPainted(false);
        toMainHS1.setContentAreaFilled(false);

        exit4.setForeground(new java.awt.Color(132, 165, 157));
        exit4.setText("X");
        exit4.setBorderPainted(false);
        exit4.setContentAreaFilled(false);

        javax.swing.GroupLayout highscoresLayout = new javax.swing.GroupLayout(highscores);
        highscores.setLayout(highscoresLayout);
        highscoresLayout.setHorizontalGroup(
            highscoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(highscoresLayout.createSequentialGroup()
                .addGroup(highscoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(highscoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(highscoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topHighScores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HS2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HS3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HS4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HS5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(highscoresLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(findHS, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(highscoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(toMainHS1)
                        .addGap(125, 125, 125)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit4)))
                .addContainerGap())
        );
        highscoresLayout.setVerticalGroup(
            highscoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(highscoresLayout.createSequentialGroup()
                .addGroup(highscoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(highscoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(highscoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit4)
                            .addComponent(toMainHS1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topHighScores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HS1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HS2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HS3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HS4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HS5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(findHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        main.add(highscores, "card5");

        searchHS.setBackground(new java.awt.Color(247, 237, 226));
        searchHS.setMinimumSize(new java.awt.Dimension(650, 365));
        searchHS.setPreferredSize(new java.awt.Dimension(650, 365));

        title2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title2.setForeground(new java.awt.Color(61, 82, 77));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("High Scores");

        foundHS.setBackground(new java.awt.Color(132, 165, 157));
        foundHS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        foundHS.setForeground(new java.awt.Color(132, 165, 157));
        foundHS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foundHS.setText("Here is the found high score:");

        toMainHS2.setBackground(new java.awt.Color(255, 204, 102));
        toMainHS2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainHS2.setForeground(new java.awt.Color(132, 165, 157));
        toMainHS2.setText("<");
        toMainHS2.setBorderPainted(false);
        toMainHS2.setContentAreaFilled(false);

        searchedHS.setBackground(new java.awt.Color(61, 82, 77));
        searchedHS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        searchedHS.setForeground(new java.awt.Color(61, 82, 77));
        searchedHS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchedHS.setText("1. ");

        findHS1.setBackground(new java.awt.Color(246, 189, 96));
        findHS1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        findHS1.setForeground(new java.awt.Color(61, 82, 77));
        findHS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        findHS1.setText("Search for another score?");
        findHS1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        findHS1.setMinimumSize(new java.awt.Dimension(150, 40));
        findHS1.setPreferredSize(new java.awt.Dimension(150, 40));

        exit5.setForeground(new java.awt.Color(132, 165, 157));
        exit5.setText("X");
        exit5.setBorderPainted(false);
        exit5.setContentAreaFilled(false);

        javax.swing.GroupLayout searchHSLayout = new javax.swing.GroupLayout(searchHS);
        searchHS.setLayout(searchHSLayout);
        searchHSLayout.setHorizontalGroup(
            searchHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchHSLayout.createSequentialGroup()
                .addGroup(searchHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchHSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(searchHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foundHS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchedHS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(searchHSLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(findHS1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(searchHSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(toMainHS2)
                        .addGap(137, 137, 137)
                        .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit5)))
                .addContainerGap())
        );
        searchHSLayout.setVerticalGroup(
            searchHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchHSLayout.createSequentialGroup()
                .addGroup(searchHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchHSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(searchHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit5)
                            .addComponent(toMainHS2))))
                .addGap(52, 52, 52)
                .addComponent(foundHS)
                .addGap(36, 36, 36)
                .addComponent(searchedHS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(findHS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        main.add(searchHS, "card6");

        customisationsQs.setBackground(new java.awt.Color(247, 237, 226));
        customisationsQs.setMinimumSize(new java.awt.Dimension(650, 365));
        customisationsQs.setPreferredSize(new java.awt.Dimension(650, 365));
        customisationsQs.setLayout(new java.awt.CardLayout());

        questionsAdd.setMinimumSize(new java.awt.Dimension(650, 365));
        questionsAdd.setOpaque(false);
        questionsAdd.setPreferredSize(new java.awt.Dimension(650, 365));

        title3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title3.setForeground(new java.awt.Color(61, 82, 77));
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("Customisations");

        customNote.setBackground(new java.awt.Color(132, 165, 157));
        customNote.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        customNote.setForeground(new java.awt.Color(132, 165, 157));
        customNote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customNote.setText("Note: if you would like to use these questions in game, enter at least 5.");

        questionField.setBackground(new java.awt.Color(246, 189, 96));
        questionField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        questionField.setForeground(new java.awt.Color(61, 82, 77));
        questionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        questionField.setText("Enter the question here!");
        questionField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        questionField.setMinimumSize(new java.awt.Dimension(200, 40));
        questionField.setPreferredSize(new java.awt.Dimension(200, 40));

        toMainC.setBackground(new java.awt.Color(255, 204, 102));
        toMainC.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainC.setForeground(new java.awt.Color(132, 165, 157));
        toMainC.setText("<");
        toMainC.setBorderPainted(false);
        toMainC.setContentAreaFilled(false);

        CustomQs.setBackground(new java.awt.Color(132, 165, 157));
        CustomQs.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        CustomQs.setForeground(new java.awt.Color(132, 165, 157));
        CustomQs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomQs.setText("Enter your custom questions here!");

        exit7.setForeground(new java.awt.Color(132, 165, 157));
        exit7.setText("X");
        exit7.setBorderPainted(false);
        exit7.setContentAreaFilled(false);

        javax.swing.GroupLayout questionsAddLayout = new javax.swing.GroupLayout(questionsAdd);
        questionsAdd.setLayout(questionsAddLayout);
        questionsAddLayout.setHorizontalGroup(
            questionsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionsAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questionsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustomQs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(questionsAddLayout.createSequentialGroup()
                        .addComponent(toMainC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(questionsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(questionsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionsAddLayout.createSequentialGroup()
                                    .addComponent(questionField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(229, 229, 229))
                                .addComponent(exit7, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap())
        );
        questionsAddLayout.setVerticalGroup(
            questionsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionsAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questionsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionsAddLayout.createSequentialGroup()
                        .addComponent(exit7)
                        .addGap(1, 1, 1)
                        .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(toMainC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CustomQs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customNote)
                .addGap(40, 40, 40)
                .addComponent(questionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        customisationsQs.add(questionsAdd, "card2");

        questionsCheck.setMinimumSize(new java.awt.Dimension(650, 365));
        questionsCheck.setName(""); // NOI18N
        questionsCheck.setOpaque(false);
        questionsCheck.setPreferredSize(new java.awt.Dimension(650, 365));

        inputQ.setBackground(new java.awt.Color(132, 165, 157));
        inputQ.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        inputQ.setForeground(new java.awt.Color(132, 165, 157));
        inputQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputQ.setText("The question you typed is:");

        inputtedQ.setBackground(new java.awt.Color(132, 165, 157));
        inputtedQ.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        inputtedQ.setForeground(new java.awt.Color(132, 165, 157));
        inputtedQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputtedQ.setText("question here");

        YesQs.setBackground(new java.awt.Color(246, 189, 96));
        YesQs.setForeground(new java.awt.Color(61, 82, 77));
        YesQs.setText("Yes");
        YesQs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        YesQs.setMaximumSize(new java.awt.Dimension(70, 30));
        YesQs.setMinimumSize(new java.awt.Dimension(70, 30));
        YesQs.setPreferredSize(new java.awt.Dimension(70, 30));

        NoQs.setBackground(new java.awt.Color(246, 189, 96));
        NoQs.setForeground(new java.awt.Color(61, 82, 77));
        NoQs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        NoQs.setLabel("No");
        NoQs.setMaximumSize(new java.awt.Dimension(70, 30));
        NoQs.setMinimumSize(new java.awt.Dimension(70, 30));
        NoQs.setPreferredSize(new java.awt.Dimension(70, 30));

        title4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title4.setForeground(new java.awt.Color(61, 82, 77));
        title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title4.setText("Customisations");

        continueQ.setBackground(new java.awt.Color(132, 165, 157));
        continueQ.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        continueQ.setForeground(new java.awt.Color(132, 165, 157));
        continueQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        continueQ.setText("Would you like to continue with this question?");

        toMainC1.setBackground(new java.awt.Color(255, 204, 102));
        toMainC1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainC1.setForeground(new java.awt.Color(132, 165, 157));
        toMainC1.setText("<");
        toMainC1.setBorderPainted(false);
        toMainC1.setContentAreaFilled(false);

        exit6.setForeground(new java.awt.Color(132, 165, 157));
        exit6.setText("X");
        exit6.setBorderPainted(false);
        exit6.setContentAreaFilled(false);

        javax.swing.GroupLayout questionsCheckLayout = new javax.swing.GroupLayout(questionsCheck);
        questionsCheck.setLayout(questionsCheckLayout);
        questionsCheckLayout.setHorizontalGroup(
            questionsCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputtedQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(continueQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(questionsCheckLayout.createSequentialGroup()
                .addGroup(questionsCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionsCheckLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(YesQs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(NoQs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(questionsCheckLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(questionsCheckLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(toMainC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(questionsCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit6))))
                .addContainerGap())
        );
        questionsCheckLayout.setVerticalGroup(
            questionsCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionsCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questionsCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionsCheckLayout.createSequentialGroup()
                        .addComponent(exit6)
                        .addGap(1, 1, 1)
                        .addComponent(title4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(toMainC1))
                .addGap(18, 18, 18)
                .addComponent(inputQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputtedQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueQ)
                .addGap(18, 18, 18)
                .addGroup(questionsCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YesQs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoQs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        customisationsQs.add(questionsCheck, "card3");

        answersAdd.setMinimumSize(new java.awt.Dimension(650, 365));
        answersAdd.setOpaque(false);
        answersAdd.setPreferredSize(new java.awt.Dimension(650, 365));

        title5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title5.setForeground(new java.awt.Color(61, 82, 77));
        title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title5.setText("Customisations");

        CustomAs.setBackground(new java.awt.Color(132, 165, 157));
        CustomAs.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        CustomAs.setForeground(new java.awt.Color(132, 165, 157));
        CustomAs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomAs.setText("Enter the correct answer to your question.");

        answerField.setBackground(new java.awt.Color(246, 189, 96));
        answerField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        answerField.setForeground(new java.awt.Color(61, 82, 77));
        answerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerField.setText("Enter the answer here!");
        answerField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        answerField.setMinimumSize(new java.awt.Dimension(200, 40));
        answerField.setPreferredSize(new java.awt.Dimension(200, 40));

        toMainC2.setBackground(new java.awt.Color(255, 204, 102));
        toMainC2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainC2.setForeground(new java.awt.Color(132, 165, 157));
        toMainC2.setText("<");
        toMainC2.setBorderPainted(false);
        toMainC2.setContentAreaFilled(false);

        exit8.setForeground(new java.awt.Color(132, 165, 157));
        exit8.setText("X");
        exit8.setBorderPainted(false);
        exit8.setContentAreaFilled(false);

        javax.swing.GroupLayout answersAddLayout = new javax.swing.GroupLayout(answersAdd);
        answersAdd.setLayout(answersAddLayout);
        answersAddLayout.setHorizontalGroup(
            answersAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersAddLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(answersAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(answersAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustomAs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(answersAddLayout.createSequentialGroup()
                        .addComponent(toMainC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(answersAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit8))))
                .addContainerGap())
        );
        answersAddLayout.setVerticalGroup(
            answersAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(answersAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(answersAddLayout.createSequentialGroup()
                        .addComponent(exit8)
                        .addGap(1, 1, 1)
                        .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(toMainC2))
                .addGap(34, 34, 34)
                .addComponent(CustomAs)
                .addGap(47, 47, 47)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        customisationsQs.add(answersAdd, "card4");

        answerCheck.setMinimumSize(new java.awt.Dimension(650, 365));
        answerCheck.setOpaque(false);
        answerCheck.setPreferredSize(new java.awt.Dimension(650, 365));

        title6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title6.setForeground(new java.awt.Color(61, 82, 77));
        title6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title6.setText("Customisations");

        answerCheckCorrect.setBackground(new java.awt.Color(132, 165, 157));
        answerCheckCorrect.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        answerCheckCorrect.setForeground(new java.awt.Color(132, 165, 157));
        answerCheckCorrect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerCheckCorrect.setText("The answer you typed is:");

        inputtedA.setBackground(new java.awt.Color(132, 165, 157));
        inputtedA.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        inputtedA.setForeground(new java.awt.Color(132, 165, 157));
        inputtedA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputtedA.setText("answer here");

        inputA.setBackground(new java.awt.Color(132, 165, 157));
        inputA.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        inputA.setForeground(new java.awt.Color(132, 165, 157));
        inputA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputA.setText("Is this the correct answer to your question?");

        YesAs.setBackground(new java.awt.Color(246, 189, 96));
        YesAs.setForeground(new java.awt.Color(61, 82, 77));
        YesAs.setText("Yes");
        YesAs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        YesAs.setMaximumSize(new java.awt.Dimension(70, 30));
        YesAs.setMinimumSize(new java.awt.Dimension(70, 30));
        YesAs.setPreferredSize(new java.awt.Dimension(70, 30));

        NoAs.setBackground(new java.awt.Color(246, 189, 96));
        NoAs.setForeground(new java.awt.Color(61, 82, 77));
        NoAs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        NoAs.setLabel("No");
        NoAs.setMaximumSize(new java.awt.Dimension(70, 30));
        NoAs.setMinimumSize(new java.awt.Dimension(70, 30));
        NoAs.setPreferredSize(new java.awt.Dimension(70, 30));

        toMainC3.setBackground(new java.awt.Color(255, 204, 102));
        toMainC3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainC3.setForeground(new java.awt.Color(132, 165, 157));
        toMainC3.setText("<");
        toMainC3.setBorderPainted(false);
        toMainC3.setContentAreaFilled(false);

        exit9.setForeground(new java.awt.Color(132, 165, 157));
        exit9.setText("X");
        exit9.setBorderPainted(false);
        exit9.setContentAreaFilled(false);

        javax.swing.GroupLayout answerCheckLayout = new javax.swing.GroupLayout(answerCheck);
        answerCheck.setLayout(answerCheckLayout);
        answerCheckLayout.setHorizontalGroup(
            answerCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputtedA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(answerCheckLayout.createSequentialGroup()
                .addGroup(answerCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(answerCheckLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(YesAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(NoAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(answerCheckLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(answerCheckCorrect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(answerCheckLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(toMainC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(answerCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(answerCheckLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exit9))
                            .addComponent(title6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        answerCheckLayout.setVerticalGroup(
            answerCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(answerCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(answerCheckLayout.createSequentialGroup()
                        .addComponent(toMainC3)
                        .addGap(82, 82, 82))
                    .addGroup(answerCheckLayout.createSequentialGroup()
                        .addComponent(exit9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(answerCheckCorrect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputtedA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputA)
                .addGap(18, 18, 18)
                .addGroup(answerCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YesAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        customisationsQs.add(answerCheck, "card5");

        answerWrong.setMinimumSize(new java.awt.Dimension(650, 365));
        answerWrong.setOpaque(false);
        answerWrong.setPreferredSize(new java.awt.Dimension(650, 365));

        title7.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title7.setForeground(new java.awt.Color(61, 82, 77));
        title7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title7.setText("Customisations");

        wrongAs.setBackground(new java.awt.Color(132, 165, 157));
        wrongAs.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        wrongAs.setForeground(new java.awt.Color(132, 165, 157));
        wrongAs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wrongAs.setText("Enter 3 wrong answers for your question.");

        wrongAnswerField.setBackground(new java.awt.Color(246, 189, 96));
        wrongAnswerField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        wrongAnswerField.setForeground(new java.awt.Color(61, 82, 77));
        wrongAnswerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wrongAnswerField.setText("Enter the wrong answer here!");
        wrongAnswerField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        wrongAnswerField.setMinimumSize(new java.awt.Dimension(200, 40));
        wrongAnswerField.setPreferredSize(new java.awt.Dimension(200, 40));

        exit10.setForeground(new java.awt.Color(132, 165, 157));
        exit10.setText("X");
        exit10.setBorderPainted(false);
        exit10.setContentAreaFilled(false);

        javax.swing.GroupLayout answerWrongLayout = new javax.swing.GroupLayout(answerWrong);
        answerWrong.setLayout(answerWrongLayout);
        answerWrongLayout.setHorizontalGroup(
            answerWrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerWrongLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(wrongAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(answerWrongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(answerWrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wrongAs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerWrongLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit10)))
                .addContainerGap())
        );
        answerWrongLayout.setVerticalGroup(
            answerWrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerWrongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit10)
                .addGap(1, 1, 1)
                .addComponent(title7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(wrongAs)
                .addGap(47, 47, 47)
                .addComponent(wrongAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        customisationsQs.add(answerWrong, "card6");

        fullyAddedQandA.setMinimumSize(new java.awt.Dimension(650, 365));
        fullyAddedQandA.setOpaque(false);
        fullyAddedQandA.setPreferredSize(new java.awt.Dimension(650, 365));

        title8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title8.setForeground(new java.awt.Color(61, 82, 77));
        title8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title8.setText("Customisations");

        wrongAs1.setBackground(new java.awt.Color(132, 165, 157));
        wrongAs1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        wrongAs1.setForeground(new java.awt.Color(132, 165, 157));
        wrongAs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wrongAs1.setText("Your question and answers have successfully been added!!");

        addAnother.setBackground(new java.awt.Color(246, 189, 96));
        addAnother.setForeground(new java.awt.Color(61, 82, 77));
        addAnother.setText("Add another?");
        addAnother.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        addAnother.setMaximumSize(new java.awt.Dimension(85, 30));
        addAnother.setMinimumSize(new java.awt.Dimension(85, 30));
        addAnother.setPreferredSize(new java.awt.Dimension(85, 30));

        backToMain.setBackground(new java.awt.Color(246, 189, 96));
        backToMain.setForeground(new java.awt.Color(61, 82, 77));
        backToMain.setText("Back to start");
        backToMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        backToMain.setMaximumSize(new java.awt.Dimension(85, 30));
        backToMain.setMinimumSize(new java.awt.Dimension(85, 30));
        backToMain.setPreferredSize(new java.awt.Dimension(85, 30));

        exit11.setForeground(new java.awt.Color(132, 165, 157));
        exit11.setText("X");
        exit11.setBorderPainted(false);
        exit11.setContentAreaFilled(false);

        javax.swing.GroupLayout fullyAddedQandALayout = new javax.swing.GroupLayout(fullyAddedQandA);
        fullyAddedQandA.setLayout(fullyAddedQandALayout);
        fullyAddedQandALayout.setHorizontalGroup(
            fullyAddedQandALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullyAddedQandALayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(addAnother, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(backToMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fullyAddedQandALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fullyAddedQandALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wrongAs1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fullyAddedQandALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit11)))
                .addContainerGap())
        );
        fullyAddedQandALayout.setVerticalGroup(
            fullyAddedQandALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullyAddedQandALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit11)
                .addGap(1, 1, 1)
                .addComponent(title8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(wrongAs1)
                .addGap(18, 18, 18)
                .addGroup(fullyAddedQandALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAnother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backToMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        customisationsQs.add(fullyAddedQandA, "card7");

        main.add(customisationsQs, "card7");

        newGameOptions.setBackground(new java.awt.Color(247, 237, 226));
        newGameOptions.setForeground(new java.awt.Color(247, 237, 226));
        newGameOptions.setToolTipText("");
        newGameOptions.setMinimumSize(new java.awt.Dimension(650, 365));
        newGameOptions.setPreferredSize(new java.awt.Dimension(650, 365));

        title9.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title9.setForeground(new java.awt.Color(61, 82, 77));
        title9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title9.setText("New Game");

        question3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        question3.setForeground(new java.awt.Color(61, 82, 77));
        question3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question3.setText("What type of game would you like to play?");

        singlePlayerOption.setBackground(new java.awt.Color(246, 189, 96));
        singlePlayerOption.setForeground(new java.awt.Color(61, 82, 77));
        singlePlayerOption.setText("Single Player");
        singlePlayerOption.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        singlePlayerOption.setMaximumSize(new java.awt.Dimension(150, 50));
        singlePlayerOption.setMinimumSize(new java.awt.Dimension(150, 50));
        singlePlayerOption.setPreferredSize(new java.awt.Dimension(150, 50));

        multiplayerOption.setBackground(new java.awt.Color(246, 189, 96));
        multiplayerOption.setForeground(new java.awt.Color(61, 82, 77));
        multiplayerOption.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        multiplayerOption.setLabel("Multiplayer");
        multiplayerOption.setMaximumSize(new java.awt.Dimension(150, 50));
        multiplayerOption.setMinimumSize(new java.awt.Dimension(150, 50));
        multiplayerOption.setPreferredSize(new java.awt.Dimension(150, 50));

        toMainNG.setBackground(new java.awt.Color(255, 204, 102));
        toMainNG.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainNG.setForeground(new java.awt.Color(132, 165, 157));
        toMainNG.setText("<");
        toMainNG.setBorderPainted(false);
        toMainNG.setContentAreaFilled(false);

        exit12.setForeground(new java.awt.Color(132, 165, 157));
        exit12.setText("X");
        exit12.setBorderPainted(false);
        exit12.setContentAreaFilled(false);

        javax.swing.GroupLayout newGameOptionsLayout = new javax.swing.GroupLayout(newGameOptions);
        newGameOptions.setLayout(newGameOptionsLayout);
        newGameOptionsLayout.setHorizontalGroup(
            newGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(question3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(newGameOptionsLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(singlePlayerOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(multiplayerOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(newGameOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toMainNG)
                .addGap(113, 113, 113)
                .addComponent(title9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit12)
                .addContainerGap())
        );
        newGameOptionsLayout.setVerticalGroup(
            newGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newGameOptionsLayout.createSequentialGroup()
                .addGroup(newGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(newGameOptionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(newGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit12)
                            .addComponent(toMainNG))))
                .addGap(41, 41, 41)
                .addComponent(question3)
                .addGap(55, 55, 55)
                .addGroup(newGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singlePlayerOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplayerOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        main.add(newGameOptions, "card8");

        singlePlayerGameOptions.setBackground(new java.awt.Color(247, 237, 226));
        singlePlayerGameOptions.setMinimumSize(new java.awt.Dimension(650, 365));
        singlePlayerGameOptions.setOpaque(false);
        singlePlayerGameOptions.setPreferredSize(new java.awt.Dimension(650, 365));

        title10.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title10.setForeground(new java.awt.Color(61, 82, 77));
        title10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title10.setText("New Game");

        question4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        question4.setForeground(new java.awt.Color(61, 82, 77));
        question4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question4.setText("What questions would you like to use?");

        randomQsS.setBackground(new java.awt.Color(246, 189, 96));
        randomQsS.setForeground(new java.awt.Color(61, 82, 77));
        randomQsS.setText("Randomised");
        randomQsS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        randomQsS.setMaximumSize(new java.awt.Dimension(150, 50));
        randomQsS.setMinimumSize(new java.awt.Dimension(150, 50));
        randomQsS.setPreferredSize(new java.awt.Dimension(150, 50));

        customQsS.setBackground(new java.awt.Color(246, 189, 96));
        customQsS.setForeground(new java.awt.Color(61, 82, 77));
        customQsS.setText("Category chooser");
        customQsS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        customQsS.setMaximumSize(new java.awt.Dimension(150, 50));
        customQsS.setMinimumSize(new java.awt.Dimension(150, 50));
        customQsS.setPreferredSize(new java.awt.Dimension(150, 50));

        toMainS.setBackground(new java.awt.Color(255, 204, 102));
        toMainS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainS.setForeground(new java.awt.Color(132, 165, 157));
        toMainS.setText("<");
        toMainS.setBorderPainted(false);
        toMainS.setContentAreaFilled(false);

        exit13.setForeground(new java.awt.Color(132, 165, 157));
        exit13.setText("X");
        exit13.setBorderPainted(false);
        exit13.setContentAreaFilled(false);

        javax.swing.GroupLayout singlePlayerGameOptionsLayout = new javax.swing.GroupLayout(singlePlayerGameOptions);
        singlePlayerGameOptions.setLayout(singlePlayerGameOptionsLayout);
        singlePlayerGameOptionsLayout.setHorizontalGroup(
            singlePlayerGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(question4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(singlePlayerGameOptionsLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(randomQsS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customQsS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(singlePlayerGameOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toMainS)
                .addGap(129, 129, 129)
                .addComponent(title10, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit13)
                .addContainerGap())
        );
        singlePlayerGameOptionsLayout.setVerticalGroup(
            singlePlayerGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singlePlayerGameOptionsLayout.createSequentialGroup()
                .addGroup(singlePlayerGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(singlePlayerGameOptionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(singlePlayerGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit13)
                            .addComponent(toMainS))))
                .addGap(41, 41, 41)
                .addComponent(question4)
                .addGap(55, 55, 55)
                .addGroup(singlePlayerGameOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(randomQsS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customQsS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        main.add(singlePlayerGameOptions, "card9");

        singleGame.setBackground(new java.awt.Color(247, 237, 226));
        singleGame.setMinimumSize(new java.awt.Dimension(650, 365));
        singleGame.setPreferredSize(new java.awt.Dimension(650, 365));

        singleQuestion.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 16)); // NOI18N
        singleQuestion.setForeground(new java.awt.Color(61, 82, 77));
        singleQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singleQuestion.setText("Question");

        categoryName.setBackground(new java.awt.Color(132, 165, 157));
        categoryName.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        categoryName.setForeground(new java.awt.Color(132, 165, 157));
        categoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryName.setText("The category is:");

        ans5.setBackground(new java.awt.Color(245, 202, 195));
        ans5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        ans5.setForeground(new java.awt.Color(61, 82, 77));
        ans5.setText("ans2");
        ans5.setBorderPainted(false);
        ans5.setMaximumSize(new java.awt.Dimension(180, 40));
        ans5.setMinimumSize(new java.awt.Dimension(180, 40));
        ans5.setPreferredSize(new java.awt.Dimension(180, 40));

        ans6.setBackground(new java.awt.Color(245, 202, 195));
        ans6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        ans6.setForeground(new java.awt.Color(61, 82, 77));
        ans6.setText("ans1");
        ans6.setBorderPainted(false);
        ans6.setMaximumSize(new java.awt.Dimension(180, 40));
        ans6.setMinimumSize(new java.awt.Dimension(180, 40));
        ans6.setPreferredSize(new java.awt.Dimension(120, 40));

        ans7.setBackground(new java.awt.Color(245, 202, 195));
        ans7.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        ans7.setForeground(new java.awt.Color(61, 82, 77));
        ans7.setText("ans3");
        ans7.setBorderPainted(false);
        ans7.setMaximumSize(new java.awt.Dimension(120, 40));
        ans7.setMinimumSize(new java.awt.Dimension(120, 40));
        ans7.setPreferredSize(new java.awt.Dimension(120, 40));

        ans8.setBackground(new java.awt.Color(245, 202, 195));
        ans8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        ans8.setForeground(new java.awt.Color(61, 82, 77));
        ans8.setText("ans4");
        ans8.setBorderPainted(false);
        ans8.setMaximumSize(new java.awt.Dimension(180, 40));
        ans8.setMinimumSize(new java.awt.Dimension(180, 40));
        ans8.setPreferredSize(new java.awt.Dimension(180, 40));

        score.setBackground(new java.awt.Color(132, 165, 157));
        score.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        score.setForeground(new java.awt.Color(132, 165, 157));
        score.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        score.setText("Score: ");

        streakSingle.setBackground(new java.awt.Color(132, 165, 157));
        streakSingle.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        streakSingle.setForeground(new java.awt.Color(132, 165, 157));
        streakSingle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        streakSingle.setText("You are on a streak!!");

        exit14.setForeground(new java.awt.Color(132, 165, 157));
        exit14.setText("X");
        exit14.setBorderPainted(false);
        exit14.setContentAreaFilled(false);

        javax.swing.GroupLayout singleGameLayout = new javax.swing.GroupLayout(singleGame);
        singleGame.setLayout(singleGameLayout);
        singleGameLayout.setHorizontalGroup(
            singleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(singleQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(singleGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoryName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(singleGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(streakSingle)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singleGameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit14)
                .addContainerGap())
            .addGroup(singleGameLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(singleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ans7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ans6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(singleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ans8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        singleGameLayout.setVerticalGroup(
            singleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singleGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singleQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(singleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(singleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ans8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(singleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score)
                    .addComponent(streakSingle))
                .addContainerGap())
        );

        main.add(singleGame, "card10");

        endSingleGame.setBackground(new java.awt.Color(247, 237, 226));
        endSingleGame.setMinimumSize(new java.awt.Dimension(650, 365));
        endSingleGame.setPreferredSize(new java.awt.Dimension(650, 365));

        finalScoreSingle.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        finalScoreSingle.setForeground(new java.awt.Color(61, 82, 77));
        finalScoreSingle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        finalScoreSingle.setText("Your score is:");

        question5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        question5.setForeground(new java.awt.Color(61, 82, 77));
        question5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question5.setText("What would you like to do?");

        toStartEnd.setBackground(new java.awt.Color(246, 189, 96));
        toStartEnd.setForeground(new java.awt.Color(61, 82, 77));
        toStartEnd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        toStartEnd.setLabel("Back to start");
        toStartEnd.setMaximumSize(new java.awt.Dimension(150, 50));
        toStartEnd.setMinimumSize(new java.awt.Dimension(150, 50));
        toStartEnd.setPreferredSize(new java.awt.Dimension(150, 50));

        replayS.setBackground(new java.awt.Color(246, 189, 96));
        replayS.setForeground(new java.awt.Color(61, 82, 77));
        replayS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 202, 195), 1, true));
        replayS.setLabel("Replay game");
        replayS.setMaximumSize(new java.awt.Dimension(150, 50));
        replayS.setMinimumSize(new java.awt.Dimension(150, 50));
        replayS.setPreferredSize(new java.awt.Dimension(150, 50));

        exit15.setForeground(new java.awt.Color(132, 165, 157));
        exit15.setText("X");
        exit15.setBorderPainted(false);
        exit15.setContentAreaFilled(false);

        javax.swing.GroupLayout endSingleGameLayout = new javax.swing.GroupLayout(endSingleGame);
        endSingleGame.setLayout(endSingleGameLayout);
        endSingleGameLayout.setHorizontalGroup(
            endSingleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endSingleGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(finalScoreSingle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(question5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(endSingleGameLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(toStartEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(replayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endSingleGameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit15)
                .addContainerGap())
        );
        endSingleGameLayout.setVerticalGroup(
            endSingleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endSingleGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit15)
                .addGap(22, 22, 22)
                .addComponent(finalScoreSingle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(question5)
                .addGap(28, 28, 28)
                .addGroup(endSingleGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toStartEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        main.add(endSingleGame, "card11");

        singleCustomOptions.setBackground(new java.awt.Color(247, 237, 226));
        singleCustomOptions.setMinimumSize(new java.awt.Dimension(650, 365));
        singleCustomOptions.setOpaque(false);
        singleCustomOptions.setPreferredSize(new java.awt.Dimension(650, 365));

        title11.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 48)); // NOI18N
        title11.setForeground(new java.awt.Color(61, 82, 77));
        title11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title11.setText("New Game");

        exit16.setForeground(new java.awt.Color(132, 165, 157));
        exit16.setText("X");
        exit16.setBorderPainted(false);
        exit16.setContentAreaFilled(false);

        question6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        question6.setForeground(new java.awt.Color(61, 82, 77));
        question6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question6.setText("What categories would you like to use in game?");

        scienceS.setBackground(new java.awt.Color(245, 202, 195));
        scienceS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        scienceS.setForeground(new java.awt.Color(61, 82, 77));
        scienceS.setText("Science");
        scienceS.setBorderPainted(false);
        scienceS.setMaximumSize(new java.awt.Dimension(120, 40));
        scienceS.setMinimumSize(new java.awt.Dimension(120, 40));
        scienceS.setPreferredSize(new java.awt.Dimension(120, 40));

        historyS.setBackground(new java.awt.Color(245, 202, 195));
        historyS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        historyS.setForeground(new java.awt.Color(61, 82, 77));
        historyS.setText("History");
        historyS.setBorderPainted(false);
        historyS.setMaximumSize(new java.awt.Dimension(120, 40));
        historyS.setMinimumSize(new java.awt.Dimension(120, 40));
        historyS.setPreferredSize(new java.awt.Dimension(120, 40));

        artsS.setBackground(new java.awt.Color(245, 202, 195));
        artsS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        artsS.setForeground(new java.awt.Color(61, 82, 77));
        artsS.setText("Arts");
        artsS.setBorderPainted(false);
        artsS.setMaximumSize(new java.awt.Dimension(120, 40));
        artsS.setMinimumSize(new java.awt.Dimension(120, 40));
        artsS.setPreferredSize(new java.awt.Dimension(120, 40));

        geographyS.setBackground(new java.awt.Color(245, 202, 195));
        geographyS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        geographyS.setForeground(new java.awt.Color(61, 82, 77));
        geographyS.setText("Geography");
        geographyS.setBorderPainted(false);
        geographyS.setMaximumSize(new java.awt.Dimension(120, 40));
        geographyS.setMinimumSize(new java.awt.Dimension(120, 40));
        geographyS.setPreferredSize(new java.awt.Dimension(120, 40));

        sportsS.setBackground(new java.awt.Color(245, 202, 195));
        sportsS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        sportsS.setForeground(new java.awt.Color(61, 82, 77));
        sportsS.setText("Sports");
        sportsS.setBorderPainted(false);
        sportsS.setMaximumSize(new java.awt.Dimension(120, 40));
        sportsS.setMinimumSize(new java.awt.Dimension(120, 40));
        sportsS.setPreferredSize(new java.awt.Dimension(120, 40));

        customS.setBackground(new java.awt.Color(245, 202, 195));
        customS.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        customS.setForeground(new java.awt.Color(61, 82, 77));
        customS.setText("Custom");
        customS.setBorderPainted(false);
        customS.setMaximumSize(new java.awt.Dimension(120, 40));
        customS.setMinimumSize(new java.awt.Dimension(120, 40));
        customS.setPreferredSize(new java.awt.Dimension(120, 40));

        toMainS1.setBackground(new java.awt.Color(255, 204, 102));
        toMainS1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        toMainS1.setForeground(new java.awt.Color(132, 165, 157));
        toMainS1.setText("<");
        toMainS1.setBorderPainted(false);
        toMainS1.setContentAreaFilled(false);

        javax.swing.GroupLayout singleCustomOptionsLayout = new javax.swing.GroupLayout(singleCustomOptions);
        singleCustomOptions.setLayout(singleCustomOptionsLayout);
        singleCustomOptionsLayout.setHorizontalGroup(
            singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singleCustomOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(question6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(singleCustomOptionsLayout.createSequentialGroup()
                        .addComponent(toMainS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title11, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(exit16)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singleCustomOptionsLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scienceS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historyS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(geographyS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(artsS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sportsS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(103, 103, 103))
        );
        singleCustomOptionsLayout.setVerticalGroup(
            singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleCustomOptionsLayout.createSequentialGroup()
                .addGroup(singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(singleCustomOptionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit16)
                            .addComponent(toMainS1))))
                .addGap(47, 47, 47)
                .addComponent(question6)
                .addGap(34, 34, 34)
                .addGroup(singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(singleCustomOptionsLayout.createSequentialGroup()
                        .addComponent(historyS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(scienceS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(singleCustomOptionsLayout.createSequentialGroup()
                        .addGroup(singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sportsS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(artsS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(singleCustomOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(geographyS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(71, 71, 71))
        );

        main.add(singleCustomOptions, "card12");

        getContentPane().add(main);
        main.setBounds(0, 0, 0, 0);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void switchToMain() {
        main.removeAll();
        main.add(mainPage);
        main.repaint();
        main.revalidate();
    }

    public void switchToStart() {
        main.removeAll();
        main.add(startPage);
        main.repaint();
        main.revalidate();
    }

    public void switchToHowToPlay() {
        main.removeAll();
        main.add(howToPlay);
        howToPlay.add(howToInstruct1);
        howToPlay.add(howToInstruct2);
        howToPlay.add(howToInstruct3);
        main.repaint();
        main.revalidate();
    }

    public void switchToHowToInstruct1() {

    }

    public void switchToHowToInstruct2() {
        howToPlay.remove(howToInstruct1);
        howToPlay.repaint();
        howToPlay.revalidate();

    }

    public void switchToHowToInstruct3() {
        howToPlay.remove(howToInstruct2);
        howToPlay.repaint();
        howToPlay.revalidate();
    }

    public void switchToHighscores() {
        //updateHighScores();
        main.removeAll();
        main.add(highscores);
        main.repaint();
        main.revalidate();
    }

    public void switchToSearchHS() {
        main.removeAll();
        main.add(searchHS);
        main.repaint();
        main.revalidate();
    }

    public void switchToCustomisationsQs() {
        main.removeAll();
        main.add(customisationsQs);
        customisationsQs.add(questionsAdd);
        customisationsQs.add(questionsCheck);
        customisationsQs.add(answersAdd);
        customisationsQs.add(answerCheck);
        customisationsQs.add(answerWrong);
        customisationsQs.add(fullyAddedQandA);
        main.repaint();
        main.revalidate();
    }

    public void switchToQuestionsCheck() {
        inputtedQ.setText(questionField.getText());
        //set custom questions to this field.
        customisationsQs.remove(questionsAdd);
        customisationsQs.repaint();
        customisationsQs.revalidate();
    }

    public void goBackToQuestionsAdd() {
        questionField.setText("Enter the question here!");
        main.removeAll();
        main.add(customisationsQs);

        customisationsQs.removeAll();
        customisationsQs.add(questionsAdd);
        customisationsQs.add(questionsCheck);
        customisationsQs.add(answersAdd);
        customisationsQs.add(answerCheck);
        customisationsQs.add(answerWrong);
        customisationsQs.add(fullyAddedQandA);

        main.repaint();
        main.revalidate();
    }

    public void switchToAnswersAdd() {
        questionField.setText("Enter the question here!");

        customisationsQs.remove(questionsCheck);
        customisationsQs.repaint();
        customisationsQs.revalidate();
    }

    public void switchToAnswerCheck() {
        customisationsQs.remove(answersAdd);
        customisationsQs.repaint();
        customisationsQs.revalidate();
    }

    public void goBackToAnswersAdd() {
        answerField.setText("Enter the answer here!");
        main.removeAll();
        main.add(customisationsQs);

        customisationsQs.removeAll();
        customisationsQs.add(answersAdd);
        customisationsQs.add(answerCheck);
        customisationsQs.add(answerWrong);
        customisationsQs.add(fullyAddedQandA);

        main.repaint();
        main.revalidate();
    }

    public void switchToAnswerWrong() {

        //add custom questions and answer to database
        /*customisations custom = new customisations();
        custom.addQtoCustom(customQuestion);
        custom.addAnswerToCustom(customQuestion, answerField.getText(), true);*/
        answerField.setText("Enter the answer here!");

        customisationsQs.remove(answerCheck);
        customisationsQs.repaint();
        customisationsQs.revalidate();
    }

    public void switchToFullyAddedQandA() {
        customisationsQs.remove(answerWrong);
        customisationsQs.repaint();
        customisationsQs.revalidate();

    }

    public void switchToNewGameOptions() {
        main.removeAll();
        main.add(newGameOptions);
        main.repaint();
        main.revalidate();
    }

    public void switchToSinglePlayerGameOptions() {
        main.removeAll();
        main.add(singlePlayerGameOptions);
        main.repaint();
        main.revalidate();
    }

    public void switchToSingleGame() {
        main.removeAll();
        main.add(singleGame);
        main.repaint();
        main.revalidate();
    }

    public void switchToEndSingleGame() {
        main.removeAll();
        main.add(endSingleGame);
        main.repaint();
        main.revalidate();
    }

    public void switchToSingleCustomOptions() {
        main.removeAll();
        main.add(singleCustomOptions);
        singleCustomOptions.add(historyS);
        singleCustomOptions.add(artsS);
        singleCustomOptions.add(sportsS);
        singleCustomOptions.add(scienceS);
        singleCustomOptions.add(geographyS);
        main.repaint();
        main.revalidate();
    }
    
    
    public void addActionListenerToButton(JButton button, ActionListener listener)  {
        button.addActionListener(listener);  
    }
            
    
    public void addActionListenerToTextField(JTextField field, ActionListener listener) {
        field.addActionListener(listener);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomAs;
    private javax.swing.JLabel CustomQs;
    private javax.swing.JLabel HS1;
    private javax.swing.JLabel HS2;
    private javax.swing.JLabel HS3;
    private javax.swing.JLabel HS4;
    private javax.swing.JLabel HS5;
    private javax.swing.JButton HowTo;
    private javax.swing.JButton NoAs;
    private javax.swing.JButton NoQs;
    private javax.swing.JLabel TriviaTrek;
    private javax.swing.JButton YesAs;
    private javax.swing.JButton YesQs;
    private javax.swing.JButton addAnother;
    private javax.swing.JButton ans1;
    private javax.swing.JButton ans2;
    private javax.swing.JButton ans3;
    private javax.swing.JButton ans4;
    private javax.swing.JButton ans5;
    private javax.swing.JButton ans6;
    private javax.swing.JButton ans7;
    private javax.swing.JButton ans8;
    private javax.swing.JPanel answerCheck;
    private javax.swing.JLabel answerCheckCorrect;
    private javax.swing.JTextField answerField;
    private javax.swing.JPanel answerWrong;
    private javax.swing.JPanel answersAdd;
    private javax.swing.JButton artsS;
    private javax.swing.JButton backToMain;
    private javax.swing.JLabel categoryName;
    private javax.swing.JLabel continueQ;
    private javax.swing.JLabel customNote;
    private javax.swing.JButton customQsS;
    private javax.swing.JButton customS;
    private javax.swing.JPanel customisationsQs;
    private javax.swing.JButton customise;
    private javax.swing.JPanel endSingleGame;
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JButton exit10;
    private javax.swing.JButton exit11;
    private javax.swing.JButton exit12;
    private javax.swing.JButton exit13;
    private javax.swing.JButton exit14;
    private javax.swing.JButton exit15;
    private javax.swing.JButton exit16;
    private javax.swing.JButton exit2;
    private javax.swing.JButton exit3;
    private javax.swing.JButton exit4;
    private javax.swing.JButton exit5;
    private javax.swing.JButton exit6;
    private javax.swing.JButton exit7;
    private javax.swing.JButton exit8;
    private javax.swing.JButton exit9;
    private javax.swing.JLabel finalScoreSingle;
    private javax.swing.JTextField findHS;
    private javax.swing.JTextField findHS1;
    private javax.swing.JLabel foundHS;
    private javax.swing.JPanel fullyAddedQandA;
    private javax.swing.JButton geographyS;
    private javax.swing.JButton goodLuckToMain;
    private javax.swing.JPanel highscores;
    private javax.swing.JButton historyS;
    private javax.swing.JLabel howMuch;
    private javax.swing.JLabel howTo1;
    private javax.swing.JLabel howTo2;
    private javax.swing.JLabel howTo3;
    private javax.swing.JPanel howToInstruct1;
    private javax.swing.JPanel howToInstruct2;
    private javax.swing.JPanel howToInstruct3;
    private javax.swing.JPanel howToPlay;
    private javax.swing.JTextField howToSpecial;
    private javax.swing.JLabel inputA;
    private javax.swing.JLabel inputQ;
    private javax.swing.JLabel inputtedA;
    private javax.swing.JLabel inputtedQ;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainPage;
    private javax.swing.JButton multiplayerOption;
    private javax.swing.JButton newGame;
    private javax.swing.JPanel newGameOptions;
    private javax.swing.JLabel normalQuestion;
    private javax.swing.JLabel normalQuestion1;
    private javax.swing.JLabel normalQuestion2;
    private javax.swing.JLabel normalQuestion3;
    private javax.swing.JLabel normalQuestion4;
    private javax.swing.JLabel question;
    private javax.swing.JLabel question1;
    private javax.swing.JLabel question2;
    private javax.swing.JLabel question3;
    private javax.swing.JLabel question4;
    private javax.swing.JLabel question5;
    private javax.swing.JLabel question6;
    private javax.swing.JTextField questionField;
    private javax.swing.JPanel questionsAdd;
    private javax.swing.JPanel questionsCheck;
    private javax.swing.JButton randomQsS;
    private javax.swing.JButton replayS;
    private javax.swing.JButton reset;
    private javax.swing.JButton scienceS;
    private javax.swing.JLabel score;
    private javax.swing.JPanel searchHS;
    private javax.swing.JLabel searchedHS;
    private javax.swing.JPanel singleCustomOptions;
    private javax.swing.JPanel singleGame;
    private javax.swing.JPanel singlePlayerGameOptions;
    private javax.swing.JButton singlePlayerOption;
    private javax.swing.JLabel singleQuestion;
    private javax.swing.JButton sportsS;
    private javax.swing.JPanel startPage;
    private javax.swing.JLabel streakSingle;
    private javax.swing.JButton submitHowToSpecial;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title10;
    private javax.swing.JLabel title11;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel title7;
    private javax.swing.JLabel title8;
    private javax.swing.JLabel title9;
    private javax.swing.JButton toHighScores;
    javax.swing.JButton toMain;
    private javax.swing.JButton toMainC;
    private javax.swing.JButton toMainC1;
    private javax.swing.JButton toMainC2;
    private javax.swing.JButton toMainC3;
    private javax.swing.JButton toMainHS1;
    private javax.swing.JButton toMainHS2;
    private javax.swing.JButton toMainHowTo;
    private javax.swing.JButton toMainHowTo1;
    private javax.swing.JButton toMainNG;
    private javax.swing.JButton toMainS;
    private javax.swing.JButton toMainS1;
    private javax.swing.JButton toStart;
    private javax.swing.JButton toStartEnd;
    private javax.swing.JLabel topHighScores;
    private javax.swing.JTextField wrongAnswerField;
    private javax.swing.JLabel wrongAs;
    private javax.swing.JLabel wrongAs1;
    // End of variables declaration//GEN-END:variables
}
