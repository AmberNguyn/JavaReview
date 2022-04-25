package ABCCoffeeShop;

import java.util.Date;

public class Food extends SellingItem{
    public Food(String itemID, double itemCost, int itemNum, String description, Date sellingDate) {
        super(itemID, itemCost, itemNum, description, sellingDate);
    }

    public Food() {
    }

    public double getPrice()
    {
        return super.getItemCost() * 1.2;
    }

    @Override
    public String toString()
    {
        String str = "Item ID: " + getItemID() + "\n" +
                "Item cost: " + getItemCost() + "\n" +
                "Item number: " + getItemNum() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Selling date: " + getSellingDate() + "\n" +
                "Food's price: " + getPrice() + "\n";
        return str;
    }

}
