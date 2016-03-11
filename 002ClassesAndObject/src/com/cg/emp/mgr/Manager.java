package com.cg.emp.mgr;
import com.cg.emp.Employee;
public class Manager extends Employee{
	//all the member variable of Employee is available to Manager      
	private double bonus;
	public Manager() {
		System.out.println("Manager No-Arg contructor");
	}
	public Manager(String ename,double salary,double bonus){
		//super is used to invoke super class constructor/method
		//in case of constructor call to super must be the 
		//first line of code
	//	System.out.println("Manager Overloaded constrcutor");
		super(ename,salary);
		System.out.println("Manager Overloaded constrcutor");
		/*this.empId = ++id;//auto generating the empId
		this.ename = ename;
		this.salary = salary;*/
		this.bonus=bonus;
	}
	//business method
	@Override
	public double calculateSal() {
		//System.out.println("calSalary of Manager");
		salary=super.calculateSal()+bonus;
		return salary;
	}
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", Total Salary=" + calculateSal()
				+ ",EmpId =" + getEmpId() + ", EmployeeName=" + getEname()
				+ "]";
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
