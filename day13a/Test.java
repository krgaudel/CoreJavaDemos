package day13a;

public class Test {
	public static void main(String[] args) {
		Shape shape;
	
		
		shape=new Triangle(); //  shape is a reference variable. (Triangle object)=new Triangle()
		shape.draw();         // shape can be assigned to child object. since we can not make 
		System.out.println("+++++++++++++++");// object of abstract class, this method is useful
		shape=new Rectangle();
		shape.draw();
		
	}

}
