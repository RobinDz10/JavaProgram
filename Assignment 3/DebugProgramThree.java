//  Lab 3
//
//  Released:  1/27/2022
//
//  @Author  Kumar Saurabh (ksaurabh)
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

About the java file: The current Program uses string built in functions like length(), charAt(), concat() and substring(). 

Expected Program Output:
The correct result for this program

Eg: 

*/

import java.io.*;
import java.util.Scanner;

class DebugProgramThree {

    public static void main(String p[]) throws IOException {
        String str = "This is a debugging exercise";
        int len = str.length();		// Change str.length to str.length()

        char ch1 = str.charAt(len - 1);		// Change str.len to len, and change len to len - 1
        System.out.println("The last character of the string is " + ch1);

        String str1 = "Hello";
        String str2 = " World";

        System.out.println(str1.concat(str2));	// Delete keyword static
        										// Change String.concat(str1, str2) to str1.concat(str2)

        System.out.println(str.replace('i', 'K'));

        System.out.println("Substring starting from index 15:");
        System.out.println(str.substring(15));
        System.out.println("Substring starting from index 15 and ending at 20:");
        System.out.println(str.substring(15, 21)); // Change 30 to 21, because the right value is not included, so I cannot use 20
    }
}