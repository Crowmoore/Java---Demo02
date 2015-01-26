package fi.jamk.Dwarf;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 *
 * @author h3090
 */
public class Dwarf {
    
    List<String> firstnameList = Arrays.asList("Thor", "Bjorn", "Lauger", "Ovur", "Varin", "Maof", "Garandas", "Vonthic", "Kilar", "Darnar", "Dwalbar", "Sundkas", "Garn", "Burgan", "Buror", "Donulf");
    List<String> lastnamePrefixList = Arrays.asList("Oak", "Frost", "Thunder", "Fire", "Ground", "Iron", "Stone", "Sword", "Blood", "Red", "Anvil", "Gray", "Foe", "Strong", "Troll", "Orc", "Serpent", "Snake");
    List<String> lastnameSuffixList = Arrays.asList("shield", "rock", "heart", "hammer", "forger", "shadow", "breaker", "beard", "axe", "fist", "bane", "caster", "crusher", "eye", "mind");
    List<String> likesDislikesList = Arrays.asList("goblins", "dragons", "spiders", "insects", "fruits", "death", "animals", "swords", "legendary folklore", "elves", "drunkness", "ale", "rock punishing", "fighting", "birds", "shiny things", "torture", "nails", "sharp things", "holidays", "ugliness", "beautiful dwarves", "fish", "magic", "sorcerers", "undead things", "dungeon crawling", "looting", "raiding", "loud noises", "dark and wet places", "spirits of his ancestors", "high places", "snow", "mining");
    List<String> cityList = Arrays.asList("Gorndarum", "Birnkahldur", "Hig Faldir", "Bhom Buldor", "Haggrim", "Dugbihr", "Gol Durahl", "Bhogh Darohm", "Thoghbuldahr", "Veglodahr", "Kan Taruhm", "Ham Darul", "Vern Darim");
    List<String> deityList = Arrays.asList("Cuvther, The Goddes of Fertility", "Mueyr, The God of Ale", "Qoldur, The God of Poetry", "Juxorr, The Goddes of Mercy", "Durlo, The God of Good Luck", "Kidorr, The God of Earth", "Nutdon, The God of Fire", "Wyeyar, The God of Night", "Emaos, The God of the Underworld", "Jidite, The God of Revenge");
    List<String> weaponList = Arrays.asList("Sword", "Greathammer", "Dagger", "Bow", "Crossbow", "Hammer", "Bastard sword", "Rock", "Thigh bone", "Another dwarf", "Chair", "Any small animal", "Sharp stick", "Slingshot");
    String firstname;
    String lastname;
    String lastnamePrefix;
    String lastnameSuffix;
    String firstLike;
    String secondLike;
    String dislike;
    String absoluteLove;
    String absoluteHate;
    String city;
    String likesRoll;
    String deity;
    String weapon;
    int age;
    int currentYear = 1500;
    int birthYear;
    int strength;
    int intellect;
    int wisdom;
    int dexterity;
    int statRoll;
    Random randomizer = new Random();
    
    public Dwarf() {
        this.firstname = null;
        this.lastname = null;
        this.strength = 1;
        this.intellect = 1;
        this.wisdom = 1;
        this.dexterity = 1;
        this.firstLike = null;
        this.secondLike = null;
        this.dislike = null;
        this.absoluteLove = null;
        this.absoluteHate = null;
        this.city = null;
        this.deity = null;
        this.weapon = null;
        this.age = 0;
        this.birthYear = 0;
    }
    
    public String getFirstname() {
        this.firstname = firstnameList.get(randomizer.nextInt(firstnameList.size()));
        return this.firstname;
    }
    public String getLastname() {
        this.lastnamePrefix = lastnamePrefixList.get(randomizer.nextInt(lastnamePrefixList.size()));
        this.lastnameSuffix = lastnameSuffixList.get(randomizer.nextInt(lastnameSuffixList.size()));
        return (this.lastnamePrefix + this.lastnameSuffix);
    }
    public String getLikes() {
        this.likesRoll = likesDislikesList.get(randomizer.nextInt(likesDislikesList.size()));
        return this.likesRoll;
    }
    public String getCity() {
        this.city = cityList.get(randomizer.nextInt(cityList.size()));
        return this.city;
    }        
    public String getDeity() {
        this.deity = deityList.get(randomizer.nextInt(deityList.size()));
        return this.deity;
    }
    public String getWeapon() {
        this.weapon = weaponList.get(randomizer.nextInt(weaponList.size()));
        return this.weapon;
    }
    public int getBirthYear() {
        this.birthYear = randomizer.nextInt(85) + 1415;
        return this.birthYear;
    }
    public int getAge() {
        this.age = this.currentYear - this.birthYear;
        return this.age;
    }
    public int getStats() {
        this.statRoll = randomizer.nextInt(5);
        return this.statRoll;
    }
}
