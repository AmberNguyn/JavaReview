package seaportManagementSystem;

public class CargoShip extends Ship{
    private int cargo_capacity;

    public CargoShip(String shipName, int year) {
        super(shipName, year);
    }

    public CargoShip(String shipName, int year, int cargo_capacity) {
        super(shipName, year);
        this.cargo_capacity = cargo_capacity;
    }

    public int getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    @Override
    public String toString()
    {
        String str = "Ship's name: " + getShipName() + "\n" +
                "Ship's cargo capacity: " + cargo_capacity + "\n";
        return str;
    }
}
