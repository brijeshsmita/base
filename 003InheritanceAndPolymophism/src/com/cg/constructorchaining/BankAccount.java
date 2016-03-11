package com.cg.constructorchaining;
public class BankAccount {
	private int accId;
	private String accHolderName;
	private double curBal;
	private static String bankName;	
	static{
		bankName="CG Bank India Pvt. Ltd";
	}
	public BankAccount() {
		this(1);
		/*accId=1;
		accHolderName="unknown";
		curBal=0.0;*/
	}
	public BankAccount(int accId) {
		this(accId,"unknown");
		/*this.accId=accId;
		accHolderName="unknown";
		curBal=0.0;*/
	}
	public BankAccount(int accId,String accHolderName) {
		this(accId,accHolderName,0.0);
		/*this.accId=accId;
		this.accHolderName=accHolderName;
		curBal=0.0;*/
	}
	public BankAccount(int accId,String accHolderName
			,double curBal){
		this.accId=accId;
		this.accHolderName=accHolderName;
		this.curBal=curBal;
	}	
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
	public void print(){
		System.out.println("============Bank Account Details=========="
				+ "\nBank Account Id		: "+accId
				+ "\nAccount Holder Name	: "+accHolderName
				+ "\nCurrent Balance 	: "+curBal
				+ "\nBank Name 		: "+bankName);
		
	}//endof print
	@Override
	public String toString() {
		return "BankAccount [accId=" + accId + ", accHolderName="
				+ accHolderName + ", curBal=" + curBal 
				+ "Bank Name 		: "+bankName+ "]";
	}
	//getter and setters
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
