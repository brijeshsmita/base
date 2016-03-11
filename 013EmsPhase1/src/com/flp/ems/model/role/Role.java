package com.flp.ems.model.role;

import java.io.Serializable;

public class Role implements Serializable{
	private static final long serialVersionUID = -7401338126352479588L;
	private int roleId;
	private String roleName;
	private String roleDesc;
	private static int numId;
//static init block
	static
	{
		numId=10+(int)(Math.random()*444.44);
	}
//init block
	{
		roleId=getNumId();
	}
	public Role() {
		// TODO Auto-generated constructor stub
	}
	public Role(String roleName, String roleDesc) {
		super();
		this.roleName = roleName;
		this.roleDesc = roleDesc;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public static int getNumId() {
		return numId++;
	}
	public static void setNumId(int numId) {
		Role.numId = numId;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName
				+ ", roleDesc=" + roleDesc + "]";
	}
	
}
