package com.cg.project.test.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.project.ui.ProjectUserInterface;

public class TestProjectUI {

	@Test
	public void test() {
		assertNotNull(ProjectUserInterface.getDepartmentservice());
		assertNotNull(ProjectUserInterface.getProjectservice());
		assertNotNull(ProjectUserInterface.getValidateEmp());
	}

}
