package day_24_FileHandling;

import java.io.File;

public class CreateFolderDemo1 {
// how to create a folder
	public static void main(String[] args) {
		File obj=new File("C:\\Users\\kulga\\OneDrive\\Desktop\\FileHandling");
			obj.mkdirs();
			
			
		}
	}


