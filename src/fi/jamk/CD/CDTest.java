/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.CD;

/**
 *
 * @author Greatmelons
 */
public class CDTest {
    
    public static void main(String arcs[]) {
        CD cd1 = new CD("Metallica", "Ride the Lightning");
        CD cd2 = new CD();
        cd2.setArtist("Caladan Brood");
        cd2.setAlbum("Book of the Fallen");
        cd2.setTracks(10);
        cd2.setLength(118);
        System.out.println(cd1.returnCDInfo());
        System.out.println(cd2.returnCDInfo());
        
    }
    
}
