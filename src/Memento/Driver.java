package Memento;

public class Driver {
    public static void main(String[] args) {

        Character player1 = new Character();
        CharacterStateSave characterStateSave = new CharacterStateSave();
        WeaponType weaponType = new WeaponType();
        Location location = new Location();

        player1.setName("Johnny");
        player1.setExpLevel(4);
        player1.setLocation(location.WF);
        player1.setWeaponName("MP5");
        player1.setWeaponType(weaponType.SUBMACHINEGUN);

        characterStateSave.displayCharacterState(player1);

        characterStateSave.save(player1);

        player1.setName("Johnny");
        player1.setExpLevel(7);
        player1.setLocation(location.KL);
        player1.setWeaponName("Remington 870");
        player1.setWeaponType(weaponType.SHOTGUN);

        characterStateSave.displayCharacterState(player1);

        characterStateSave.restoreToPreviousSave(player1);

        characterStateSave.displayCharacterState(player1);

    }
}

