/**
*  
* @author Aidan Amberg
*  Date: 09/08/2022
*  Course/Section: CMIS 141
*  Description: Week four discussion response
*
*/

package week4;
import java.util.Scanner;

public class AmbergAidan_Response4 {
	public static void main(String args[]) {
        // define variable to store user input
        int n;
        Scanner sc = new Scanner(System.in);
        
        // take user input
        System.out.println("Enter number of times to loop: ");
        n = sc.nextInt();
        
        // declare int variable to iterate
        int i = 0;
        
        // iterate using for loop for n times
        // from i = 0 till i = n-1 and print 
        // value of (i+1)
        
        //MODIFIED LOOP HERE BEGINS HERE
        do {
            System.out.println("Iteration number: " + (i+1));
            i++;
        } while (i < n);
    }
}