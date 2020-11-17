package Memento;

public class CharacterState {
    private String name;
    private int expLevel;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpLevel() {
        return expLevel;
    }

    public void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CharacterState(String name, int expLevel, String location) {
        this.name = name;
        this.expLevel = expLevel;
        this.location = location;
    }

    public CharacterState() {
    }
}
