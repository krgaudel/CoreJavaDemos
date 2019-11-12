package demos;

public class NestedIfElse {
	public static void main(String[] args) {
		int a = 9;
		int b = 8;
		int c = 1;

		if (a > b) {
			if (a > c) {
				System.out.println("a is greatest");
			} else
				System.out.println("c is the greates");
		} else {
			// System.out.println("may be b or c is greater than a");
			if (b > c) {
				System.out.println("b is the greatest");
			} else {
				System.out.println("c is the greatest");
			}
		}
		System.out.println("rest of the code");

	}
}
