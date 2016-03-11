package com.cg.array;

import com.cg.emp.Employee;

public class ArrayDemo {

	public static void main(String[] args) {
		//int age=10;
		//arrays
		double [] marksArr ={10,20,30,40,50};
		System.out.println("Printing the array content...");
		for(int i=0;i<marksArr.length;i++){
			System.out.println(marksArr[i]);
		}
		int [] age = new int[5];
		String [] namesOfTrainees =new String[5];
		Employee [] empArr = new Employee[2];
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		empArr[0]= e1; 
		empArr[1]=e2;
	}

}
