package assignments;

//31.	Write a Program display following patterns.
/*
1
12	
123
1234
12345
*/
public class Question31 {

	public static void main(String[] args) {
		int row = 5;// rows are fixed but column can be declared as how many elements we want in
					// each column
		int[][] arr = new int[row][];

		// to take how many elements we need in each columns, we declare as follows
		arr[0] = new int[1];// in 0th row, one element
		arr[1] = new int[2];// in 1th row, two elements
		arr[2] = new int[3];// in 2th row, three elements
		arr[3] = new int[4];// in 3th row, four elements
		arr[4] = new int[5];// in 4th row, five elements

		arr[0][0] = 1;
		arr[1][0] = 1;
		arr[1][1] = 2;
		arr[2][0] = 1;
		arr[2][1] = 2;
		arr[2][2] = 3;
		arr[3][0] = 1;
		arr[3][1] = 2;
		arr[3][2] = 3;
		arr[3][3] = 4;
		arr[4][0] = 1;
		arr[4][1] = 2;
		arr[4][2] = 3;
		arr[4][3] = 4;
		arr[4][4] = 5;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
