package day17_String;

import java.util.StringTokenizer;

public class StringDemo6 {
	public static void main(String[] args) {
		String s1="My name is, Kul Raj Gaudel. I am living ,,in Houston Texas,, and i am learning Java";
		String[] array=s1.split(" ");
		System.out.println(s1.length());
		for(String a: array) {
			System.out.println(a);
		}
		System.out.println("===============");
		
		String[] ss=s1.split(", ");
		System.out.println(ss.length);
		for(String a: ss) {
			System.out.println(a);
		}
		System.out.println("============================");
		StringTokenizer obj1=new StringTokenizer(s1);// splits by default on space basis
		while(obj1.hasMoreElements()) {
			System.out.println(obj1.nextElement());
		}
		System.out.println("=============================");
		StringTokenizer obj2=new StringTokenizer(s1, ",");// splits on the basis of ","
		System.out.println(obj2.countTokens());
		while (obj2.hasMoreElements()) {
			System.out.println(obj2.nextElement());
			
		}
	}

}
