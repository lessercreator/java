/**
*  
* @author Aidan Amberg
*  Date: 09/26/2022
*  Course/Section: CMIS 141
*  Description: Week six discussion post
*
*/

package week6;
import java.util.Scanner;
import java.lang.Math;

public class AmbergAidan_Weekly6 {
	public static void pythagorean (int a, int b) {
		
		double hype = Math.sqrt((a*a) + (b*b));
		System.out.printf("The hypotenuse of your triangle is " + String.format("%.2f", hype));
	}
	
	public static void main (String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.println("Please enter a whole number as the length of the side of a right triangle: ");
		int a = user.nextInt();
		System.out.println("Please enter another whole number as the length of the side of a right triangle: ");
		int b = user.nextInt();
		
		pythagorean(a, b);
	}
}