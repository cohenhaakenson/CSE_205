package Homeworks.HW1;

import java.util.Scanner;

public class TempConversion { 
	
   public static void main(String[] args) {
    // Below this comment: declare and instantiate a Scanner
    Scanner scn = new Scanner(System.in);
      
    // Below this comment: declare any other variables you may need
    // to store the user's input and the Kelvin equivalent value
    double input;
    double kelvin;

    // Below this comment: collect the requried inputs from the user
    System.out.print("Enter temperature in Fahrenheit : ");
    input = scn.nextDouble();

    // Below this comment: call your FahrenheitToKelvin method
    kelvin = FahrenheitToKelvin(input);

    // Below this comment: disply the required results
    PrintKelvin(input, kelvin);
          
   }
   
   // define your FahrenheitToKelvin method here below
   public static double FahrenheitToKelvin(double f) {
	   double k = 273.15 + ((f-32) * (5.0/9.0));
	   return k;
   }
   
   public static void PrintKelvin(double f, double k) {
	   System.out.printf("%n%.2f degrees Fahrenheit is %.2f Kelvin%n", f, k);
   }
   
}
