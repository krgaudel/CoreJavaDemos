package demos;

import java.util.Scanner;

public class SwitchCaseDemo1 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your choice");
	int choice=input.nextInt();
	
	switch(choice) {
	
	case 1:
		System.out.println("addition: ");
		break;
		
	case 2:
		System.out.println("Subtraction: ");
		break;
		
	case 3:
		System.out.println("Multiplication: ");
		break;
	case 4:
		System.out.println("Division: ");
		break;
		
	default:
		System.out.println("wrong entry");
		break;
		
	}
}
}
