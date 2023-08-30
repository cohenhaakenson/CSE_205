package ReadingAssignments.RA2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Chap8 {

    public static void main(String[] args) {

        /*
         * 8.5.1 Main
         * try {
         * CH8_5_1Main(args);
         * } catch (FileNotFoundException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         */

    }

    /*
     * Challenge 8.5.2
     * 
     */
    public static void CH8_5_2Main(String[] args) throws FileNotFoundException {
        // Prompt for the input and output file names
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        System.out.print("Output file: ");
        String outputFileName = console.next();

        // Construct the Scanner and PrintWriter objects for reading and writing
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);
        // Read the input and write the output

        double avg;
        int count = 0;
        double total = 0;

        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            out.printf("%17.2f\n", value);
            total = total + value;
            count++;
        }

        avg = total / count;

        out.printf("Average: %10.2f\n", avg);

        in.close();
        out.close();
    }

    /*
     * Challenge 8.5.1
     * Write a program that reads a file one character at a time
     * and prints out how many characters are uppercase letters,
     * lowercase letters, digits, white space, and something else.
     */
    public static void CH8_5_1Main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("");
        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;
        int whitespace = 0;
        int other = 0;

        while (in.hasNext()) {
            char input = in.next().charAt(0);
            if (Character.isUpperCase(input)) {
                uppercase++;
            } else if (Character.isLowerCase(input)) {
                lowercase++;
            } else if (Character.isDigit(input)) {
                digits++;
            } else if (Character.isWhitespace(input)) {
                whitespace++;
            } else
                other++;
        }

        in.close();

        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Digits: " + digits);
        System.out.println("Whitespace: " + whitespace);
        System.out.println("Other: " + other);
    }
}
