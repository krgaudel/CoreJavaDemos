package day17_String;

public class StringDemo3 {
	public static void main(String[] args) {
		String s1="Good Morning";
		System.out.println(s1.substring(5));// Morning. Returns a string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string
		System.out.println(s1.substring(0, 4));// Good
		System.out.println(s1.toUpperCase());//GOOD MORNING
		System.out.println(s1.toLowerCase());// good morning
		System.out.println(s1.contains("Good"));//true
		System.out.println(s1.charAt(0));// G
		System.out.println(s1.substring(0, 1).toLowerCase());//g
		
		String s2="     Kul Raj Gaudel      ";
		System.out.println(s2.trim());//Kul Raj Gaudel. trims white space at the begging and end, not in the middle
		System.out.println(s1.concat(s2)); // Good Morning     Kul Raj Gaudel   
		System.out.println(s1.replace("Morning", "Evening"));
		
	}

}
