package assignments;

import java.util.Scanner;

public class Question28c {
	public void primeNumber(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the start number: ");
		int startNum = input.nextInt();
		System.out.println("Enter the end number: ");
		int endNum = input.nextInt();
		int pNum = startNum;
		while (pNum >= startNum && pNum <= endNum) {
			Question28c obj = new Question28c();
			obj.primeNumber(pNum);
			pNum++;

		}

	}
}