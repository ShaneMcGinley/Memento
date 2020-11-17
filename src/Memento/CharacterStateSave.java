package Memento;

public class CharacterStateSave {

    private String nameCopy;
    private int expLevelCopy;
    private String locationCopy;
    private String weaponNameCopy;
    private WeaponType weaponTypeCopy;

    public String getWeaponNameCopy() {
        return weaponNameCopy;
    }

    public void setWeaponNameCopy(String weaponNameCopy) {
        this.weaponNameCopy = weaponNameCopy;
    }

    public WeaponType getWeaponTypeCopy() {
        return weaponTypeCopy;
    }

    public void setWeaponTypeCopy(WeaponType weaponTypeCopy) {
        this.weaponTypeCopy = weaponTypeCopy;
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

    public void save(CharacterState characterState, Weapon weapon){
        System.out.println("Saving Game\n");
        setNameCopy(characterState.getName());
        setExpLevelCopy(characterState.getExpLevel());
        setLocationCopy(characterState.getLocation());
        setWeaponNameCopy(weapon.getWeaponName());
        setWeaponTypeCopy(weapon.getWeaponType());
    }

    public void restoreToPreviousSave(CharacterState characterState, Weapon weapon){
        System.out.println("Your character has died, reloading the last saved checkpoint.\n");
        characterState.setName(nameCopy);
        characterState.setExpLevel(expLevelCopy);
        characterState.setLocation(locationCopy);
        weapon.setWeaponName(weaponNameCopy);
        weapon.setWeaponType(weaponTypeCopy);
    }

    public void displayCharacterState(CharacterState characterState, Weapon weapon){
        System.out.println("Character Details: \nPlayer Name: " + characterState.getName() + "\nExperience Level: " + characterState.getExpLevel() + "\nSave Location: " + characterState.getLocation() + "\nWeapon Name: " + weapon.getWeaponName() + "\nWeapon Type: " + weapon.getWeaponType() +"\n");
    }

}
