/**
*  
* @author Aidan Amberg
*  Date: 09/01/2022
*  Course/Section: CMIS 141
*  Description: Week three discussion post
*
*/

package week3;
import java.util.Scanner;

public class AmbergAidan_Weekly3 {
	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);
		
		//Receive user input
		System.out.println("Are you 21 years of age or older?");
		String adult = user.nextLine();
		user.close();
		
		//Checks user input in conditional statements
		if (adult.toLowerCase().equals("yes")) {
			System.out.println("Enjoy responsibly!");
		}
		
		else {
			System.out.println("Sorry, come back when you are 21!");
		}
		
	}
}