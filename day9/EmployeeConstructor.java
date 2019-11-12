package day9;

public class EmployeeConstructor {
	String name;
	int id;
	double salary;
	// 1st constructor using two variables, we can make more than one constructor
	// constructor is made in class block and constructor name is same as class name
	//access modifier can be public, private or none
	public EmployeeConstructor(String n, int i) {
		name=n;
		id=i;
	}
	//2nd constructors using all three variables
	public EmployeeConstructor(String n, int i, double s) {
		name=n;
		id=i;
		salary=s;
	}
	public void show() {
		System.out.println("Name is: "+ name);
		System.out.println("ID is: "+id);
		System.out.println("Salary is: "+ salary);
	}
	
	public static void main(String[] args) {
		EmployeeConstructor e1=new EmployeeConstructor("Kul", 31,5000);
		e1.show();
		
		EmployeeConstructor e2=new EmployeeConstructor("Mohan", 35, 6000);
		e2.show();
		
		
	}

}
