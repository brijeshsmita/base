package com.cg.emp;

public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	private int age;
	private String email;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double empSal, int age,
			String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.age = age;
		this.email = email;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", age=" + age + ", email=" + email
				+ "]";
	}
}