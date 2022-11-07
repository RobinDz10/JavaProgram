public class PyramidPrinting {
	
	// Design the output of the pyramid, based on the base number from the user input
	public static void pyramidLevel(int num, int maxLevelSize) {
		String str = "";
		// For the base level
		if(num == maxLevelSize) {
			for(int i = 0; i < num; i++)
				str += "*";
		}
		// For the level above the base level
		else {
			int spaces = (maxLevelSize - num) / 2;
			for(int i = 0; i < spaces; i++)
				str += " ";
			for(int i = 0; i < num; i++)
				str += "*";
			for(int i = 0; i < spaces; i++)
				str += " ";
		}
		// Print out current level
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		//Test case 1
		System.out.println("Test case 1:");
		System.out.println("Base number is 5:");
		int num = 5;	// Set base number to 5
		int maxLevelSize = num;
		// Output the pyramid based on the base number, level by level
		for(int i = 1; i <= num; i += 2) {
			pyramidLevel(i, maxLevelSize);
		}
		
		//Test case 2
		System.out.println("Test case 2:");
		System.out.println("Base number is 7:");
		num = 7;		// Set base number to 7
		maxLevelSize = num;
		// Output the pyramid based on the base number, level by level
		for(int i = 1; i <= num; i += 2) {
			pyramidLevel(i, maxLevelSize);
		}
		
		//Test case 3
		System.out.println("Test case 3:");
		System.out.println("Base number is 11:");
		num = 11;		// Set base number to 11
		maxLevelSize = num;
		// Output the pyramid based on the base number, level by level
		for(int i = 1; i <= num; i += 2) {
			pyramidLevel(i, maxLevelSize);
		}
		
		//Test case 4
		System.out.println("Test case 4:");
		System.out.println("Base number is 15:");
		num = 15;		// Set base number to 15
		maxLevelSize = num;
		// Output the pyramid based on the base number, level by level
		for(int i = 1; i <= num; i += 2) {
			pyramidLevel(i, maxLevelSize);
		}
	}
}
