package assignments;

import java.util.Scanner;

//34.	Write a program to reverse the element of an array.
public class Question34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements of an array : ");
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int temp;
		int st = 0;
		int end = size - 1;
		while (st < end) {
			temp = arr[st];
			arr[st] = arr[end];
			arr[end] = temp;
			st++;
			end--;
		}
		System.out.println("Reversed array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

}
