package com.cg.role.services;

import java.util.ArrayList;

import com.cg.role.domain.Role;

public interface IRoleServices 
{
	void addRole(Role r);
	void removeRole(int empNo);
	Role modifyRole(Role r);
	Role searchRole(int empNo) ;
	ArrayList<Role> listAllRole();
	void showAllRoleId();
}
