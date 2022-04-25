package seaportManagementSystem;


public class SeaportManagementDemo {
    public static void main(String[] args) {
        Ship[] shipArray = new Ship[5];

        shipArray[0] = new CargoShip("Sunny", 1980, 110);
        shipArray[1] = new Ship("Cloudy", 1989);
        shipArray[2] = new CargoShip("Windy", 1966, 200);
        shipArray[3] = new CruiseShip("Snowy", 2000, 500);
        shipArray[4] = new Ship("Stormy", 2009);


        for (Ship ship : shipArray
        ) {
            System.out.println(ship);
        }

    }


}
