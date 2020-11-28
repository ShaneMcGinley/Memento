package Memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class CharacterCaretaker {
    Deque<Character> saves = new ArrayDeque<>();

    public Character getSave() {
        return saves.pop();
    }

    public void addSave(Character character) {
        saves.push(character);
    }
}
