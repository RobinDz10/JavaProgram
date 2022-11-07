public class Date {
	private String date;	// Private variable of Date
	
	// Initialize the date
	public void setDate(String inputDate) {
		date = inputDate;	
	}
	
	// Get the date
	public String getDate() {
		return date;
	}
	
	// Assign the date with a new day value
	public void setDay(String day) {
		String tempDate = date.substring(0, 3);
		tempDate += day;
		tempDate += date.substring(5, 10);
		date = tempDate;
	}
	
	
	// Get the day value of the date
	public int getDay() {
		int day = 0;
		day = date.charAt(3) - '0';
		day *= 10;
		day += date.charAt(4) - '0';
		return day;
	}
	
	// Assign the date with a new month value
	public void setMonth(String month) {
		String tempDate = month;
		tempDate += date.substring(2, 10);
		date = tempDate;
	}
	
	// Get the month value of the date
	public int getMonth() {
		int month = 0;
		month = date.charAt(0) - '0';
		month *= 10;
		month += date.charAt(1) - '0';
		return month;
	}
	
	// Assign the date with a new year value
	public void setYear(String year) {
		String tempDate = date.substring(0, 6);
		tempDate += year;
		date = tempDate;
	}
	
	// Get the year value of the date
	public int getYear() {
		int year = 0;
		year += date.charAt(6) - '0';
		year *= 10;
		year += date.charAt(7) - '0';
		year *= 10;
		year += date.charAt(8) - '0';
		year *= 10;
		year += date.charAt(9) - '0';
		return year;
	}
	
	// Calculate the days between two different date
	public int getDifferent(String anotherDate) {
		
		// Use 3 different variable to represent the year, month and day of the first date
		String strYear1 = date.substring(6, 10);
		String strMonth1 = date.substring(0, 2);
		String strDay1 = date.substring(3, 5);
		int year1 = 0, month1 = 0, day1 = 0;
		year1 = strYear1.charAt(0) - '0';
		year1 *= 10;
		year1 += strYear1.charAt(1) - '0';
		year1 *= 10;
		year1 += strYear1.charAt(2) - '0';
		year1 *= 10;
		year1 += strYear1.charAt(3) - '0';
		month1 = strMonth1.charAt(0) - '0';
		month1 *= 10;
		month1 += strMonth1.charAt(1) - '0';
		day1 = strDay1.charAt(0) - '0';
		day1 *= 10;
		day1 += strDay1.charAt(1) - '0';
		
		// Use 3 different variable to represent the year, month and day of the second date
		String strYear2 = anotherDate.substring(6, 10);
		String strMonth2 = anotherDate.substring(0, 2);
		String strDay2 = anotherDate.substring(3, 5);
		int year2 = 0, month2 = 0, day2 = 0;
		year2 = strYear2.charAt(0) - '0';
		year2 *= 10;
		year2 += strYear2.charAt(1) - '0';
		year2 *= 10;
		year2 += strYear2.charAt(2) - '0';
		year2 *= 10;
		year2 += strYear2.charAt(3) - '0';
		month2 = strMonth2.charAt(0) - '0';
		month2 *= 10;
		month2 += strMonth2.charAt(1) - '0';
		day2 = strDay2.charAt(0) - '0';
		day2 *= 10;
		day2 += strDay2.charAt(1) - '0';
		
		// Calculate the days between the two dates
		int num1 = year1 * 365 + month1 * 30 + day1, num2 = year2 * 365 + month2 * 30 + day2;
		return Math.abs(num1 - num2);
	}
}
