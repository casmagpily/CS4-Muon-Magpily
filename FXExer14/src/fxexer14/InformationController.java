/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxexer14;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MUON
 */
public class InformationController implements Initializable {
    
    @FXML private ImageView shownIcon;
    @FXML private Text subjectName, units, grades;
    @FXML private TextField searchbox;
    @FXML private Button previous, back, next, search;
    
    private int page;
    private int maxPage;
    
    @FXML public void previous(ActionEvent event){
        page--;
        try{
            Subject s = Subject.getSubjectByIndex(page);
            Image img = new Image(getClass().getResourceAsStream("imgs/" + s.getImgFileName()));
            shownIcon.setImage(img);
        }
        catch(IndexOutOfBoundsException e){
            Image img = new Image(getClass().getResourceAsStream("imgs/empty.png"));
            shownIcon.setImage(img);
        }
    }
    @FXML public void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuController.fxml"));
        Parent root = loader.load();
        
        Scene subjectScene = new Scene(root);
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.hide();
        thisStage.setScene(subjectScene);
        thisStage.show();
    }
    @FXML public void next(ActionEvent event){
        page++;
        try{
            Subject s = Subject.getSubjectByIndex(page);
            Image img = new Image(getClass().getResourceAsStream("imgs/" + s.getImgFileName()));
            shownIcon.setImage(img);
        }
        catch(IndexOutOfBoundsException e){
            Image img = new Image(getClass().getResourceAsStream("imgs/empty.png"));
            shownIcon.setImage(img);
        }
    }
    @FXML public void search(ActionEvent event){
        
    }
    
            
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        page = 0;
    }    
    
}
