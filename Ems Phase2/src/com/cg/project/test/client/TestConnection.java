package com.cg.project.test.client;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.connection.MyConnection;

public class TestConnection 
{

	@Test
	public void test() {
		assertNotNull(MyConnection.getConnection());
	}

}
