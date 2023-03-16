/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package fxexer14;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Lauan 03
 */
public class MenuController implements Initializable {
    
    @FXML private ImageView icon1, icon2, icon3;
    @FXML private Button prev, next;
    
    private int page;
    private int maxPage;
    private ArrayList<ImageView> iconList;
    
    @FXML public void next(){
        clearIcons();
        page++;
        setSubjectIcons();
        checkLimit();
    }
    
    @FXML public void previous(){
        clearIcons();
        page--;
        setSubjectIcons();
        checkLimit();
    }
    
    @FXML public void details1(Event event) throws IOException{
        int index = (page *3) + 1;
        Subject s = Subject.getSubjectByIndex(index - 1); 
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Information.fxml"));
        Parent root = loader.load();
        MenuController controller = loader.getController();

        Scene subjectScene = new Scene(root);
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.hide();
        thisStage.setScene(subjectScene);
        thisStage.show();
    }
    public void setSubjectIcons(){
        int index = page*3;
        for(int i=0; i<iconList.size(); i++){
            try{
                Subject s = Subject.getSubjectByIndex(index + i);
                Image img = new Image(getClass().getResourceAsStream("imgs/" + s.getImgFileName()));
                iconList.get(i).setImage(img);
            }
            catch(IndexOutOfBoundsException e){
                Image img = new Image(getClass().getResourceAsStream("imgs/empty.png"));
                iconList.get(i).setImage(img);
            }
        }
    }
    
    public void checkLimit(){
        if(page == maxPage) next.setDisable(true);
        else next.setDisable(false);
        if(page == 0) prev.setDisable(true);
        else prev.setDisable(false);
    }
    
    public void clearIcons(){
        for(ImageView i : iconList){
            i.setImage(null);
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iconList = new ArrayList();
        iconList.add(icon1);
        iconList.add(icon2);
        iconList.add(icon3);
        page = 0;
        maxPage = Subject.getListLength()/3;
        setSubjectIcons();
        checkLimit();
    }    
    
}
