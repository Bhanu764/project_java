package com.lab;

public class numberofobj3 {
	static int objcount=0;
	{
		objcount++;
	}

	public static void main(String[] args) {
		numberofobj3 obj1=new numberofobj3();
		numberofobj3 obj2=new numberofobj3();
		numberofobj3 obj3=new numberofobj3();
		
		System.out.println("Number of obj= "+objcount);

	}

}
