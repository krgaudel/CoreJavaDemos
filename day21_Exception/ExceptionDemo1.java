package day21_Exception;

import java.util.Scanner;

public class ExceptionDemo1 {
	String name;
	public static void main(String[] args) {
		ExceptionDemo1 obj1=new ExceptionDemo1();
		ExceptionDemo1 obj2=null;
		System.out.println(obj1.name);
		//System.out.println(obj2.name);//  java.lang.NullPointerException
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter num a: ");
		int a =input.nextInt();
		System.out.println("Enter num b: ");
		int b =input.nextInt();
		System.out.println(a/b);//java.lang.ArithmeticException  if you enter b=0
								//java.util.InputMismatchException if you put string for a or b eg. a=one


		
		
		

	}

}
