package day12;

public class Derieved extends Base{
	//hiding variable
	String name="Derieved";
	//Overriding of method
	public void greet() {
		System.out.println(name);
		System.out.println(super.name);// super acts like reserved word 'this' and pulls name from base
		
		System.out.println(" Good Morning from: "+name);
		super.greet();
	}
}
// Question can we use super in main method or parent class?