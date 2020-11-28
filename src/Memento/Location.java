package Memento;

public enum Location {
    WINTERHOLD,
    WINDHELM,
    WHITERUN,
    KINGS_LANDING,
    WINTERFELD;

    @Override
    public String toString(){
        switch(this) {
            case WINTERHOLD:
                return "Winterhold";
            case WINDHELM:
                return "Windhelm";
            case WHITERUN:
                return "Whiterun";
            case KINGS_LANDING:
                return "King's Landing";
            case WINTERFELD:
                return "Winterfell";
            default:
                return "Winterhold";
        }
    }
}
