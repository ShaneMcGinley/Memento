package Memento;

public class Driver {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        CharacterState player1 = new CharacterState();
        CharacterStateSave characterStateSave = new CharacterStateSave();

        player1.setName("Johnny");
        player1.setExpLevel(4);
        player1.setLocation("Reserve");

        weapon.setWeaponName("MP5");
        weapon.setWeaponType(WeaponType.SUBMACHINE_GUN);

        characterStateSave.displayCharacterState(player1, weapon);

        characterStateSave.save(player1,weapon);

        player1.setName("Johnny");
        player1.setExpLevel(7);
        player1.setLocation("Old Town");
        weapon.setWeaponName("Remington 870");
        weapon.setWeaponType(WeaponType.SHOTGUN);
        characterStateSave.displayCharacterState(player1, weapon);

        characterStateSave.restoreToPreviousSave(player1,weapon);

        characterStateSave.displayCharacterState(player1, weapon);

    }
}

