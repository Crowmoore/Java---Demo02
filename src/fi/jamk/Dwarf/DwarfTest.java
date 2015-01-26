package fi.jamk.Dwarf;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author h3090
 */

public class DwarfTest {
     
    public static void main(String args[]) {
        
        ArrayList<Dwarf> dwarfList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("How many dwarfs would you like to generate? ");
        int dwarfCount = input.nextInt();
        for (int i=0; i<dwarfCount; i++) {
            Dwarf dwarf = newDwarf();
            dwarfList.add(dwarf);
        }
        for (int i=0; i<dwarfCount; i++) {
            System.out.print("\n");
            printDwarfInfo(dwarfList.get(i));
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
        System.out.println("He was born in the great city of " + dwarf.city + " in the year " + dwarf.birthYear + ".");
        System.out.println("His warm feelings towards " + dwarf.firstLike + " and " + dwarf.secondLike + " are widely known. He simply cannot comprehend " + dwarf.dislike + ".");
        System.out.println("His most beloved thing in the whole world is " + dwarf.absoluteLove + " and he despises " + dwarf.absoluteHate + ".");
        System.out.println(dwarf.weapon + " is a weapon of choice for " + dwarf.firstname + ". He never leaves the city without one.");
        System.out.println("He worships a deity known as " + dwarf.deity + ", whom he honors daily.");
        System.out.println("Strength: " + dwarf.strength + "\n" + "Intellect: " + dwarf.intellect + "\n"
        + "Wisdom: " + dwarf.wisdom + "\n" + "Dexterity: " + dwarf.dexterity);
    }
}
