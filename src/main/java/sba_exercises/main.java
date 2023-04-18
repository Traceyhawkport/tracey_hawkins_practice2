package sba_exercises;

import java.util.Map;

public class main {

    public static void main(String[] args) {
        System.out.println("----------- Testing the constructor of MySystem class -----");
        //object instance of MySystem
        MySystem mySystem = new MySystem();

        for (Item item : mySystem.getMyItemsInHashMap().values()) {
            String itemName = String.format("%-20s", item.getItemName());
            String itemDescription = String.format("%-20s", item.getItemDescription());
            String price = String.format("%-10.2f", item.getPrice());
            String availableQuantity = String.format("%-10d", item.getAvailableQuantity());
            System.out.printf(itemName + itemDescription + price + availableQuantity);
        }

        for (Map.Entry<String, Item> entry : mySystem.getMyItemsInHashMap().entrySet()) {
            Item item = entry.getValue();
            System.out.printf("%-20s%-20s%-10.2f%-10d%n", item.getItemName(), item.getItemDescription(),
                    item.getPrice(), item.getAvailableQuantity());
        }


        //System.out.println("---------Galley Grub----------");
        //using the printf() method to display formatted output to the console.
        //System.out.printf("%-20s%-20s%-10s%-10s%n", "Name", "Description", "Price", "Quantity Available");
        //The format string "%-20s%-20s%-10s%-10s%n" is used to specify the layout of the output.
        //% indicates that there is  a value at that position in the output. 20 and 10 are width specifiers
        //s is a conversion specifier that indicates the corresponding value is a string.


    }
    }


