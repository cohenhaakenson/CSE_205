package ReadingAssignments.RA2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main7_13 {

    public static void main(String[] args) {


    }


    /*
     * Challenge 7.13.1
     */
    public static double cornerAverage(double[][] values) {
        int rows = values.length;
        int columns = values[0].length;
        double sum = 0;
        sum = values[0][0] + values[0][columns - 1] +
                values[rows - 1][0] + values[rows - 1][columns - 1];
        return sum / 4;
    }

}
