package com.synergy.bank;
import java.util.ArrayList;


import com.synergy.bank.current.CurrentAccount;
/*
 * @author Smita Brijesh
 */
import com.synergy.bank.save.SavingsAccount;
/*
 * T- denotes type
 * E -denote element
 * K - keys
 * V - value
 * N - numbers
 */
public class BankAccList {
	static ArrayList<BankAccount>  accList;
	int size, top;
	{
		top= -1;
		accList = new ArrayList<>(size);
	}
	public BankAccList() {
	}
	public BankAccList(int size) {
		this.size=size;
	}
	public static void printAll(){
		for(BankAccount b:accList){
			System.out.println(b);
		}
	}
	public void addNewAccount(BankAccount ba){
			if(top<accList.size())
				accList.add(++top, ba);
	}
	public void removeAccount(BankAccount ba){
		if(top<accList.size())
			accList.remove(ba);
}
	public static void main(String[] args) {
		
		BankAccList list = new BankAccList(10);
		list.addNewAccount(new SavingsAccount ("Amar",1000,true));
		list.addNewAccount(new SavingsAccount ("aish",1000,true));
		list.addNewAccount(new CurrentAccount ("sia",1000,7889));
		printAll();
	}
}

