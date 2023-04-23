package sba_exercises.EXCERCISE;


public class main {

    public static void main(String[] args) {
        MySystem system = new MySystem();

        // Test removeItem method
        System.out.println("----------- Testing removeItem(..) method -----");
        Item removedItem = system.removeItem("kelp rings");
        System.out.println("Removed item: " + removedItem);
        System.out.println("Remaining items:");
        for (Item item : system.getMyItemsInHashMap().values()) {
            System.out.println(item);
        }

        // Test reduceAvailableQuantity method
        System.out.println("----------- Testing reduceAvailableQuantity(..) method -----");
        Item reducedItem1 = system.reduceAvailableQuantity("kelp rings");

        // object instance of MySystem
        //System.out.println("---------Galley Grub----------");
        // using the printf() method to display formatted output to the console.
        // System.out.printf("%-20s%-20s%-10s%-10s%n", "Name", "Description", "Price", "Quantity Available");
        // The format string "%-20s%-20s%-10s%-10s%n" is used to specify the layout of the output.
        // % indicates that there is a value at that position in the output. 20 and 10 are width specifiers
        // s is a conversion specifier that indicates the corresponding value is a string.
    }
}
