/**
*  
* @author Aidan Amberg
*  Date: 0/12/2022
*  Course/Section: CMIS 141
*  Description: Week three assignment
*
*/

package week3;
import java.util.Scanner;

public class AmbergAidan_Asgn3 {
	public static void main (String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.println("Welcome to the GAMER ZONE");
		
		//initiate
		System.out.println("Do you want to play?");
		String play = user.nextLine();
		if (!play.toLowerCase().equals("yes")) {
			System.out.println("Goodbye.");
			System.exit(0);
		}
		
		//grab user name
		System.out.println("Please enter your In-Game Name: ");
		String uname = user.nextLine();
		System.out.printf("Welcome to the game, %s.\n", uname);
		
		//grab XP scores and run calculations
		System.out.println("Please use our custom XP leveling system to level up!");
		System.out.println("Enter three values for XP and one value for engagement score.");
		System.out.println("The values should be multiples of 5 between 0 and 100.");
		
		double lvl;
		
		//level 1
		int x1 = user.nextInt();
		lvl = (x1 * 1.2);
		System.out.printf("Your level 1 xp is %s\n", lvl);
		
		//level 2
		int x2 = user.nextInt();
		lvl = lvl + (x2 * 1.3);
		System.out.printf("Your level 2 xp is %s\n", lvl);
		
		//level 3
		int x3 = user.nextInt();
		lvl = lvl + (x3 * 1.5);
		System.out.printf("Your level 3 xp is %s\n", lvl);
		
		//engagement score
		int ES = user.nextInt();
		lvl = lvl + (ES * 1.6);
		System.out.printf("Your final xp level with the engagement multiplier applied is %s\n", lvl);	
		System.out.printf("Thanks for playing %s.", uname);
		
		
		user.close();
	}
}