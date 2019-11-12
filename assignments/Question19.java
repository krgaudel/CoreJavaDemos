package assignments;

import java.util.Scanner;

//19.//	Write a Program to accept three sides of triangle and display which kind of triangle is formed.
public class Question19 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter side a of a triangle: ");
	int a=input.nextInt();
	
	System.out.println("Enter side b of a triangle: ");
	int b=input.nextInt();
	
	System.out.println("Enter side c of a triangle: ");
	int c=input.nextInt();
	
	if(a==b && b==c) {
		System.out.println("This is an equilateral triangle");
	}
	else if( a!=b && b!=c && a!=c) {
		System.out.println("This is an scalane triangle");
	}
	else if ((a==b)|| (b==c)||(a==c)) {
		System.out.println("This is an isolace triangle");
	}
	

	
	
}
}
