/**
*  
* @author Aidan Amberg
*  Date: 08/24/2022
*  Course/Section: CMIS 141
*  Description: Week two response
*
*/

package week2;
import java.util.Scanner;

public class AmbergAidan_Response2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers:");//Prompting User to enter two numbers
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt(); //third value for response
		/* Since we have to perform some calculation on two numbers so I
		am calculating by how much percent one number is greater than other */
		double diff = Math.abs(number1 - number2); //Calculating difference among two numbers
		double percentChange = (double)(diff / number1)*100; //Calculating percentage by which one number is greater or less
		if(number1>number2)
		{
		System.out.println(number1+" is "+percentChange+"% greater than "+number2);
		}
		else{
		System.out.println(number1+" is "+percentChange+"% less than "+number2);
		}
		//Added calculation and output
		System.out.println(percentChange + "% of " + number3 + " is " + (number3*percentChange)/100);
		}
}

