package day11;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int[][]arr= {{10,20,30},{11,22,33},{44,55,66}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println();
			
		}
	}

}
