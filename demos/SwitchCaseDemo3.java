package demos;

import java.util.Scanner;

public class SwitchCaseDemo3 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your choice");
	String choice=input.next();
	
	
switch(choice) {
	
	case "add":
		System.out.println("addition: ");
		break;
		
	case "substract":
		System.out.println("Subtraction: ");
		break;
		
	case "multiply":
		System.out.println("Multiplication: ");
		break;
	case "divide":
		System.out.println("Division: ");
		break;
		
	default:
		System.out.println("wrong entry");
		break;
		
	}
System.out.println("Rest of the code");
}
}
