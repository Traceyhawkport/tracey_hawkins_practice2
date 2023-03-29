package Arraypractice;

public class Main4 {
    public static void main(String[] args) {
        // = is assignment operator assigning value to the variable.
        int[] numbers = {2, 4, 6, 8, 10};

        //Print statement for the value of the first index
        System.out.println("Value of first index: " + numbers[0]);
        //print out the value at the last index using length  - 1 as the index
        int lastIndex = numbers.length - 1;
        System.out.println("Value of the last index: " + numbers[lastIndex]);

        // try {
        //trying to print value at index = length
        //System.out.print("Value at index = length: " + numbers[numbers.length]);

        //catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Exception caught: " + e);
    }

    //try {
    // trying to assign a value to index 5
    // myArray[5] = 12;
    // } catch (ArrayIndexOutOfBoundsException e) {
    //System.out.println("Exception caught: " + e);

}
