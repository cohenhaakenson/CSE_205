package Homeworks.HW1;

//Below this comment: import the Scanner
import java.util.Scanner;

public class Initials {
	
	public static void main(String[] args) {
	   // Below this comment: declare and instantiate a Scanner
	   Scanner scn = new Scanner(System.in);
	   
	   // Below this comment: declare any other variables you may need
	   String name = "";
	   String initials;
	   
	   // Below this comment: collect the required inputs
	   System.out.print("Enter name : ");
	   name = scn.nextLine();
	   
	   // Below this comment: call your required method
	   initials = getInitials(name);
	   
	   // Below this comment: display the required results
	   System.out.println("Initials for " + name + " : " + initials);
	}
	
	// define your required method here below
	public static String getInitials(String name) {
		String initials = "";
		int index1 = name.indexOf(" ");
		int index2 = name.lastIndexOf(" ");
		
		if (index1 == -1) {
			initials = name.substring(0,1) + ".";
		}
		else if (index1 == index2) {
			initials = name.substring(0,1) + ". " + name.substring(index1+1, index1+2) + ".";
		}else {
			initials = name.substring(0,1) + ". " + name.substring(index1+1, index1+2) + ". " + name.substring(index2+1, index2+2) + ".";
		}
		
		return initials;
	}

}
