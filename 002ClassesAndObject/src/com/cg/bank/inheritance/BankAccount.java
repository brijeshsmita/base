package com.cg.bank.inheritance;

public class BankAccount {
	private int accId;
	private String accHolderName;
	private double curBal;
	private static String bankName;	
	static{
		bankName="CG Bank India Pvt. Ltd";
	}
	public void setBankAccount(int accId,String accHolderName
			,double curBal){
		this.accId=accId;
		this.accHolderName=accHolderName;
		this.curBal=curBal;
	}
	public void deposit(double amount){
		curBal+=amount;//curBal=curBal+amount
		System.out.println("Amount Deposit successfully "
				+ ", your Cuurent Balance is :"+curBal);
	}
	public void withdraw(double amount){
		if(checkBalance(amount)){
			curBal-=amount;//curBal=curBal+amount
			System.out.println(amount+"Amount Withdrawn successfully "
					+ ", your Cuurent Balance is :"+curBal);
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
		System.out.println("============Bank Account Details=========="
				+ "\nBank Account Id		: "+accId
				+ "\nAccount Holder Name	: "+accHolderName
				+ "\nCurrent Balance 	: "+curBal
				+ "\nBank Name 		: "+bankName);
		
	}//endof print
}
