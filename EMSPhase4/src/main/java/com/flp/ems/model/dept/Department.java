//Step 1 : Package declaration
package com.flp.ems.model.dept;
//Step 2 : none or many import statements
//Step 3 : public class
public class Department {
	//Step 4 : Private member variables
	private int deptId;
	private String deptName;
	private String deptDesc;
	private static int numId;
	//Step 5 : Static block
	//step 6 : No-Arguments Constructor
	public Department() {
		
	}
	//step 7 : Overloaded Constructor
	public Department(String deptName, String deptDesc) {
		super();
		this.deptName = deptName;
		this.deptDesc = deptDesc;
	}
	//step 8 : getters and setters
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	public static int getNumId() {
		return ++numId;
	}
	public static void setNumId(int numId) {
		Department.numId = numId;
	}
	//step 10 : override toString() method
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName
				+ ", deptDesc=" + deptDesc + "]";
	}
	
}
