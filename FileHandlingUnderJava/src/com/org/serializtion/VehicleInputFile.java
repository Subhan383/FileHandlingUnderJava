package com.org.serializtion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class VehicleInputFile {

	public static void main(String[] args) throws ClassNotFoundException {
		try(FileInputStream fis=new FileInputStream("S:\\\\IMAGES\\\\SUBHAN\\\\PICS\\\\Test.dat")){
			try(ObjectInputStream obj=new ObjectInputStream(fis)){
				VehicleSerialization v1= (VehicleSerialization) obj.readObject();
				VehicleSerialization v2= (VehicleSerialization) obj.readObject();
				System.out.println("object 1: "+v1);
				System.out.println("object 2: "+v2);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}

	}

}
