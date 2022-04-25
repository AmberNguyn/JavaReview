package ABCCoffeeShop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CoffeeShopDemo {
    public static void main(String[] args) {
        List<SellingItem> ItemsList = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter item ID: ");
            String itemID = keyboard.nextLine();





            System.out.println("Enter item cost: ");
            double itemCost = keyboard.nextDouble();
            System.out.println("Enter number of items: ");
            int itemNum = keyboard.nextInt();
            System.out.println("Enter description: ");
            String description = keyboard.nextLine();

            SellingItem item = new SellingItem(itemID, itemCost, itemNum, description, new Date());

            System.out.println("Do you want to add more item? Press 0 to end.");
            choice = keyboard.nextInt();
        }
        while (choice == 0);

    }
}
