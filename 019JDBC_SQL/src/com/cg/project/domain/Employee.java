package com.cg.project.domain;

import java.io.Serializable;
import java.util.Date;
/*
 * empno number(6) constraint emp_pk primary key,
	ename varchar2(30),
	grade char(2),
dob date, deptno number(2)
 */
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	private int empNo;
	private String ename;
	private String grade;
	private Date dob;
	private int deptNo;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", grade="
				+ grade + ", dob=" + dob + ", deptNo=" + deptNo + "]";
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
}
