package com.cg.main;

import com.cg.emp.Employee;
import com.cg.emp.mgr.Manager;
import com.cg.emp.mgr.sales.SalesManager;

public class TestInheritance {
	public static void main(String[] args) {
		/*Employee e1 = new Employee("Smita", 99999.99);
		System.out.println(e1);
		Manager m1 = new Manager("Ria", 898989.89, 2000.90);
		System.out.println(m1);*/
		//constructor are invoked from super class to subclass
		SalesManager s1 = new SalesManager("Rakesh",
				9999.88, 2300.50, 40, 1.02);
		System.out.println(s1);
	}
}
