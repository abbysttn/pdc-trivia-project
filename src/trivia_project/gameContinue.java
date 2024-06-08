/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia_project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author abbys
 */
public class gameContinue {

    private Statement statement;
    private final DBManager dbManager;
    private final Connection conn;

    public gameContinue() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }

    public boolean checkGame() { //checks what type of game is saved in the file
        boolean questionsFound = false;
        try {
            statement = conn.createStatement();
            String getQs = "SELECT * FROM SAVEDGAMEQS";

            ResultSet resultSet = statement.executeQuery(getQs);

            if (resultSet.next()) {
                questionsFound = true;
            } else {
                questionsFound = false;
            }

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

        return questionsFound;
    }
}
