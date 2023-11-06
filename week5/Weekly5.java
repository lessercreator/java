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

public class AmbergAidan_Weekly5 {
	public static void main (String[] args) {
		
		//user input
		Scanner user = new Scanner(System.in);
		System.out.println("How many words do you want?");
		int num = user.nextInt();
		
		//sentence to draw from
		String[] quick = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
		
		//error catching
		if (num > quick.length) {
			System.out.println("The quick brown fox jumps over the lazy dog");
			System.exit(0);
		}
		
		//for loop
		for (int i = 0; i < num; i++) {
			System.out.print(quick[i] + " ");
		}
	}
}