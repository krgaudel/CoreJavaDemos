package assignments;

import java.util.Scanner;

// write a program to find the addition of 2 two dimensional arrays 
public class Question37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row = 3;
		int column = 3;
		int[][] arr1 = new int[row][column];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.println("Enter the elements of  arr1: ");
				arr1[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		int[][] arr2 = new int[row][column];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.println("Enter the elements of  arr2 ");
				arr2[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		int[][] arr3 = new int[row][column];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();

		}
	}

}
