package demos;

public class NonStaticDemo {
	int a=5;
	
	public void sayHello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		NonStaticDemo object=new NonStaticDemo();// to access non static variable , we made object
		System.out.println(object.a);// object name . non static variable
		object.sayHello();
		

	}

}
