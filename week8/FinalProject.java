/**
*  
* @author Aidan Amberg
*  Date: 10/11/2022
*  Course/Section: CMIS 141
*  Description: Final Project for CMIS 141
*
*/

package week8;
import java.util.Scanner;

public class AmbergAidan_FinalProject {
	
	public class Global {
		public static int j = 0;
	}
	
	public static void add_multiple(Scanner user, String[] name_list, String[] id_list, String[] sale_list) {
		
		//input number of users who are being added
		System.out.println("How many customers would you like to add?\n");
		String ph = user.nextLine();
		int num = Integer.parseInt(ph);
		
		//get user input
		for (int i = 1; i <= num; i++) {
			System.out.println("Entering Information For Customer " + i);
			System.out.println("Customer Name: ");
			String name = user.nextLine();
			System.out.println("Enter Customer ID (5 digits): ");
			String id = user.nextLine();
			System.out.println("Enter Customer's Total Sales: ");
			String sales = user.nextLine();
			System.out.println("---------");
			
			//populate array
			name_list[Global.j] = name;
			id_list[Global.j] = id;
			sale_list[Global.j] = sales;
			Global.j++;
			
		}
	}
	
public static void add_single(Scanner user, String[] name_list, String[] id_list, String[] sale_list) {
		
		//get user input
		System.out.println("Entering Information For Customer.");
		System.out.println("Customer Name: ");
		String name = user.nextLine();
		System.out.println("Enter Customer ID (5 digits): ");
		String id = user.nextLine();
		System.out.println("Enter Customer's Total Sales: ");
		String sales = user.nextLine();
		
		//populate array
		name_list[Global.j] = name;
		id_list[Global.j] = id;	
		sale_list[Global.j] = sales;
		Global.j++;
	}

public static void display_all(Scanner user, String[] name_list, String[] id_list, String[] sale_list) {
	System.out.println("Customer Data Storage\n"
					+ "Customer #X: Name, ID, Total Spent");
	
	//iterate through for loop
	for (int i = 0; i < Global.j; i++) {
		System.out.print("Customer #" + i + ": " + name_list[i] + ", " + id_list[i] + ", $" + sale_list[i] + "\n");
	}
}

public static void display_one(Scanner user, String[] name_list, String[] id_list, String[] sale_list) {
	System.out.println("Input Customer #: ");
	String innum = user.nextLine();
	int num = Integer.parseInt(innum);

	System.out.println("Customer Data");
	System.out.print("Customer #" + num + ": " + name_list[num] + ", " + id_list[num] + ", $" + sale_list[num] + "\n");
}
	

public static void display_range(Scanner user, String[] name_list, String[] id_list, String[] sale_list) {
	System.out.println("Input Two Numbers for a Sales Range (low high): ");
	
	//user input
	String onein = user.nextLine();
	String twoin = user.nextLine();
	int one = Integer.parseInt(onein);
	int two = Integer.parseInt(twoin);

	for (int i = 0; i < Global.j; i++) {
		if (Integer.parseInt(sale_list[i]) >= one && Integer.parseInt(sale_list[i]) <= two) {
			System.out.print("Customer #" + i + ": " + name_list[i] + ", " + id_list[i] + ", $" + sale_list[i] + "\n");
		}
	}	
}

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);

		//initialize arrays
		String[] name_list = new String[100];
		String[] id_list = new String[100];
		String[] sale_list = new String[100];
		
		//initialize variables
		int selection;
		
		do {
			//print menu
			System.out.println("\nMENU\n"
							+ "1) Add multiple new customers\n"
							+ "2) Add single new customers\n"
							+ "3) Display all customers\n"
							+ "4) Retreive specific customer's data\n"
							+ "5) Retreive customers with orders based on range\n"
							+ "6) Exit program\n"
							+ "\n"
							+ "Enter your selection: ");
			
			String ph = user.nextLine();
			selection = Integer.parseInt(ph);
			
			//case statement to iterate through menu options
			switch(selection) {
			case 1:
				add_multiple(user, name_list, id_list, sale_list);
				break;
			case 2:
				add_single(user, name_list, id_list, sale_list);
				break;
			case 3:
				display_all(user, name_list, id_list, sale_list);
				break;
			case 4:
				display_one(user, name_list, id_list, sale_list);
				break;
			case 5:
				display_range(user, name_list, id_list, sale_list);
				break;
			}
		} while (selection != 6);
	}
}