package Arraypractice;
import java.util.Arrays;
public class Main7 {
    public static void main(String[] args) {
        //create array with 5 elements
        int[] numbers = {3, 6, 9, 12, 15};
        //(for loop) loop through array and assign value of the loop control variable *2
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] *2;
        }
            //Print Array to check values

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
        }


    }
}

