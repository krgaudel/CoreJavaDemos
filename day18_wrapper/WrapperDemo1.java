package day18_wrapper;
// 4. Object oriented representation of primitive
public class WrapperDemo1 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s1==s3);//false
		
		
		// Boxing (autoboxing)
		int a=5;//primitive
		Integer i=new Integer(a);//primitive to object
		System.out.println(a);
		System.out.println(i);
		System.out.println(a==i);// why true?
		
		
		Integer ii=Integer.valueOf(a); //another way of converting primitive to object
		System.out.println(ii);
		
		
		
		
		
	}

}
