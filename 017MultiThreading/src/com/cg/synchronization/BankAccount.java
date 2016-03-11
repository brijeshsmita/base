package com.cg.synchronization;
/**
 * 
 */


/*@author smita*/
public abstract class BankAccount {
	private final int accNumber;//blank final
	
	private double accBalance;
	private String accHolderName;
	
	private static int accId;
	static
	{
		accId=100001;
	}
//init block
	{
		this.accNumber=accId++;
		//auto-generating account number
	}
//no-arg contr
	public BankAccount() {
	}
//overloaded constr
	public BankAccount(double accBalance, String accHolderName) {
		super();
		this.accBalance = accBalance;
		this.accHolderName = accHolderName;
	}
//business methods
	public void deposit(double amount){
		accBalance+=amount;
	}
	public void withdraw(double amount){
		if(accBalance<amount)
		{
			try {
				throw new LowBalanceException();
			} catch (LowBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			accBalance-=amount;
	}
//getters and setters
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public static int getAccId() {
		return accId;
	}
	public static void setAccId(int accId) {
		BankAccount.accId = accId;
	}
	public int getAccNumber() {
		return accNumber;
	}
//toString()
	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", accBalance="
				+ accBalance + ", accHolderName=" + accHolderName + "]";
	}
//equals
	public boolean equals(Object b)
	{
		return this.hashCode()==b.hashCode();
	}
//hashCode
	@Override
	public int hashCode() {
		return this.accNumber;
	}
	
}








