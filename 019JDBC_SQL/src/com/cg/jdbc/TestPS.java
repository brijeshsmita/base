package com.cg.jdbc;
public class TestPS {
	public static void main(String[] args) {
		PSDemo.insertEmployee();//C
		DemoStatement.showAllRecords();//R
		PSDemo.updateEmpGrade("T9", 1001);//U
		PSDemo.findEmployeeById(1001);
		PSDemo.deleteEmployee(1001);//D
		DemoStatement.showAllRecords();
	}
}
