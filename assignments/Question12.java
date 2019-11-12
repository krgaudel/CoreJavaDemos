package assignments;
//12.	Write a program to accept the roll, name, and nationality of the person and display those values in good format way.
import java.util.Scanner;

public class Question12 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the name: ");// why i can not type both first and last name ?
	String name=input.nextLine();
	System.out.println("Enter the roll number: ");
	int roll=input.nextInt();
	System.out.println("Enter the nationality: ");
	String nationality=input.next();
	
	System.out.println("Roll number is: "+roll);
	System.out.println("Name is: "+ name);
	System.out.println("Nationality is: "+nationality);
	
	
	
	
	
	
}
}
