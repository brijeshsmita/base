package com.flp.ems.model.role;

public class Role {
	//INSTANCE VARIABLE
	private int roleId;
	private String roleName;
	private String roleDesc;
	private static int numId;
	//STATIC BLOCK
	static{
		numId=100+(int) (Math.random()*0.034);
	}
	//INIT BLOCK
	{
		roleId=getNumId();
	}
	//DEFAULT CONSTRUCTOR
	public Role() {
		
	}
	//OVERLOADED CONSTRUCTOR
	public Role(String roleName, String roleDesc) {
		super();
		this.roleName = roleName;
		this.roleDesc = roleDesc;
	}
	//TO STRING
	@Override
	public String toString() {
		return "\nRole [roleId=" + roleId + ", roleName=" + roleName
				+ ", roleDesc=" + roleDesc + "]";
	}
	//GETTERS AND SETTERS
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
		return ++numId;
	}
	public static void setNumId(int numId) {
		Role.numId = numId;
	}
}//end of role class
