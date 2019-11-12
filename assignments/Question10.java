package assignments;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		// Question a. 
		/*System.out.println("Enter the initial velocity: "); 
		double u=input.nextDouble();
		System.out.println("Enter the time travelled: ");
		double t=input.nextDouble();
		System.out.println("Enter the acceleration: ");
		double a=input.nextDouble();
		double s=u*t+0.5*a*Math.pow(t, 2);
		System.out.println("Distance travelled is: "+s);
		*/
		
		//Question b.
		System.out.println("========================================");
		/*
		 * System.out.println("Enter side 1 of a triangle: "); double
		 * s1=input.nextDouble(); System.out.println("Enter side 2 of a triangle: ");
		 * double s2=input.nextDouble();
		 * System.out.println("Enter side 3 of a triangle"); double
		 * s3=input.nextDouble(); double sp=(s1+s2+s3)/2;
		 * 
		 * double area=Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
		 * System.out.println("Area of triangle is: "+ area);
		 */
		
		//Question c.
		System.out.println("Enter b: ");
		double b= input.nextDouble();
		System.out.println("Enter a : ");
		double a=input.nextDouble();
		System.out.println("Enter c: ");
		double c=input.nextDouble();
		 double x=(-b+Math.sqrt(Math.pow(b, 2))-4*a*c)/2*a;
		 System.out.println("Value of x is "+x);
		
		
		  
		
		
		
		
		
	}

}
