package ABCCoffeeShop;

import java.util.Date;

public class SellingItem {
    private String itemID;
    private double itemCost;
    private int itemNum;
    private String description;
    private Date sellingDate;


    public SellingItem(String itemID, double itemCost, int itemNum, String description, Date sellingDate) {
        setItemID(itemID);
        setItemCost(itemCost);
        setItemNum(itemNum);
        this.description = description;
        this.sellingDate = sellingDate;
    }

    public SellingItem() {
    }


    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        char[] itemIDArray = itemID.toCharArray();
        if (itemIDArray.length == 7) {
            if (Character.isLetter(itemIDArray[0]) && Character.isLetter(itemIDArray[1]) &&
                    itemIDArray[2] == '-' && Character.isDigit(itemIDArray[3])
                    && Character.isDigit(itemIDArray[4]) && Character.isDigit(itemIDArray[5])
                    && Character.isDigit(itemIDArray[6])
            ) {
                this.itemID = itemID;
            } else {
                System.out.println("Invalid input. Please run the program and type again.");
            }
        } else {
            System.out.println("Invalid input. Please run the program and type again.");
        }

    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        if (itemCost <= 0)
        {
            System.out.println("Invalid input. Please run the program and type it again.");
        }
        else
        {
            this.itemCost = itemCost;
        }
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        if (itemNum <= 20 && itemNum >=1)
        {
            this.itemNum = itemNum;
        }
        else
        {
            System.out.println("Invalid input. Please run the program and type it again.");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(Date sellingDate) {
        this.sellingDate = sellingDate;
    }

    //    public double getPrice(){
//
//    }


    public String toString() {
        String str = "Item ID: " + itemID + "\n" +
                "Item cost: " + itemCost + "\n" +
                "Item number: " + itemNum + "\n" +
                "Description: " + description + "\n" +
                "Selling date: " + sellingDate + "\n";
        return str;
    }
}
