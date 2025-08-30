package com.kStudy;

public class Stud {

	public static void main(String[] args) {
		StdDet s=new StdDet();
		s.setN("Bhanu");
		s.setStdAge(0);
		s.setStdRoll(1);
		s.setGpa(8.5);
		System.out.println("Student Details"+"\nStudent Name = "+s.getN()+"\nStudent Age = "+s.getStdAge()+"\nStudent Roll No. = "+s.getStdRoll()+"\nStudent GPA = "+s.getGpa());
//		s.display();
//
//	}
//	void display() {
//		System.out.println("Student Details"+"\nStudent Name = "+getN()+"\nStudent Age = "+getAge()+"\nStudent Roll No. = "+getStdRoll()+"\nStudent GPA = "+getGpa());
	}

}
