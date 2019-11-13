package day21_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		int []arr=new int[1];
		try {
			System.out.println("try start..");
		Scanner input = new Scanner(System.in);      //java.util.InputMismatchException if entered string value on a or b 
		System.out.println("Enter num a: ");
		int a = input.nextInt();
		System.out.println("Enter num b: ");
		int b = input.nextInt();
		arr[2]=ExceptionDemo2.divide(a, b);// java.lang.ArrayIndexOutOfBoundsException because divide(a,b) will never go to index 2
		System.out.println(ExceptionDemo2.divide(a, b));	//java.lang.ArithmeticException if b=0 entered
		}catch(ArithmeticException e){System.out.println(e);} 
		 catch(InputMismatchException e) {System.out.println(e);}
		 catch(Exception e) {System.out.println(e);}                       //  try-catch handles exception, can have more 		
		 System.out.println("try end...");                 // than one catch to handle more exceptions
		                                      // if we do not know what kind of exception,
                                              // just write Exception e
	}

}
