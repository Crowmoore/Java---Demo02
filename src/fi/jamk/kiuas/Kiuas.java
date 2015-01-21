/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.kiuas;

/**
 *
 * @author h3090
 */
public class Kiuas {
    
    boolean isOn;
    double temperature;
    double humidity;
    
    public Kiuas() {
        this.isOn = false;
        this.temperature = 21;
        this.humidity = 45;
    }
    public Kiuas(boolean isOn, double temperature, double humidity) {
        this.isOn = isOn;
        this.temperature = temperature;
        this.humidity = humidity;
    }
    
    public void setState(boolean isOn) {
        this.isOn = isOn;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    public double getTemperature() {
        return this.temperature;
    }
    public double getHumidity() {
        return this.humidity;
    }
    public boolean getState() {
        return this.isOn;
    }
    public String getStatus() {
        return "Kiuas is on: " + this.isOn + " temperature: " + this.temperature + "°C " + " humidity: " + this.humidity + "%";
    }
}