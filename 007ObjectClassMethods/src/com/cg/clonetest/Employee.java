
package com.cg.clonetest;
public class Employee implements Cloneable{
	private static int id=100;
	private int empId;
	private String ename;
	protected double salary;
	private static String coName;
	static{
		id=100;
		coName="CG Ltd.";
		System.out.println("static-init block invoked");
	}	
	{
		System.out.println("init block invoked");
		this.empId = ++id;
	}
	public Employee() {		
		System.out.println("Employee No_Arg constrcutor");
	}
	public Employee(String ename, double salary) {
		System.out.println("Employee Overloaded constrcutor");
		//this.empId = ++id;//auto generating the empId
		this.ename = ename;
		this.salary = salary;
	}
	//step 8 : getters and setters
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
//step 9 : member methods/business methods
	public double calculateSal(){
		return this.salary;
	}
	public double calculateSal(double ... salary){
		double sum=0;
		for(double d: salary){
			sum+=d;
		}
		return sum;
	}
//step 10 : override toString() method 
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename 
				+ ", Total Salary="
				+ this.calculateSal(this.salary) + "]";
	}
//override clone()- to generate copy of an object	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}









