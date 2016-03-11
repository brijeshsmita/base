package com.cg.bank.save;

import com.cg.bank.BankAccount;

public class SavingAccount extends BankAccount{
	private boolean isSalaryAccount;
//no-arg constr
	public SavingAccount() {
	}
//overloade constr
	public SavingAccount(String accHolderName, double curBal
			,boolean isSalaryAccount) {
		super(accHolderName, curBal);
		this.isSalaryAccount=isSalaryAccount;
	}	
	@Override
	public double calculateInterest() {
		return curBal*0.10;
	}	
	@Override
	public void print() {
		System.out.println("===============SavingAccount=============");
		System.out.println("isSalaryAccount : "+isSalaryAccount);
		super.print();
	}
	@Override
	public String toString() {
		return "SavingAccount [isSalaryAccount=" + isSalaryAccount
				+ ", toString()=" + super.toString() + "]";
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

}
