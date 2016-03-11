package com.flp.ems.model.emp;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6676349236718774353L;
	private int empId;
	private String empName;
	private String kinId;
	private String emailId;
	private String phoneNo;
	private String address;
	private Date doj;
	private Date dob;
	private int projectId;
	private int roleId;
	private int deptId;
	private static int numId;
	private static int kid;
	
	static{
		numId=10+(int) (Math.random()*34);
		kid=10+(int) (Math.random()*34);
	}
	//INIT
	{
		empId=getNumId();
		kinId="KIN"+getKid();
	}
	//DEFAULT CONSTRUCTOR
	public Employee() {
		
	}
	//OVER LOADED CONSTRUCTOR
	public Employee(String empName, String emailId, String phoneNo,
			String address, Date doj, Date dob, int projectId, int roleId,
			int deptId) {
		super();
		this.empName = empName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.address = address;
		this.doj = doj;
		this.dob = dob;
		this.projectId = projectId;
		this.roleId = roleId;
		this.deptId = deptId;
	}
	//TO STRING
	@Override
	public String toString() {
		return "\n Employee [empID=" + empId + ", empName=" + empName + ", kinId="
				+ kinId + ", emailId=" + emailId + ", address=" + address
				+ ", doj=" + doj + ", dob=" + dob + ", projectId=" + projectId
				+ ", roleId=" + roleId + ", deptId=" + deptId + "]";
	}
	//GETTER
	public int getEmpId() {
		return empId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getEmpName() {
		return empName;
	}
	public String getKinId() {
		return kinId;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getAddress() {
		return address;
	}
	public Date getDoj() {
		return doj;
	}
	public Date getDob() {
		return dob;
	}
	public int getProjectId() {
		return projectId;
	}
	public int getRoleId() {
		return roleId;
	}
	public int getDeptId() {
		return deptId;
	}
	public static int getNumId() {
		return ++numId;
	}
	public static int getKid() {
		return ++kid;
	}
	//SETTER
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setKinId(String kinId) {
		this.kinId = kinId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	//EQUALS AND HASHCODE
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}//end   of class Employee
