/**
*  
* @author Aidan Amberg
*  Date: 08/18/2022
*  Course/Section: CMIS 141
*  Description: Week one assignment
*
*/

package week1;
import java.util.Scanner; //import the scanner class

public class AmbergAidan_Asgn1 {
	public static void main (String[] args) {
		Scanner obj = new Scanner(System.in);
		
		//Customer ID
		System.out.println("Please enter your customer ID: ");
		String id = obj.nextLine();
		
		//Product Description
		System.out.println("Please enter a product description: ");
		String prod_desc = obj.nextLine();
		
		//Price
		System.out.println("Please enter the unit price: ");
		double price = obj.nextDouble();
		
		//Quantity
		System.out.println("Please enter the quantity: ");
		int quantity = obj.nextInt();
		
		//Discount
		System.out.println("Please enter the product discount (0.10, etc.): ");
		double discount = obj.nextDouble();
		
		//Order Total
		double total = (price*quantity);
		
		//Order Total (post-discount)
		double total_p = total - (discount*total);
		
		//OUTPUT SECTION
		System.out.println("ORDER DATA:");
		System.out.println("Customer ID: " + id);
		System.out.println("Unit Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Product Description: " + prod_desc);
		System.out.println("Discount: " + discount);
		System.out.println("\nThe total price of the order is: $" + String.format("%.2f", total));
		System.out.println("The total price of the order AFTER the discount is applied is: $" + String.format("%.2f", total_p));


	}
}