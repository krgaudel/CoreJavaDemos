package day17_String;

public class StringDemo1 {
	public static void main(String[] args) {
		//Implicit creation without making object
		String s1="Hello";
		System.out.println(s1);
		
		//Explicit creation by making object
		String s2 = new String();// blank string
		System.out.println(s2);
		
		String s3=new String("Hello");
		System.out.println(s3);
		
		char [] array1= {'H','e','l','l','o'};// string can also be made by making array of characters
		String s4=new String(array1);
		System.out.println(s4);
		
		byte[] array2= {65,73,74,80,5,125};  // String can also be made by making array of bytes
		String s5=new String(array2);
		System.out.println(s5);
	
	}
	}

	
