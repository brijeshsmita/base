/*
 * class to define structure of an EMployee Object
 */
//step 1 : package declaration
package com.cg.emp;

//step 2 : import statements
import java.util.Date;

/**
 * @author brijeshsmita
 *
 */
//step 3 : public class 
public class Employee {
	
//step 4  : properties/attribute/instance variables
	int empId;
	String ename;
	double salary;
//step 5  : static variables
	static String coName="cg";

	static int count;
	Date joinDate;
//step 6  : static block	
	static{
		//it is used to initialize only static variables
		coName="CG Pvt. Ltd.";
		System.out.println("static block invoked....");
		
		//called before creation of an Object 
	}
	{
		count++;
	}
	public static void main(String[] args) {
		System.out.println("main invoked.....");
		Employee e1 = new Employee();
		System.out.println("object created.....");
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String ename, double salary, Date joinDate) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.joinDate = joinDate;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static String getCoName() {
		return coName;
	}
	public static void setCoName(String coName) {
		Employee.coName = coName;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary="
				+ salary + ", joinDate=" + joinDate + "]";
	}
	public static void companyInfo() {
		System.out.println(coName);
	}
	public static int getEmpCount() {
		// TODO Auto-generated method stub
		return count;
	}
	
	
}
