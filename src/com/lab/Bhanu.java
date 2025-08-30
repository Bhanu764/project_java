package com.lab;
import java.util.Scanner;

public class Bhanu {
	long accNo;
	String name;
	double deposit;
	double saving;
	static String branchName = "union";
	static String IFSC="0239FI";
	
	
	Scanner sc=new Scanner(System.in);
	
	
	String name1() {
		System.out.println("Enter Account Holder Name = ");
		return sc.next();
		
	}
	long accNo1() {
		System.out.println("Enter the Account Number = ");
		return sc.nextLong();
		
	}
	double deposit1() {
		System.out.println("Enter Deposit = ");
		return sc.nextDouble();
		
	}
	double saving1() {
		System.out.println("Enter Saving Ammount = ");
		return sc.nextDouble();
	}
	

	public static void main(String[] args) {
		Bhanu b=new Bhanu();
		b.accNo=b.accNo1();
		b.name=b.name1();
		b.deposit=b.deposit1();
		b.saving=b.saving1();
		double total=b.deposit+b.saving;
		System.out.println("Account Number = "+ b.accNo);
		System.out.println("Account Holder Name = "+b.name);
		System.out.println("Deposti Amount = "+b.deposit);
		System.out.println("Savings Amount = "+b.saving);
		System.out.println("total amount = "+total);
		

	}
	


}
