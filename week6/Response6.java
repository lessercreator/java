/**
*  @author Samsus Saintloth
*  @editor Aidan Amberg
*  
*  Date: 09/27/2022
*  Description: Discussion Week 6 CMIS 141 6381
*  
*  This program will accept user input and perform a calculation
*  
*  *addition will calculate beats per second*
*/ 

package week6;
import java.util.Scanner;


public class AmbergAidan_Response6 {

	public static void second(int a, int b) {
		double avg = a+b/2;
		double sec = avg/60;
		
		System.out.printf("Your heartrate is " + String.format("%.2f", sec) + " per second");
	}

	
	//main method
	public static void main(String[] args) {
		//Initial description to user
		System.out.print("\n Measure your pulse average for two-minutes on two-iterations! \n");
		//calls method- with integer values as placeholder, until user enters info
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n For one minute, use two fingers and count your pulse: \n");
		int a = scanner.nextInt();
		System.out.print("\n Now for the second minute, use two fingers and count your pulse. \n");
		int b = scanner.nextInt();
		
		//deliberate additional spacing
		System.out.print("");
		pulseAverage(a, b);
		second(a, b);
		//outward student information
		System.out.print(" \n Samsus Saintloth \nWeek 6 Discussion  \n 25 September 2022");
		
	}
	
		public static void pulseAverage(int a, int b){ //method used for input takes two parameters
			
			int averageP = a+b/2; //calculation rest here
			System.out.println(averageP + " beats per minute have been recorded as the result");
			}
	
		



}