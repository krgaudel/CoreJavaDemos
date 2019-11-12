package assignments;

import java.util.Scanner;

//36.	Write a function to find duplicate elements in an array.
public class Question36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements of an array: ");
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " has duplicates ");

				}

			}

		}

	}

}
