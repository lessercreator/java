/**
*  
* @author Aidan Amberg
*  Date: 09/20/2022
*  Course/Section: CMIS 141
*  Description: Week four assignment
*
*/

package week4;
import java.util.Scanner;

public class AmbergAidan_Asgn4 {
	
	public static void triangle (int s1) {
		
		//print triangle
		for (int i = 0; i < s1; i++) {
			for (int j = 0, count = 1; j <= i; j++) {
				
				System.out.print(count);
				count++;
				
			}
			System.out.print("\n");
		}
	}
		
	public static void square (int s2) {
		
		//calculate square dimensions
		int size = (s2*2)-1;
		int front = 0;
		int back = size - 1;
		
		//initialize matrix
        int matrix[][] = new int[size][size];
        
        while (s2 != 0) {
        	for (int i = front; i<=back; i++) {
        		for (int j = front; j<=back; j++) {
        			if (i==front || i==back || j==front|| j==back) {
        				matrix[i][j] = s2;
        			}
        		}
        	}
        	++front;
        	--back;
        	--s2;
        }
        print(matrix, size);
	}
	
	public static void print(int matrix[][], int size) {
		for (int i = 0; i<size; i++) {
			for (int j = 0; j<size; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args) {
		
		//user prompt
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter a size for the triangle: ");
		int s1 = user.nextInt();
		triangle(s1);
		
		System.out.println("\nPlease enter a size for the box: ");
		int s2 = user.nextInt();
		square(s2);
	}
}