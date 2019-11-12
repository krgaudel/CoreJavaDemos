package day16_Polymorphism;

import java.util.Scanner;
//An example of runtime polymorphism(dynamic binding)

public class AnimalTest {
	
	
	public static void getAnimalSound(Animal animal) { // when we send object to animal, it will know what animal sound to make
		//unknown which animal sound will occur
		animal.makesSound();  // this method does not know which animal sound it will make
		
	}

	public static void main(String[] args) {
		//Animal animal=new Cat();
		//getAnimalSound(animal);
		
		//Animal animal=new Dog();
		//getAnimalSound(animal);
		Animal animal=null;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your animal choice ");
		String choice=input.next();
		switch (choice) {
		case "cat":
			 animal=new Cat();
			break;
        case "dog":
        	animal=new Dog();
			break;
		default:
			System.out.println("This is not your animal choice");
			break;
		}
		if (animal!=null) {
			getAnimalSound(animal);
			
		}
		
		

}
}
