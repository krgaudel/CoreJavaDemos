package day21_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
	public static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		try {
			System.out.println("try start..");
		Scanner input = new Scanner(System.in);      //java.util.InputMismatchException if entered string value on a or b 
		System.out.println("Enter num a: ");
		int a = input.nextInt();
		System.out.println("Enter num b: ");
		int b = input.nextInt();
		
		System.out.println(ExceptionDemo2.divide(a, b));	//java.lang.ArithmeticException if b=0 entered
		}catch(ArithmeticException e){} 
		 catch(InputMismatchException e) {};                 //try-catch handles exception		
		 System.out.println("try end...");
}													// can have more than one catch
	                               // code that gives exceptions are enclosed inside try{ ....}
	               //followed by catch(Exception_class_name e) {}
}