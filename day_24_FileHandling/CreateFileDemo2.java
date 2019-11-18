package day_24_FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo2 {

	public static void main(String[] args) {
		File object = new File("C:\\Users\\kulga\\OneDrive\\Desktop\\FileHandling\\file2.txt");

		if (!object.exists()) {
			try {
				object.createNewFile();
				System.out.println("File created");

			}

			catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File already exists ");

		}
	}
}
