/**
 * Movie class, represents a Movie object
 * @author Yana Li
 *
 */

import java.util.Scanner;


public class MovieDriver {

	public static void main(String[] args) {
		
		String answer;
		
		do
		{
			Scanner keyboard = new Scanner (System.in);
			Movie mov= new Movie();
			
			
			System.out.println ("Enter the name of a movie");
			String mTitle = keyboard.nextLine();
			mov.setTitle (mTitle);
			
			
			
			System.out.println ("Enter the rating of a movie");
			String mRate= keyboard.nextLine();
			mov.setRating (mRate);
			
			System.out.println ("Enter the number of ticket sold for this movie");
			int mTickets= keyboard.nextInt();
			mov.setSoldTickets (mTickets);
			
			
			System.out.println(mov.toString());
			keyboard.nextLine();
			System.out.println("Do you want to enter another? (y or n)");
			answer= keyboard.nextLine();
			
		}while (answer.equalsIgnoreCase ("y"));
		
		System.out.println("Goodbye");
		
	}

}
