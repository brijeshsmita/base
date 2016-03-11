package com.ems.phase3.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;



public class Employee implements Serializable{

	private int employeeId;
	public String kinId;
	private String employeeName;
	private String emailId;
	private String address;
	private String phoneNo;
	private Date dateOfJoining;
	private Date dateOfBirth;
	private String projectId;
	private String roleId;
	private String departmentId;
	private int kid;
	private static int eid;
	private static final String strKid;
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	
	static{
		eid=1001;
	//	kid=1;
	//	kid=(int) Math.random();
		
		
		strKid="KinID";
	}
	//init block
	{
		
	//	kinId=strKid+(int)(kid.getAndIncrement()*Math.random()*023);//KinID1001
	}
	
	//no-Arg constructor
	public Employee() {
		kid=generateId();
		employeeId=eid++;//auto-generated
		kinId=strKid+kid;
	}
	public static int generateId(){
		int randomId=0;
		Random r = new Random();
		for(int i=0;i<10;i++){
			randomId=r.nextInt(1000000);
		}return randomId;
	}

	
//overloaded constructor
	public Employee(String employeeName, String emailId, String address,
			String phoneNo, Date dateOfJoining, Date dateOfBirth,
			String projectId, String roleId, String departmentId) {
		kid=generateId();
		employeeId=eid++;//auto-generated
		kinId=strKid+kid;
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.address = address;
		this.phoneNo = phoneNo;
		this.dateOfJoining = dateOfJoining;
		this.dateOfBirth = dateOfBirth;
		this.projectId = projectId;
		this.roleId = roleId;
		this.departmentId = departmentId;
	}

	//getter setters
	public int getEmployeeId() {
		return employeeId;
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


	public Date getDateOfJoining() {
		return dateOfJoining;
	}


	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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


	public String getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}





	public static int getEid() {
		return eid;
	}


	public static String getStrkid() {
		return strKid;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", kinId=" + kinId
				+ ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", address=" + address + ", phoneNo=" + phoneNo
				+ ", dateOfJoining=" + dateOfJoining + ", dateOfBirth="
				+ dateOfBirth + ", projectId=" + projectId + ", roleId="
				+ roleId + ", departmentId=" + departmentId + "]";
	}



	
}