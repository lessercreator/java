/**
*  
* @author Aidan Amberg
*  Date: 09/07/2022
*  Course/Section: CMIS 141
*  Description: Week four discussion post
*
*/

package week4;
import java.util.Scanner;

public class AmbergAidan_Weekly4 {
	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		int select = 0;
		
		//Begin loop
		while (select != 4) {
			//Print selection menu
			System.out.println("Select an option to learn more: \n"
							+  "1) What is Java?\n"
							+  "2) Who invented Java?\n"
							+  "3) What makes Java unique?\n"
							+  "4) EXIT");
			
			//Read user selection
			select = user.nextInt();
			
			//Output selection
			if (select == 1) {
				System.out.println("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA).\n");
			}
			else if (select == 2) {
				System.out.println("Java was originally developed by James Gosling at Sun Microsystems.\n");
			}
			else if (select == 3) {
				System.out.println("The main difference between Java and any other programming language is the unique method in which Java code is executed. Unlike compiled languages such as C++, Java is compiled into bytecode which can run on any device with the Java Virtual Machine (JVM).\n");
			}
			else if (select == 4) {
				System.out.println("Exiting program\n");
				select = 4;
			}
			else {
				System.out.println("INVALID SELECTION\n");
			}
		}
	}
}