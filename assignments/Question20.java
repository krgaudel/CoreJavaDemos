package assignments;

import java.util.Scanner;

//20.	Write a program to create the equivalent of a four-function calculator. 
//The program to enter two integer’s numbers and an operator.
//It then carries out the specified arithmetic operator operation: 
//addition, subtraction, multiplication or division of the two numbers. 
//Finally, it displays the result.
public class Question20 {
public static void main(String[] args) {
	Scanner cal=new Scanner(System.in);
	System.out.println("Enter first number: ");
	int a=cal.nextInt();
	System.out.println("Enter second number: ");
	int b=cal.nextInt();
	System.out.println("Enter your arithmetic choice: +, -, * or /: ");
	char choice=cal.next().charAt(0);
	
	switch(choice) {
	case '+':
		int sum=a+b;
		System.out.println("The sum is "+sum);
		break;
	case'-':
		int diff=a-b;
		System.out.println("The difference is "+ diff);
		break;
	case'*':
		int product=a*b;
		System.out.println("The product is "+ product);
		break;
	case '/':
		double div=(double)a/b;
		System.out.println("The division is "+ div);
		break;
		
	default:
		System.out.println("you entered wrong operator ");
		break;
	}
	
}
}
