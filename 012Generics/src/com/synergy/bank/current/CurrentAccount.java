package com.synergy.bank.current;
import com.synergy.bank.BankAccount;
import com.synergy.print.Printable;
public class CurrentAccount extends BankAccount 
implements Printable{
	private double overDraftLimit;
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
		overDraftLimit=0.0;
	}
	public CurrentAccount(String name, double curBal,double overDrafLimit) {
		super(name, curBal);
		this.overDraftLimit=overDrafLimit;
	}
	@Override
	public String toString() {
		return "CuurentAccount [overDraftLimit=" + overDraftLimit 
				+super.toString()+"]";
	}
//override means same method name with same signature and different implementation
//used in inheritance only
	@Override
	public void print() {
		super.print();
	}
	//overloading
	public void print(double overDrafLimit) {
		System.out.println(this);
	}
	

}
