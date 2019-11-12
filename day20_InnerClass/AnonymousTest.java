package day20_InnerClass;

public class AnonymousTest {

	public static void main(String[] args) {
		AnonymousDemo obj= new AnonymousDemo();
		
		AnonymousDemo ob= new AnonymousDemo() {
			public void display() {
				System.out.println("Hello From my side..");
			}
			
		};                                           // can also be called method by curley braces included
                                                      // this method is called anonymous inner class
		obj.display();
		ob.display();// Now this ob is displaying from anonymous class by overriding method.

	}

}
