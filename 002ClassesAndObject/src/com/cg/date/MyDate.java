package com.cg.date;
//step 1: package declaration
//step 2: import statement if required
//top level class can only be public
//step 3: public class 
public class MyDate {
//step 4: private instance variables
	private int day;
	private int month;
	private int year;
	public MyDate() {
		// TODO Auto-generated constructor stub
	}
//step 5: methods
	public void initDate(){
//method to initialize to default value
		System.out.println("initDate() invoked...");
		day=month=year=1;				
	}
//method to display date on the console
	public void displayDate(){
		//current object day month and year will be displayed
		System.out.println(day+"-"+month+"-"+year);		
	}
//method to set the Date object value
	public void setDate(int day, int month, int year){
		System.out.println("setDate() invoked.....");
		this.day=day;
		this.month=month;
		this.year=year;
		//this refers to current object
		//explicit this reference has to be used only when
		//local variable name and instance variable name are same
	}
	public MyDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
		//this refers to current object
		//explicit this reference has to be used only when
		//local variable name and instance variable name are same
	}
}
