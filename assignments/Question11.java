package assignments;
//11.	Write a program to swap two numbers
//a) using temp variable
//b) without temp variable

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value of X: ");
		int x= input.nextInt();
		System.out.println("Enter value of Y: ");
		int y=input.nextInt();
		int temp=x;
		x=y;
		y=temp;
		
		
		
		System.out.println("After swap, x is "+ x);
		System.out.println("After swap, y is "+ y);
		
	}

}
