package fi.jamk.Student;

/**
 *
 * @author h3090
 */
public class Student {
    
    String name;
    int age;
    boolean isDrunk;
    boolean isSucceeding;
    
    public Student() {
        this.name = "";
        this.age = 0;
        this.isDrunk = true;
        this.isSucceeding = false;
    }
    
    public Student(String name, int age, boolean isDrunk, boolean isSucceeding) {
        this.name = name;
        this.age = age;
        this.isDrunk = isDrunk;
        this.isSucceeding = isSucceeding;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDrunk(boolean isDrunk) {
        this.isDrunk = isDrunk;
    }
    public void setSuccess(boolean isSucceeding) {
        this.isSucceeding = isSucceeding;
    }
    public String returnStudent() {
        return ("Student: " + this.name + "\n" + "Age: " + this.age + "\n" + "Currently drunk: " + this.isDrunk + "\n" + "Succeeding in studies: " + this.isSucceeding + "\n");
    }
    
}
