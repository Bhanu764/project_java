package com.constructor;

public class Vehicle1 {
	String vehicleType;
	
	
	
	public Vehicle1(String vehicleType) {
		
		this.vehicleType = vehicleType;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void show2() {
		System.out.println("vehicle Type = "+vehicleType);
	}

}
class Car1 extends Vehicle1{
	String carBrand;
	int carNo;
	
//	Car1(){
//		super("fds","fd");
//	}



	 Car1( String carBrand, int carNo) {
		super("re");
		this.carBrand = carBrand;
		this.carNo = carNo;
	}

	public static void main(String[] args) {
		
	}
	void show1() {
		System.out.println("CarB = "+carBrand+"\nCar No.= "+carNo);
	}
	
}
class ElectricCar extends Car1{ 
	String eType;
	int battery;
	
	public ElectricCar() {
		this("E1",122);
	}

	public ElectricCar( String eType, int battery) {
		super("car1", 567);
		this.eType = eType;
		this.battery = battery;
	}

	public static void main(String[] args) {
		ElectricCar e=new ElectricCar();
		e.show();
		e.show1();
		e.show2();
		
	}
	void show() {
		System.out.println("E = "+eType+"\nbatt= "+battery);
	}
	
}