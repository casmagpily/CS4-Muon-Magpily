/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package fxexer14;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lauan 03
 */
public class FXExer14 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        new Subject("Math", "math.png", 4, 1.75);
        new Subject("Biology", "biology.png", 3, 2.0);
        new Subject("Chemistry", "chemistry.png", 3, 1.5);
        new Subject("Physics", "physics.png", 3, 1.75);
        new Subject("Computer Science", "computer science.png", 1, 1.5);
        new Subject("Social Science", "social science.png", 1, 1.5);
        new Subject("English", "english.png", 1, 1.75);
        new Subject("Research", "research.png", 5, 1.5);
        
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    @FXML public void openIcon(ActionEvent event){
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
