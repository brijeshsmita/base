package com.cg.main;

import com.cg.sql.PSDemo;
import com.cg.sql.StatementDemo;

public class TestStatement {
	public static void main(String[] args) {				
		PSDemo.insertEmployee();	
		StatementDemo.showAllEmployee();
		PSDemo.updateEmpGrade("T8", 1111);
		PSDemo.findEmployeeById(1111);
		PSDemo.deleteEmployee(1111);
		PSDemo.findEmployeeById(1111);
	}
}
