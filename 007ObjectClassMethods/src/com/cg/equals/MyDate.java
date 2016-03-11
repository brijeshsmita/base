package com.cg.equals;
public class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate() {
	}
	public MyDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public String toString() {
		return day+"-"+month+"-"+year;
	}
	public boolean equals(Object obj){
		if(obj instanceof MyDate){//checking type of object
			//typecast Object to MyDate type
			MyDate ref=(MyDate)obj;
			if((this.day==ref.day)
					&&(this.month==ref.month)
					&&this.year==ref.year)
				return true;
		}
		return false;
	}
}
