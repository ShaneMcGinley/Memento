package Memento;

import java.util.ArrayDeque;

public class CharacterStateSave {

    public ArrayDeque<Character> saves = new ArrayDeque<>();
    private String nameCopy;
    private int expLevelCopy;
    private String locationCopy;
    private String weaponNameCopy;
    private String weaponTypeCopy;

    public String getWeaponTypeCopy() { return weaponTypeCopy; }

    public void setWeaponTypeCopy(String weaponTypeCopy) {
        this.weaponTypeCopy = weaponTypeCopy;
    }

    public String getWeaponNameCopy() {
        return weaponNameCopy;
    }

    public void setWeaponNameCopy(String weaponNameCopy) {
        this.weaponNameCopy = weaponNameCopy;
    }

    public String getNameCopy() {
        return nameCopy;
    }

    public void setNameCopy(String nameCopy) {
        this.nameCopy = nameCopy;
    }

    public int getExpLevelCopy() {
        return expLevelCopy;
    }

    public void setExpLevelCopy(int expLevelCopy) {
        this.expLevelCopy = expLevelCopy;
    }

    public String getLocationCopy() {
        return locationCopy;
    }

    public void setLocationCopy(String locationCopy) {
        this.locationCopy = locationCopy;
    }

    public Character save(){
        System.out.println("Saving Character Details...\n");
        Character character = new Character(nameCopy,expLevelCopy,locationCopy,
                weaponNameCopy,weaponTypeCopy);
        return character;
    }

    public void restoreToPreviousSave(Character character){
        System.out.println("Getting Last Save / Reversing the save once...\n");
        nameCopy = character.getName();
        expLevelCopy = character.getExpLevel();
        locationCopy = character.getLocation();
        weaponNameCopy = character.getWeaponName();
        weaponTypeCopy = character.getWeaponType();
    }

    public Character getSave() {
        Character character = saves.pop();
        return character;
    }

    public void addSave(Character character) {
        saves.push(character);
    }

    public void displayCharacterState(Character character){
        System.out.println("Character Details: \nPlayer Name: " + character.getName()
                + "\nExperience Level: " + character.getExpLevel() + "\nLocation: "
                + character.getLocation() + "\nWeapon Name: " + character.getWeaponName()
                + "\nWeapon Type: " + character.getWeaponType() +"\n");
    }
}
