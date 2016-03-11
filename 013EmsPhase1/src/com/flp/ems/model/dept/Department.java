package com.flp.ems.model.dept;

import java.io.Serializable;

public class Department implements Serializable{
	private static final long serialVersionUID = -5094345440690290725L;
	private int deptId;
	private String deptName;
	private String deptDesc;
	private static int numId;
//static init block
	static
	{
		numId=1000+(int)(Math.random()*101);
	}

	//init block
	{
		deptId=getNumId();
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(String deptName, String deptDesc) {
		super();
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
	public static int getNumId() {
		return numId++;
	}
	public static void setNumId(int numId) {
		Department.numId = numId;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName
				+ ", deptDesc=" + deptDesc + "]";
	}
	
}
