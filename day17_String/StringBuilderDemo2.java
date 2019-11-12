package day17_String;
//thread not safe
//efficient
public class StringBuilderDemo2 {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Good ");
		System.out.println(sb);
		
		sb.insert(5, "Morning");
		System.out.println(sb);
		
		sb.delete(5, 12);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
