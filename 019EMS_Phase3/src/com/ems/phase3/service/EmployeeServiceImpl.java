package com.ems.phase3.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.ems.phase3.dao.EmployeeDaoImplForList;
import com.ems.phase3.dao.IEmployeeDao;
import com.ems.phase3.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDao employeeDao;
	//init block
	{
	   employeeDao=new EmployeeDaoImplForList();
		
	}
	@Override
	public void addEmployee(Employee e,Connection con) {
		employeeDao.addEmployee(e,con);
	}
	
	@Override
	public ArrayList<Employee> listAllEmployee(Connection con) {
		
		return employeeDao.listAllEmployee(con);
	}

	@Override
	public void removeEmployee(String kinId, Connection con) {
		 employeeDao.removeEmployee(kinId, con);
		
	}

	@Override
	public void modifyEmployee(Employee e, Connection con) {
		employeeDao.modifyEmployee(e, con);
		
	}

	@Override
	public Employee searchByKinId(String kinId, Connection con) {
		// TODO Auto-generated method stub
		return  employeeDao.searchByKinId(kinId, con);
	}

	@Override
	public Employee searchByEmailId(String emailId, Connection con) {
		// TODO Auto-generated method stub
		return employeeDao.searchByEmailId(emailId, con);
	}

	@Override
	public Employee searchByName(String name, Connection con) {
		// TODO Auto-generated method stub
		return employeeDao.searchByName(name, con);
	}

	
}
