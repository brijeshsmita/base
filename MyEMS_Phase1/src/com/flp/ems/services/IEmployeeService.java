package com.flp.ems.services;

import java.util.ArrayList;

import com.flp.ems.model.emp.Employee;

public interface IEmployeeService {
	int addEmployee(Employee employee);
	int modifyEmployee(Employee employee);
	int removeEmployee(Employee employee);
	void employeeSerialize();
	ArrayList<Employee> getAllEmployee();
	Employee SearchEmployee(int empId);
	Employee SearchEmployeeByKinID(String kinId);
	Employee SearchEmployeeByName(String empName);
	Employee SearchEmployeeByEmail(String email);
}
