package Memento;

public class SavingCharacter {

    private String nameCopy;
    private String expLevelCopy;
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

    public String getExpLevelCopy() {
        return expLevelCopy;
    }

    public void setExpLevelCopy(String expLevelCopy) {
        this.expLevelCopy = expLevelCopy;
    }

    public String getLocationCopy() {
        return locationCopy;
    }

    public void setLocationCopy(String locationCopy) {
        this.locationCopy = locationCopy;
    }

    public void save(CharacterInfo characterInfo, Weapon weapon){
        System.out.println("Saving Game\n");
        setNameCopy(characterInfo.getName());
        setExpLevelCopy(characterInfo.getExpLevel());
        setLocationCopy(characterInfo.getLocation());
        setWeaponNameCopy(weapon.getWeaponName());
        setWeaponTypeCopy(weapon.getWeaponType());
    }

    public void restoreToPreviousSave(CharacterInfo characterInfo, Weapon weapon){
        System.out.println("Your character has died, reloading the last saved checkpoint.\n");
        characterInfo.setName(nameCopy);
        characterInfo.setExpLevel(expLevelCopy);
        characterInfo.setLocation(locationCopy);
        weapon.setWeaponName(weaponNameCopy);
        weapon.setWeaponType(weaponTypeCopy);
    }

}
