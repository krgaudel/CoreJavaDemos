package day9;

public class Student {
	String name;
	int roll;
// just like set,, no need to make separate setters
	public void assignValue(String n, int r) {
		name = n;
		roll = r;

	}
	//just like get
	public void displayInfo() {
		System.out.println("Name is: "+ name);
		System.out.println("Roll is: "+ roll);
	}
}