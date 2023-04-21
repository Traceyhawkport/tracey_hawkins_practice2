package sba_exercises.excercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] myStringArrayTestValue = {"life", "is", "worth", "living", "with", "passion"};
        MyOperation myOperation = new MyOperation();
        myOperation.convertStringArrayIntoArrayList(myStringArrayTestValue);
    }


    // Print out the contents of myArrayList to verify that it contains the correct String objects
    ArrayList<String> myArrayList = myOperation.getMyArrayList();
    System.out.println("myArrayList: " + myArrayList);
}

