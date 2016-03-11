package com.synergy.mvc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Role implements Serializable {
	private static final long serialVersionUID = 4726826313954386025L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;
	private String name;
	private String roleDesc;
	private static int numId;
	
	static{
		numId=11;
	}
	
	//init block
	{
		roleId=numId++;//auto-generation
	}
	
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
