package assignments;

import java.util.Scanner;

//33.	Write a Program to display number in ascending order in array.
public class Question33 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int [] arr=new int[5];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter the elements of an array: ");
		arr[i]=input.nextInt();
	}
	
	System.out.println("Before ascending: ");

for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
	
}
int temp=0;
for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}
	
}
System.out.println("After ascending: ");

for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
	
}


	
}
}
