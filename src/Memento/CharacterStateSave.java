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

    public void save(Character character){
        System.out.println("Saving Game\n");
        setNameCopy(character.getName());
        setExpLevelCopy(character.getExpLevel());
        setLocationCopy(character.getLocation());
        setWeaponNameCopy(character.getWeaponName());
        setWeaponTypeCopy(character.getWeaponType());
    }

    public void saveCharacterState(Character character){
        System.out.println("Saving Current Character State\n");
        setNameCopy(character.getName());
        setExpLevelCopy(character.getExpLevel());
        setLocationCopy(character.getLocation());
        setWeaponNameCopy(character.getWeaponName());
        setWeaponTypeCopy(character.getWeaponType());
    }

    public void restoreToPreviousSave(Character character){
        System.out.println("Your character has died, reloading the last saved checkpoint.\n");
        character.setName(nameCopy);
        character.setExpLevel(expLevelCopy);
        character.setLocation(locationCopy);
        character.setWeaponName(weaponNameCopy);
        character.setWeaponType(weaponTypeCopy);
    }

    public void displayCharacterState(Character character,String name, int expLevel,
                                      String location, String weaponName, String weaponType){
        System.out.println("Character Details: \nPlayer Name: " + character.getName()
                + "\nExperience Level: " + character.getExpLevel() + "\nSave Location: "
                + character.getLocation() + "\nWeapon Name: " + character.getWeaponName()
                + "\nWeapon Type: " + character.getWeaponType() +"\n");
    }
}
