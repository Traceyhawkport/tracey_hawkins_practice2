package Arraypractice;

import java.util.Scanner;


import java.util.Arrays;

public class Main12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //question at beginning of program

        System.out.print("How many favorite things do you have? ");
        int numFavorites = input.nextInt();
        input.nextLine(); // consume newline character

        String[] favorites = new String[numFavorites];
        //user input
        for (int i = 0; i < numFavorites; i++) {
            System.out.print("Enter favorite #" + (i + 1) + ": "); //for loop
            favorites[i] = input.nextLine();
        }
        //after user input
        System.out.println("Your favorite things are:");
        for (String favorite : favorites) {
            System.out.println("- " + favorite);
        }
    }
}


