package ABCCoffeeShop;

import java.util.Date;

public class Other extends SellingItem {
    public Other(String itemID, double itemCost, int itemNum, String description, Date sellingDate) {
        super(itemID, itemCost, itemNum, description, sellingDate);
    }

    public Other() {
    }

    public double getPrice()
    {
        return super.getItemCost() * 1.3;
    }

    @Override
    public String toString()
    {
        String str = "Item ID: " + getItemID() + "\n" +
                "Item cost: " + getItemCost() + "\n" +
                "Item number: " + getItemNum() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Selling date: " + getSellingDate() + "\n" +
                "Other's price: " + getPrice() + "\n";
        return str;
    }

}
