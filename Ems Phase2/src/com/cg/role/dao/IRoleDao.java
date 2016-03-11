package com.cg.role.dao;

import java.util.ArrayList;

import com.cg.role.domain.Role;

public interface IRoleDao 
{
	void addRole(Role e);
	void removeRole(int empNo);
	Role modifyRole(Role e);
	Role searchRole(int empNo);
	ArrayList<Role> listAllRole();
}
