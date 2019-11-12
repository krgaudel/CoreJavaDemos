package demos;

public class DataTypeDemo {
	public static void main(String[] args) {
		byte b1 = 127;// max range
		byte b2 = -128;// min range
		
		int i1=2147483647;
		int i2=-2147483648;
		
		long l1=9223372036854775807L;// must include letter l or L at the end
		long l2=-9223372036854775808L;//must include letter l or L at the end
		long l3=50;
		
		double d1=1.7976931348623157E308;
		double d2= 4.9E-324;
		
		float f1=3.4028235E38f;// must include f or F
		float f2=1.4E-45f;// must include letter f or F
		float f3=10;
		
		char a= 'a';
		char b='@';

		
		  System.out.println(Byte.MAX_VALUE);// to find out max range of any data type
		  System.out.println(Byte.MIN_VALUE);// to find min range of any data type
		  System.out.println(Byte.SIZE);// to find size (bites)
		  System.out.println(Byte.BYTES);//to find Byte
		  
		  System.out.println(Short.MAX_VALUE);//32767
		  System.out.println(Short.MIN_VALUE);//-32768
		  System.out.println(Short.SIZE);//16 System.out.println(Short.BYTES);//2
		  
		  
		  
		  System.out.println(Integer.MAX_VALUE);//2147483647
		  System.out.println(Integer.MIN_VALUE);//-2147483648
		  System.out.println(Integer.SIZE);//32 System.out.println(Integer.BYTES);//4
		 		
		  System.out.println(Long.MAX_VALUE);
		  System.out.println(Long.MIN_VALUE);
		  System.out.println(Long.SIZE);
		  System.out.println(Long.BYTES);
		
		
		System.out.println("Max value for duble is: "+Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.SIZE);
		System.out.println(Double.BYTES);
		
		System.out.println("Max value for float is "+Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.SIZE);
		System.out.println(Float.BYTES);
		
		
		System.out.println("Max value of char is "+Character.MAX_VALUE);
		System.out.println("Min Value of char is "+Character.MIN_VALUE);
		System.out.println("Size of character is " + Character.SIZE);
		System.out.println("Bytes of character is "+Character.BYTES);
		
		
		
		
	}

}
