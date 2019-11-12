package assignments;

import java.util.Scanner;

//35.	Write a function to find second largest number in given array.
public class Question35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements of an array: ");
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		// the following code gives ascending order
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println("The second highest number in an array is "+arr[size-2]);
	}
}
