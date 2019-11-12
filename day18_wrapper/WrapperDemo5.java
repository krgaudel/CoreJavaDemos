package day18_wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo5 {

	public static void main(String[] args) {
		// 5.In Data structure programming
		//if you need list of data, you can us List 
		List <String>l1=new ArrayList<String>(); //List is a interface given by java in java.util package
		l1.add("Ram");                         //ArrayList is a implementing class
		l1.add("Sita");               // List is a collection of similar elements in the form of objects
		l1.add("Hari");                     // can add anytype of data, int, string, boolean etc, not good!! if <String> is not there
		
		System.out.println(l1);
		
		List <Integer>l2=new ArrayList<>(); // has to be Integer, not int because List is collection of similar elements in the form of objects
		l2.add(5);
		l2.add(10);
		l2.add(15);
		System.out.println(l2);
		
	}

}
