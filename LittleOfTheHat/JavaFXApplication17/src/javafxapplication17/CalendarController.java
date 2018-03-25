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




import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
/**
/**
 * FXML Controller class
 *
 * @author aabdin02
 */
public class CalendarController extends  Application implements Initializable {
    private boolean monday;
    
    public void setStage(){
        try{
            Stage stage = new Stage();
            start(stage);
        }catch(Exception ex){
            System.out.print("Weird");
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openMonday(ActionEvent event) {
        try{
            monday = true;
            Stage stage = new Stage();
            start(stage);
        }catch(Exception ex){
            System.out.println();
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
         String file_name = "";
        if(monday){
            file_name = "CustomerProfile.fxml";
        }
        
        Parent root = FXMLLoader.load(getClass().getResource(file_name));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
