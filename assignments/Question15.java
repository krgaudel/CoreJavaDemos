package assignments;

import java.util.Scanner;

//15.	Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].
public class Question15 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter an integer between 0-128");
	int i=input.nextInt();
	if(i >=0 && i<= 128) {
		char c = (char)i;
		System.out.println("Ascii conversion for "+i +" is "+c);
	}
	else
	{System.out.println("Num is not in range");

	}

	
	
}
}
