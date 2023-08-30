package Homeworks.HW1;

public class Main {
	   public static void main(String[] agrs) {
	      // you may write code in this main method to test your required method
	      System.out.println(DiffMinMax(1,2,3));
	      System.out.println(DiffMinMax(50,10,20));
	      System.out.println(DiffMinMax(1,1,1));
	      System.out.println(DiffMinMax(50,100,10));
	   }
	   
	   // define your required method here below
	   public static int DiffMinMax(int a, int b, int c) {
		   int max = a;
		   int min = a;
		   if (b > max) { max = b;}
		   if (c > max) { max = c;}
		   if (min > b) { min = b;}
		   if (min > c) { min = c;}
		   
		   return max - min;
	   }
	   
	}

