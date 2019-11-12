package day16c_AccessModifier;

public class AccessModifierDemoChild extends AccessModifierDemo {
	
	
public static void main(String[] args) {
	AccessModifierDemo obj=new AccessModifierDemo(3.4);
	obj.defaultMethod();      
	obj.publicMethod();
	//obj.privateMethod();   // Private method can not be accessed in child class
	obj.protectedMethod();
}

}
