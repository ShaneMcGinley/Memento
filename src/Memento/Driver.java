package Memento;

public class Driver {
    public static void main(String[] args) {

        // Creating new instances
        CharacterStateSave characterStateSave = new CharacterStateSave("Johnny",
                1,Location.WINTERFELL,"MP5",WeaponType.SUBMACHINE_GUN);
        CharacterCaretaker characterCaretaker = new CharacterCaretaker();

        // Updating the values via the setters
        characterStateSave.setName("Johnny");
        characterStateSave.setExpLevel(1);
        characterStateSave.setLocation(Location.WINTERFELL);
        characterStateSave.setWeaponName("MP5");
        characterStateSave.setWeaponType(WeaponType.SUBMACHINE_GUN);

        /* pushes the characterStateSave's save method into the deque (stack)*/
        characterCaretaker.addSave(characterStateSave.save());

        characterStateSave.displayCharacterState();

        // adding it to the stack.
        // displaying current details.
        // Updating character details in the save class.
        characterStateSave.setName("Johnny");
        characterStateSave.setExpLevel(2);
        characterStateSave.setLocation(Location.KINGS_LANDING);
        characterStateSave.setWeaponName("Remington 870");
        characterStateSave.setWeaponType(WeaponType.SHOTGUN);

        // same as above..
        characterCaretaker.addSave(characterStateSave.save());
        characterStateSave.displayCharacterState();

        characterStateSave.setExpLevel(3);
        characterStateSave.setLocation(Location.WINTERHOLD);

        characterCaretaker.addSave(characterStateSave.save());
        characterStateSave.displayCharacterState();

        characterStateSave.restoreToPreviousSave(characterCaretaker.getSave());

        characterStateSave.displayCharacterState();

        characterStateSave.restoreToPreviousSave(characterCaretaker.getSave());

        characterStateSave.displayCharacterState();

        characterStateSave.restoreToPreviousSave(characterCaretaker.getSave());

        characterStateSave.displayCharacterState();
    }
}


