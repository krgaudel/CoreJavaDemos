package assignments;

import java.util.Scanner;

//17.	Write a program to calculate leap year.
public class Question17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a year ");
		int year=input.nextInt();
		if(year%4==0) {
			System.out.println(year+" year is a leap year");
		}
		else {
			System.out.println(year+" year is not a leap year");
		}
	}

}
