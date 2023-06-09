package sba_exercises.exercise2;

public class Main {
    public static void main(String[] args) {
        int[] myNumberArray = {23,12,33,47};
        double average = calculateAverage(myNumberArray);
        System.out.printf("The average of the numbers is: %.2f", average);
    }

    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}
