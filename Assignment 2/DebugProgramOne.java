import java.util.Scanner; // Change "java.util.Scan" to "java.util.Scanner"

class operationOne // Delete "()" here
{
//    function to add 2 integers
    public int add(int first_operand,int second_operand){ 
    	// Change the first data type from "String" to "int"
    	// Also, remove the keyword "static"
    	// Because the IDE suggested that "The static method add() should be accessed in a static way"
        return first_operand + second_operand;
    }
//    function to subtract 2 integers
    public int subtract(int first_operand,int second_operand){ 
    	// Change the data types from "float" to "int"
    	// Also, remove the keyword "static"
    	// Because the IDE suggested that ""The static method add() should be accessed in a static way"
        return first_operand - second_operand;
    }
}

public class DebugProgramOne
{
    public static void main(String[] args)
    {
    	operationOne operationsEVEn = new operationOne(); // Initialize the object with the class name, not object
//      Initializing Scanner object
        Scanner sc = new Scanner(System.in); // Change "Scan" to "Scanner"
        
        System.out.println("Welcome to Addition/Subtraction Calculator:");
        System.out.println("Choose your operation:");
        System.out.println("1. Add\n2. Subtract");
        System.out.println("Enter 1 for performing Addition");
        System.out.println("Enter 2 for performing Subtraction");
        int choice = sc.nextInt();
        System.out.println("Enter first operand");
        int first_operand = sc.nextInt();
        System.out.println("Enter second operand");
//        Taking an int input using Scanner object
        int second_operand = sc.nextInt();
        int result = 0; // Add a variable named result to store the computed value
        if(choice == 1)
        {
            result = operationsEVEn.add(first_operand,second_operand); // We have to use the object name "operationsEVEn" here
        }
        else if(choice == 2) // "elif" is a python command, so we change it to "else if"
        {
            result = operationsEVEn.subtract(first_operand,second_operand); // We have to use the object name "operationsEVEn" here
        }
        System.out.println("The result of the operation is:" + result);
    }
}

