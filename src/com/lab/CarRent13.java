package com.lab;

import java.util.Scanner;

public class CarRent13 {
	String company;
	int dailyRent = 1500;
	int noDays;
	int insurance=500;
	Scanner sc =new Scanner(System.in);
	public int noDays() {
		System.out.println("Enter number of days = ");
		return sc.nextInt();
	}
	public String company() {
		System.out.println("Enter Company = ");
		return sc.nextLine();
	}


	public static void main(String[] args) {
		CarRent13 c = new CarRent13();
		c.company=c.company();
		c.noDays=c.noDays();
		int total=c.noDays*c.dailyRent+c.insurance;
		System.out.println("Welcome Sir/Mam "+"\nCompany = "+c.company+"\nNumber of Days = "+c.noDays+"\n Total Charges = "+total);


	}

}
