package com.lab;
import java.util.Scanner;


public class tenth1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number= ");
		int n=sc.nextInt();
		int a=n/100;
		int b=(n-(a*100))/10;
		System.out.println(b);
		sc.close();

	}

}
