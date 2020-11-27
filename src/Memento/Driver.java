package Memento;

public class Driver {
    public static void main(String[] args) {

        // Creating new instances
        CharacterStateSave characterStateSave = new CharacterStateSave();
        WeaponType weaponType = new WeaponType();
        Location location = new Location();

        // Setting the initial values - setters
        characterStateSave.setNameCopy("Johnny");
        characterStateSave.setExpLevelCopy(1);
        characterStateSave.setLocationCopy(location.WF);
        characterStateSave.setWeaponNameCopy("MP5");
        characterStateSave.setWeaponTypeCopy(weaponType.SUBMACHINEGUN);

        // Creating new Character variable.
        // letting it equal save method - creates new Character instance and passes its variables.
        Character player1 = characterStateSave.save();
        // adding it to the stack.
        characterStateSave.addSave(player1);
        // displaying current details in character.
        characterStateSave.displayCharacterState(player1);

        // Updating character details in the save class.
        characterStateSave.setNameCopy("Johnny");
        characterStateSave.setExpLevelCopy(2);
        characterStateSave.setLocationCopy(location.KL);
        characterStateSave.setWeaponNameCopy("Remington 870");
        characterStateSave.setWeaponTypeCopy(weaponType.SHOTGUN);

        // same as above..
        player1 = characterStateSave.save();
        characterStateSave.addSave(player1);
        characterStateSave.displayCharacterState(player1);

        characterStateSave.setExpLevelCopy(3);
        characterStateSave.setLocationCopy(location.WHD);

        player1 = characterStateSave.save();
        characterStateSave.addSave(player1);
        characterStateSave.displayCharacterState(player1);

        player1 = characterStateSave.getSave();

        characterStateSave.restoreToPreviousSave(player1);

        characterStateSave.displayCharacterState(player1);

        player1 = characterStateSave.getSave();

        characterStateSave.restoreToPreviousSave(player1);

        characterStateSave.displayCharacterState(player1);

        player1 = characterStateSave.getSave();
        characterStateSave.restoreToPreviousSave(player1);
        characterStateSave.displayCharacterState(player1);
    }
}

