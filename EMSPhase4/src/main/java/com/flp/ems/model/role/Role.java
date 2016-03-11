//Step 1 : Package declaration
package com.flp.ems.model.role;
//Step 2 : none or many import statements
//Step 3 : public class
public class Role {
	//Step 4 : Private member variables
	private int roleId;
	private String roleName;
	private String roleDesc;
	private static int numId;
	//Step 5 : Static block

	public static int getNumId() {
		return ++numId;
	}
	public static void setNumId(int numId) {
		Role.numId = numId;
	}
	//step 6 : No-Arguments Constructor
	public Role() {
		
	}
	//step 7 : Overloaded Constructor
	public Role(String roleName, String roleDesc) {
		super();
		this.roleName = roleName;
		this.roleDesc = roleDesc;
	}
	//step 8 : getters and setters
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
	//step 10 : override toString() method
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName
				+ ", roleDesc=" + roleDesc + "]";
	}
		
}//end of class
