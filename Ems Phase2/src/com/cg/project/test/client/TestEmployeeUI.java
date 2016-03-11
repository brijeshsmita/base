package com.cg.project.test.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.project.ui.EmployeeUserInterface;

public class TestEmployeeUI 
{

	@Test
	public void test()
	{
		assertNotNull(EmployeeUserInterface.getEmployeeService());
		assertNotNull(EmployeeUserInterface.getDepartmentService());
		assertNotNull(EmployeeUserInterface.getProjectService());
		assertNotNull(EmployeeUserInterface.getRoleService());
		assertNotNull(EmployeeUserInterface.getDateValidation());
		assertNotNull(EmployeeUserInterface.getValidateEmp());
	}

}
