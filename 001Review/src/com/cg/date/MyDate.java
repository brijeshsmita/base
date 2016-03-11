/**
 * 
 */
package com.cg.date;

/**
 * @author Smita Brijesh
 * program for date
 */
public class MyDate {
	//instance variables
	private int day,month,year;
	//default constr
	public MyDate(){
		day=month=year=1;
	}
	//overloaded constr
	public MyDate(int d, int m, int y){
		day=d;
		month=m;
		year=y;
	}
	//method to initialize date value
	public void initDate(int d, int m, int y){
		day=d;
		month=m;
		year=y;
	}
	public void print(){
//this is a keyword in java which refers to current object
		//System.out.println(day+"-"+month+"-"+year);
		System.out.println(this.toString());//this means current object
		//and if we try to print current object
		//call back is given to toString() method
	}
	public String toString(){
		return day+"-"+month+"-"+year;
	}
	public static void main(String[] args) {
		//create object of MyDate class
		MyDate m1 = new MyDate();
		m1.print();
		m1.initDate(11, 11, 2011);
		System.out.println("M1 object value : "+m1.toString());
		MyDate m2 = new MyDate();
		System.out.println("M2 object value : "+m2.toString());
/*
 * whenever we try to print an object
 * callback is given to toString() method
 * if our class does not has toString()
 * then Object class toString() is invoked
 * it returns string value that is
 * 1>fully qualified name of class(i.e.packagename.classname)
 * 2>'@' sign 
 * 3> unique code
		 */
	/*	m1.print();
		
		//create second object
		MyDate m2 = new MyDate();
		m2.initDate(27, 5, 2015);
		System.out.print("Course start date is :");
		m2.print();*/
	}
	
}








