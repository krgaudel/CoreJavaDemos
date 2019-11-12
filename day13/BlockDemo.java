package day13;

public class BlockDemo {
	int a;
	static int b;
	static int c;
	static {
		b=0;
		System.out.println("This is statci block, in java static block will be called first");
	}                 // static block will be called implicitly only one time but init block is caled everytime constructor is called

	{
		a = 0;
		System.out.println("init block will be called implicitly");// this is init block inside two curley braces inside
	   }                                                              // class block will be called before calling constructor
     																//init block will be called everytime constructor is called
	public void sayHello() {
		System.out.println(" Hello ");
	}
	static {
		c=0;
		System.out.println("This is another static block, in java all static block will be called first");
	}

	public BlockDemo(String S) {
		System.out.println("This is constructor ");
	}

	public static void main(String[] args) {
		BlockDemo object1 = new BlockDemo("hi");// constructor called by making object
		object1.sayHello();
		System.out.println(object1.a);
		System.out.println("+++++++++++++++++++++++++++++");
		BlockDemo object2 = new BlockDemo("hi");// constructor called by making object
		object2.sayHello();
		System.out.println(object2.a);

	}

}
