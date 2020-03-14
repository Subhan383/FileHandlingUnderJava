package com.org.serializtion;

import java.io.Serializable;

public class VehicleSerialization implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  int vehicleId;
	public  String vehicleName;
	public VehicleSerialization(int vehicleId, String vehicleName) {
		
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
	}
	@Override
	public String toString() {
		return "VehicleSerialization [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + "]";
	}
	

}
