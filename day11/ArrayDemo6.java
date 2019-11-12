package day11;

public class ArrayDemo6 {
	public static void main(String[] args) {
		int row=3;
		int [] [] arr = new int[row][];// in two-dimensional array, row has to be fixed but 
		                               //column size can be left blank and declared later. 
		//to take input in two-dimensional arrays
		//the following decides how many columns each row has
		arr[0]= new int[1];// 0th row has  one column        10
		arr[1]=new int[2];// 1th row has two columns         20 30
		arr[2]=new int[3];// 2th row has three columns       40 50 60
		
		arr[0][0]=10;
		arr[1][0]=20;
		arr[1][1]=30;
		arr[2][0]=40;
		arr[2][1]=50;
		arr[2][2]=60;
		// To print the array elements 
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j <arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
	
	}
	

}
