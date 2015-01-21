/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.CD;

/**
 *
 * @author h3090
 */
public class CD {
    
    String artist;
    String album;
    int numberOfTracks;
    double totalLength;
    
    public CD(String artist, String album) {
        this.artist = artist;
        this.album = album;
    }
    public CD() {
        this.artist = "";
        this.album = "";
        this.numberOfTracks = 0;
        this.totalLength = 0;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }
    public void setLength(double totalLength) {
        this.totalLength = totalLength;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String returnCDInfo() {
        return ("Album: " + this.artist + " - " + this.album + "\n" + "Number of tracks: " + this.numberOfTracks + "\n" + "Total length: " + this.totalLength + " minutes. ");
    }
    
}
