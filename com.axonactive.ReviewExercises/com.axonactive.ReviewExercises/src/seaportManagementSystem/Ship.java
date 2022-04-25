package seaportManagementSystem;

public class Ship {
    private String shipName;
    private int year;

    public Ship(String shipName, int year) {
        this.shipName = shipName;
        this.year = year;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString()
    {
        String str = "Ship's name: " + shipName + "\n" +
                "Built year: " + year + "\n";
        return str;
    }
}
