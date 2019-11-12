package day15;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape;
		                                                 //similarity
		                                               //int a=5;
		//Object implicitly casting (Upcasting )       //long b=a;
		shape=new Rectangle();
		shape.draw();
		
		shape=new Circle();
		shape.draw();
		
		
		//Rectangle rectangle= new Shape();  can not initiate directly-type casting mismatch
		                                                //similarity
                                                        //long l=5;
       //Object Explicit casting  (downcasting)         //int i=l;
		Shape s=new Shape();                // first needs to make object of parent class
		Rectangle rectangle=(Rectangle) s;  // then do type casting
		                                     // long l=5;
		                                     //int i=(int)l;
		
	}

}
