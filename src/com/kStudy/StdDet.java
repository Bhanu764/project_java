package com.kStudy;
public class StdDet {
	private String stdName;
	private int stdAge;
	private int stdRoll;
	private double gpa;
	
	public void setN(String stdName) {
		this.stdName=stdName;
	}
	public String getN() {
		return stdName;
	}
	public int getStdAge() {
		return stdAge;	
	}
	public void setStdAge(int stdAge) {
		if(stdAge<0) {
			System.out.println("invalid age");
		}else {
			this.stdAge = stdAge;
		}
	}
	public int getStdRoll() {
		return stdRoll;
	}
	public void setStdRoll(int stdRoll) {
		this.stdRoll = stdRoll;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public static void main(String[] args) {
		

	}

}
