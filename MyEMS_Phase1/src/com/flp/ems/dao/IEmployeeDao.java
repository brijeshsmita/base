package com.flp.ems.dao;

import java.util.ArrayList;

import com.flp.ems.model.emp.Employee;

public interface IEmployeeDao {
	int addEmployee(Employee employee);
	void employeeSerialize();
	int modifyEmployee(Employee employee);
	int removeEmployee(Employee employee);
	ArrayList<Employee> getAllEmployee();
	Employee SearchEmployee(int empId);
	Employee SearchEmployeeByKinID(String kinId);
	Employee SearchEmployeeByName(String empName);
	Employee SearchEmployeeByEmail(String email);
}
