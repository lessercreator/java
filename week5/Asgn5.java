/**
*  
* @author Aidan Amberg
*  Date: 09/27/2022
*  Course/Section: CMIS 141
*  Description: Week five assignment
*
*/

package week5;
import java.util.Scanner;

public class AmbergAidan_Asgn5 {
	
	public static void foot_bushel () {
		Scanner user = new Scanner(System.in);

		System.out.println("You have decided to run a conversion from cubic feet to U.S. bushels.\n"
						 + "Please enter the number of cubic feet: ");
		
		//calculate values
		int feet = user.nextInt();
		double bushels = feet * 0.803564;
		
		System.out.println("\n" + feet + " feet equals " + String.format("%.2f", bushels) + " bushels.");
	}
		
	public static void miles_km () {
		
		Scanner user = new Scanner(System.in);

		System.out.println("You have decided to run a conversion from miles to kilometers.\n"
						 + "Please enter the number of miles: ");
		
		//calculate values
		int miles = user.nextInt();
		double km = miles * 1.60934;
		
		System.out.println("\n" + miles + " miles equals " + String.format("%.2f", km) + " kilometers.");
	}
	
	public static void honors() {
	
		Scanner user = new Scanner(System.in);

		System.out.println("You have decided to calculate your honors title.\n"
						 + "Please enter your GPA: ");
		
		double gpa = user.nextDouble();
		
		//conditional if statement
		int ph = (gpa >= 3.5 && gpa <= 3.7) ? 1 : 
				 (gpa >= 3.8 && gpa <= 3.9) ? 2 :
				 (gpa >= 4.0) ? 3 : 4;
		
		//switch statement
		switch(ph) {
		case 1: 
			System.out.println("With a GPA of " + gpa + ", you will graduate Cum Laude.");
			break;
		case 2:
			System.out.println("With a GPA of " + gpa + ", you will graduate Magna Cum Laude.");
			break;
		case 3:
			System.out.println("With a GPA of " + gpa + ", you will graduate Summa Cum Laude.");
			break;
		case 4:
			System.out.println("With a GPA of " + gpa + ", you will not graduate with honors.");
			break;
		}
	}
	
	public static void main (String[] args) {
		
		int selection;
		
		//while loop for menu
		do {
		
			//user prompt
			Scanner user = new Scanner(System.in);
			System.out.println("\nPlease make a selection:\n ");
			
			//display menu
			System.out.println("1) Convert cubic feet to U.S. bushels\n"
							 + "2) Convert miles to kilometers\n"
							 + "3) Determine if you graduate with honors\n"
							 + "4) Exit Program\n");
	
			selection = user.nextInt();
			
			//switch statement to run through methods
			switch(selection) {
			case 1: foot_bushel(); break;
			case 2: miles_km(); break;
			case 3: honors(); break;
			}
			
		} while (selection != 4);
		System.out.println("Goodbye!");
	}
}