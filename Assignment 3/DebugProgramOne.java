//  Lab 3
//
//  Released:  1/27/2022
//
//  @Author  Your Name and username
//  Last Edited: 1/26/2022
//
//
//  Directions: The given file is not according to java coding guidelines
//              and may have compilation errors to be fixed. 
//              Tasks to be performed:
//              1. Edit the file to make it according to java coding guidelines 
//              and fix the errors if any.
//              2. Include comments to indicate the changes made to the file 
//              to make it according to coding conventions or fix issues.
//
//////////////////////////////////////////////////////////////////////////////

/*
Note: The file is a standalone java file, meaning you can run this file directly without having to set up the other 2 files.

About the java file: The current Program computes Area of different shapes based on user input.

User Input: 
1. choice: User should enter either 1 or 2 depending on which shape the user wants to compute area for.
2. first_operand, second_operand: The operands on which the addition/subtraction operation is to be performed.

Expected Program Output:
The correct result for Area operations

Eg: 
Find area of 
1 . Square
2 . Rectangle 
Select a choice : 2
Enter the breadth :
2
Enter the length :  
2
Area of rectangle with breadth 2 and length 2 is : 4
*/

import java.io.*;
import java.util.Scanner;

class DebugProgramOne {

    public void findarea(int a, int b) {
        System.out.println("\n Area of rectangle with breadth " + a + " and length " + b + " is :" + a * b);
    }
    
    // Add void before findarea
    public void findarea(int a) {
        System.out.println("\n Area of square with  side " + a + " is :" + (a * a));	// Change (a + a) * 2 to a * a
    }

    public static void main(String p[]) throws IOException {
        DebugProgramOne d = new DebugProgramOne();		// Change Rectangle to DebugProgramOne
        Scanner keyboard = new Scanner(System.in);		// Change System.out to System.in
        System.out.print("\n Find area of \n 1 . Square \n 2 . Rectangle \n\nSelect a choice : ");
        int choice = keyboard.nextInt();		// Change Scanner.nextInt() to keyboard.nextInt()
        if (choice == 1) {
            System.out.print("\n Enter the side : ");
            int s = keyboard.nextInt();			// Change s to int s
            d.findarea(s);
        }

        else if (choice == 2) {
            System.out.print("\n Enter the breadth : ");
            int a = keyboard.nextInt();		// Split inta to int a
            System.out.println("\n Enter the length : ");		// Change print() to System.out.println()
            int b = keyboard.nextInt();		// Change b to int b, change nextLong() to nextInt()
            d.findarea(a, b);				// Change findarea() to d.findarea()
        }

        else {
            System.out.println("Invalid choice");		// Change print() to System.out.println()
        }
    }
}