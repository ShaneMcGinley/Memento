package Memento;

public class CharacterInfo {
    private String name;
    private String expLevel;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpLevel() {
        return expLevel;
    }

    public void setExpLevel(String expLevel) {
        this.expLevel = expLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CharacterInfo(String name, String expLevel, String location) {
        this.name = name;
        this.expLevel = expLevel;
        this.location = location;
    }

    public CharacterInfo() {
    }

    public void displayCharacterInfo(Weapon weapon){
        System.out.println("Character Details: \nPlayer Name: " + getName() + "\nExperience Level: " + getExpLevel() + "\nSave Location: " + getLocation() + "\nWeapon Name: " + weapon.getWeaponName() + "\nWeapon Type: " + weapon.getWeaponType() +"\n");
    }
}
