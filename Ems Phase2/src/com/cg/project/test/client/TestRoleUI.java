package com.cg.project.test.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.project.ui.RoleUserInterface;

public class TestRoleUI {

	@Test
	public void test() {
		assertNotNull(RoleUserInterface.getRoleService());
		assertNotNull(RoleUserInterface.getValidateEmp());
	}

}
