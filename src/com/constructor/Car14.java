package com.constructor;

public class Car14 {
	String model;
	String brand;
	String year;
	double price;
	public Car14() {
		this("200cc");
	}
	public Car14(String model) {
		this("500cc","tata");
		this.model=model;
	}
	public Car14(String model,String brand) {
		
		this("900cc","mahindra","2002");
		this.model=model;
		this.brand=brand;
	}
	
	public Car14(String model, String brand, String year) {
		this("100cc","sura","2025",3000000.0);
		this.model = model;
		this.brand = brand;
		this.year = year;
	}
	public Car14(String model, String brand, String year, double price) {
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}
	public static void main(String[] args) {
		Car14 c=new Car14();
		c.show();
		Car14 c1=new Car14("500cc");
		c1.show();
		Car14 c2=new Car14("900cc","mahi");
		c2.show();
		Car14 c3=new Car14("1000cc","mahi","20025");
		c2.show();
	}
	void show() {
		System.out.println("Model = "+model+"\nBrand = "+brand+"\nYear = "+year+"\nPrice = "+price);
		System.out.println("************************");
	}

}
