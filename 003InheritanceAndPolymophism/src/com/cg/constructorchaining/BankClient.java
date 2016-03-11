package com.cg.constructorchaining;
public class BankClient {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount();		
		BankAccount ba2 = new BankAccount(222);		
		BankAccount ba3 = new BankAccount(333,"Smita");		
		BankAccount ba4 = new BankAccount(444,"Rita",9999.99);
		System.out.println(ba1);
		System.out.println(ba3);
		System.out.println(ba2);
		System.out.println(ba4);
	}
}
