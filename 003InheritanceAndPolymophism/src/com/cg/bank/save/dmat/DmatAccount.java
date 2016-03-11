package com.cg.bank.save.dmat;

import com.cg.bank.save.SavingAccount;

public class DmatAccount extends SavingAccount{
	private double investment;
	//constructor cannot be inherited
	//no-arg constructor
	public DmatAccount() {
		System.out.println("No-arg DmatAccount contructor");
	}
	public DmatAccount(String accHolderName, double curBal,boolean isSalaryAccount,double investment) {
		super(accHolderName, curBal,isSalaryAccount);
		this.investment=investment;
		System.out.println("Overloaded DmatAccount constructor");
	}
	@Override
	public String toString() {
		return " +investment "+investment+"]"+
				super.toString();
	}
	@Override
	public void print() {		
		super.print();
		System.out.println("+investment "+investment);
	}	
}
