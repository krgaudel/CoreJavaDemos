package day_24_FileHandling;

import java.io.File;
import java.io.IOException;
//How to create an empty file?
public class CreateFileDemo1 {
                                                   // File is a class in io
	public static void main(String[] args) {
		try {
		File file1=new File("C:\\Users\\kulga\\OneDrive\\Desktop\\FileHandling\\file1.txt");// to find file path,control+shift+right click to any folder and copy as path
		if(file1.createNewFile()){                                           // if used forward slash,only one slash works
			System.out.println("File Ccreated: "+file1.getName());        //createsNewFile will create new file
		}else {
			System.out.println("File already exists");
		}
		}catch(IOException e) {
		System.out.println("An error has occured ");
		e.printStackTrace();
	}
		
	}
		

}
