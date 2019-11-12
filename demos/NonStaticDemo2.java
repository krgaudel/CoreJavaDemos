package demos;

public class NonStaticDemo2 {
	
	public static void main(String[] args) {
		NonStaticDemo object=new NonStaticDemo();
		System.out.println(object.a);
		object.sayHello();
	}

}
