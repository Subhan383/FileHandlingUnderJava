package com.org.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readingfromfiles {

	public static void main(String[] args) throws IOException {
		File directory = new File("S:\\\\IMAGES\\\\SUBHAN\\\\PICS");
		directory.mkdirs();
		File file = new File("S:\\\\IMAGES\\\\SUBHAN\\\\PICS//Test.txt");
		file.createNewFile();
		System.out.println("File created inside specified directory");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
			
			writer.write("Subhan");
			writer.newLine();
			writer.write("Sailaja");
			writer.newLine();
			writer.write("Kanna");
			writer.newLine();
			writer.write("SubhanSailaja");
			writer.newLine();
			System.out.println("Writing task completed inside specified file");
			writer.close();
		}

		BufferedReader reader = new BufferedReader(new FileReader("subhan/File/sample.txt"));
		String line;
		System.out.println("****************************");
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();

	}
}
