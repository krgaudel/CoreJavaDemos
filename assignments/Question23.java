package assignments;

import java.util.Scanner;

//23.	Write a Program to sum 1 to nth natural numbers.
public class Question23 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=input.nextInt();
		int sum=0;
		for(int i=1; i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("The sum from 1 to "+num + " is "+ sum);
	}

}