package com.cg.emp.mgr.sales;

import com.cg.emp.mgr.Manager;

public class SalesManager extends Manager {
//member variables
	private double sales;
	private double comm;
//default/No-Arg constructor
	public SalesManager() {
		System.out.println("SalesManager No-Arg Contructor");
	}//end of constructor
//overloaded Constructor
	public SalesManager(String ename, double salary, double bonus,
			double sales, double comm) {
		super(ename, salary, bonus);
		 
		this.sales = sales;
		this.comm = comm;
	}//end of overloaded constructor
//override business methods
	@Override
	public double calculateSal() {
		return super.calculateSal()+(sales*comm);
	}//end of calulateSal()
//override toString
	@Override
	public String toString() {
		return 
		"SalesManager [sales=" + sales + ", comm=" + comm
		+ ", Total Salary=" + calculateSal() + ", Bonus="
		+ getBonus() + ",EmpId=" + getEmpId() + ",Employee Name="
		+ getEname() + "]";
	}//end of toString
//setters and getters
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}	
}//end of class











