package com.cg.project.test.client;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestConnection.class, TestEmployeeService.class,
		TestEmployeeUI.class, TestProjectServices.class, TestProjectUI.class,
		TestRoleServices.class, TestRoleUI.class })
public class AllTests {

}
