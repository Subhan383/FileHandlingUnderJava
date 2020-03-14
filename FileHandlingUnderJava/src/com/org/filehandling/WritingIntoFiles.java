package com.org.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFiles {

	public static void main(String[] args) throws IOException {
		File directory = new File("Subhan/file");
		directory.mkdirs();
		File file = new File("subhan/File/Test.txt");
		file.createNewFile();
		System.out.println("File created inside specified directory");
		try(BufferedWriter writer=new BufferedWriter(new FileWriter(file,true))){
			writer.newLine();
			writer.write("Subhan");
			writer.newLine();
			writer.write("Subhan");
			writer.newLine();
			writer.write("Subhan");
			writer.newLine();
			writer.write("Subhan");
			writer.newLine();
			System.out.println("Writing task completed inside specified file");
			writer.close();
		}

	}

}
