package com.ems.phase2.model;

import java.io.Serializable;

public class Department implements Serializable {
	private static final long serialVersionUID = 3404746857372932561L;
	private int deptId;
	private String deptName;
	private String deptDesc;
	//no-Arg 
	public Department() {
		System.out.println("Departmnt created");
	}
	public Department(int deptId, String deptName, String deptDesc) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptDesc = deptDesc;
	}
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
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName
				+ ", deptDesc=" + deptDesc + "]";
	}	
}
