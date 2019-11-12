package day13a;

public class Triangle extends Shape {
	public  void draw() {
		Point p1=new Point(20,30);
		Point p2=new Point(30,40);
		Point p3=new Point(50,60);
		System.out.println("Triangle is drawn...using point p1 "+ p1.getX()+ " "+p1.getY());
		System.out.println("Triangle is drawn...using point p2 "+ p2.getX()+ " "+p2.getY());
		System.out.println("Triangle is drawn...using point p3 "+ p3.getX()+ " "+p3.getY());
	}

}

