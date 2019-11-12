package Day14;

public /*abstract*/ interface InterfaceDemo1 {  // can write abstract or not, compiler writes abstract 
	void m1();
	abstract void m2(); // can make method by the following ways, By default public abstract void
	public void m3();    // can not make private, protected, static and final methods in interface class
	public abstract void m4();
	
	
	 int a=5;
	 final int a2=5;      // can initialize the variables in the following ways, By default public static final 
	 static int a3=5;
	 public int a4=5;
	 static final int a5=5;
	 public final int a6=5;
	 public static final int a8=5;  // cannot make constructor of interface class
	                                //can not make any type of block
	                                // must give implementation of all the methods that we make in interface class 
	                                //by making another class
	                                // written as implements and parent class name instead of extends

}
