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
	public static void main(String[] args) {
		//creating object of BankAccount class
		BankAccount ba = new BankAccount ();
		System.out.println("Previous Balance :" + ba.curBal);
		ba.deposit (5000);
		ba.withdraw(1000);
	System.out.println("Balance after withdrawing Rs.1000/- :" 
		+ ba.curBal);
	}

}
