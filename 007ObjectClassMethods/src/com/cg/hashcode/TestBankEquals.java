package com.cg.hashcode;

public class TestBankEquals {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Smita", 9999.99);
		b1.setAccId(111);
		BankAccount b2 = new BankAccount("Mita", 3499.99);
		b2.setAccId(111);
		System.out.println("Are two BankAccount object equal : "
				+b1.equals(b2));
	}

}
