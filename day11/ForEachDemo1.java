package day11;

public class ForEachDemo1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i : arr) {//// Enhanced for loop(for each loop) first write array type(e.g. int) and : and array
						
			sum = sum + i;// name inside the for

		}
		System.out.println(sum);
	}
}
