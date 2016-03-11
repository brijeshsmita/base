package com.ems.phase3.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.ems.phase3.model.Employee;

public interface IEmployeeService {
	void addEmployee(Employee e,Connection con);
	ArrayList<Employee>listAllEmployee(Connection con);

	void removeEmployee(String kinId,Connection con);
	void modifyEmployee(Employee e,Connection con);
	Employee searchByKinId(String kinId,Connection con);
	Employee searchByEmailId(String emailId,Connection con);
	Employee searchByName(String name,Connection con);
	
}



