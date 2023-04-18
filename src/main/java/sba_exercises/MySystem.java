package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySystem {

    private Map<String, Item> myItemsInHashMap;
    private String itemType;

    public MySystem() {
        this.myItemsInHashMap = new HashMap<>();

        File file = new File("sample.txt"); //used to read sample text file
        Scanner scanner = null;//Scanner object is created here
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        //code then reads each line from the file using the scanner.nextLine() method
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //splits each line into an array of strings using the split() method,
            // where each element in the array corresponds to a different attribute of the Item class.
            String[] parts = line.split("  ");
            //extracts the relevant information to create new Item object
            String itemName = parts[0];
            String itemDescription = parts[1];
            Double price = Double.parseDouble(parts[2]);
            Integer availableQuantity = Integer.parseInt(parts[3]);
            Item item = new Item(itemName, itemDescription, price, availableQuantity);//new item object
            assert myItemsInHashMap != null;
            myItemsInHashMap.put(itemName, item); //item object added to hashmap
        }
        scanner.close();
    }


    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }
}






