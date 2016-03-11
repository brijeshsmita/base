package com.cg.project.domain;

import java.io.Serializable;

public class Department implements Serializable{
	private static final long serialVersionUID = -5094345440690290725L;
	private int deptNo;
	private String dname;
	private String loc;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", dname=" + dname + ", loc="
				+ loc + "]";
	}	
}
