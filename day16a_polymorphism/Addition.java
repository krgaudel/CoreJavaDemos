package day16a_polymorphism;
// This is an example of overloading of method. We can make multiple methods with the same name 
//as long as the arguments differ.  
public class Addition {
	public void sum() {
		int a=5;
		int b=10;
		int add=a+b;
		System.out.println("Sum is =>" + add);
	}
	
	public void sum(int a) {
		int b=10;
		int add=a+b;
		System.out.println("Sum is==> " + add);
		
	}
	
	public void sum(int a, int b) {
		int add=a+b;
		System.out.println("Sum is ===>" + add);
	}
	

	public void sum(double a, double b) {
		double add=a+b;
		System.out.println("Sum is ====>" + add);
	}
	
	public static void main(String[] args) {
		// an example of compile time polymorphism(static binding)
		Addition object=new Addition();
		object.sum();
		object.sum(100);
		object.sum(100,200);   // method with matching type argument is called even thought the method name
		object.sum(4.5,5.5);  // is same
	}

}
