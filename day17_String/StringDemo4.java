package day17_String;

public class StringDemo4 {

	public static void main(String[] args) {
		String s1= "Good ";
		System.out.println(s1);
		System.out.println(s1.concat(" morning"));
		s1.concat("Evening");
		System.out.println(s1);// s1 still prints Good; example of immutability 
		
		s1=s1.concat("Evening");// s1 breaks the initial object relation and makes new object
		System.out.println(s1);// now prints Good Evening
	}
}
