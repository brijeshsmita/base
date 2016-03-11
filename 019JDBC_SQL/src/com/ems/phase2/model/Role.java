package com.ems.phase2.model;

import java.io.Serializable;

public class Role implements Serializable {
	private static final long serialVersionUID = -7269099564324045081L;
	private int roleId;
	private String name;
	private String roleDesc;
	//no-Arg constructor
	public Role() {
		System.out.println("Role created...");
	}
	
	//overloaded constructor
	public Role(String name, String roleDesc) {
		super();
		this.name = name;
		this.roleDesc= roleDesc;
	}
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public int getRoleId() {
		return roleId;
	}
	//toString
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", name=" + name
				+ ", roleDesc=" + roleDesc + "]";
	}
	
	
	
	
	
	

}
