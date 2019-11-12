package assignments;

import java.util.Scanner;

//21.	Program to input the number of (1...7) and translate to its equivalent name of the day of the week.
public class Question21 {
	public static void main(String[] args) {
		Scanner days=new Scanner(System.in);
		System.out.println("Enter day of the week 1-7 :");
		int day=days.nextInt();
		if (day>=1 && day<=7) {
			switch(day) {
			case 1:
				System.out.println(" Monday ");
				break;
			case 2:
				System.out.println(" Tuesday ");
				break;
			case 3:
				System.out.println(" Wednesday ");
				break;
			case 4:
				System.out.println(" Thrsday ");
				break;
			case 5:
				System.out.println(" Friday ");
				break;
			case 6:
				System.out.println(" Saturday ");
				break;
			case 7:
				System.out.println(" Sunday ");
				break;
			}
		}
	else {
				System.out.println(" You entered outside the range ");
				
			}
			
		}
		
	}


