import Memento.CharacterCaretaker;
import Memento.CharacterStateSave;
import Memento.Location;
import Memento.WeaponType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class CharacterStateTest {
    @Test
    public void testOutputBeforeSave(){
        String expectedOutput = "Character Details: \n" +
                "Player Name: Johnny\n" +
                "Experience Level: 1\n" +
                "Location: Windhelm\n" +
                "Weapon Name: MP5\n" +
                "Weapon Type: Submachine Gun\n\r\n";

        CharacterStateSave characterStateSave = new CharacterStateSave("Johnny",1,
                Location.WINDHELM,"MP5",WeaponType.SUBMACHINE_GUN);

        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));

        characterStateSave.displayCharacterState();

        Assertions.assertEquals(expectedOutput,actualOutput.toString());
    }

    @Test
    public void testSaveAndRestore(){
        String expectedOutput = "Saving Character Details...\n\r\n";

        expectedOutput += "Character Details: \n" +
                "Player Name: Johnny\n" +
                "Experience Level: 1\n" +
                "Location: Winterfell\n" +
                "Weapon Name: MP5\n" +
                "Weapon Type: Submachine Gun\n\r\n";

        expectedOutput += "Character Details: \n" +
                "Player Name: Johnny\n" +
                "Experience Level: 2\n" +
                "Location: King's Landing\n" +
                "Weapon Name: Remington 870\n" +
                "Weapon Type: Shotgun\n\r\n";


        expectedOutput += "Getting Last Save / Reversing the save once...\n\r\n";

        expectedOutput += "Character Details: \n" +
                "Player Name: Johnny\n" +
                "Experience Level: 1\n" +
                "Location: Winterfell\n" +
                "Weapon Name: MP5\n" +
                "Weapon Type: Submachine Gun\n\r\n";

        CharacterStateSave characterStateSave = new CharacterStateSave("Johnny",
                1,Location.WINTERFELL,"MP5",WeaponType.SUBMACHINE_GUN);
        CharacterCaretaker characterCaretaker = new CharacterCaretaker();

        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        characterCaretaker.addSave(characterStateSave.save());

        characterStateSave.displayCharacterState();

        characterStateSave.setName("Johnny");
        characterStateSave.setExpLevel(2);
        characterStateSave.setLocation(Location.KINGS_LANDING);
        characterStateSave.setWeaponName("Remington 870");
        characterStateSave.setWeaponType(WeaponType.SHOTGUN);

        characterStateSave.displayCharacterState();

        characterStateSave.restoreToPreviousSave(characterCaretaker.getSave());

        characterStateSave.displayCharacterState();

        Assertions.assertEquals(expectedOutput,actualOutput.toString());
    }
}
