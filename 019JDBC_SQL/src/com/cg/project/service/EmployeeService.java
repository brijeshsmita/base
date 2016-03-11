package com.cg.project.service;

import java.util.ArrayList;

import com.cg.project.dao.DepartmentDao;
import com.cg.project.dao.EmployeeDao;
import com.cg.project.dao.IEmployeeDao;
import com.cg.project.domain.Employee;

public class EmployeeService implements IEmployeeService {
	private static IEmployeeDao employeeDao;
	static{
		employeeDao = new EmployeeDao();
	}
	@Override
	public void addEmployee(Employee e) {
		employeeDao.addEmployee(e);
	}

	@Override
	public void removeEmployee(int empNo) {
		employeeDao.removeEmployee(empNo);
	}

	@Override
	public Employee modifyEmployee(Employee e) {
		return employeeDao.modifyEmployee(e);
	}

	@Override
	public Employee searchEmployee(int empNo) {
		return employeeDao.searchEmployee(empNo);
	}

	@Override
	public ArrayList<Employee> listAllEmployee() {
		return employeeDao.listAllEmployee();
	}

}
