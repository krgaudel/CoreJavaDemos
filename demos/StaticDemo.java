package demos;

public class StaticDemo {
public static int a=5;
	
	public static void sayHello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo.a);// class name.static variable
		StaticDemo.sayHello();// 
		
	}

}
