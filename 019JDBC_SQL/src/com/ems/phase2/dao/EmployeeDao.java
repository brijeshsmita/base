package com.ems.phase2.dao;
import java.util.ArrayList;

import com.flp.ems.model.emp.Employee;
public interface EmployeeDao {
	int addEmployee(Employee employee);
	int modifyEmployee(Employee employee);
	int removeEmployee(Employee employee);
	ArrayList<Employee> getAllEmployee();

	Employee searchEmployee(int empId);
	Employee searchEmployeeByKinId(String kinId);
	Employee searchEmployeeByName(String empName);
	Employee searchEmployeeByEmail(String emailId);
}
