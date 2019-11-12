package demos;

public class MethodDemo3 {
	public void printArray(int[] arr) {
		for(int a:arr) {
			System.out.println(a);
		}

	}

	public int[] returnArray() {
		int[] arr = { 10, 20, 30, 40 };
		return arr;

	}
	
	public static void main(String[] args) {
		MethodDemo3 obj=new MethodDemo3();// making object to call method from non static 
		int[] array=obj.returnArray();// obj.returnArray() returns arr and holds in array
		obj.printArray(array);// obj.printArray(array) prints array elements
		
	}
}
