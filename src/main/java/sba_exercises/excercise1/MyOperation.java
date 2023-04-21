package sba_exercises.excercise1;

import java.util.ArrayList;

public class MyOperation implements IMyOperations {
    private ArrayList<String> myArrayList;

    public MyOperation() {
        myArrayList = new ArrayList<String>();
    }

    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray) {
        for (String s : stringArray) {
            myArrayList.add(s);
        }
    }

    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index) {
        if (index >= 0 && index < myArrayList.size()) {
            myArrayList.set(index, "new element");
        }
    }

    @Override
    public ArrayList<String> createANewArrayListFromExistingArray() {
        ArrayList<String> newArrayList = new ArrayList<String>(myArrayList);
        return newArrayList;
    }
    public ArrayList<String> getMyArrayList() {
        return myArrayList;

}

}


