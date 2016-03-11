/**
 * 
 */
package com.cg.bank;

/**
 * @author Smita Brijesh
 *
 */
//as there is no access modifier thus the access level is Default
//means this class will be accessed only within the same package
//top leve class can be only public or can have default access level
public class BankAccount {
	private int id;
	private double curBal;
	private String name;
	private static String bankName;
	static{
		bankName="CG Bank";
	}
	public BankAccount(){
		System.out.println("BankAccount no_argument Constructor");
	}
//deposit method
	public void deposit(double amount){
		curBal+=amount;
		System.out.println("Deposit successful !! \n"
				+ "Your current balance is : "+curBal);
	}
//withdraw ,method
	public void withdraw(double amount){
		if(amount<curBal){
			curBal-=amount;
			System.out.println("Withdraw successful !! \n"
				+ "Your current balance is : "+curBal);
		}else
			System.out.println("Low Balance !! \n"
					+ "Your current balance is : "+curBal);
	}
	public static void bankInfo(){
		System.out.println("Printing Bank information\n"+bankName);
	}
	public static void main(String[] args) {
//creating object of BankAccount class
		BankAccount b1 = new BankAccount();
	}
	public void setBankAccount(int i, String string, int j) {
		// TODO Auto-generated method stub
		
	}
	public void print() {
		System.out.println(this);
	}

}





