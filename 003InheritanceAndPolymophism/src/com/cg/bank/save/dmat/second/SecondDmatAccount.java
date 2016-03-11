package com.cg.bank.save.dmat.second;

import com.cg.bank.save.dmat.DmatAccount;

public class SecondDmatAccount extends DmatAccount{
	private double additionalInvestment;
	//constructor cannot be inherited
	//no-arg constructor
	public SecondDmatAccount() {
		System.out.println("No-arg SecondDmatAccount contructor");
	}
	public SecondDmatAccount(String accHolderName, double curBal,boolean isSalaryAccount,double investment,double additionalInvestment) {
		super(accHolderName, curBal,isSalaryAccount,investment);
		this.additionalInvestment=additionalInvestment;
		System.out.println("Overloaded SecondDmatAccount constructor");
	}
	@Override
	public String toString() {
		return " +additionalInvestment "+additionalInvestment+"]"+
				super.toString();
	}
	@Override
	public void print() {		
		super.print();
		System.out.println("+additionalInvestment "+additionalInvestment);
	}	
}
