package com.cg.test_enum;

public class TestEnumDay {

	public static void main(String[] args) {
		System.out.println("Printing all contant of enum");
		for(EnumDay day :EnumDay.values()){
			System.out.println(day.name());
		}

	}

}
//values() is in-build method of enum which returns an array 
//name() method is also in-build which return the name of the constant of enum