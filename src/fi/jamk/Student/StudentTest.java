/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.Student;

/**
 *
 * @author Greatmelons
 */
public class StudentTest {
    
    public static void main(String args[]) {
        Student student1 = new Student("George Pantazis", 29, true, true);
        Student student2 = new Student("Mino Taur", 19, false, true);
        Student student3 = new Student("IB Hurtin", 22, true, false);
        Student student4 = new Student("Kim Jong-Un", 28, false, false);
        Student student5 = new Student("Doctor Feelgood", 51, true, true);
        Student student6 = new Student();
        
        student6.setName("Michael Bay");
        student6.setAge(57);
        student6.setDrunk(true);
        student6.setSuccess(false);
        
        String studentInfo[] = new String[6];
        studentInfo[0] = student1.returnStudent();
        studentInfo[1] = student2.returnStudent();
        studentInfo[2] = student3.returnStudent();
        studentInfo[3] = student4.returnStudent();
        studentInfo[4] = student5.returnStudent();
        studentInfo[5] = student6.returnStudent();
        
        for(int i=0; i<6; i++) {
            System.out.println(studentInfo[i]);
        }
    }
    
}
