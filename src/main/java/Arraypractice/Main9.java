package Arraypractice;
import java.util.Arrays;
public class Main9 {
    public static void main(String[] args) {
        String[] cities = {"Washington", "Spartanburg", "Duluth", "Landover", "Suitland"};
        //print the original array

        System.out.println(("Original Array:"));
        for (int i = 0; i <cities.length; i++) {
            System.out.print(cities[i] +" ");
        }
        System.out.println();

        // Swap the first element with the middle element
        String temp = cities[0];
        cities[0] = cities[cities.length / 2];
        cities[cities.length / 2] = temp;
        //print modified array
        System.out.println("Modified array:");
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + " ");
        }
        System.out.println();
        }
    }

