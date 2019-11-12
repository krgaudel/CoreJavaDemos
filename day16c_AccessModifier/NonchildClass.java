package day16c_AccessModifier;

public class NonchildClass {
public static void main(String[] args) {
	AccessModifierDemo obj=new AccessModifierDemo(3.4);
	obj.defaultMethod();      
	obj.publicMethod();
	//obj.privateMethod();   // Private method can not be accessed in nonchild class of same package
	obj.protectedMethod();  
	                        
}
	

}
