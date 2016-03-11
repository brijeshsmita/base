package com.synergy.mvc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Department implements Serializable {

	private static final long serialVersionUID = 7828746734677957064L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int departmentId;
	private String departmentName;
	private String deptDesc;
	private static int deptId;
	
	static{
		deptId+=10;
	}
	//init block
	{
		departmentId=deptId;
	}
	
	//no-Arg 
	public Department() {
		System.out.println("Departmnt created");
	}
	//overloaded constructor
	public Department(String departmentName, String deptDesc) {
		super();
		this.departmentName = departmentName;
		this.deptDesc = deptDesc;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDescription(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName="
				+ departmentName + ", deptDesc=" + deptDesc + "]";
	}

	
	

}
