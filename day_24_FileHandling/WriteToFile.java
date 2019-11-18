package day_24_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	//How to write on a file?

	public static void main(String[] args) {
		try {
			FileWriter mywriter=new FileWriter("C:\\Users\\kulga\\OneDrive\\Desktop\\FileHandling\\file1.txt");
			mywriter.write("I am writing into the file from the java. I am reading out from the file from java");
			mywriter.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		

	}

}
