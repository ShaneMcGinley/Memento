package Memento;

public class Character {
    private String name;
    private int expLevel;
    private String location;
    private String weaponName;
    private WeaponType weaponType;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Character(String name, int expLevel, String location, String weaponName, WeaponType weaponType) {
        this.name = name;
        this.expLevel = expLevel;
        this.location = location;
        this.weaponName = weaponName;
        this.weaponType = weaponType;
    }

    public Character() {
    }
}
