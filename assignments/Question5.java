package assignments;
//5.	Write a program to find the area of circle, rectangle, and triangle.
import java.util.Scanner;

public class Question5 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the radius of circle: ");
	double r=input.nextDouble();
	double areaC=3.14*r*r;
	System.out.println("Area of the circle is: "+areaC);
	
	
	System.out.println("+++++++++++++++++++++++++++++++++++");
	
	
	System.out.println("Enter the length of a rectangel: ");
	double l = input.nextDouble();
	System.out.println("Enter the breadth of a rectangle: ");
	double b = input.nextDouble();
	double areaR=l*b;
	System.out.println("Area of a rectangle is: "+areaR);
	
	System.out.println("+++++++++++++++++++++++++++++++++++++");
	
	System.out.println("Enter the base of a triangle: ");
	double base=input.nextDouble();
	System.out.println("Enter the height of a triangle:  ");
	double height=input.nextDouble();
	double areaT=base*height/2;
	System.out.println("Area of a triangle is: "+ areaT);
	
	
}
}
