package day17_String;
//thread safe
//more useful in multithreaded programming
public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Good ");
		System.out.println(sb);
		
		sb.insert(5, "Morning");
		System.out.println(sb);
		
		sb.delete(5, 12);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

	}

}
