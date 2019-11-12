package assignments;

import java.util.Scanner;

//18.	Write a program to display largest number from given three values.
public class Question18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();

		System.out.println("Enter second number: ");
		int num2 = input.nextInt();

		System.out.println("Enter third number: ");
		int num3 = input.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is greatest");
			} else
				System.out.println(num3 + " is the greates");
		} else {

			if (num2 > num3) {
				System.out.println(num2 + " is the greatest");
			} else {
				System.out.println(num3 + " is the greatest");
			}
		}

	}
}