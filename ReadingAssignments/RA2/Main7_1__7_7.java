package ReadingAssignments.RA2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main7_1__7_7 {

    public static void main(String[] args) {
        // CH7_4_1Main(args);
        // CH7_4_5Main(args);
        // CH7_7_1Main(args);
        CH7_7_1Main(args);

        int[] evens;

        ArrayList<String> s = new ArrayList<String>();
        s.add("poo");
        
        
    }

    /*
     * Chapter 7 Challenge 7.4.1
     * Using a for loop, fill the array a with
     * 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2.
     */
    public static void CH7_4_1() {
        int[] a = new int[18];

        for (int i = 0; i < a.length; i++) {

            a[i] = i % 3;

        }

        System.out.println(Arrays.toString(a));
    }

    /*
     * Chapter 7 Challenge 7.4.2
     * When printing separators, we skipped the separator before
     * the initial element. Rewrite the loop so that the separator
     * is printed after each element, except for the last element.
     */
    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i >= 0 && i < values.length - 1) {
                System.out.print(" | ");
            }
        }
    }

    public static void CH7_4_1Main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = in.nextInt();
        }
        printArray(myArray);
    }

    /*
     * Chapter 7 Challenge 7.4.3
     * Compute the distance between the positions of the first and
     * last zero element in the given array.
     * For example, if the array is
     * 3 0 1 0 4 9 5 0 6 your algorithm should yield 7 - 1 = 6
     * If the array contains a single zero, return 0.
     * If it doesn't contain any zeroes, return a negative value.
     */
    public static int zeroesDistance(double[] values) {
        int firstPos = 0;
        int lastPos = values.length - 1;
        boolean found = false;
        while (firstPos < values.length && !found) {
            if (values[firstPos] == 0 && values[lastPos] == 0) {
                found = true;
            } else if (values[firstPos] != 0) {
                firstPos++;
            } else if (values[lastPos] > 0) {
                lastPos--;
            }
        }
        if (firstPos == values.length && lastPos == -1) {
            return -1;
        }

        return lastPos - firstPos;
    }

    /*
     * Chapter 7 Challenge 7.4.4
     * Complete this code to swap the first and last element of the given array.
     * Do nothing if the array is empty.
     */
    public static void swapFirstLast(int[] values) {

        if (values.length != 0) {
            int temp = values[0];
            values[0] = values[values.length - 1];
            values[values.length - 1] = temp;
        }

    }

    /*
     * Chapter 7 Challenge 7.4.5
     * Complete the following code to make a copy of the
     * first half of an array of strings.
     */

    /**
     * Copies the first half of an array. If the length is odd,
     * don't copy the middle value.
     * 
     * @param values an array
     * @return a copy of the first half of values
     */
    public static String[] copyHalf(String[] values) {

        String[] firstHalf = new String[values.length / 2];
        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = values[i];
        }

        return firstHalf;
    }

    public static void CH7_4_5Main(String[] args) {
        String[] arr1 = { "Mary", "had", "a", "little", "lamb" };
        System.out.println("Full Array 1: " + Arrays.toString(arr1));
        System.out.println("Half Array 1: " + Arrays.toString(copyHalf(arr1)));

        System.out.println();

        String[] arr2 = { "its", "fleece", "was", "white", "as", "snow" };
        System.out.println("Full Array 2: " + Arrays.toString(arr2));
        System.out.println("Half Array 2: " + Arrays.toString(copyHalf(arr2)));
    }

    /*
     * Chapter 7 Challenge 7.7.1
     * Now implement the removeOdd method in Java.
     */
    public static int removeOdd(int[] values, int size) {
        int odd = 0;
        int currPos = 0;
        for (int val : values) {
            if (val % 2 > 0) {
                int temp = values[currPos];
                values[currPos] = values[values.length - 1];
                values[values.length - 1] = temp;
                odd++;
            }
            currPos++;
        }
        return odd;
    }

    public static void swapValues(int[] values, int index1, int index2) {
        int temp = values[index1];
        values[index1] = values[index2];
        values[index2] = temp;
    }

    public static void CH7_7_1Main(String[] args) {
        int[] a = { 22, 98, 95, 46, 31, 53, 82, 24, 11, 19 };
        int sizeBefore = 8;
        int sizeAfter = removeOdd(a, sizeBefore);
        System.out.print("a: [ ");
        for (int i = 0; i < sizeAfter; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
        System.out.println("Expected: [ 22 98 46 82 24 ]");

        int[] b = { 23, 97, 95, 45, 31, 53, 81, 24, 11, 19 };
        sizeBefore = 7;
        sizeAfter = removeOdd(b, sizeBefore);
        System.out.print("b: [ ");
        for (int i = 0; i < sizeAfter; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("]");
        System.out.println("Expected: [ ]");
    }

}
