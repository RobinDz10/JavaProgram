import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionExercises {
    public static void main(String[] args) {

        System.out.println("Calling problem 1:");
        System.out.println("Final product: " + Arrays.toString(problem1()));

        System.out.println();

        System.out.println("Calling problem 2:");
        System.out.println("Final product: " + problem2().toString());


    }

    public static int[] problem1() {	
    	int[] intArray = {1, 2, 3, 4, 5};
    	for(int i = 0; i <= intArray.length; i++) {
    		try {
    			intArray[i] = intArray[i - 1] + intArray[i];
    		}
    		catch(Exception e) {
    			System.out.println("Exception encountered: " + e.getMessage());
    			if(i < intArray.length) {
    				intArray[i] = 100;
    			}
    		}
    	}
    	return intArray;
    }


    public static ArrayList<Integer> problem2() {
    	ArrayList<Integer> myArrayList = null;
    	for(int i = 0; i < 10; i++) {
    		try {
    			myArrayList.add(i);
    			myArrayList.set(i, i / myArrayList.get(i - 1));
    		}
    		catch(NullPointerException e) {
    			System.out.println("Exception encountered: " + e.getMessage());
    			if(myArrayList == null) {
    				myArrayList = new ArrayList<Integer>();
    			}
    			myArrayList.add(i);
    		}
    		catch(ArithmeticException e) {
    			System.out.println("Exception encountered: " + e.getMessage() + " at index " + i);
    		}
    	}
    	return myArrayList;
    }
}
