package demos;

import java.util.Scanner;

public class SwitchCaseDemo2 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter the operator: +, -, * or /: ");
	
	char c=input.next().charAt(0);
	
switch(c) {
	
	case '+':
		System.out.println("addition: ");
		break;
		
	case '-':
		System.out.println("Subtraction: ");
		break;
		
	case '*':
		System.out.println("Multiplication: ");
		break;
	case '/':
		System.out.println("Division: ");
		break;
		
	default:
		System.out.println("wrong entry");
		break;
		
	}
System.out.println("Rest of the code");
}
}
