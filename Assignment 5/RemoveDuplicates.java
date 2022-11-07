import java.util.Random;
import java.util.Arrays;

public class RemoveDuplicates {
	// This method is to remove all duplicate numbers in the original array
	public static int[] removeDups(int[] arr) {
		int pos = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] != arr[i + 1]) {
				arr[pos] = arr[i];
				pos++;
			}
		}
		arr[pos++] = arr[arr.length - 1];
		// Using Arrays.copyOf method will use NO-extra space, which means this is a completely in-place method
		arr = Arrays.copyOf(arr, pos);
		return arr;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		// Create an integer array. It contains 20 integers, each integer is randomly chosen from 0 to 9
		int[] arr = new int[20];
		for(int i = 0; i < 20; i++) {
			int num = rand.nextInt(10);
			arr[i] = num;
		}
		// Sort the array with ascending order
		Arrays.sort(arr);
		// Output the sorted original array
		System.out.print("Input: ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		arr = removeDups(arr);
		// Output the sorted original array after removing all duplicates
		System.out.print("Output: ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
