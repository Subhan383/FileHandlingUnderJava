package com.org.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFilesWithScanner {

	public static void main(String[] args) throws IOException {
		File directory = new File("k://Subhan//Sailaja");
		directory.mkdirs();
		System.out.println("Directory created in 'K' drive");
		File file2 = new File("S:\\IMAGES\\SUBHAN\\PICS//Test.txt");
		file2.delete();
		File file = new File("k://Subhan//Sailaja//Kanna.txt");
		file.createNewFile();
		System.out.println("File created under specified directory");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write("Subhan");
		writer.newLine();
		writer.write("SailajaSubhan");
		writer.newLine();
		writer.write("ArhaSubhan");
		writer.newLine();
		writer.write("ArhanSubhan");
		writer.close();
       System.out.println("Writing task completed");
		Scanner sc = new Scanner(new File("k://Subhan//Sailaja//Kanna.txt"));
		String line;
		while (sc.hasNext()) {
			line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
	}

}
