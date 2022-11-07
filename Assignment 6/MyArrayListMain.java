import java.util.Scanner;

public class MyArrayListMain {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		MyArrayList arrayList1 = new MyArrayList(arr);
		System.out.println("The original ArrayList is: " + arrayList1.toString() + ", the size of the ArrayList is: " + arrayList1.getSize());
		Scanner sc = new Scanner(System.in);
		System.out.println("Please add 5 positive integers into the ArrayList: ");
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			arrayList1.add(num);;
			System.out.println("Now the ArrayList is: " + arrayList1.toString() + ", the size of the ArrayList is: " + arrayList1.getSize());
		}
		System.out.println("Please remove 5 positive integers from the ArrayList: ");
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if(arrayList1.remove(num)) {
				System.out.println("Remove success. Now the ArrayList is: " + arrayList1.toString() + ", the size of the ArrayList is: " + arrayList1.getSize());
			}
			else {
				System.out.println("Remove failed. The input integer does not exist in the ArrayList.");
			}
		}
		System.out.println("Please enter 5 positive integers to check if it exists in the ArrayList: ");
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			if(arrayList1.indexOf(num) == -1) {
				System.out.println("The input integer does not exist in the ArrayList.");
			}
			else {
				System.out.println("The index of the input integer in the ArrayList is: " + arrayList1.indexOf(num));
			}
		}
		sc.close();
	}
}