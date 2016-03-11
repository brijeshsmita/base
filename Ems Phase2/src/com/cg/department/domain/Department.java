package com.cg.department.domain;

public class Department 
{
	private int deptId;
	private String deptName;
	private String deptDesc;
	
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

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName
				+ ", deptDesc=" + deptDesc + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode()==obj.hashCode();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return deptId;
	}
	
	
	
	
}
