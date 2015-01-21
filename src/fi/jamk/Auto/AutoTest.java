/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Auto;

import fi.jamk.Auto.Auto;

/**
 *
 * @author h3090
 */
public class AutoTest {
    
    public static void main(String args[]) {
        //create a new object from Auto-class
        Auto car1 = new Auto();
        //change car1 model
        car1.setModel("Saab 900i");
        //System.out.print("Car model is: " + car1.getModel());
        car1.increaseSpeed();
        car1.setColor("Fiery red");
        System.out.println("Car no.1: " + car1.returnAllAttributes());
    
        //create a new object from Auto-class
        Auto car2 = new Auto("Obsidian black", "Saab 900", 140);
        System.out.println("Car no.2: " + car2.returnAllAttributes());
    }
    
}
