/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;


/**
 *
 * @author abbys
 */

public class runGame {

    public static void main(String[] args) { //loads all highscores into the game and runs the main page
        DBManager dbManager = new DBManager(); //connect database
        dbManager.getConnection();
        
        
        TriviaModel model = TriviaModel.getModelInstance();
        TriviaView view = new TriviaView();
        TriviaController controller = new TriviaController(model, view);
        
        view.setVisible(true);
        
    }
}
