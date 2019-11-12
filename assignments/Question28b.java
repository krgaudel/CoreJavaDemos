package assignments;

import java.util.Scanner;

//firstNthPrime(int)
public class Question28b {
	boolean isPrime=true;
	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;	
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many firstNthPrime you want ?: ");
		int num=input.nextInt();
		Question28b obj=new Question28b();
		int count=1;
		int startNum=1;
		while(count<=num) {
			startNum++;
				if(Question28b.isPrime(startNum)) {
					System.out.println(startNum);
					count++;
				
					
				}
		}
	}
	
	
}
