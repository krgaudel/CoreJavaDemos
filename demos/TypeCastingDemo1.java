package demos;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		
		//Implicit-type casting
		//By Java compiler
		byte b = 127;
		int i = b;
		
		//Explicit-type casting
		//By programmer
		int ii= 127;
		//byte bb = ii; //can not covert int to byte because byte is smaller than int
		byte bb =(byte) ii;
		
		
		int x = 4;
		int y = 10;
		double div= (double) x/y;   /// type casting done to give accurate result for div
		 System.out.println(div);
		
		
	}
}
