package com.cg.bank;

public class BankingApp {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Smita", 9999.99);
		BankAccount b2 = new BankAccount("Mita", 3499.99);
		BankAccount b3 = new BankAccount("Rita", 3645.99);
		BankAccount b4 = new BankAccount("Sita", 98999.99);
		BankAccount b5 = new BankAccount("Gita", 656.99);
		b1.print();b2.print();b3.print();b4.print();b5.print();
		BankAccount b6 = new BankAccount(); 
		b6.setAccHolderName("Sia");
		b6.setCurBal(98989.9);
		b6.print();
		
	}

}
