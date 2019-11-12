package day11;

import java.util.Scanner;

public class ArrayDemo3 {
	public static void main(String[] args) {
		final int ROW=3;
		final int COLUMN=3;
		int[][] arr=new int[ROW][COLUMN];
		Scanner input=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print("Enter the array numbers: ");
				arr[i][j]=input.nextInt();
			}
	}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
