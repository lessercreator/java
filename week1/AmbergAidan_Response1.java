/**
*  
* @author Aidan Amberg
*  Date: 08/18/2022
*  Course/Section: CMIS 141
*  Description: Week one response
*
*/

package week1;
import java.util.Date;	

public class AmbergAidan_Response1 {
	public static void main(String[] args) {
		//This simple program displays my name, age, and current state of residency.
		Date dateToday = new Date();
		String myName = "Kelly Oliver"; // Initialized a string type variable and filled it with my name.
		int myAge = 37; // Initialized a integer type variable and filled it with my current age.
		String myState = "North Carolina"; // Initialized a string type variable and filled it with North Carolina.
		System.out.print("Hello class, my name is "); // Printed beginning of message.
		System.out.println(myName); // Printed myName variable.
		System.out.print("I am currently "); // Printed second sentence pretext.
		System.out.print(myAge); // Printed variable myAge.
		System.out.println(" Years Old"); // Printed end of second sentence.
		System.out.print("I currently live in ");
		System.out.println(myState);
		System.out.print("Today is ");
		System.out.println(dateToday);

		//Added code begins here:
		String fun_fact= "North Carolina is the birthplace of Pepsi-Cola, one of the most well known beverage brands in the world!";
		System.out.println(fun_fact);
		
	}

}
