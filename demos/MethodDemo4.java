package demos;

public class MethodDemo4 {
	public static void printArray1(int[] arr) {    //[] can be replaced by ...
		for(int a:arr) {
			System.out.println(a);
		}
	}
	public static void printArray2(int... arr) { // if ... used, values can also be passed without making an array
		for(int a: arr) {
			System.out.println(a);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int [] array= {10,20,30,40};
		MethodDemo4.printArray1(array);
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		MethodDemo4.printArray2(array);
		MethodDemo4.printArray2(1,2,3,4,5);//can be passed values without making separate array
		                                   // this method can be used to sort if we do not know how many elements we have
		                                   // can also be passed other arguments but int...arr has to be the last argument
		                                   // can have only one of ... type array in one method
		
	}
}