package com.cg.student;
public abstract class Student {
//private var
	private int rollNo;
	private String fname;
	private String lname;
	private String email;
	private String address;
	private String phoneNo;
	protected double marks;
//static var
	private static String instituteName;
	private static int numId;//var to generate auto_number
//static init block
	static{
		
	}//end of static block
//init block
	{
		//auto generation of accId
		rollNo=(int) (numId++ +(Math.random()*123.123));
		fname="unknown";lname="unknown";email="unknown";
		address="unknown";phoneNo="unknown";marks=0.0;
		
		System.out.println("init block invoked");
	}//end of init block
//no-arg constructor
	public Student() {
		System.out.println("Student No-arg Constructor invoked");
	}
//overloaded contrutor without rollNo, as roll number is auto generated
	public Student(String fname, String lname, String email, String address,
			String phoneNo, double marks) {
		System.out.println("Student Overloaded Constructor invoked");
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
		this.phoneNo = phoneNo;
		this.marks = marks;
	}
//business method print
	public void print(){
		System.out.println(
				"|===========================================================|"
			 +"\n|		Student Details			         |"
			 +"\n|===========================================================|"
				+ "\nRoll Number	    		:    	 "+rollNo
				+ "\nStudent Name			:	 "+fname+" "+lname
				+ "\nEmail 				:        "+email
				+ "\nAddress 			:        "+address
				+ "\nPhone No 			:        "+phoneNo
				+ "\nMarks 				:        "+marks
				+ "\nInstitute Name 			:        "+instituteName
				);
		
	}//endof print
//business method calculateMarks
	public double calculateMarks(){
		return marks;
	}
//getters and setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public static String getInstituteName() {
		return instituteName;
	}
	public static void setInstituteName(String instituteName) {
		Student.instituteName = instituteName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fname=" + fname + ", lname="
				+ lname + ", email=" + email + ", address=" + address
				+ ", phoneNo=" + phoneNo + ", marks=" + marks +
				", instituteName=" + instituteName +"]";
	}
	
//toString method
	
}
