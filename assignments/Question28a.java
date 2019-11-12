package assignments;

import java.util.Scanner;

public class Question28a {
	public void primeNumber(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		Question28a obj=new Question28a();
		obj.primeNumber(num);

	}

}
