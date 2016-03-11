package com.flp.ems.services.impl;
import java.util.ArrayList;
import com.flp.ems.dao.EmployeeDao;
import com.flp.ems.dao.impl.EmployeeDaoImpl;
import com.flp.ems.model.emp.Employee;
import com.flp.ems.services.EmployeeService;
public class EmployeeServiceImpl implements EmployeeService {
	private static EmployeeDao employeeDao;
	static{
		employeeDao= new EmployeeDaoImpl();
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
	public Employee searchEmployee(int empId) {
		return employeeDao.searchEmployee(empId);
	}

	@Override
	public Employee searchEmployeeByKinId(String kinId) {
		return employeeDao.searchEmployeeByKinId(kinId);
	}

	@Override
	public Employee searchEmployeeByName(String empName) {
		return employeeDao.searchEmployeeByName(empName);
	}

	@Override
	public Employee searchEmployeeByEmail(String emailId) {
		return employeeDao.searchEmployeeByEmail(emailId);
	}

}
