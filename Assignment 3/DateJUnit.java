public class DateJUnit {
	public static void main(String[] args) {
		
		// Initialize a new Date object named date1
		Date date1 = new Date();
		date1.setDate("12-02-1987");
		System.out.println("Date 1 is: " + date1.getDate());
		date1.setDay("19");			// Assign date3 with a new day value
		System.out.println("Now the day of Date 1 is: " + date1.getDay());
		System.out.println("Now the date of Date 1 is: " + date1.getDate());	// print out the changed date
		date1.setMonth("05");		// Assign date3 with a new month value
		System.out.println("Now the month of Date 1 is: " + date1.getMonth());
		System.out.println("Now the date of Date 1 is: " + date1.getDate());	// print out the changed date1
		date1.setYear("1997");		// Assign date3 with a new year value
		System.out.println("Now the year of Date 1 is: " + date1.getYear());
		System.out.println("Now the date of Date 1 is: " + date1.getDate());	// print out the changed date1
		
		System.out.println("================================================================================");
		
		// Initialize a new Date object named date3
		Date date2 = new Date();
		date2.setDate("08-08-1999");
		System.out.println("Date 2 is: " + date2.getDate());
		date2.setDay("11");			// Assign date3 with a new day value
		System.out.println("Now the day of Date 2 is: " + date2.getDay());
		System.out.println("Now the date of Date 2 is: " + date2.getDate());	// print out the changed date2
		date2.setMonth("02");		// Assign date3 with a new month value
		System.out.println("Now the month of Date 2 is: " + date2.getMonth());	
		System.out.println("Now the date of Date 2 is: " + date2.getDate());	// print out the changed date2
		date2.setYear("2001");		// Assign date3 with a new year value
		System.out.println("Now the year of Date 2 is: " + date2.getYear());
		System.out.println("Now the date of Date 2 is: " + date2.getDate());	// print out the changed date2
		
		System.out.println("================================================================================");
		
		// Initialize a new Date object named date3
		Date date3 = new Date();
		date3.setDate("02-20-1955");
		System.out.println("Date 3 is: " + date3.getDate());
		date3.setDay("16");			// Assign date3 with a new day value
		System.out.println("Now the day of Date 3 is: " + date3.getDay());
		System.out.println("Now the date of Date 3 is: " + date3.getDate());	// print out the changed date3
		date3.setMonth("11");		// Assign date3 with a new month value
		System.out.println("Now the month of Date 3 is: " + date3.getMonth());
		System.out.println("Now the date of Date 3 is: " + date3.getDate());	// print out the changed date3
		date3.setYear("2005");		// Assign date3 with a new year value
		System.out.println("Now the year of Date 3 is: " + date3.getYear());
		System.out.println("Now the date of Date 3 is: " + date3.getDate());	// print out the changed date3
		
		System.out.println("================================================================================");
		
		// Test the getDifference() method in the class Date()
		// In here, I will calculate the days between date1 and date2, date2 and date3, date3 and date1
		System.out.println("Date 1 is: " + date1.getDate());
		System.out.println("Date 2 is: " + date2.getDate());
		System.out.println("The days between Date 1 and Date 2 is: " + date1.getDifferent(date2.getDate()));
		System.out.println();
		System.out.println("Date 2 is: " + date2.getDate());
		System.out.println("Date 3 is: " + date3.getDate());
		System.out.println("The days between Date 2 and Date 3 is: " + date2.getDifferent(date3.getDate()));
		System.out.println();
		System.out.println("Date 3 is: " + date3.getDate());
		System.out.println("Date 1 is: " + date1.getDate());
		System.out.println("The days between Date 3 and Date 1 is: " + date3.getDifferent(date1.getDate()));
		
		System.out.println("================================================================================");
		
		// The below code is for testing the examples listed in the lab instructions
		Date date4 = new Date();
		Date date5 = new Date();
		Date date6 = new Date();
		Date date7 = new Date();
		Date date8 = new Date();
		Date date9 = new Date();
		date4.setDate("01-02-1998");
		date5.setDate("01-03-1998");
		date6.setDate("02-01-1998");
		date7.setDate("03-01-1998");
		date8.setDate("02-01-2020");
		date9.setDate("02-01-2000");
		System.out.println("Test the examples in the lab instructions:");
		System.out.println("The days between " + date4.getDate() + " and " + date5.getDate() + " is: " + date4.getDifferent(date5.getDate()));
		System.out.println("The days between " + date6.getDate() + " and " + date7.getDate() + " is: " + date6.getDifferent(date7.getDate()));
		System.out.println("The days between " + date6.getDate() + " and " + date8.getDate() + " is: " + date6.getDifferent(date8.getDate()));
		System.out.println("The days between " + date8.getDate() + " and " + date9.getDate() + " is: " + date8.getDifferent(date9.getDate()));
	}
}
