package Arraypractice;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};
        //print the length of the array
        System.out.println("Original array length: " + colors.length);
        //make copy of array using clone()
        String[] colorsCopy = colors.clone();
        //verify the original array was copied
        System.out.println("Original array: " + Arrays.toString(colors));
        System.out.println("Copied array: " + Arrays.toString(colorsCopy));
    }
}
