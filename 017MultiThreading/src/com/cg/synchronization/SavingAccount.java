package com.cg.synchronization;

/**@author smita*/
public class SavingAccount extends BankAccount {
	private boolean salaryAccount;
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(double accBalance, String accHolderName, boolean salaryAccount) {
		super(accBalance, accHolderName);
		this.salaryAccount = salaryAccount;
	}
//getters and setters
	public boolean isSalaryAccount() {
		return salaryAccount;
	}
	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
//toString()
	@Override
	public String toString() {
		return "SavingAccount [salaryAccount=" + salaryAccount + ", toString()="
				+ super.toString() + "]";
	}
//hashCode()
	@Override
	public int hashCode() {
		return super.hashCode();
	}
//equals()
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
