package com.flp.ems.factory;

import com.flp.ems.services.EmployeeService;
import com.flp.ems.services.EmployeeService;

public class EmployeeServiceFactory {
	private static EmployeeService instance;
	static{
		instance = new EmployeeService();
	}
	public static EmployeeService getInstance(){
		return instance;
	}
	private EmployeeServiceFactory(){}
}
