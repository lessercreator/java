/**
*  
* @author Aidan Amberg
*  Date: 08/31/2022
*  Course/Section: CMIS 141
*  Description: Week two assignment
*
*/

package week2;
import java.util.Scanner;

public class AmbergAidan_Asgn2 {
	public static void main (String[] args) {
		Scanner obj = new Scanner(System.in);
		
		//Prompt for first value
		System.out.println("Please enter a number between 200 and 1000: ");
		String one_in = obj.nextLine();
		int one = Integer.parseInt(one_in);		//Typecasting to prevent nextInt scanner issue
		if (one < 200 || one > 1000) {
			System.out.println("INVALID NUMBER");
			System.exit(0);
		}
		
		//Prompt for second value
		System.out.println("Please enter another number between 200 and 1000: ");
		String two_in = obj.nextLine();
		int two = Integer.parseInt(two_in);
		if (two < 200 || two > 1000) {
			System.out.println("INVALID NUMBER");
			System.exit(0);
		}
		
		System.out.println("Please choose a mathematical operation (+, -, *, or /): ");
		String op = obj.nextLine();
		
		obj.close(); //close scanner object
		
		//Perform addition
		if (op.equals("+")) {
			System.out.println(one + " + " + two + " = " + (one+two));
		}
		
		//Perform subtraction
		else if (op.equals("-")) {
			System.out.println(one + " - " + two + " = " + (one-two));
		}
		
		//Perform multiplication
		else if (op.equals("*")) {
			System.out.println(one + " * " + two + " = " + (one*two));
		}
		
		//Perform division
		else if (op.equals("/")) {
			//Typecast to double to account for decimal
			double one_d = Double.parseDouble(one_in);
			double two_d = Double.parseDouble(two_in);

			System.out.println(String.format("%.0f", one_d) + " / " + String.format("%.0f", two_d) + " = " + (String.format("%.2f", one_d/two_d)));
		}
		
		//Error catching for invalid input
		else {
			System.out.println("INVALID OPERATION");
		}
	}
}