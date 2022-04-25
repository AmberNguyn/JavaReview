package smartphone;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class SmartPhoneManagement {
    Map<String, SmartPhone> PhoneList = new HashMap<>();


    public SmartPhoneManagement() { // This default constructor is used for easier testing
        PhoneList = new HashMap<>();
        SmartPhone initialP1 = new SmartPhone("4131",  // phone 1
                "China",
                35,
                "25 Dec",
                "iPhone 7 max option"),
                initialP2 = new SmartPhone("4121", // phone 2
                        "Vie",
                        40,
                        "24 Arp",
                        "iPhone 8 max option"),
                initialP3 = new SmartPhone("3121", // phone 3
                        "Vie",
                        45,
                        "01 Jan",
                        "iPhone X max option"),
                initialP4 = new SmartPhone("1121", // phone 4
                        "Vie",
                        105,
                        "15 May",
                        "iPhone 12 max option");

        PhoneList.put(initialP1.getPhoneID(), initialP1);
        PhoneList.put(initialP2.getPhoneID(), initialP2);
        PhoneList.put(initialP3.getPhoneID(), initialP3);
        PhoneList.put(initialP4.getPhoneID(), initialP4);
    }

    //Add phone -> ask for input then put smart phone into PhoneList
    public void add() {
        Scanner keyboard = new Scanner(System.in);
        SmartPhone newPhone = new SmartPhone();
        System.out.println("Enter phone ID: ");
        newPhone.setPhoneID(keyboard.nextLine());
        System.out.println("Enter manufacturer: ");
        newPhone.setManufacturer(keyboard.nextLine());
        System.out.println("Enter created date: ");
        newPhone.setCreatedDate(keyboard.nextLine());
        System.out.println("Enter description: ");
        newPhone.setDescription(keyboard.nextLine());
        System.out.println("Enter price: ");
        newPhone.setPrice(keyboard.nextDouble());

        PhoneList.put(newPhone.getPhoneID(), newPhone);

    }

    // User type phone ID -> delete
    public void delete() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ENTER THE PHONE ID YOU WANT TO DELETE:");
        String search = keyboard.nextLine();

        if (PhoneList.containsKey(search)) {
            System.out.println("FOUND...DELETED...");
            PhoneList.remove(search);
        } else {
            System.out.println("WE CAN NOT FIND YOUR PHONE ID");
        }

    }

    //Show the list of all smartphone in the list
    public void showPhones() {
        PhoneList.forEach((key, value) -> System.out.println(value));
    }

    //Sort the list of smartphones by price
    public void sortPhones() {
        TreeMap<String, SmartPhone> PhoneListSortedByPrice = new TreeMap<>(PhoneList);
        System.out.println("===== THE SORTED LIST OF PHONES =====");
        PhoneListSortedByPrice.forEach((key, value) -> System.out.println(value));
    }

    //Search phone by ID
    public void searchPhone() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the phone ID you want to search: ");
        String search = keyboard.nextLine();
        if (PhoneList.containsKey(search)) {
            System.out.println("===== THIS IS THE INFORMATION OF THE PHONE ID: " + search + " =====");
            System.out.println(PhoneList.get(search));
        } else {
            System.out.println("===== CAN NOT FIND THIS PHONE INFORMATION =====");
        }
    }

    // Search smartphone by min price and max price;
    public void searchByPrice() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the minimum price: ");
        double minPrice = keyboard.nextDouble();
        System.out.println("Enter the maximum price: ");
        double maxPrice = keyboard.nextDouble();


        System.out.println("==== THE PHONE LIST FROM MIN PRICE TO MAX PRICE =====");
        PhoneList.forEach((key, value) ->
                {
                    if (value.getPrice() >= minPrice && value.getPrice() <= maxPrice) {
                        System.out.println(value);
                    }
                }
        );


    }

    // Search phones by manufacturer
    public void searchByManufacturer() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the manufacturer you want to search: ");
        String search = keyboard.nextLine();

        PhoneList.forEach((key, value) -> {
            if (value.getManufacturer().equalsIgnoreCase(search)) {
                System.out.println("===== FOUND =====");
                System.out.println(value);
            }

        });
    }


    //show Menu
    public void start() {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== CHOOSE A NUMBER: =====");
            System.out.println("1. Add smart phone");
            System.out.println("2. Delete smart phone");
            System.out.println("3. View the list of all smart phones");
            System.out.println("4. Sort the list of smart phones by price");
            System.out.println("5. Search smart phone by ID");
            System.out.println("6. Search smart phone by min price and max price");
            System.out.println("7. List of smart phones by manufacturer");
            System.out.println("8. Exit");
            System.out.println();
            System.out.println("ENTER YOUR NUMBER: ");
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    showPhones();
                    break;
                case 4:
                    sortPhones();
                    break;
                case 5:
                    searchPhone();
                    break;
                case 6:
                    searchByPrice();
                    break;
                case 7:
                    searchByManufacturer();
                    break;
                case 8:
                    System.out.println("Quit Program");
                    break;
                default:
                    System.out.println("Invalid input. Please enter again.");
            }

        } while (choice != 8);
    }
}
