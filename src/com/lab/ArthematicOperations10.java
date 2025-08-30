package com.lab;

import java.util.Scanner;

public class ArthematicOperations10 {	
	public static int add(int a,int b) {
		 int r1=a+b;
		System.out.println("sum = "+r1);
		return r1;
	}
	public static double sub(double add,int b) {
		double r2=add-b;
		System.out.println("sub = "+r2);
		 return r2;

	}
	public static double mul(double sub,int b) {
		double r3=sub*b;
		System.out.println("mul = "+r3);
		return r3;

	}
	public static double div(double mul,int b) {
		double r4=mul/b;
		System.out.println("div = "+r4);
		return r4;

	}
	public static double mod(double div,int b) {
		double r5=div%b;
		System.out.println("mod = "+r5);
		return r5;

	}

	public static void main(String[] args) {
		ArthematicOperations10 a = new ArthematicOperations10();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number = ");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number = ");
		int n2=sc.nextInt();
		int add1=add(n1,n2);
		System.out.println("Enter n3 = ");
		int n3=sc.nextInt();
		double sub1=sub(add1,n3);
		System.out.println("Enter n4 = ");
		int n4=sc.nextInt();
		double mul1=mul(sub1,n4);
		System.out.println("Enter n5 = ");
		int n5=sc.nextInt();
		double div=div(mul1,n5);
		System.out.println("Enter n6 = ");
		int n6=sc.nextInt();
		double mod=mod(div,n6);
		sc.close();

		//		a.add(a,b);
//		a.sub(r1,b);
//		a.mul(r2,b);
//		a.div(3,b);
		
		
		
	}

}
