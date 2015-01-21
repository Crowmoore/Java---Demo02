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
public class KiuasTest {
    
    public static void main(String args[]) {
        
        Kiuas kiuas1 = new Kiuas();
        System.out.println(kiuas1.getStatus());
        
        Kiuas kiuas2 = new Kiuas(true, 85, 95);
        System.out.print(kiuas2.getStatus());
    }
    
}
