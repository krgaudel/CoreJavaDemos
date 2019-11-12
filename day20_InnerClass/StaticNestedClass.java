package day20_InnerClass;

public class StaticNestedClass {
	static int outerVar=15;
	public static void outerMethod() {
		System.out.println("outer static metod...");
	}
	public static class InnerClass{           // you can not make the outer class static but  
		static int innervar=20;                // inner class canbe made static if we need to make static 
		public static void innerMethod() {      // variables, methods etc inside inner class.
			System.out.println("Inner static Method..");
		}
	}

	public static void main(String[] args) {
		//StaticNestedClass outerobj=new StaticNestedClass(); // no need to make object because all variables and methods are static
		System.out.println(StaticNestedClass.outerVar);
		StaticNestedClass.outerMethod();
		
		//InnerClass innerobj=new InnerClass();// call from class name, no need of making objects
		System.out.println(StaticNestedClass.InnerClass.innervar);
		StaticNestedClass.InnerClass.innerMethod();
	}

}
