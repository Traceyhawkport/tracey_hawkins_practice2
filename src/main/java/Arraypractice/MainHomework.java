package Arraypractice;

import java.util.Scanner;

public class MainHomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a line of text
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();

        // Split the line into words
        String[] words = line.split("\\W+");

        // Remove any empty or dot characters from the words array
        int count = 0;
        String[] newWords = new String[words.length];
        for (String word : words) {
            if (!word.isEmpty() && !word.equals(".")) {
                newWords[count++] = word;
            }
        }

        // Array to store the word counts
        int[] counts = new int[count];

        // Count the number of times each word occurs
        for (int i = 0; i < count; i++) {
            counts[i] = 1;
            for (int j = i + 1; j < count; j++) {
                if (newWords[i].equalsIgnoreCase(newWords[j])) {
                    counts[i]++;
                    // Set the count of the duplicate word to 0 to avoid double-counting
                    counts[j] = 0;
                }
            }
        }

        // Print the word counts
        for (int i = 0; i < count; i++) {
            if (counts[i] > 0) {
                System.out.printf("\"%s\" occurs %d times%n", newWords[i], counts[i]);
            }
        }
    }
}
