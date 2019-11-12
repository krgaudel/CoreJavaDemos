package demos;

public class ElseIfDemo {
	public static void main(String[] args) {
		int marks=91;
		
		if (marks >= 80 && marks <= 100) {
			System.out.println("First Division");
		}
		else if (marks>=70 && marks <= 80) {
			System.out.println("Second Division");
		}
		else if (marks>=60 && marks<70) {
			System.out.println("Third division");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("Rest of the code");
	}

}
