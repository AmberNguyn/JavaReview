package seaportManagementSystem;

public class CruiseShip extends Ship {
    private int max_passengers;

    public CruiseShip(String shipName, int year, int max_passengers) {
        super(shipName, year);
        this.max_passengers = max_passengers;
    }

    public CruiseShip(String shipName, int year) {
        super(shipName, year);
    }

    public int getMax_passengers() {
        return max_passengers;
    }

    public void setMax_passengers(int max_passengers) {
        this.max_passengers = max_passengers;
    }

    @Override
    public String toString()
    {
        String str = "Ship's name: " + getShipName() + "\n" +
                "Maximum passengers: " + max_passengers + "\n";
        return str;
    }
}
