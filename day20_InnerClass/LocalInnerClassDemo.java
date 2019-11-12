package day20_InnerClass;

public class LocalInnerClassDemo {
	
	public void greet() {                  // In java, we can make class inside a method also, this is called local class
		
		String msg="Good Morning";
		
		 class LocalInner {
			 String s="Hello";
			 public String sayHello() {      //  method scope is within, therefore sayHello scope is within greet method
				 return s;
			 }
			
		}
		 LocalInner ob=new LocalInner();// Local method should be called here first
		 String greetings=ob.sayHello()+" "+ msg;
		System.out.println(greetings);
	}

	public static void main(String[] args) {
		LocalInnerClassDemo obj=new LocalInnerClassDemo();

		obj.greet();
		
		
	}

}
