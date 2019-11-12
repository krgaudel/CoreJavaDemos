package day20_InnerClass;

import day20_InnerClass.NonstaticClass.InnerClass; // Automatically imported the inner class while 
                                                   //accessing inner class object just like we access library class
public class NonStatciTest {

	public static void main(String[] args) {
		NonstaticClass outerobj=new NonstaticClass();  // to access outer class we make object of outer class and call
		System.out.println(outerobj.outerVariable);
		outerobj.outerMethod();

		                                               // to access inner class we make object of inner class
		InnerClass innerobj=outerobj.new InnerClass();//must use outer class object to access inner class while making inner class object
		System.out.println(innerobj.innerVariable);   // Inner class must be imported to access inner class object, imports automatic
		innerobj.InnerMethod();

	}

}
