package com.flp.ems.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


import com.flp.ems.model.emp.Employee;
@Service
public interface EmployeeServices {
	int addEmployee(Employee employee);
	int modifyEmployee(Employee employee);
	int removeEmployee(Employee employee);
	ArrayList<Employee> getAllEmployee();
	
	Employee searchEmployee(int empId);
	Employee searchEmployeeByKinId(String kinId);
	Employee searchEmployeeByName(String empName);
	Employee searchEmployeeByEmail(String emailId);
}
