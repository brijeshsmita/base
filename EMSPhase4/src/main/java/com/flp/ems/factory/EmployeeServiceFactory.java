package com.flp.ems.factory;

import com.flp.ems.services.EmployeeServices;
import com.flp.ems.services.impl.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	private static EmployeeServices instance;
	static{
		instance = new EmployeeServiceImpl();
	}
	public static EmployeeServices getInstance(){
		return instance;
	}
	private EmployeeServiceFactory(){
		
	}
}//end of class
