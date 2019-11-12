package day2;

import java.util.Scanner;

public class TempConversion {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(" pick 1 for Celsius To Fahrenheit or 2 for Fahrenheit To Celsius");
		int pick=input.nextInt();
		if(pick==1) {
		System.out.println("Enter the Celsius value : ");
		double celsius= input.nextDouble();
		
		double fahrenheit=(celsius*9/5)+32;
		System.out.println("The faherenheit value for "+ celsius + " degree celsius is " + fahrenheit +" degree Fahrenheit");
		
		}
		else{
		
			System.out.println("Enter the Faherenheit value :  ");
			double fahrenheit=input.nextDouble();
			double celsius=(fahrenheit-32)*5/9;
			System.out.println("The degree value for "+ fahrenheit+" Fahrenheit is " + celsius+ " degree Celsius");
		
		}
		

		                                                                                                                                                                                                                                
	}
}

