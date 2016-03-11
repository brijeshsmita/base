package com.cg.date;
public class DateClient {
	public static void main(String[] args) {
	/*	// create object in java
		MyDate dob;		
		dob= new MyDate();
		System.out.println("=======Priting DOB information=====");
		dob.displayDate();
		dob.initDate();
		dob.displayDate();
		dob.setDate(11,11,1999);
		dob.displayDate();
		System.out.println("===================================");	*/	
		MyDate doj = new MyDate();
		System.out.println("=======Priting DOJ information=====");
		doj.displayDate();
		doj.setDate(29,12, 2015);
		doj.displayDate();
		System.out.println("===================================");
	}
	//new keyword performs following task
	//1> create object on heap
	//2> allocate memory to the instance variable
	//3> initialize instance variable
	//** instance variable always has a default value
}
