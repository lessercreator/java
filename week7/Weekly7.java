/**
*  
* @author Aidan Amberg
*  Date: 09/28/2022
*  Course/Section: CMIS 141
*  Description: Week seven discussion post
*
*/

package week7;

public class AmbergAidan_Weekly7 {
	
	public static void viktor(int awry) {
			
			//square each element of the array
			awry = awry * awry;
		
		System.out.print(awry + " ");
	}
	
	public static void main(String[] args) {
		
		//declare array
		int[] awry = {2, 4, 8, 16, 32, 64};
		
		System.out.println("The original array is: ");
		
		//print original array
		for (int i = 0; i < awry.length; i++) {
			System.out.print(awry[i] + " ");
		}
		
		System.out.println("\n\nThe modified array is: ");
		
		//call function
		for (int i = 0; i < awry.length; i++) {
			viktor(awry[i]);

		}
	}
}