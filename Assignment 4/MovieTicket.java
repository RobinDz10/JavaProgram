import java.util.*;

public class MovieTicket {
	
	// Check if the movie is suitable for the people with a given age
    public static boolean ageRestricted(int age, String rating){
    	if(age >= 0 && age <= 12 && (rating == "G" || rating == "PG")) return false;	// false -> NOT age restricted
    	if(age >= 13 && age <= 17 && (rating == "G" || rating == "PG" || rating == "PG13")) return false;	// false -> NOT age restricted
    	if(age >= 18 && (rating == "G" || rating == "PG" || rating == "PG13" || rating == "R")) return false;	// false -> NOT age restricted
        return true;	// true -> age restricted
    }
    
    public static int getPrice(int age){
    	if(age >= 0 && age <= 12) return 5;		// For people in age of [0, 12], the cost is 5 per person
    	if(age >= 13 && age <= 17) return 9;	// For people in age of [13, 17], the cost is 9 per person
    	if(age >= 18) return 12;				// For people in age larger or equals to 18, the cost is 12 per person
        return 0;
    }
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	boolean flag = true;	// This variable is used for judging if the costumer meet the condition of "Age Restricted"
    	int totalCost = 0;	// total cost of all the tickets
    	while(true) {
    		int ticketsNumber;
    		String movieRating;
    		System.out.println("Please enter a movie rating (G, PG, PG13, R):");
    		movieRating = sc.nextLine();	// Get the movie rating from user input
    		// Check if the movie rating is valid input
    		if(!movieRating.equals("G") && !movieRating.equals("PG") && !movieRating.equals("PG13") && !movieRating.equals("R")) {
    			System.out.println("Invalid movie rating!");
    			continue;
    		}
    		System.out.println("Please enter the number of tickets to buy:");
    		ticketsNumber = sc.nextInt();	// Get the tickets number the costumer want to purchase from user input
    		if(ticketsNumber <= 0) {
    			System.out.println("Invalid tickets number!");
    			continue;
    		}
    		// Check if each ticket will or will not meet the condition of "Age Restricted"
    		// If meet, stop counting the total cost of the tickets. Otherwise we will get the total cost of all the tickets
    		for(int i = 0; i < ticketsNumber; i++) {
    			int age;
    			System.out.println("Please enter the age of the audiance:");
    			age = sc.nextInt();
    			if(movieRating.equals("PG13") && age <= 12) {
    				flag = false;
    				break;
    			}
    			else if(movieRating.equals("R") && age <= 17) {
    				flag = false;
    				break;
    			}
    			if(age >= 0 && age <= 12) totalCost += 5;
    			else if(age >= 13 && age <= 17) totalCost += 9;
    			else if(age >= 18) totalCost += 12;
    		}
    		break;
    	}
    	if(flag == false) System.out.println("Age Restricted!");	// If age restricted, print out corresponding message
    	else System.out.println("The total cost of the movie tickets is: " + totalCost);	// If not age restricted, print out the total cost
    }
}
