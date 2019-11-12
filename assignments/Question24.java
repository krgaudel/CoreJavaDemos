package assignments;

import java.util.Scanner;

//24.	Write a program to print the factorial number of given numbers.
public class Question24 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=input.nextInt();
		int factorial=1;
		for(int i=num; i>=1; i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
