package day11;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr= {10,20,23,45,67};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
