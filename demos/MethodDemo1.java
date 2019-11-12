package demos;

public class MethodDemo1 {
	//<access modifier>void<method name>(){
	//any number of statement
	//}
	
	public void greet() {
	
		System.out.println("hello");
		System.out.println("Good Morning");
	}
public static void main(String[] args) {
	System.out.println("Main Start");
	
	MethodDemo1 obj=new MethodDemo1();//this is an object
	obj.greet();//method calling
}
}
