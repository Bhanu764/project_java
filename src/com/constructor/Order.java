package com.constructor;

public class Order {
	int n;
	int order;
	double totalBill;
	int count;
	double ppr;
	Order(int n){
		this.n=n;
	}
	void totalItems(int a,int amount) {
		order+=a;
		totalBill+=a*amount;
	}
	double applyServiceCharge(int a) {

		return (totalBill * a) / 100;
	}

	double totalBill() {
		return totalBill + applyServiceCharge(5);
	}
	void bill() {
		System.out.println("Table Number = "+n+"\nNo. orders = "+order+"\nService Charges = "+applyServiceCharge(5)+"\nTotal Bill = "+totalBill());
	}
	public static void main(String[] args) {
		Order o=new Order(5);
		o.totalItems(3,100);
		o.totalItems(2,200);
		o.bill();
		

	}

}
