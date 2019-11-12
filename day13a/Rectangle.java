package day13a;

public class Rectangle extends Shape {
	public  void draw() {
		Point p1=new Point(20,30);
		Point p2=new Point(30,40);
		Point p3=new Point(50,60);
		Point p4=new Point(70,80);
		System.out.println("Rectangle is drawn...using point p1 "+ p1.getX()+ " "+p1.getY());
		System.out.println("Rectangle is drawn...using point p2 "+ p2.getX()+ " "+p2.getY());
		System.out.println("Rectangle is drawn...using point p3 "+ p3.getX()+ " "+p3.getY());
		System.out.println("Rectangle is drawn...using point p4 "+ p4.getX()+ " "+p4.getY());

	}

}
