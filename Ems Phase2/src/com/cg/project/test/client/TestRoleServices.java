package com.cg.project.test.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.role.services.RoleServices;

public class TestRoleServices {

	@Test
	public void test() {
		assertNotNull(RoleServices.getRoleDao());
	}

}
