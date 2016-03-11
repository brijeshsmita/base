package com.ems.phase2.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
/*
 * create table employee(
	employeeId number(6) constraint employee_pk2 PRIMARY KEY,
	employeeName varchar2(50)NOT NULL,
	kinId varchar2(20) UNIQUE NOT NULL,
	emailId varchar2(20) UNIQUE NOT NULL,
	phoneNo VARCHAR2(12) not null ,
	dob date not null,
	doj date not null,
	address varchar2(200) not null,
	deptId number(4),
	projectId number(6),
	roleId number(6),
	FOREIGN KEY(deptId) REFERENCES department(deptId),
	FOREIGN KEY(projectId) REFERENCES project(projectId),
	FOREIGN KEY(roleId) REFERENCES role(roleId),
	CHECK (dob >= '01-jan-1988')
);
DROP SEQUENCE SQ_EMPLOYEE;
create SEQUENCE SQ_EMPLOYEE
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 
 insert into employee
values(SQ_EMPLOYEE.NEXTVAL,'SMITA','kin11','sea@gmail.com'
,'23456778','11-Dec-1988','12-Dec-2015','Old fort Delhi',10,101,1001);
 */
public class Employee implements Serializable{
	private static final long serialVersionUID = 696356997822844683L;
	private int employeeId;
	public String kinId;
	private String employeeName;
	private String emailId;
	private String address;
	private String phoneNo;
	private Date dob;
	private Date doj;
	private String projectId;
	private String roleId;
	private String deptId;
	private static final String strKid;
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	static{
		strKid="KinID";
	}
	//init block
	{		
		kinId=strKid+generateId();
	}
	public static int generateId(){
		int randomId=0;
		Random r = new Random();
		for(int i=0;i<10;i++){
			randomId=r.nextInt(1000000);
		}return randomId;
	}
	//no-Arg constructor
	public Employee() {
		
	}	
//overloaded constructor
	public Employee(int employeeId, String kinId, String employeeName,
			String emailId, String address, String phoneNo, Date dob, Date doj,
			String projectId, String roleId, String deptId) {
		super();
		this.employeeId = employeeId;
		this.kinId = kinId;
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.address = address;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.doj = doj;
		this.projectId = projectId;
		this.roleId = roleId;
		this.deptId = deptId;
	}
	public String getKinId() {
		return kinId;
	}
	public void setKinId(String kinId) {
		this.kinId = kinId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", kinId=" + kinId
				+ ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", address=" + address + ", phoneNo=" + phoneNo + ", dob="
				+ dob + ", doj=" + doj + ", projectId=" + projectId
				+ ", roleId=" + roleId + ", deptId=" + deptId + "]";
	}
}