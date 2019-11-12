package assignments;
//7.	Write a program that read the radius and length of a cylinder and computes volume.
import java.util.Scanner;

public class Question7 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the radius of a cylinder: ");
	double r1=input.nextDouble();
	System.out.println("Enter the height of a rectangle: ");
	double h1=input.nextDouble();
	
	double v1= 3.14*Math.pow(r1, 2)*h1;
	 System.out.println("Volume of a cylinder is: "+ v1);
}
}
