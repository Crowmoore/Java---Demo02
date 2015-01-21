/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.Vehicle;

/**
 *
 * @author Greatmelons
 */
public class VehicleTest {
    
    public static void main(String args[]) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle(130, "Lada 1200L");
        vehicle1.setSpeed(80);
        vehicle1.setName("Saab 900i");
        System.out.println("Vehicle 1 is " + vehicle1.returnVehicleName());
        System.out.println("Vehicle 2 is " + vehicle2.printVehicleInfo());
    }
    
}
