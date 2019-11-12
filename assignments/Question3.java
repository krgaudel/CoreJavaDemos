package assignments;

import java.util.Scanner;

//3.	Write a program to find sum and average of two numbers input by User (using Scanner class).
public class Question3 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter 1st number: ");
	int num1=input.nextInt();
	
	System.out.println("Enter 2nd number: ");
	int num2=input.nextInt();
	
	double sum=num1+num2;
	double average=sum/2;
	
	System.out.println("The sum is: "+sum);
	System.out.println("The average is: "+average);


		
	}

}
