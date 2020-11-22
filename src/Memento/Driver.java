package Memento;

public class Driver {
    public static void main(String[] args) {

        Character player1 = new Character();
        CharacterStateSave characterStateSave = new CharacterStateSave();

        player1.setName("Johnny");
        player1.setExpLevel(4);
        player1.setLocation("Reserve");
        player1.setWeaponName("MP5");
        player1.setWeaponType(WeaponType.SUBMACHINE_GUN);

        characterStateSave.displayCharacterState(player1,"",0,
                "","","");

        characterStateSave.save(player1);

        player1.setName("Johnny");
        player1.setExpLevel(7);
        player1.setLocation("Old Town");
        player1.setWeaponName("Remington 870");
        player1.setWeaponType(WeaponType.SHOTGUN);

        characterStateSave.displayCharacterState(player1,"",0,
                "","","");

        characterStateSave.restoreToPreviousSave(player1);

        characterStateSave.displayCharacterState(player1,"",0,
                "","","");

    }
}

