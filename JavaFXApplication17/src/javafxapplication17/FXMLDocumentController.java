/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication17;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author aabdin02
 */
public class FXMLDocumentController extends Application implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ImageView logo;
    
    private boolean profile;
    private boolean schedule;
    private boolean gallary;
    private boolean myHistory;
    private boolean myReview;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openProfileFile(ActionEvent event) {
        profile = true;
        setStage();
    }

    public void setStage(){
        try{
            Stage stage = new Stage();
            start(stage);
        }catch(Exception ex){
            System.out.print("Weird");
        }
    }
    @Override
    public void start(Stage stage) throws Exception {
        String file_name = "";
        if(profile){
            file_name = "profilePage.fxml";
        }
        if(schedule){
            file_name = "Calendar.fxml";
        }
        if(myHistory){
            file_name = "myHistory.fxml";
        }
        if(myReview){
            file_name = "myReview.fxml";
        }
        if(gallary){
            file_name = "galary.fxml";
        }
        Parent root = FXMLLoader.load(getClass().getResource(file_name));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        profile = false;
        schedule = false;
        myHistory = false;
        myReview = false;
        gallary = false;
    }

    @FXML
    private void myAppointMentsCalendar(ActionEvent event) {
        schedule = true;
        setStage();
    }

    @FXML
    private void showMyHistory(ActionEvent event) {
        myHistory = true;
        setStage();
    }

    @FXML
    private void myReview(ActionEvent event) {
        myReview = true;
        setStage();
    }

    @FXML
    private void showMyGallary(ActionEvent event) {
        gallary = true;
        setStage();
    }
    
}
