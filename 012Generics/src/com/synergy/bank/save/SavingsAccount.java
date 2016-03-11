package com.synergy.bank.save;
import com.synergy.bank.BankAccount;
import com.synergy.print.Printable;
public class SavingsAccount extends BankAccount 
implements Printable{	
 	private boolean isSalaryAcc;
 	//default constructor
 	public SavingsAccount(){ 		
 		isSalaryAcc=true;
 		System.out.println("SavingsAccount Deafult constructor");
 	}
 	public SavingsAccount(String name,double curBal,boolean isSalaryAcc){
 		super(name, curBal);
		this.isSalaryAcc=isSalaryAcc;
		System.out.println("SavingsAccount Overloaded constructor");
 	} 	
	@Override
	public String toString() {
		return "SavingsAccount [isSalaryAcc=" + isSalaryAcc 
				+ super.toString()+"]";
	}
	@Override
	public void print(){
		System.out.println(this);
	}
	public boolean isSalaryAcc() {
		return isSalaryAcc;
	}
	public void setSalaryAcc(boolean isSalaryAcc) {
		this.isSalaryAcc = isSalaryAcc;
	}
 	
}
