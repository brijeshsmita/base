package com.cg.student.java;
import com.cg.student.Student;
public class JavaStudent extends Student{
//private var
	private double practicalMarks;
//no-arg Constructor
	public JavaStudent() {
		System.out.println("JavaStudent no-arg Constructor");
	}
//Overloaded Constructor
	public JavaStudent(String fname, String lname, String email,
			String address, String phoneNo, double marks,
			double practicalMarks) {
		super(fname, lname, email, address, phoneNo, marks);
		this.practicalMarks=practicalMarks;
		System.out.println("JavaStudent overloaded Constructor");
	}	
//business methods
	@Override
	public void print() {
		super.print();
		System.out.println("PracticalMarks"+practicalMarks);
	}
	@Override
	public double calculateMarks() {
		marks=marks+practicalMarks;
		return marks;
	}
//toString()
	@Override
	public String toString() {
		return "JavaStudent [practicalMarks=" + practicalMarks
				+ ", toString()=" + super.toString() + "]";
	}
//getter and setters
	public double getPracticalMarks() {
		return practicalMarks;
	}
	public void setPracticalMarks(double practicalMarks) {
		this.practicalMarks = practicalMarks;
	}
	
}
