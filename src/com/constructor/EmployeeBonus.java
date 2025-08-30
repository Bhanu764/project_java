package com.constructor;

import java.util.Scanner;

public class EmployeeBonus {
	int employeeId;
	int projComptd;
	int overTimeHrs;
	double salary;
	float b;
	
	public EmployeeBonus(int employeeId, int projComptd, int overTimeHrs, double salary) {
		super();
		this.employeeId = employeeId;
		this.projComptd = projComptd;
		this.overTimeHrs = overTimeHrs;
		this.salary = salary;
	}
//	Scanner sc=new Scanner(System.in);
//	
//	public void s() {
//		System.out.println("Enter Employee ID = ");
//		int employeeId=sc.nextInt();
//		System.out.println("Enter Number of Projects = ");
//		int projComptd=sc.nextInt();
//		System.out.println("Enter Over Time = ");
//		int overTimeHrs=sc.nextInt();
//		System.out.println("Enter Salary = ");
//		double salary=sc.nextDouble();
//		b=(float)((projComptd>3 && overTimeHrs>=10)?((salary*10)/100):(projComptd>3 || overTimeHrs>=10)?((salary*5)/100):0);
//		projComptd++;
//		System.out.println("Employee ID = "+employeeId+"\nNo. of Projects = "+projComptd+"\nOver Time = "+overTimeHrs+"\nSalary = "+salary+"\nBonus = "+b+"\nTotal Salary = "+to());
//	}
	void bonus() {
		b=(float)((projComptd>3 && overTimeHrs>=10)?((salary*10)/100):(projComptd>3 || overTimeHrs>=10)?((salary*5)/100):0);
		projComptd++;
		
	}
	double to() {
		 return (float)(salary+b);
	}
	void show() {
		System.out.println("Employee ID = "+employeeId+"\nNo. of Projects = "+projComptd+"\nOver Time = "+overTimeHrs+"\nSalary = "+salary+"\nBonus = "+b+"\nTotal Salary = "+to());
	}
	public static void main(String[] args) {
//		EmployeeBonus e1=new EmployeeBonus();
//		e1.s();
//		e1.bonus();
//		e1.show();
		EmployeeBonus b=new EmployeeBonus(67,4,8,40000);
		b.bonus();
		b.show();
	}
	
									

}