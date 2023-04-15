package Arraypractice;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {


        int[] numbers = {4, 2, 9, 13, 1, 0};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.print("Array in ascending order: ");
        //for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Print the smallest and largest element of the array
        System.out.println("The smallest number is " + numbers[0]);//first or smallest element(array)
        System.out.println("The biggest number is " + numbers[numbers.length - 1]);//last or largest(array)
    }
}

