/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package trivia_project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abbys
 */
public class playerScoreTest {

    @Before
    public void setUp() {
        playerScore.scores.clear();
    }

    @Test
    public void testNewSingleScore() {
        playerScore.newSingleScore();

        assertEquals(1, playerScore.scores.size());
        assertEquals(0, (int) playerScore.scores.get(0));
    }

    @Test
    public void testAddToScoreSingle() {
        playerScore.newSingleScore();
        playerScore.addToScoreSingle();
        assertEquals(10, (int) playerScore.scores.get(0));
    }

    @Test
    public void testAddToScoreSingleStreak() {
        playerScore.newSingleScore();
        playerScore.addToScoreSingleStreak();

        assertEquals(30, (int) playerScore.scores.get(0));
    }

    @Test
    public void testAddToScoreSingleSpecial() {
        playerScore.newSingleScore();
        playerScore.addToScoreSingleSpecial();
        assertEquals(100, (int) playerScore.scores.get(0));
    }

    @Test
    public void testMinusScore() {
        playerScore.newSingleScore();
        playerScore.addToScoreSingle();
        playerScore.minusScore();
        assertEquals(0, (int) playerScore.scores.get(0));

        playerScore.minusScore();
        assertEquals(0, (int) playerScore.scores.get(0));
    }

    @Test
    public void testNewMultiScore() {
        int numberOfPlayers = 3;
        playerScore.newMultiScore(numberOfPlayers);
        assertEquals(numberOfPlayers, playerScore.scores.size());
        for (int score : playerScore.scores) {
            assertEquals(0, score);
        }
    }

    @Test
    public void testAddToMultiScore() {
        int playerIndex = 1;
        playerScore.newMultiScore(3);
        playerScore.addToMultiScore(playerIndex);
        assertEquals(10, (int) playerScore.scores.get(playerIndex));
    }

    @Test
    public void testAddToMultiScoreStreak() {
        int playerIndex = 2;
        playerScore.newMultiScore(3);
        playerScore.addToMultiScoreStreak(playerIndex);
        assertEquals(30, (int) playerScore.scores.get(playerIndex));
    }

    @Test
    public void testAddToMultiScoreSpecial() {
        int playerIndex = 0;
        playerScore.newMultiScore(3);
        playerScore.addToMultiScoreSpecial(playerIndex);
        assertEquals(100, (int) playerScore.scores.get(playerIndex));
    }

    @Test
    public void testMinusScoreMulti() {
        int playerIndex = 1;
        playerScore.newMultiScore(3);
        playerScore.addToMultiScore(playerIndex);
        playerScore.minusScoreMulti(playerIndex);
        assertEquals(0, (int) playerScore.scores.get(playerIndex));

        playerScore.minusScoreMulti(playerIndex);
        assertEquals(0, (int) playerScore.scores.get(playerIndex));
    }

}
