package com.cg.generic;

public class TestGeneric {
	public static void main(String[] args) {
	//String Object
		CacheAnyObject<String> obj = new CacheAnyObject<String>();
		obj.add(" Hello!");
		System.out.println("Message is : "+obj.get());
	//Employee Object
		CacheAnyObject<Employee> emp = 
				new CacheAnyObject<Employee>();
		emp.add(new Employee(111, "Smita", 9999));
		//error		//emp.add("Hello");
		System.out.println("Employee is : "+emp.get());
	//Integer Object	
		CacheAnyObject<Integer> obj1=
				new CacheAnyObject<Integer>();
		obj1.add(9999);
		System.out.println("Integer value is : "+obj1.get());
		
	}
}
