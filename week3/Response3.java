/**
*  
* @author Aidan Amberg
*  Date: 09/01/2022
*  Course/Section: CMIS 141
*  Description: Week three response to Pasha Zobov
*
*/

package week3;
import java.util.Scanner;

public class AmbergAidan_Response3 {
    public static void main(String[] args) {
        
    	System.out.println("Hi my name is Pasha\nWelcome to my discussion program"); //header

        //scanner initialization
        Scanner in = new Scanner(System.in);

        //output initialization
        String output;

        //prompt user for input and identify the input using ternary operator
        System.out.print("Write anything for identification: ");
        output = in.hasNextBigInteger() ? "integer"
                : in.hasNextBoolean() ? "boolean"
                : in.hasNextFloat() ? "float"
                : "string";
        in.close(); //close scanner obj
        
        //Response code begins here
        String size = output.equals("integer") ? "An Integer is 4 bytes in size."
        			: output.equals("boolean") ? "A Boolean is 1 bit in size."
        			: output.equals("float") ? "A Float is 4 bytes in size."
        			: "A String is a non-primitive data type in java, and has a variable length depending on the lenght of the string.";

        //print the result
        System.out.printf("Your input is a %s\n", output);
        System.out.printf("Fun fact: %s", size); //Part of response
    }
}