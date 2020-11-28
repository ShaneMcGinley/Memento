package Memento;

public class Character implements Memento{
    private String name;
    private int expLevel;
    private Location location;
    private String weaponName;
    private WeaponType weaponType;

    public WeaponType getWeaponType() { return weaponType; }

    public void setWeaponType(WeaponType weaponType) { this.weaponType = weaponType; }

    public String getName() { return name; }

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

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public Character(String name, int expLevel, Location location, String weaponName, WeaponType weaponType) {
        this.name = name;
        this.expLevel = expLevel;
        this.location = location;
        this.weaponName = weaponName;
        this.weaponType = weaponType;
    }

    public Character() {
    }
}
