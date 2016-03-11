package com.cg.clonetest;
import com.cg.emp.Employee;

public class CloneTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("Divya", 9999);
		try {
			Employee e1Copy=(Employee) e1.clone();
			System.out.println("Copy of Employee "+e1Copy);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
