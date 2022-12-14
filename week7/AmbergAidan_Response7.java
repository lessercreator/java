/**
 * 
 * @author Naftali Gadri
 * 09/30/2022
 * CMIS 141 Week 7 Discussion
 * 
 *  This program uses a method to modify the array input to change only the odd numbers to even.
 *
 *	Response by Aidan Amberg on 09/30/2022
 */

package week7;
import java.util.*;

public class AmbergAidan_Response7 {
			
	//Loop 
    public static void EvenCalc(int[] arr) {       	
    	
    //Define method to change input from even to odd
    	for(int i=0;i<arr.length;i++)
        	{  
            	if(arr[i]%2!=0)
            	{
            		arr[i]=arr[i]+1;
            	}
        	}
    	}
    
    //Original array
	public static void main(String[] args) {
		
		int[] arr={3,8,11,14,21};
		
		//response code to increase array size by two
				int[] arr2 = new int[7];
			    for(int i = 0; i < 5; i++) {
			    	arr2[i] = arr[i];
			    	System.out.print(arr2[i]);
			    }
			    
			    arr2[5] = 35;
			    arr2[6] = 79;
			    
	//Pass the original array to the function	
	EvenCalc(arr); 
	
	//Output the modified array
	System.out.println("The modified array is: ");
	
	for(int i=0;i<arr.length;i++)
	    System.out.print(arr[i]+" ");
	
	//pass the expanded array to the function
	EvenCalc(arr2);
	
	//added output code
	    System.out.println("\nThe expanded array is: ");
	    
	    for(int i = 0; i < 7; i++) {
	    	System.out.print(arr2[i] + " ");
	    }
	}
}