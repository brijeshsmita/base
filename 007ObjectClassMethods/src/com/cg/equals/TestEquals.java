package com.cg.equals;
public class TestEquals {
	public static void main(String[] args) {
		MyDate d1 = new MyDate(11,11,11);
		MyDate d2 = new MyDate(11,11,11);
		//equals() method of Object class compares hashcode of the object
		System.out.println("Are two date object equal : "+d1.equals(d2));
		
	}
}
