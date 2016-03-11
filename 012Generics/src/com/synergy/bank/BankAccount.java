package com.synergy.bank;
//step 1: package declaration
//step 2: import if required
//step 3: public class
//step 4: private instance/member variable
//step 5: static variables if required
//step 6: static init block for initializing static var
//step 7: init block for initializing var with default value
//step 8: No-Arg constructor
//step 9: Overlaoded Constructor
//step 10: Business Methods
//step 11: Override toString() method
//step 12: Getters and setters
public class BankAccount {
	private int accId;
	protected String accHolderName;
	private double curBal;
	private static String bankName;	
	private static int numId;	
	static{
		bankName="CG Bank India Pvt. Ltd";
		numId=1000;
		System.out.println("static-init block invoked");
	}
	//init block
	{
		//auto generation of accId
		accId=(int) (numId++ +(Math.random()*111.11));
		accHolderName="unknown";
		curBal=0.0;
		System.out.println("init block invoked");
	}
	public BankAccount() {
		System.out.println("No-arg BankAccount constructor");
	}
	public BankAccount(String accHolderName,double curBal){
		this.accHolderName=accHolderName;
		this.curBal=curBal;
		System.out.println("Overloaded BankAccount constructor");
	}

	//business methods
	public void deposit(double amount){
		curBal+=amount;//curBal=curBal+amount
		System.out.println("Amount Deposit successfully "
				+ ", your Cuurent Balance is :"+curBal);
	}//end of deposit
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
	//Static Binding\Early Binding\Method Overloading
	public void print(int NoOfPrint){}
	public void print(){
		System.out.println(
				"|===================You Bank Account Details================|"
				+ "\nBank Account Id	    	:    	"+accId
				+ "\nAccount Holder Name	:	 "+accHolderName
				+ "\nCurrent Balance 	:        "+curBal
				+ "\nBank Name 		:        "+bankName
				+"\n|===========================================================|");
		
	}//endof print
//override toString
	@Override
	public String toString() {
		return "BankAccount [accId=" + accId + ", accHolderName="
				+ accHolderName + ", curBal=" + curBal 
				+"Bank Name 		: "+bankName+"]";
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
	public static String getBankName() {
		return bankName;
	}
	public static void setBankName(String bankName) {
		BankAccount.bankName = bankName;
	}
	
}
