package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("---------Testing reading sample.txt----------");
        //using the printf() method to display formatted output to the console.
        System.out.printf("%-20s%-20s%-10s%-10s%n", "Name", "Description", "Price", "Quantity Available");
        //The format string "%-20s%-20s%-10s%-10s%n" is used to specify the layout of the output.
        //% indicates that there is  a value at that position in the output. 20 and 10 are width specifiers
        //s is a conversion specifier that indicates the corresponding value is a string.
        try {
            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split("  "); // Two spaces as delimiter
                if (items.length == 4) {
                    String itemName = items[0];
                    String itemDescription = items[1];
                    double price = Double.parseDouble(items[2]);
                    int quantity = Integer.parseInt(items[3]);


                    System.out.printf("%-20s%-20s%-10.2f%-10d%n", itemName, itemDescription, price, quantity);
                } else {
                    System.out.println("Error: Invalid line format - " + line);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Propagating FileNotFoundException to default exception handler
            throw new RuntimeException(e);

        }
    }
}