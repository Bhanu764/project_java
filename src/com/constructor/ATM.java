package com.constructor;

import java.util.Scanner;

public class ATM {
	private static final String deposit = null;
	private static final String withdraw = null;
	private static final String pinChange = null;
	static String n;
	Scanner sc = new Scanner(System.in);
	
	
	public String n1() {
		System.out.println("enter Input = ");
		String n= sc.nextLine();
		return n;
	}
	static void deposit() {
		System.out.println("deposite");
	}
	static void withdraw() {
		System.out.println("Withdraw");
	}
	static void pinChange() {
		System.out.println("pinChange");
	}

	public static void main(String[] args) {
		ATM a=new ATM();
		a.n1();
		i(n);
		}
	static void i(String n) {
		if(n==deposit) {
			deposit();
		}else if(n==withdraw){
			withdraw();
		}else if(n==pinChange) {
			pinChange();
		}else {
			System.out.println("Input is wrong");
		}
	}

}
