package com.cg.jdbc.emp.services;

import com.cg.jdbc.emp.model.Employee;

public interface IEmployeeService {
	void addEmployee(Employee e);
	void removeEmployee(Employee e);
	void modifyEmployee(Employee e);
	void searchEmployee(Employee e);
	void listAllEmployee();
}
