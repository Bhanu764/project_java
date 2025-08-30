package com.lab;

import java.util.Scanner;

public class UniCodevalues {
	
	 int uni(char a){
		return (int)a;
	}
	char uni(int a){
		return (char)a; 
	}

	public static void main(String[] args) {
		UniCodevalues u=new UniCodevalues();
//		u.uni(45);
		System.out.println(u.uni(99));

	}

}