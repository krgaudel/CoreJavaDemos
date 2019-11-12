package demos;

import java.util.Scanner;

public class MethodDemo2 {
	//<access modifier> void <method name>(any num of args) {
	//any num of statements
	//}
	public void printInfo(String name, int age, double salary) {
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+ age);
		System.out.println("Salary is "+ salary);
	}
	public void greet(String name, String message) {
		System.out.println( "Hello "+ name+" "+ message);
	}
	public void isPrime(int num){
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a mumber: ");
	int n=input.nextInt();	
	MethodDemo2 obj=new MethodDemo2();
	obj.isPrime(n);
	
	//obj.greet(" kul", "good morning!");// this is taking user input direct from hard code
	
	System.out.println("Enter name: ");
	String name= input.next();
	System.out.println("Enter greeting:");
	String greet=input.next();
	obj.greet(name, greet);
	
	System.out.println("Enter name: ");
	String name1=input.next();
	System.out.println("Enter age: ");
	int age=input.nextInt();
	System.out.println("Enter salary: ");
	double salary=input.nextDouble();
	MethodDemo2 obj1=new MethodDemo2();
	obj1.printInfo(name1, age, salary);
	
	
}
}
