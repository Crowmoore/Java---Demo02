/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Vehicle;

/**
 *
 * @author h3090
 */
public class Vehicle {
    
    int speed;
    String name;
    
    public Vehicle() {
        this.speed = 0;
        this.name = "";
    }
    
    public Vehicle(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String printVehicleInfo() {
        return (this.name + " and is currently travelling at " + this.speed + " km/h");
    }
    public String returnVehicleName() {
        return this.name;
    }
    
}
