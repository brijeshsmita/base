package com.cg.bank;
public abstract class BankAccount {
	protected int accId;
	protected String accHolderName;
	protected double curBal;
	public static String bankName;	
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
// yes we can have constructor in  an abstract class but why we need them 
//	if we cant instantiate Abstract Class??
//constructors are allowed coz in inheritance
	//constructor is called super to sub
	public BankAccount() {
		System.out.println("No-arg BankAccount constructor");
	}
	public BankAccount(String accHolderName,double curBal){
		this.accHolderName=accHolderName;
		this.curBal=curBal;
		System.out.println("Overloaded BankAccount constructor");
	}
//abstract method
	public abstract double calculateInterest();
	
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
