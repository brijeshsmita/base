package com.cg.date;
public class MyDate {
	private int day,month,year;
//any initialization to be made before invokation of constructor
//for such default initialization we should write init block
	{
		System.out.println("init block invoked");
		day=month=year=1;//is invoked before constructor
	}
//No-Arg constructor
	public MyDate() {
		this(1);
//second usage of 'this' keyword is to invoke current class constructor
//must be first line of code in constructor call	
		System.out.println("MyDate No-Arg Constructor invoked....");
	}
//overloaded constructor
	public MyDate(int day) {
		this(day,1);
		System.out.println("Overloaded MyDate(int day) Constructor invoked...");
		//this.day = day;
	}
	public MyDate(int day, int month) {
		this(day,month,1);
		System.out.println("Overloaded MyDate(int day, int month) Constructor invoked...");
		/*this.day = day;
		this.month = month;*/
	}
	public MyDate(int day, int month, int year) {
		System.out.println("Overloaded MyDate(int day, int month, int year) Constructor invoked...");
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
//business method
	public void print(){
		System.out.println(day+"-"+month+"-"+year);
	}
//override toString()
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year
				+ "]";
	}
//generate getter and setters
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
