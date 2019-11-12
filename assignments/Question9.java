package assignments;

import java.util.Scanner;

//9.	Write a program that converts pounds into kg. The program prompts the user to enter number of pounds,
//      converts it to kg and displays the result [1 pound is 0.454 kg].
public class Question9 {
	public static void main(String[] args) {
	System.out.println("Enter number of pounds: ");
	Scanner pounds=new Scanner(System.in);
	double p1=pounds.nextDouble();
	double kg=p1/2.2046;
	System.out.println(p1+" pound is "+ kg+ " kg");
	
		
	}

}
