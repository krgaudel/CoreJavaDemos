package day17_String;

public class StringBuilderDemo1 {
	public static void main(String[] args) {
		String s="Good";
		System.out.println(s);
		StringBuilder sb=new StringBuilder("Good");// StringBuilder is a library class that is mutable
		System.out.println(sb);//Good
		
		s.concat("Morning");
		System.out.println(s);//Good.  because s is immutable
		
		sb.append(" Morning");
		System.out.println(sb);// Good Morning. because sb is object of mutable class StringBuilder
		
	}

}
