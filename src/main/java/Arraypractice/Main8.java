package Arraypractice;
import java.util.Arrays;
public class Main8 {
    public static void main(String[] args) {
        //Array 5 elements
        int [] numbers = {1, 2, 3, 4, 5};

        //for loop ! skips the middle element?

        for(int i = 0; i < numbers.length; i++)
        if(i != 2){
            //skip the middle element
            System.out.println (numbers[i]);
        }
}
}