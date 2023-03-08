/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise12magpilychristopherakira;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 *
 * @author MUON
 */
public class FXMLDocumentController implements Initializable {
    
    Subject math = new Subject("Math", "math.png", 4, 1.75);
    Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
    Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
    Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
    Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
    Subject displayedSubject = math;
    
    
    @FXML private Label label;
    @FXML ImageView subjectImage;
    @FXML TextField searchBar;
    @FXML Button search, next, prev;
    @FXML Text subjectName, grade, units;
    
    @FXML public void search(ActionEvent event) {
        String searched = searchBar.getText();
        try{
            displayedSubject = displayedSubject.searchSubject(searched);
            Image image = new Image(getClass().getResourceAsStream(displayedSubject.getImgFileName()));
            subjectImage.setImage(image);
            subjectName.setText(displayedSubject.getName());
            grade.setText("Grade: " + Double.toString(displayedSubject.getGrade()));
            units.setText("Units: " + Double.toString(displayedSubject.getUnits()));
        }
        catch(Exception e){
            
        }
    }
    @FXML public void nextSubject(ActionEvent event) {
        try{
            if(displayedSubject == math){
                displayedSubject = bio;
            }
            else if(displayedSubject == bio){
                displayedSubject = chem;
            }
            else if(displayedSubject == chem){
                displayedSubject = physics;
            }
            else if(displayedSubject == physics){
                displayedSubject = cs;
            }
            else if(displayedSubject == cs){
                displayedSubject = math;
            }
            Image image = new Image(getClass().getResourceAsStream(displayedSubject.getImgFileName()));
            subjectImage.setImage(image);
            subjectName.setText(displayedSubject.getName());
            grade.setText("Grade: " + Double.toString(displayedSubject.getGrade()));
            units.setText("Units: " + Double.toString(displayedSubject.getUnits()));
        }
        catch(Exception e){
            
        }
    }    
    @FXML public void prevSubject(ActionEvent event) {
        try{
            if(displayedSubject == math){
                displayedSubject = cs;
            }
            else if(displayedSubject == bio){
                displayedSubject = math;
            }
            else if(displayedSubject == chem){
                displayedSubject = bio;
            }
            else if(displayedSubject == physics){
                displayedSubject = chem;
            }
            else if(displayedSubject == cs){
                displayedSubject = physics;
            }
            Image image = new Image(getClass().getResourceAsStream(displayedSubject.getImgFileName()));
            subjectImage.setImage(image);
            subjectName.setText(displayedSubject.getName());
            grade.setText("Grade: " + Double.toString(displayedSubject.getGrade()));
            units.setText("Units: " + Double.toString(displayedSubject.getUnits()));
        }
        catch(Exception e){
            
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
        Image image = new Image(getClass().getResourceAsStream(displayedSubject.getImgFileName()));
        subjectImage.setImage(image);
        subjectName.setText(displayedSubject.getName());
        grade.setText("Grade: " + Double.toString(displayedSubject.getGrade()));
        units.setText("Units: " + Double.toString(displayedSubject.getUnits()));  
        }
        catch(Exception e){
            
        }
    }    
    
}
