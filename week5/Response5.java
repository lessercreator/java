/**
*  
* @author Aidan Amberg
*  Date: 09/14/2022
*  Course/Section: CMIS 141
*  Description: Week five discussion post
*
*/

package week5;
import java.util.Scanner;
public class AmbergAidan_Response5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Variables
		int num1;
		int num2;
		int num3;
		int count = 0;
		
		//Asks user for beginning number
		System.out.println("Please enter the positive whole number you wish to start with: ");
		num1 = input.nextInt();
		num3 = num1;
		
		//Added code
		//Get the upper limit from user
		System.out.println("Please enter the whole number you wish to stop at: ");
		int top = input.nextInt();
		
		//Loop uses the Fibonacci sequence until it reaches or surpasses 10,000
		for (num2 = num1; num2 <= top; num2 += num3) {
			count++; //Keeps track of how many times the sequence repeats
			System.out.println(num2);
			
			num3 = num1; //num3 is set to the 1st previous number
			num2 += num3; //num2 (the 2nd previous number) is incremented by num3 (the 1st previous number)
			num1 = num2; //num1 is set as the new 2nd previous number
			
			if(!(num2 <= top))
				break;
			
			System.out.println(num2);
			count++; //Keeps track of how many times the sequence repeats
		}
		System.out.println(num2);
		//Tell the user how many times the loop repeated
		System.out.println("The Fibonacci sequence was used " + count + " times.");
		
		input.close();
	}

}