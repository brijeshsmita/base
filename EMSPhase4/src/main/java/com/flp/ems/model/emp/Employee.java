//Step 1 : Package declaration
package com.flp.ems.model.emp;

//Step 2 : none or many import statements
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//Step 3 : public class
@Entity
@Table
public class Employee implements Serializable{
	//Step 4 : Private member variables	
	private static final long serialVersionUID = 7712136666667593637L;
	@Id
	@GeneratedValue
	private int empId;
	@Column(name="empName")
	private String empName;
	@Column(name="kinId")
	private String kinId;
	@Column(name="emailId")
	private String emailId;
	@Column(name="phoneNo")
	private String phoneNo;
	@Column(name="dob")
	private Date dob;
	@Column(name="doj")
	private Date doj;
	@Column(name="address")
	private String address;
	@Column(name="deptId")
	private int deptId;
	@Column(name="projectId")
	private int projectId;
	@Column(name="roleId")
	private int roleId;
	
	private static int numId;
	private static int kin;
	//Step 5 : Static block
	
	static {
		//numId = 100+(int)(Math.random()*100);
		kin = 10+(int)(Math.random()*100);
	}
	//init block
	{
		//empId=getNumId();
		kinId="KIN"+ getKin();
	}
	//step 6 : No-Arguments Constructor
	public Employee() {
		
	}
	//step 7 : Overloaded Constructor
	public Employee(String empName, String emailId, String phoneNo, Date dob,
			Date doj, String address, int deptId, int projectId, int roleId) {
		super();
		this.empName = empName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.doj = doj;
		this.address = address;
		this.deptId = deptId;
		this.projectId = projectId;
		this.roleId = roleId;
	}
	//step 8 : getters and setters
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
	public String getKinId() {
		return kinId;
	}
	public void setKinId(String kinId) {
		this.kinId = kinId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public static int getNumId() {
		return ++numId;
	}
	public static void setNumId(int numId) {
		Employee.numId = numId;
	}
	public static int getKin() {
		return ++kin;
	}
	public static void setKin(int kin) {
		Employee.kin = kin;
	}
	//step 10 : override toString() method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", kinId="
				+ kinId + ", emailId=" + emailId + ", phoneNo=" + phoneNo
				+ ", dob=" + dob + ", doj=" + doj + ", address=" + address
				+ ", deptId=" + deptId + ", projectId=" + projectId
				+ ", roleId=" + roleId + "]";
	}
	@Override
	public int hashCode() {
		return empId;
	}
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
}
