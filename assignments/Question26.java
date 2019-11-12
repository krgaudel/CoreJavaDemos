package assignments;
//26.	Write a Program to reverse the given number. //123 => 321
import java.util.Scanner;

public class Question26 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int originalNum=input.nextInt();
		int reverseNumber=0;
		while(originalNum>=1) {
			reverseNumber=reverseNumber*10;
			reverseNumber=reverseNumber+originalNum%10;
			originalNum=originalNum/10;
			
		}
		System.out.println(reverseNumber);
	}

}
