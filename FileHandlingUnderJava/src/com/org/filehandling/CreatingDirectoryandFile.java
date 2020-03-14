package com.org.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingDirectoryandFile {

	public static void main(String[] args) throws IOException {
		File directory=new File("S:\\IMAGES\\SUBHAN\\PICS");
		directory.mkdirs();
		System.out.println("Directory created");
		File file = new File("S:\\IMAGES\\SUBHAN\\PICS//Test.txt");
		file.createNewFile();
		System.out.println("File created under specified directory");

	}

}
