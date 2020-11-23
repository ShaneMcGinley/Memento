package Memento;

public class CharacterStateSave {

    private String nameCopy;
    private int expLevelCopy;
    private String locationCopy;
    private String weaponNameCopy;
    private String weaponType;

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
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

    public void save(Character character){
        System.out.println("Saving Game\n");
        setNameCopy(character.getName());
        setExpLevelCopy(character.getExpLevel());
        setLocationCopy(character.getLocation());
        setWeaponNameCopy(character.getWeaponName());
        setWeaponType(character.getWeaponType());
    }

    public void saveCharacterState(Character character){
        System.out.println("Saving Current Character State\n");
        setNameCopy(character.getName());
        setExpLevelCopy(character.getExpLevel());
        setLocationCopy(character.getLocation());
        setWeaponNameCopy(character.getWeaponName());
        setWeaponType(character.getWeaponType());
    }

    public void restoreToPreviousSave(Character character){
        System.out.println("Your character has died, reloading the last saved checkpoint.\n");
        character.setName(nameCopy);
        character.setExpLevel(expLevelCopy);
        character.setLocation(locationCopy);
        character.setWeaponName(weaponNameCopy);
        character.setWeaponType(weaponType);
    }

    public void displayCharacterState(Character character){
        System.out.println("Character Details: \nPlayer Name: " + character.getName()
                + "\nExperience Level: " + character.getExpLevel() + "\nSave Location: "
                + character.getLocation() + "\nWeapon Name: " + character.getWeaponName()
                + "\nWeapon Type: " + character.getWeaponType() +"\n");
    }
}
