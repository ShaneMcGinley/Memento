package Memento;

public class CharacterStateSave implements Originator{

    private String name;
    private int expLevel;
    private Location location;
    private String weaponName;
    private WeaponType weaponType;

    public WeaponType getWeaponType() { return weaponType; }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpLevel() {
        return expLevel;
    }

    public void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CharacterStateSave(String name, int expLevel, Location location, String weaponName, WeaponType weaponType) {
        this.name = name;
        this.expLevel = expLevel;
        this.location = location;
        this.weaponName = weaponName;
        this.weaponType = weaponType;
    }

    @Override
    public Character save(){
        System.out.println("Saving Character Details...\n");
        Character character = new Character(name,expLevel,location,
                weaponName,weaponType);
        return character;
    }

    @Override
    public void restoreToPreviousSave(Character character){
        System.out.println("Getting Last Save / Reversing the save once...\n");
        name = character.getName();
        expLevel = character.getExpLevel();
        location = character.getLocation();
        weaponName = character.getWeaponName();
        weaponType = character.getWeaponType();
    }

    @Override
    public void displayCharacterState(){
        System.out.println("Character Details: \nPlayer Name: " + name
                + "\nExperience Level: " + expLevel + "\nLocation: "
                + location + "\nWeapon Name: " + weaponName
                + "\nWeapon Type: " + weaponType +"\n");
    }
}
