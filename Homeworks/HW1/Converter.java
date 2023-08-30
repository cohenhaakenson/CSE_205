package Homeworks.HW1;

import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scn = new Scanner(System.in);
      
      // Below this comment: declare any other variables you may need
      // to store the user's input and the Feet and Inches equivalent value
      double meters;
      String converted;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter distance in meters : ");
      meters = scn.nextDouble();
      
      // Below this comment: call your MetersToFeetAndInches method
      converted = MetersToFeetAndInches(meters);
      
      // Below this comment: disply the required results
      System.out.printf("%.2f meters in Feet and Inches is : %s", meters, converted);
   }
   
   // define your MetersToFeetAndInches method here below
   public static String MetersToFeetAndInches(double m) {
	   String result = "";
	   
	   double in = m * 39.37;
	   int ft = (int) (in / 12);
	   in = in%12;
	   
	   result = ft + "' " + String.format("%.2f", in) + '"';
	   
	   return result;
   }
   
}

