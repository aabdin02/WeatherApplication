/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapplication;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author aabdin02
 */
public class weather {
    Map<String, Double> main = new TreeMap();

    public Map<String,Double> getMain(){
        return main;
    }
    
    public double getTemp(){
        return main.get("temp");
    }
    
    public double getPressure(){
        return main.get("pressure");
    }
    
    public double getHumidity(){
        return main.get("humidity");
    }
}
