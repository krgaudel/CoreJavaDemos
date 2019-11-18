package day_24_FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		File obj=new File("C:\\Users\\kulga\\OneDrive\\Desktop\\FileHandling\\file1.txt");
		try {
			Scanner myReader=new Scanner (obj);
			while(myReader.hasNextLine()) {
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
