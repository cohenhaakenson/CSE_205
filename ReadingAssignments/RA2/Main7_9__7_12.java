package ReadingAssignments.RA2;

import java.util.Arrays;
import java.util.Scanner;

public class Main7_9__7_12 {

    public static void main(String[] args) {

        // CH7_9_3Main(args);
        // Ch7_9_4Main(args);

    }


    /*
     * Chapter 7 Challenge 7.9.6
     * 
     */
    public static void Ch7_9_6Main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int values[] = new int[length];
        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }
        int numMatches = 0;

        /* Count the number of matches here */
        for (int n : values) {
            if (n > 0) {
                numMatches++;
            }
        }

        int[] matches = new int[numMatches];

        /* Adapt the algorithm here */
        int count = 0;
        for (int n : values) {
            if (n > 0) {
                matches[count] = n;
                count++;
            }
        }

        System.out.println(Arrays.toString(matches));
    }

    /*
     * Chapter 7 Challenge 7.9.5
     * The program below uses the element separators algorithm in the
     * "Common Array Algorithms" section to print all elements of an array,
     * separated by vertical bars. Adapt this algorithm to print all positive
     * values,
     * separated by commas.
     */
    public static void CH7_9_5Main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int values[] = new int[length];
        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }
        /* Update the algorithm below */

        for (int i = 0; i < values.length; i++) {
            if (i > 0 && values[i] > 0) {
                System.out.print(", ");
                System.out.print(values[i]);
            } else if (i == 0 && values[0] > 0) {
                System.out.print(values[i]);
            }
        }
    }

    /*
     * Chapter 7 Challenge 7.9.4
     * Modify the algorithm in the "Common Array Algorithms" section
     * to use an array of strings, and to find the last match.
     * In this example, a match is a word of a specified length.
     * For example, when asked for the last word of length 3,
     * you should locate "was" at index 7
     */
    public static void Ch7_9_4Main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb",
                "it's", "fleece", "was", "white", "as",
                "snow" };

        Scanner in = new Scanner(System.in);
        System.out.print("Word length: ");
        int wordLength = in.nextInt();
        boolean found = false;
        int pos = 0;
        int i = 0;
        while (i < words.length) {
            String word = words[i];
            if (word.length() == wordLength) {
                found = true;
                pos = i;
                i++;
            } else {
                i++;
            }
        }

        if (found) {
            System.out.println("Found " + words[pos] + " at position " + pos);
        } else {
            System.out.println("No word of length " + wordLength);
        }
    }

    /*
     * Chapter 7 Challenge 7.9.3
     * 
     * int spaces = 0;
     * for (int i = 0; i < str.length(); i++)
     * {
     * char ch = str.charAt(i);
     * if (ch == ' ') { spaces++; }
     * }
     * 
     * Adapt this agorithm to print the number of positive and negative
     * values in a given array. Zero is neither positive nor negative.
     */
    public static void CH7_9_3Main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int pos = 0;
        int neg = 0;

        for (int n : nums) {
            if (n > 0) {
                pos++;
            } else if (n < 0) {
                neg++;
            }
        }

        System.out.printf("%s has %d positive and %d negative.%n",
                Arrays.toString(nums), pos, neg);
    }

}