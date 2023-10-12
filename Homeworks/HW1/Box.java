package Homeworks.HW1;

//Below this comment: import the Scanner
import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
	   try (// Below this comment: declare and instantiate a Scanner
	Scanner scn = new Scanner(System.in)) {
		// Below this comment: declare any other variables you may need
		   int w;
		   int h;
		   String b;
		   String i;
		   
		   // Below this comment: collect the required inputs
		   System.out.print("Enter width : ");
		   w = scn.nextInt();
		   System.out.print("Enter height : ");
		   h = scn.nextInt();
		   System.out.print("Enter border : ");
		   b = scn.next();
		   System.out.print("Enter interior : ");
		   i = scn.next();
		   
		   // Below this comment: display the required results
		   for(int x = 0; x < h; x++) {
			   for (int y = 0; y < w; y++) {
				   if (x == 0 || x == h-1) {
					   System.out.print(b);
				   }
				   else {
					   if (y == 0 || y == w-1) {
						   System.out.print(b);
					   }
					   else {
						   System.out.print(i);
					   }
				   }
			   }
			   System.out.println();
		   }
	}
	}
}
