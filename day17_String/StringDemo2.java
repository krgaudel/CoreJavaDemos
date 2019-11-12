package day17_String;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");

		System.out.println(s1 == s2);// outputs true because both s1 and s2 are stored in the same object in the
										// string pool area
		System.out.println(s3 == s4);// outputs false because new object is made when declared variable by object
										// method and stored in two different objects in heap area
		System.out.println(s1 == s3);// false because stored in two separate area, one in string pool and another in
										// heap area , they both have different objects

		System.out.println(s1.equals(s3));// true. if contents are exactly same and have to show them equal, then follow
											// this method
		System.out.println(s1.contentEquals(s3));
		String s5 = "hello";
		System.out.println(s1.equals(s5));// false because h is lower case in s5
		System.out.println(s1.equalsIgnoreCase(s5));// true because it ignores the case

		System.out.println(s1.contentEquals(s5));// false

	}

}
