package com.flp.ems.model.department;

public class Department {
	private int deptId;
	private String deptName;
	private String deptDesc;
	private static int numId;
	static{
		numId=1000+(int) (Math.random()*0.034);
	}
	//INIT
	{
		deptId=getNumId();
	}
	//DEFAULT CONSTRUCTOR
	public Department() {
		
	}
	//OVER LOADED CONSTRUCTOR
	public Department(String deptName, String deptDesc) {
		super();
		this.deptName = deptName;
		this.deptDesc = deptDesc;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName
				+ ", deptDesc=" + deptDesc + "]";
	}
	//GETTER
	public int getDeptId() {
		return deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public static int getNumId() {
		return numId;
	}
	//SETTER
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	
}
