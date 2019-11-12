package day12;

public class BaseTest {
 
	public static void main(String[] args) {
		Base obj=new Base();
		
		//System.out.println(obj.name);
		obj.greet();
		Derieved object=new Derieved();
		//System.out.println(object.name);
		object.greet();
		

	}

}
