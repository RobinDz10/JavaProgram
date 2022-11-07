class Lab2CompoundExercises {
    public static void main(String args[]){
    	operation1();
    	operation2();
        differentOperators();
        question2();
    }
	// 1. Review the following method (differentOperators). You will create two new methods, name them as you see fit,
    //    and implement the following changes:
	// 1a. Change differentOperators() to use ONLY simple-assignment operators and not compound. All printf statements should print the
    //     same values.
	// 1b. Change differentOperators() to use a post-increment operator each time there used to be a pre-increment operator,
    //     and vice versa. Does this change the result?
    public static void operation1() { 
    	// This function contains only simple-assignment operators
    	
    	int res = 11; // result is 11
    	System.out.println(res);
    	
    	res = res - 1; // result is now 10
    	System.out.println(res);
    	
    	int temp = -2; // result is now -5
    	res = res / temp;
    	System.out.println(res);
    	
    	temp = -20; // result is now 100
    	res = res * temp;
    	System.out.println(res);
    	
    	temp = 4; // result is now 0
    	res = res % temp;
    	System.out.println(res);
    	
    	res = res + 1; // result is now 1
    	System.out.println(res);
    	
    	System.out.println("--------------------------------------------------");
    }
    
    public static void operation2(){
        // use a post-increment operator each time there used to be a pre-increment operator, and vice versa.
    	// It will not change the result.
    	
        int result = 11; // result is 11
        System.out.println(result);

        result--; // result is now 10
        System.out.println(result);
        
        result /=- 2; // result is now -5
        System.out.println(result);

        result *=- 20; // result is now 100
        System.out.println(result);

        result %=+ 4; // result is now 0
        System.out.println(result);

        // This is the place being changed
        ++result; // result is now 1
        System.out.println(result);
        
        System.out.println("--------------------------------------------------");
   }
    
     public static void differentOperators(){

          int result = 11; // result is 11
          System.out.println(result);

          result--; // result is now 10
          System.out.println(result);
          
          result /=- 2; // result is now -5
          System.out.println(result);

          result *=- 20; // result is now 100
          System.out.println(result);

          result %=+ 4; // result is now 0
          System.out.println(result);

          result++; // result is now 1
          System.out.println(result);
          
          System.out.println("--------------------------------------------------");
     }

// 2. In the following program, using comments in this file, explain why the value "6" is printed thrice in a row:
//    Also, explain why "8" became "6" from line 51 to 52.
     public static void question2() {
        int i = 6;                // In the beginning, the value of variable i equals to 6
        ++i;                      // After this pre-increment operation, the value is 7
        System.out.println(i);    // Now we print out the value of i, which is 7
        i++;                      // After this post-increment operation, the value is 8
        System.out.println(i--);  // This command contains two steps, in the first step, we print out the value, which is 8
                                  // After we print out the value, the variable decrease by 1, which is now 7
        System.out.println(--i);  // This command contains two steps, in the first step, the variable decrease by 1, which is now 6
                                  // After the value decreased, we print out the value, which is 6
        System.out.println(i--);  // This command contains two steps, in the first step, we print out the value, which is 6
        						  // After we print out the value, the variable decrease by 1, which is now 5
        System.out.println(++i);  // This command contains two steps, in the first step, the value of the variable increased by 1, which is 6
                                  // After the value increased by 1, we print out the value, which is 6
     }
}