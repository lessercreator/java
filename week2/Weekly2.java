/**
*  
* @author Aidan Amberg
*  Date: 08/18/2022
*  Course/Section: CMIS 141
*  Description: Week two discussion post
*
*/

package week2;
import java.util.Scanner;

public class AmbergAidan_Weekly2 {
	public static void main (String[] args) {
		Scanner obj = new Scanner(System.in);
		
		//Introduce the equation we will be calculating
		System.out.println("BMI CALCULATOR");
		
		//Prompt for values
		System.out.println("Please enter your height in inches: ");
		double height = obj.nextDouble();
		System.out.println("Please enter your weight in pounds: ");
		double weight = obj.nextDouble();
		
		//Perform BMI calculation (weight / (height * height)) * 703
		double bmi = (weight / (height * height) * 703);
		System.out.println("Your body-mass index is " + String.format("%.2f", bmi));
		System.out.println("Body mass index (BMI) is a measure of body fat based on height and weight that applies to adult men and women.");
	}
}