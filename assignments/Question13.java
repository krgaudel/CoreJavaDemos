package assignments;

import java.util.Scanner;

//13.	Write a program to print the number entered by user only if the number entered is negative.
public class Question13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a positive or a negative number: ");
		int num=input.nextInt();
		if(num<=0) {
			System.out.println("You entered a negative number");
		}
		else;
		System.out.println("exit");
		
	}

}
