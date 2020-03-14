package com.org.serializtion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class VehicleOutputFile {

	public static void main(String[] args) throws IOException {
		VehicleSerialization bike=new VehicleSerialization(1, "Apache RTR 160 4V");
		VehicleSerialization car=new VehicleSerialization(2,"Mahindra XYLO");
		File file=new File("S:\\IMAGES\\SUBHAN\\PICS\\Test.dat");
		file.createNewFile();
      
		try(FileOutputStream fos=new FileOutputStream("S:\\\\IMAGES\\\\SUBHAN\\\\PICS\\\\Test.dat")){
			try(ObjectOutputStream obj=new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written onto the speicified file");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			
		} catch (IOException e) {
			System.out.println("IOException");
		}
		
	}

}
