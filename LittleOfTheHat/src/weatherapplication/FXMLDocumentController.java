/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.net.HttpURLConnection;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import com.google.gson.Gson;
/**
 * FXML Controller class
 *
 * @author aabdin02
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField city_name;

    private String result = "";
    @FXML
    private Text temperature;
    @FXML
    private Text pressure;
    @FXML
    private Text humidity;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    public void processApi(){
        String city = city_name.getText();
        String APPID ="&APPID=b7b8b4d8ff1a05a46495fc7c424ca118"; 
        String api = "http://api.openweathermap.org/data/2.5/weather?q="+city + APPID;
        
        try{
            URL url = new URL(api);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();

            int data = connection.getInputStream().read();
            while(data != - 1){
                result += Character.toString((char)data);
                data = connection.getInputStream().read();
            }
        }catch(Exception ex){
            
        }
        
    }

    @FXML
    private void displayWeather(ActionEvent event) {
        processApi();
        Gson gson = new Gson();
        weather weatherData  = gson.fromJson(result, weather.class);
        temperature.setText("Temperature: " + Double.toString(weatherData.getTemp()));
        pressure.setText("Pressure: " + Double.toString(weatherData.getPressure()));
        humidity.setText("Humidity: " + Double.toString(weatherData.getHumidity()));
    
    }

    @FXML
    private void resetWeather(ActionEvent event) {
        temperature.setText("");
        pressure.setText("");
        humidity.setText("");
        city_name.setText("");
        result = "";
    }
}
