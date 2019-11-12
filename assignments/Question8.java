package assignments;

import java.util.Scanner;

//8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
public class Question8 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the celcius temp: ");
	double c1=input.nextDouble();
	double f1=c1*1.8+32;
	System.out.println(c1+" degree celcius  is equals to "+ f1+" degree Fahrenheit.");
	
	System.out.println("======================================================");
	
	System.out.println("Enter the Fahrenheit temp: ");
	double f2=input.nextDouble();
	double c2=(f2-32)/1.8;
	System.out.println(f2+" degree fahrenheit is equals to "+ c2+" degree celcius ");
	
}
}
