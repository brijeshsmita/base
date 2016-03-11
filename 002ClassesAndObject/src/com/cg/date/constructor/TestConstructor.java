package com.cg.date.constructor;
public class TestConstructor {
	public static void main(String[] args) {	
		/*MyDate dob = new MyDate();
		System.out.println("=======Priting DOB information=====");
		dob.print();
		System.out.println("===================================");*/
		/*System.out.println("=======Priting DOJ information======");*/
		MyDate doj = new MyDate(29,12,2015);
		System.out.println("======DOJ======\n"+doj);
		//doj.setDate(29,12, 2015);
		//doj.print();
		System.out.println("===================================");
	}
}
