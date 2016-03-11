/**
 * 
 */
package com.cg.date;

import java.io.Serializable;

/**
 * @author Smita Brijesh
 * program for date
 */
public class MyDate implements Serializable{
	private static final long serialVersionUID = 4891948843031874298L;
	//instance variables
	private int day;
	private int month;
	private transient int year;
	//the value of the transient var will not be persisted
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








