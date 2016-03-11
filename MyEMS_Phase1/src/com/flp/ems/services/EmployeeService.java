package com.flp.ems.services;

import java.util.ArrayList;

import com.flp.ems.dao.IEmployeeDao;
import com.flp.ems.dao.EmployeeDao;
import com.flp.ems.model.emp.Employee;


public class EmployeeService implements IEmployeeService {

	private IEmployeeDao employeeDao;
	//init
	{
		employeeDao= new EmployeeDao();
	}
	
	@Override
	public int addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public int modifyEmployee(Employee employee) {
		return employeeDao.modifyEmployee(employee);
	}

	@Override
	public int removeEmployee(Employee employee) {
		return employeeDao.removeEmployee(employee);
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	@Override
	public Employee SearchEmployee(int empId) {
		return employeeDao.SearchEmployee(empId);
	}

	@Override
	public Employee SearchEmployeeByKinID(String kinId) {
		return employeeDao.SearchEmployeeByKinID(kinId);
	}

	@Override
	public Employee SearchEmployeeByName(String empName) {
		return employeeDao.SearchEmployeeByName(empName);
	}

	@Override
	public Employee SearchEmployeeByEmail(String email) {
		return employeeDao.SearchEmployeeByEmail(email);
	}

	@Override
	public void employeeSerialize() {
		employeeDao.employeeSerialize();
		
	}

}
