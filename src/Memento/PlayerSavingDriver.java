package Memento;

public class PlayerSavingDriver {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        CharacterInfo player1 = new CharacterInfo();
        SavingCharacter savingCharacter = new SavingCharacter();

        player1.setName("Johnny");
        player1.setExpLevel("4");
        player1.setLocation("Reserve");

        weapon.setWeaponName("MP5");
        weapon.setWeaponType(WeaponType.SUBMACHINE_GUN);

        player1.displayCharacterInfo(weapon);

        savingCharacter.save(player1,weapon);

        player1.setName("Johnny");
        player1.setExpLevel("7");
        player1.setLocation("Old Town");
        weapon.setWeaponName("Remington 870");
        weapon.setWeaponType(WeaponType.SHOTGUN);
        player1.displayCharacterInfo(weapon);


        savingCharacter.restoreToPreviousSave(player1,weapon);

        player1.displayCharacterInfo(weapon);

    }
}

