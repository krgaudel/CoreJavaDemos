package day18_wrapper;

import javax.swing.JOptionPane;

public class WrapperDemo3 {

	public static void main(String[] args) {
		String n1="5";
		String n2="6";
		
		String n3=JOptionPane.showInputDialog("Enter n3 ");//e.g "1". Enters number as string
		String n4=JOptionPane.showInputDialog("Enter n4 ");
//		
//		Integer i=new Integer(n3);
//		Integer ii=new Integer(n4);
//		int sum=i+ii;
//		System.out.println(sum);
		
		//3. converting a numeric string into its corresponding number type
		Integer int1=Integer.parseInt(n3);// functions same as=>Integer i=new Integer(n3);
		Integer int2=Integer.parseInt(n4);//functions same as =>Integer ii=new Integer(n4);
		int sum=int1+int2;
		System.out.println(sum);
		

	}

}
