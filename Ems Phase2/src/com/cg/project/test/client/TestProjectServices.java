package com.cg.project.test.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.project.services.ProjectService;

public class TestProjectServices {

	@Test
	public void test() {
		assertNotNull(ProjectService.getProjectDao());
	}

}
