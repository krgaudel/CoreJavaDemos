package day17_String;

public class StringDemo5 {
	public static void main(String[] args) {
		String s1="My name is, Kul Raj Gaudel. I am living in Houston Texas,, and i am learning Java";
		String[] array=s1.split(" ");
		for(String a: array) {
			System.out.println(a);
		}
		System.out.println("===============");
		
		String[] array1=s1.split(", ");
		for(String a: array1) {
			System.out.println(a);
		}
	}

}
