package assignments;
//14.	Write a program to relate two integers entered by user using = =or > or < sign.
import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int a=input.nextInt();
		System.out.println("Enter second integer: ");
		int b=input.nextInt();
		if(a==b) {
			System.out.println("Two integers are same");
		}
		else if(a>b) {
			System.out.println("First integer is greater than second integer");
		}
		else if(a<b) {
		System.out.println(" first integer is smaller than second integer");
		}	
		
	}

}
