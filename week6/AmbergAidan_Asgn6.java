/**
*  
* @author Aidan Amberg
*  Date: 10/03/2022
*  Course/Section: CMIS 141
*  Description: Week six assignment
*
*/

package week6;
import java.util.Scanner;

public class AmbergAidan_Asgn6 {
	
	public static String[] check(String[] team_names, int[] team_scores, int teams) {
		
		//initialize variables
		int highest = 0;
		String high_name = "";
		int lowest = 1000;
		String low_name = "";
		String[] result = new String[4];
		
		
		//find highest and lowest values
		for (int i = 0; i < teams; i++) {
			if (team_scores[i] > highest) {
				highest = team_scores[i];
				high_name = team_names[i];
			}
			if (team_scores[i] < lowest) {
				lowest = team_scores[i];
				low_name = team_names[i];
			}
		}
		
		//build array
		result[0] = Integer.toString(highest);
		result[1] = high_name;
		result[2] = Integer.toString(lowest);
		result[3] = low_name;
	
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);

		//introduce program
		System.out.println("Welcome to the Anne Arundel Annual Robotics Competition!\n");
		System.out.println("How many teams are in the competition?");
		String team_ph = user.nextLine();
		int teams = Integer.parseInt(team_ph);
		
		//team data arrays
		String[] team_names = new String[teams];
		int[] team_scores = new int[teams];
		
		//prompt
		System.out.println("Please enter the names and scores for each of the " + teams + " teams."
				+ "\nScores must be between 400 and 1000\n");
		
		
		//populate arrays with user input
		for (int i = 0, j = 1; i < teams; i++, j++) {
			System.out.println("--- " + j + " ---");
			team_names[i] = user.nextLine();
			String ph = "";
			ph = user.nextLine();
			team_scores[i] = Integer.parseInt(ph);
		}
		
		String[] results = check(team_names, team_scores, teams);
		
		//print team names and scores
		for (int i = 0; i < teams; i++) {
			System.out.println(team_names[i] + " : " + team_scores[i]);
		}
		
		System.out.println("\nThe highest scoring team was " + results[1] + " with a score of " + results[0]);
		System.out.println("\nThe lowest scoring team was " + results[3] + " with a score of " + results[2]);

		
	}
}
