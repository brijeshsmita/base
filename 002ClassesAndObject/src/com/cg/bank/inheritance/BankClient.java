package com.cg.bank.inheritance;
public class BankClient {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();
		ba1.setBankAccount(1111, "Smita", 1000);
		ba1.print();
		ba1.deposit(2000);
		ba1.withdraw(1200);		
	}
}
