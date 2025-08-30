package com.lab;
import java.util.Scanner;
public class nohudereds1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount= ");
		int amount=sc.nextInt();
		int b=amount/100;
		int c=amount-(b*100);
		System.out.println("total amount= "+amount);
		System.out.println(b+"- Number of Hunderds");
		System.out.println(c+"- remaining amount");
		sc.close();

	}

}
