package com.flp.ems.factory;
import com.flp.ems.services.EmployeeService;
import com.flp.ems.services.impl.EmployeeServiceImpl;
public class EmployeeServiceFactory {
	private static EmployeeService instance;
	static{
		instance= new EmployeeServiceImpl();
	}
	public static EmployeeService getInstance() {
		return instance;
	}//private constructor
	private EmployeeServiceFactory(){		
	}
}
