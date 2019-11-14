package practice;
just for practice purpose
import demos.StaticDemo;
import demos.NonStaticDemo;


public class Vehicle {
	public static void main(String[] args) {
		Vehicle toyota=new Vehicle();
		Vehicle honda=new Vehicle();
		
		
		Vehicle lexus;
		lexus=new Vehicle();
		
		Vehicle mazda;
		mazda=new Vehicle();
		
		
		System.out.println(toyota);
		System.out.println(toyota.hashCode());
		StaticDemo.sayHello();
		NonStaticDemo obj=new NonStaticDemo();
		obj.sayHello();		
	}

}
