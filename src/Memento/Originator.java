package Memento;

public interface Originator {
    public Character save();
    public void restoreToPreviousSave(Character character);
    public void displayCharacterState();
}
