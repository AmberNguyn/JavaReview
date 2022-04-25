package ABCCoffeeShop;

import java.util.Date;

public class Drink extends SellingItem{
    public Drink(String itemID, double itemCost, int itemNum, String description, Date sellingDate) {
        super(itemID, itemCost, itemNum, description, sellingDate);
    }

    public Drink() {
    }

    public double getPrice()
    {
        return super.getItemCost() * 1.1;
    }

    @Override
    public String toString()
    {
        String str = "Item ID: " + getItemID() + "\n" +
                "Item cost: " + getItemCost() + "\n" +
                "Item number: " + getItemNum() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Selling date: " + getSellingDate() + "\n" +
                "Drink's price: " + getPrice() + "\n";
        return str;
    }




}
