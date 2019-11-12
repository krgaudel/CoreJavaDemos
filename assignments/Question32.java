package assignments;

import java.util.Scanner;

//32.	Write a Program to accepts 5 values in array and display their sum.
public class Question32 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int [] arr=new int[5];
		 int sum=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+i+"th value of an array: ");
			arr[i]=input.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The sum of the array is "+ sum);
	}

}
