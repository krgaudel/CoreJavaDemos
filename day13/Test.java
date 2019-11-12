package day13;

public class Test {

	public static void main(String[] args) {
		Animal animal;   //in parent class reference variable, we can initialize child class object in the following example
		animal = new Tiger();
		animal.makesSound();
		

		Dog dog = new Dog();
		dog.makesSound();

	}

}
