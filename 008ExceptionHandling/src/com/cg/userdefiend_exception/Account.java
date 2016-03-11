package com.cg.userdefiend_exception;
public class Account {
	private int accId;
	protected String accHolderName;
	private double curBal;
	
	public Account() {
		System.out.println("No-arg BankAccount constructor");
	}
	public Account(int accId, String accHolderName, double curBal) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.curBal = curBal;
	}
	//business methods
	public void deposit(double amount){
		curBal+=amount;//curBal=curBal+amount
		System.out.println("Amount Deposit successfully "
				+ ", your Cuurent Balance is :"+curBal);
	}//end of deposit
	public void withdraw(double amount)throws LowBalanceException{
		if(checkBalance(amount)){
			curBal-=amount;//curBal=curBal+amount
			System.out.println(amount+"Amount Withdrawn successfully "
					+ ", your Cuurent Balance is :"+curBal);
		}else{
			//System.out.println(new LowBalanceException());
			//throw new LowBalanceException();
		throw new LowBalanceException("Balance is low, Withdraw cant happen");
		}
	}//end of withdraw
	private boolean checkBalance(double amount) {
		if(curBal>amount){
			System.out.println("Current Balance is :"+curBal);
			return true;			
		}else{
			System.out.println("In-sufficientBalance,"
					+ " Your Current Balance is :"+curBal);
			return false;
		}
	}//end of check balance
	public void print(){
		System.out.println(
				"|===================You Bank Account Details================|"
				+ "\nBank Account Id	    	:    	"+accId
				+ "\nAccount Holder Name	:	 "+accHolderName
				+ "\nCurrent Balance 	:        "+curBal
				+"\n|===========================================================|");
		
	}//endof print
//override toString
	@Override
	public String toString() {
		return "BankAccount [accId=" + accId + ", accHolderName="
				+ accHolderName + ", curBal=" + curBal 
				+"]";
	}
//generate getter and setters
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getCurBal() {
		return curBal;
	}
	public void setCurBal(double curBal) {
		this.curBal = curBal;
	}
	
	@Override
	public int hashCode() {
		return this.accId;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode()==obj.hashCode();
	}
}
