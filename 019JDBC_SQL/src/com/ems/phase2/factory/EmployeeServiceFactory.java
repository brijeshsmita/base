package com.ems.phase2.factory;
import com.ems.phase2.services.EmployeeService;
import com.ems.phase2.services.impl.EmployeeServiceImpl;
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
