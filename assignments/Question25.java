package assignments;

import java.util.Scanner;

//25.	Write a program that prompts the user to enter the number of students and each student’s name
//and score. Finally display the student with highest score.
public class Question25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int num = input.nextInt();
		int maxscore = 0;
		String high_score_name = null;
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the name of student: ");
			String name = input.next();// why there is error when Nextline
			System.out.println("Enter the score: ");
			int score = input.nextInt();

			if (score > maxscore) {
				maxscore = score;
				high_score_name = name;
			}
		}
		System.out.println("Student name is: " + high_score_name);
		System.out.println("Higest score is: " + maxscore);

	}

}
