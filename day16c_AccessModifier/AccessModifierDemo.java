package day16c_AccessModifier;

public class AccessModifierDemo {
	int defaultVariable;
	public int publicVariable;
	protected int protectedVariable;
	private int privateVariable;
	
	void defaultMethod() {
		
	}
	
	public void publicMethod() {
		
	}
	
	protected void protectedMethod() {
		
	}
	 private void privateMethod() {
		 
	 }
	 
	 
	 
	 public AccessModifierDemo() {
		 System.out.println("This is public constructor");
	 }
	 
	  AccessModifierDemo(int a) {
		 System.out.println("This is default constructor");
	 }
	  
	  private AccessModifierDemo(String s) {
			 System.out.println("This is private constructor");
		 }
	  
	  protected AccessModifierDemo(double d) {
			 System.out.println("This is protected constructor");
		 }
	  
	  public static void main(String[] args) {
		AccessModifierDemo obj=new AccessModifierDemo("Ram");
		obj.defaultMethod();      // all types of access modifiers can be accessed in the same class
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
	}

}
	
