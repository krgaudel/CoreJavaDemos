package day11;

public class ForEachDemo2 {
	public static void main(String[] args) {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		for (int[] ar :arr) {             // first convert two dimension array(e.g. arr) into one dimension array(e.g. ar)
			for(int i : ar) {             // then follow the same procedure as one dimension array, array type, variable, : array name
				System.out.print(i+ " ");// print variable (e.g.i)
			}
			System.out.println();
		}
		
	
	}
}
