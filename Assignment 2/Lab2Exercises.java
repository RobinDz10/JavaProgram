import java.lang.Math;
import java.util.Scanner;

public class Lab2Exercises {

    // computes area of a Hexagon when given its side
    public static int areaOfAHexagon(double a) {
    	return (int)(3 * Math.sqrt(3) * a * a / 2); // Return the area of the hexagon
    }

    // computes parameter of a Hexagon when given its side
    public static int perimeterOfAHexagon(double a) {
    	return (int)a * 6; // Return the perimeter of the hexagon
    }

    // Returns the count of character that are vowels in the given String
    // Also print the given string in lowercase. 
    // We suggest using built-in String methods (not a loop).
    // https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/String.html
    public static int countVowels(String str) {
    	System.out.println(str.toLowerCase()); // Print the string with all letters to be lowercase
    	String temp = str;
    	temp = temp.replace("a", "");
    	temp = temp.replace("e", "");
    	temp = temp.replace("i", "");
    	temp = temp.replace("o", "");
    	temp = temp.replace("u", "");
    	temp = temp.replace("A", "");
    	temp = temp.replace("E", "");
    	temp = temp.replace("I", "");
    	temp = temp.replace("O", "");
    	temp = temp.replace("U", "");
    	return str.length() - temp.length(); // Return the number of the vowels in the original string
    }

    // Use a Scanner to reads a number (integer) that is exactly 5 digits long and print it in reverse
    // for example: 12304 will be printed as 40321. Your solution doesn't need to work for numbers ending in zero(es)
    // or numbers that aren't exactly 5 digits long.
    // You MUST use divide and/or modulus operators and may save part of the number, then concatenate back
    // together as a String and return it.

    public static String reverse5DigitNumber(int usrNumber) {
    	String str = ""; // Create a empty string variable to store all digits of the usrNumber
    	int temp;
    	temp = usrNumber % 10;
    	usrNumber /= 10;
    	str += Integer.toString(temp);
    	temp = usrNumber % 10;
    	str += Integer.toString(temp);
    	usrNumber /= 10;
    	temp = usrNumber % 10;
    	str += Integer.toString(temp);
    	usrNumber /= 10;
    	temp = usrNumber % 10;
    	str += Integer.toString(temp);
    	usrNumber /= 10;
    	temp = usrNumber % 10;
    	str += Integer.toString(temp);
        return str; // Return the string result
    }

    // test client
    public static void main(String[] args) {
    	Scanner sc1 = new Scanner(System.in);
    	System.out.println("Please input the hexagon's length of a side:");
    	double a = sc1.nextDouble();
    	System.out.println("The area of the hexagon is :" + areaOfAHexagon(a));
    	System.out.println("The perimeter of the hexagon is: " + perimeterOfAHexagon(a));
    	System.out.println("--------------------------------------------------");
    	Scanner sc2 = new Scanner(System.in);
    	System.out.println("Please input a string:");
    	String str = sc2.nextLine();
    	System.out.println("This sentence contains " + countVowels(str) + " vowels.");
    	System.out.println("--------------------------------------------------");
    	Scanner sc3 = new Scanner(System.in);
    	System.out.println("Please input a 5-digits integer: ");
    	int num = sc3.nextInt();
    	System.out.println("The reversed number is: " + reverse5DigitNumber(num));
    }
}

////////////////////////////////////
//                                //
// ANSWER THE FOLLOWING QUESTIONS //
//                                //
////////////////////////////////////

/*
 * Questions 1 and 2 are on explicit and implicit casting of some numerical types
 *
 * 1.  What happens if you multiply an int with a char?
 * 
 * Answer: It will multiply the integer with the ASCII value of the char.
 *         For example, if I multiply integer 1 and char 'a', I will get an answer of 97, because the ASCII value of char 'a' is 97,
 *         so that the multiply of 1 and 'a' is actually the multiply of 1 and 97, so the answer is 97.
 *
 *
 *
 * 2.  What happens if you square a char?
 * 
 * Answer: We will get a float result of the sqaured value of the ASCII value of the char.
 *         For example, if we write the code like Math.sqrt('c'), we will get an answer 9.848857801796104.
 *        
 *         
 *         
 * 3.  What happens if a method has a paramater of type int, but you pass it a char?
 * 
 * Answer: The program will still work, and the parameter will be the ASCII value of the char.
 *         For example, the below code will explain my answer:
 *         public class test {
 *				public static int getResult(int a) {
 *					return a * a;
 *				}
 *	
 *				public static void main(String[] args) {
 *					System.out.println(getResult('c'));
 *   			}
 *			}
 *			The answer will be 9801, because the ASCII value of char 'c' is 99, so the getResult() method will calculate the value of 99 * 99.
 *
 * 
 * 
 * 4. What happens if a method has a paramater of type int, but you pass it a float?
 * 
 * Answer: It will occurs an error in the program.
 *         For example, if I use the same code in question 3, the IDE will report that:
 *         Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 *				The method getResult(int) in the type test is not applicable for the arguments (double)
 * 
 * 
 * 
 * 5.  What is the difference between float and double in the Java?
 * 
 * Answer: double will be more precise, because it can provide about 15 decimal digits, while the precision of float is only about 7 decimal digits.
 *         Also, the size of double and float is different. double will take 8 bytes, and float will take 4 bytes.
 *         
 *         
 *         
 * 6.  Consider the following code snippet.
 *     int i = 25;
 *     n = ++(i++);
 *     System.out.println(++(i++) % 5);
 *
 *     Without Compiling the Program:
 *          What {do you think} are the values of i and n if the code is executed?
 *          What is the final value printed?
 *          Now Compile and Run the Program to check your answers. If they are different, explain why
 *          and provide updated code!
 * 
 * Answer: I think variable i will be 27, and n will be 27.
 *         And the final value will be 4.
 *         From my result I think I'm right. Here is the logic:
 *         In the first line, we assign variable i with value 25.
 *         In the second line, we first compute i++, which i turns to be 26, and we do ++i, which i turns to be 27, and then we assign variable n with
 *            current variable i's value, which also 27.
 *         In the third line, we repeat the ++(i++) process in the first and second line again, which means ++(i++) is now 29,
 *            so we will print out the value of 29 % 5, which is 4.
 * 
 * 
 * 
 * 7.  If I define a class as below:
 *     class addnumbers {
 *            public static int addOperation(int FirstOperand, int sop){
 *                   return firstOperand + sop;
 *            }
 *            ...
 *     }
 *     Looking at Java Coding Conventions, what suggestions would you give for code refactoring?
 *
 * Answer: First, we should capitalize the first character of the class name, like: addnumbers -> Addnumbers
 *         Second, we should use lowercase in the beginning of a variable's name, like: FirstOperand -> firstOperand
 *         
 *         
 *         
 * 8.  int i = 10000000 * 100000000;
 *	   System.out.println(i);
 *
 *     Why does the code above print a weird answer? How will you fix it (for same computation)?
 *
 * Answer: Because type int have a upper bound, the range is from -2147483648 to 2147483647. Obviously the answer is beyond that range.
 *         If we want to fix it, we have to change the data type of i, from int to i;
 *         So the below code will run correctly:
 *         
 *         int i = 10000000;
 *         i *= i;
 *         System.out.println(i);
 *         
 *         And the answer will be 100000000000000.
 *
 */