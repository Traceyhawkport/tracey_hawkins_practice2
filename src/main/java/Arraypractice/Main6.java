package Arraypractice;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        //create integer array with a length of 5
        int[] myIntArrays = {1, 2, 3, 4, 5};
        //next loop through the array with variable i and then multiplied by 2
        for (int i = 0; i < myIntArrays.length; i++) {
            myIntArrays[i] = i * 2;
        }
        //loop through each array and print out each element
        for (int i = 0; i < myIntArrays.length; i++){
            System.out.println("myIntArrays["+ i + "] = " + myIntArrays[i]);
        }
    }
}