package com.lab;

import java.util.Scanner;

public class Restorent12 {
	double starter;
	double mainCourse;
	double dessart;
	Scanner sc=new Scanner(System.in);
	public double starter() {
		System.out.println("Enter Starter Cost = ");
		return sc.nextDouble();
	}
	public double mainCourse() {
		System.out.println("Enter cost of main course = ");
		return sc.nextDouble();
	}
	public double dessart() {
		System.out.println("Enter cost of dessart = ");
		return sc.nextDouble();
	}

	public static void main(String[] args) {
		Restorent12 r=new Restorent12();
		r.starter=r.starter();
		r.mainCourse=r.mainCourse();
		r.dessart=r.dessart();
		double total=r.starter+r.dessart+r.mainCourse;
		double taxRate=(total*5)/100;
		double serviceCharges=(total*10)/100;
		double totalAmount=total+taxRate+serviceCharges;
		System.out.println("Starters cost = "+r.starter+"\nMain Course cost = "+r.mainCourse+"\nDessart cost = "+r.dessart+"\nItem total = "+total+"\nTax Rate = "+taxRate+"\nService Charges = "+serviceCharges+"\nTotal Amount = "+totalAmount );
		

	}

}
