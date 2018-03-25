/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication17;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author aabdin02
 */
public class ProfilePageController extends Application implements Initializable {
    
    private boolean home;
    private ImageView profileFieldImage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void backHome(ActionEvent event) {
        home = true;
        try{
            Stage stage = new Stage();
            start(stage);
        }catch(Exception ex){
            System.out.println();
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        String file_name = "";
        if(home){
            file_name = "FXMLDocument.fxml";
        }
        Parent root = FXMLLoader.load(getClass().getResource(file_name));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
