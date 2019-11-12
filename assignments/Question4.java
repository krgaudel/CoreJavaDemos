package assignments;

import java.util.Scanner;
//4.	Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100

public class Question4 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	double I,P, T, R;
	
	System.out.println("Enter principal amount P: ");
	P=input.nextDouble();
	
	System.out.println("Enter Time in Years T:  ");
	T=input.nextDouble();
	
	System.out.println("Enter rate of interest in percentage R: ");
	R=input.nextDouble();
	
	I=P*T*R/100;
	
	System.out.println("Simple Interest of your entered money is $:" + I);
	
	}

}
