package day11;

public class ThisDemo {
	String name;

	/*// no need to type this.name =n because local variable name and instance variable names are different
	 * public ThisDemo(String n) {
	 *  name=n;
	 *   }
	 */

	/*// prints out wrong output "null" because local variable name and instance variable is same
	 * public ThisDemo(String name) { 
	 * name = name;
	 *  }
	 */
	// this in front of name variable clarifies that this.name is instance variable that is decleared in class block 
	public ThisDemo(String name) {
		this.name = name;
	}

	public void printInfo() {
		System.out.println("name is: " + name);
	}

	public static void main(String[] args) {
		ThisDemo obj = new ThisDemo("kul");
		obj.printInfo();
	}
}
