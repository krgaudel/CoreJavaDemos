package day20_InnerClass;
//Non Statci nested (inner class)
public class NonstaticClass {
	// non static variable (member data)
	int outerVariable = 5;

	//this is non-static method
	public void outerMethod() {
		System.out.println("outer method....... ");
	}
	// this is inner class
	public class InnerClass{
		int innerVariable =10;
		
		
		public void InnerMethod() {
			System.out.println("Inner Method....");
		}
		
	}

	
	

	public static void main(String[] args) {
NonstaticClass outerobj=new NonstaticClass();  // to access outer class we make object of outer class and call
System.out.println(outerobj.outerVariable);
outerobj.outerMethod();

                                               // to access inner class we make object of inner class
InnerClass innerobj=outerobj.new InnerClass();//must use outer class object to access inner class while making inner class object
System.out.println(innerobj.innerVariable);
innerobj.InnerMethod();
	}

}
