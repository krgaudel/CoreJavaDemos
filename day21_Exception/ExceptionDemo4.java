package day21_Exception;


import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// int []arr=new int[1];
		Scanner input = new Scanner(System.in); // java.util.InputMismatchException if entered string value on a or
		                                         // b
		try {
			System.out.println("try start..");
			
			System.out.println("Enter num a: ");
			int a = input.nextInt();
			System.out.println("Enter num b: ");
			int b = input.nextInt();

			System.out.println(ExceptionDemo2.divide(a, b)); // java.lang.ArithmeticException if b=0 entered
		} catch (Exception e) {
			System.out.println("Inside Catch");
		} finally {
			System.out.println("Inside finally ");   // Finally always runs, does not matter if the program has Exceptions or not
			input.close(); // input.close() close the Scanner resource
			

		}
		System.out.println("try end...");
	}

}
