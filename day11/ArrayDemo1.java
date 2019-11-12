package day11;

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[]arr=new int[3];//  this array is int type, name is arr and it has 3 values, single dimension
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter the elements of  array: ");
			arr[i]=input.nextInt();
			
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
