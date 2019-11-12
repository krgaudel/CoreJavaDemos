package assignments;

import java.util.Scanner;

//16.	Write a program to find the given number is even or odd.
public class Question16 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any integer to check for odd or even: ");
		int num=input.nextInt();
		if(num%2==1) {
			System.out.println(num+" is odd num");
		}
		else {
			System.out.println(num+" is even number");
		}
				
	}

}
