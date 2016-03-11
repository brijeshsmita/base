package com.cg.project.test.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.employee.services.EmployeeServices;

public class TestEmployeeService {

	@Test
	public void test() 
	{
		assertNotNull(EmployeeServices.getEmployeeDao());
	}

}
