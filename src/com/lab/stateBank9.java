package com.lab;



public class stateBank9 {
	String accHolderName;
	Long accountNo;
	Double bankBallance;
	public static Long nextAccountNo=62310100120L;
	public stateBank9(String name,Double ballance) {
		this.accHolderName=name;
		this.accountNo=nextAccountNo++;
		this.bankBallance=ballance;
	}
	
	public void display() {
		System.out.println("Account Holder Name = "+accHolderName);
		System.out.println("Account Number = "+accountNo);
		System.out.println("Bank Ballance = "+bankBallance);
	}
	public static void main(String[] args) {
		stateBank9 a1= new stateBank9("bnm", 2923.0);
		stateBank9 a2= new stateBank9("xcv", 654.0);
		stateBank9 a3= new stateBank9("vbm", 9876.0);
		a1.display();
		a2.display();
		a3.display();
		

		
		
	}
	
}
