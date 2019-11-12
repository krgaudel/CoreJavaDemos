package assignments;

import java.util.Scanner;

//6.	Write a program to find the perimeter of circle, triangle, and rectangle.
public class Question6 {
	public static void main(String[] args) {
		
		  Scanner input=new Scanner(System.in);
		  System.out.println("Enter the radius of a circle: "); double r =
		  input.nextDouble();
		  double perimeterC=2*3.14*r;
		  
		  System.out.println("Perimeter of acircle is: "+perimeterC );
		  
		  System.out.println("++++++++++++++++++++++++++++++++++++++++");
		  System.out.println("Enter side 1 of a triangle: "); double
		  s1=input.nextDouble();
		  System.out.println("Enter side 2 of a triangle: ");
		  double s2=input.nextDouble();
		  System.out.println("Enterside 3 of a triangle: "); double
		  s3=input.nextDouble(); double perimeterT=s1+s2+s3;
		  
		  System.out.println("Perimeter of a triangle is: "+perimeterT);
		  
		  
		  System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		 
		System.out.println("Enter the length of a rectangle: ");
		
		  double l1 = input.nextDouble();
		  System.out.println("Enter the width of a rectangle: ");
		 
		double w1 = input.nextDouble();

		double perimeterR = 2 * (l1 + w1);
		System.out.println("Perimeter of a rectangle is: " + perimeterR);

	}
}
