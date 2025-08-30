package com.constructor;

public class Vehicle {
	String vehicleType;
	String vehicleColour;
	
	

	

	public Vehicle(String vechileType, String vechileColor) {
		
		this.vehicleType = vehicleType;
		this.vehicleColour = vehicleColour;
	}


	public static void main(String[] args) {
		
		

	}	
}
class Car extends Vehicle{
	String carBrand;
	String carModel;
	
	public Car() {
		this("tata","t33");
	}
	public Car( String carBrand, String carModel) {
		super("mahi", "black");
		this.carBrand = carBrand;
		this.carModel = carModel;
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.show();
		
	}
	void show() {
		System.out.println("vehicle Type ="+vehicleType+"\nVehicle colour = "+vehicleColour+"\nCar Brand = "+carBrand+"\nCar Model = "+carModel);
	}
	
}