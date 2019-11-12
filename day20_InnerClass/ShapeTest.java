package day20_InnerClass;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();          // Example of calling method in Interface by overriding in another class
		obj.draw();

		Shape triangle = new Shape() {

			@Override            // Example of Anonymous method...overriding of draw method that is in Shape Interface
			public void draw() {
				System.out.println(" Triangle drawn on the fly, without making another clas..");

			}

		};
		triangle.draw();
	}
}