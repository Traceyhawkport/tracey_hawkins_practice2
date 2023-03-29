package Arraypractice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MainHomework {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);

                // Read a line of text
                System.out.print("Enter a line of text: ");
                String line = scanner.nextLine();

                // Split the line into words
                String[] words = line.split("\\W+");

                // HashMap to keep track of the number of times each word occurs
                Map<String, Integer> wordCounts = new HashMap<>();
                for (String word : words) {
                    if (!word.isEmpty() && !word.equals(".")) {
                        Integer count = wordCounts.get(word);
                        if (count == null) {
                            count = 0;
                        }
                        wordCounts.put(word, count + 1);
                    }
                }

                // Print the word counts
                System.out.println("Word counts:");
                for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                    System.out.printf("\"%s\" occurs %d times%n", entry.getKey(), entry.getValue());
                }
            }
        }



