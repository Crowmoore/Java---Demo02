package fi.jamk.Auto;

/**
 *
 * @author h3090
 */
public class Auto {
    //attributes
    String color;
    String model;
    int speed;
    
    //default constructor
    public Auto() {
        this.color = "";
        this.model = "";
        this.speed = 0;
    }
    
    //Auto myCar = new Auto("Black","Saab",140);
    public Auto(String color,String model,int speed) {
        this.color = color;
        this.model = model;
        this.speed = speed;
}

    //methods for speed control
    public void increaseSpeed() {
        this.speed++;
    }
    
    public void decreaseSpeed() {
        this.speed--;
    }
    
    //methods for returning attributes
    public int getSpeed() {
        return this.speed;
    }
    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.model;
    }
    
    //methods for setting attributes
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    //return all attributes as a string
    public String returnAllAttributes() {
        return this.model + " " + this.color + " " + this.speed + "km/h";
    }
}
