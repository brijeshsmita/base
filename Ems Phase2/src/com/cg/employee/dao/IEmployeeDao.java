package com.cg.employee.dao;

import java.util.ArrayList;

import com.cg.employee.domain.Employee;

public interface IEmployeeDao
{
	void addEmployee(Employee e);
	void removeEmployee(int empNo);
	Employee modifyEmployee(Employee e);
	Employee searchEmployee(int empNo);
	ArrayList<Employee> listAllEmployee();
	void modifyEmployeeByProjectId(int projectId);
}
