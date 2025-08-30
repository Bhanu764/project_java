package com.constructor;

public class Student1 {
	String name;
	int rollNo;
	String collage;
	String course;
	
//	public Student1() {

//	}
	public Student1(String name) {
//		this();
		this.name = name;
	}
	public Student1(Student1 s, int rollNo,String collage) {
		
		this.name = s.name;
		this.rollNo = rollNo;
		this.collage=collage;
	}
	public Student1(Student1 s,  String course) {
		super();
		this.name = s.name;
		this.rollNo =s.rollNo;
		this.collage=s.collage;
		this.course = course;
	}
	public static void main(String[] args) {
//		Student1 s=new Student1();
		Student1 s1=new Student1("ds");
		Student1 s2=new Student1(s1,1,"klu");
		Student1 s3=new Student1(s2,"math");
//		s.show();
		s1.show();
		s2.show();
		s3.show();

	}
	 void show() {
		System.out.println("name = "+name+"\nRollNo. = "+rollNo+"\nCourse = "+course+"\n*****************");
	}

}
