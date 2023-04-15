package HashMapExcercise;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap<String, ItemCollection> ItemCollectionMap = new HashMap<>();

        ItemCollection IC1 = new ItemCollection
                ("Water Bottles", "Pink", 9.99, 100);
        ItemCollection IC2 = new ItemCollection
                ("Drinking Cups", "Red", 19.99, 89);

        // Add key/value pairs to the Map
        ItemCollectionMap.put(IC1.getName(), IC1);
        ItemCollectionMap.put(IC2.getName(), IC2);
// Get the size of the Map

        int mapSize = ItemCollectionMap.size();
        System.out.println("Size of the Map: " + mapSize);
// Get one of the key/value pair using Item's name
        String itemName = "IC1";
        ItemCollection itemCollection = ItemCollectionMap.get(itemName);
        System.out.println("Item with name " + itemName + ": " + IC1);

        // Remove one of the key/value pair using Item's name
        ItemCollectionMap.remove(itemName);

        // Get the size of the Map after removal
        mapSize = ItemCollectionMap.size();
        System.out.println("Size of the Map after removal: " + mapSize);


        // Get the key set and display them
        System.out.println("Key Set: " + ItemCollectionMap.keySet());

        // Get the value collection and display them
        System.out.println("Value Collection: " + ItemCollectionMap.values());
    }
    }


