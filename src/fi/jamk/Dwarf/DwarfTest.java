package fi.jamk.Dwarf;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author h3090
 */

public class DwarfTest {
 
    public static void main(String args[]) {
        
        ArrayList<Dwarf> dwarves = new ArrayList<Dwarf>();
        Scanner input = new Scanner(System.in);
        System.out.print("How many dwarves would you like to generate? ");
        int dwarfCount = input.nextInt();
        for (int i=0; i<dwarfCount; i++) {
            Dwarf dwarf = newDwarf();
            dwarves.add(dwarf);
        }
        for (int i=0; i<dwarfCount; i++) {
            System.out.println("");
            printDwarfInfo(dwarves.get(i));
        }         
    }
    public static Dwarf newDwarf() {
        Dwarf newDwarf = new Dwarf();
        getName(newDwarf);
        getStats(newDwarf);
        getBirthYear(newDwarf);
        getAge(newDwarf);
        getLikes(newDwarf);
        getCity(newDwarf);
        getDeity(newDwarf);
        getWeapon(newDwarf);
        return newDwarf;
    }
    public static void getName(Dwarf newDwarf) {
        newDwarf.firstname = newDwarf.getFirstname();
        newDwarf.lastname = newDwarf.getLastname();
    }
    public static void getBirthYear(Dwarf newDwarf) {
        newDwarf.birthYear = newDwarf.getBirthYear();
    }
    public static void getAge(Dwarf newDwarf) {
        newDwarf.age = newDwarf.getAge();
    }
    public static void getStats(Dwarf newDwarf) {
        newDwarf.strength += newDwarf.getStats();
        newDwarf.intellect += newDwarf.getStats();
        newDwarf.wisdom += newDwarf.getStats();
        newDwarf.dexterity += newDwarf.getStats();
        
    }
    public static void getLikes(Dwarf newDwarf) {
        newDwarf.firstLike = newDwarf.getLikes(); 
        newDwarf.secondLike = newDwarf.getLikes();
        newDwarf.dislike = newDwarf.getLikes();
        newDwarf.absoluteLove = newDwarf.getLikes();
        newDwarf.absoluteHate = newDwarf.getLikes();
    }
    public static void getCity(Dwarf newDwarf) {
        newDwarf.city = newDwarf.getCity();
    }
    public static void getDeity(Dwarf newDwarf) {
        newDwarf.deity = newDwarf.getDeity();
    }
    public static void getWeapon(Dwarf newDwarf) {
        newDwarf.weapon = newDwarf.getWeapon();
    }
    
    public static void printDwarfInfo(Dwarf dwarf) {
        System.out.println(dwarf.firstname + " " + dwarf.lastname + ", " + dwarf.age + ".");
        System.out.println("Born in the great city of " + dwarf.city + " in the year " + dwarf.birthYear + ".");
        System.out.println("Likes " + dwarf.firstLike + " and " + dwarf.secondLike + ". Dislikes " + dwarf.dislike + ". \n"
        + "Absolutely loves " + dwarf.absoluteLove + " and hates " + dwarf.absoluteHate + ".");
        System.out.println("Favourite weapon is " + dwarf.weapon + ".");
        System.out.println("Worships " + dwarf.deity + ".");
        System.out.println("Strength: " + dwarf.strength + "\n" + "Intellect: " + dwarf.intellect + "\n"
        + "Wisdom: " + dwarf.wisdom + "\n" + "Dexterity: " + dwarf.dexterity);
    }
}
