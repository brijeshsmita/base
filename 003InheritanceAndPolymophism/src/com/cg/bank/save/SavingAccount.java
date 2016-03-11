package com.cg.bank.save;

import com.cg.bank.BankAccount;

public class SavingAccount extends BankAccount{
	private boolean isSalaryAccount;
	//constructor cannot be inherited
	//no-arg constructor
	public SavingAccount() {
		System.out.println("No-arg SavingAccount contructor");
	}
	public SavingAccount(String accHolderName, double curBal,boolean isSalaryAccount) {
		super(accHolderName, curBal);
		this.isSalaryAccount=isSalaryAccount;
		System.out.println("Overloaded SavingAccount constructor");
	}
	@Override
	public String toString() {
		return "SavingAccount [isSalaryAccount=" + isSalaryAccount + "]"+
				super.toString();
	}
	//Dynamic Binding/Runtime Binding/Method Overriding
	@Override
	public void print() {		
		super.print();
		System.out.println("isSalaryAccount=" + isSalaryAccount);
	}	
}
