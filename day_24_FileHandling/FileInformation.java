package day_24_FileHandling;

import java.io.File;

public class FileInformation {
	//some common methods in File class

	public static void main(String[] args) {
		File obj=new File("C:\\Users\\kulga\\OneDrive\\Desktop\\FileHandling\\file1.txt");
		if(obj.exists()) {
			System.out.println("File name is: "+obj.getName());
			System.out.println("Absolute path: "+ obj.getAbsolutePath());
			System.out.println("Writeable: "+ obj.canWrite());
			System.out.println("Readable: "+ obj.canRead());
			System.out.println("File size in bytes: "+ obj.length());
		}else {
			System.out.println("The file does not exists ");
		}
		
		

	}

}
