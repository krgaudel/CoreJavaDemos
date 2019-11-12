package demos;

public class VariableDemoObject {
	int a = 5;// instance variable(non static variable)
	static int i=5;// static variable can only be inside class block (class member data)
	VariableDemoObject obj1=new VariableDemoObject(); //reference static

	public void print() {
		String name = "kul";// local variable
		VariableDemoObject obj2=new VariableDemoObject();// reference local
	}

	public static void main(String[] args) {
		double d = 3.5;// local variable
		VariableDemoObject obj3=new VariableDemoObject();// reference local variable
	
	}

}
