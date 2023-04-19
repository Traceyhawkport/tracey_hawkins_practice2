package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import sba_exercises.Item;

public class MySystem {

    private static Map<String, Item> myItemsInHashMap;

    public MySystem() {
        this.myItemsInHashMap = new HashMap<>();

        // Read items from file and add them to the map
        File file = new File("sample.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("  ");
            String itemName = parts[0];
            String itemDescription = parts[1];
            Double price = Double.parseDouble(parts[2]);
            Integer availableQuantity = Integer.parseInt(parts[3]);
            Item item = new Item(itemName, itemDescription, price, availableQuantity);
            myItemsInHashMap.put(itemName, item);
        }

        scanner.close();

        // Add additional items to the map
        Item item1 = new Item("single krabby patty", "krabby patty", 1.25, 3);
        Item item2 = new Item("double krabby patty", "krabby patty", 1.50, 12);
        Item item3 = new Item("kelp rings", "salty sauce", 1.50, 5);
        Item item4 = new Item("kelp shake", "large", 1.25, 10);

        myItemsInHashMap.put("single", item1);
        myItemsInHashMap.put("double", item2);
        myItemsInHashMap.put("kelp rings", item3);
        myItemsInHashMap.put("kelp shake", item4);
    }

    public Item removeItem(String itemName) {
        if (myItemsInHashMap.containsKey(itemName)) {
            return myItemsInHashMap.remove(itemName);
        } else {
            return null;
        }
    }

    public Item reduceAvailableQuantity(String itemName) {
        Item item = myItemsInHashMap.get(itemName);
        if (item != null) {
            int newQuantity = item.getAvailableQuantity() - 1;
            if (newQuantity <= 0) {
                myItemsInHashMap.remove(itemName);
            } else {
                item.setAvailableQuantity(newQuantity);
            }
            return item;
        } else {
            return null;
        }
    }
    public static Map<String, Item> getMyItemsInHashMap() {
        if (myItemsInHashMap == null) {
            myItemsInHashMap = new HashMap<String, Item>();
        }
        return myItemsInHashMap;
    }

    public static void addItem(Item newItem) {
        myItemsInHashMap.put(newItem.getName(), newItem);

    }

    //public static Item removeItem(String itemName) {
        //return myItemsInHashMap.remove(itemName);
    }

