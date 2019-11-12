package demos;

public class LiteralsDemo {
	public static void main(String[] args) {

//1.Integer Literal e.g  1, 656, etc (By default integer )

		byte b1 = 127;
		short s1 = 127;
		int i1 = 127;
		long l1 = 127;
		long l2 = 2147483647;// no need to write l at the end if long value is up to the integer max value
								// i.e. 2147483647
		long l4 = 2147483648L;

//2.floating Literal e.g.   10.46, 200.58 etc (By default double)

		double d1 = 45.60;
		float f1 = 45.60f;// needs to put F at the end because floating literals are double by default

//3.Boolean Literal: True or False
		boolean b2 = true;
		boolean b3 = false;

//4.Character Literal:  must be single character inside single quote or character in unicode
		char c1 = 'a';
		char c2 = '1';
		char c3 = '?';
		char c4 = '\u0065'; // Can also write character in unicode

//5.String Literal         Must be in double quote
		String s2 = "hello";
		String s3 = "a";
		String s4 = "";
		String s5 = " ";
		String s6 = "";
		String s7 = "12345";
		String s8 = "My name is Kul";

//6. Null Literal
		String s9 = null;

		LiteralsDemo obj = new LiteralsDemo(); // This is how we write object in JAVA
		LiteralsDemo obj1 = null;

	}

}
