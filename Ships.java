package battleship;

public enum Ships {

    AIRCRAFT_CARRIER("Aircraft Carrier", 5),
    BATTLESHIP("Battleship", 4),
    SUBMARINE("Submarine", 3),
    CRUISER("Cruiser", 3),
    DESTROYER("Destroyer", 2);

    //attributes
    private final String name;
    private final int shipLength;

    //constructor
    Ships(String name, int shipLength) {
        this.name = name;
        this.shipLength = shipLength;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getShipLength() {
        return shipLength;
    }
}
