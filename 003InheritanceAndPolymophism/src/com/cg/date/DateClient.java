package com.cg.date;

public class DateClient {
	public static void main(String[] args) {
		MyDate dob = new MyDate(11,7);
		System.out.println("=====Abhinave DOB is :"+dob);
		//dob.month = 8;//error
		dob.setMonth(8);
		System.out.println("Correct DOB is :"+dob);
		//private data cannot be accessed outside the class
		//in certain scenario we have to provide access to the private data
		//therefore we must provide getter and setter in our class
	}
}
