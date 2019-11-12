package demos;

public class ObjectDemo2 {
public static void main(String[] args) {
	new ObjectDemo2();
	System.out.println(new ObjectDemo2());// prints objectid
	
	ObjectDemo2 obj=new ObjectDemo2();
	System.out.println(obj);//prints objectid
	
	ObjectDemo2 object;
	object=new ObjectDemo2();
	System.out.println(object);//prints objectid
	
	System.out.println(new ObjectDemo2().hashCode());// hashCode() creates hexadecimal part of object id
}
}
