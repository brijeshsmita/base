package com.cg.userdefiend_exception;

public class TestUserDefinedException {

	public static void main(String[] args) throws LowBalanceException {
		Account a1 = new Account(111, "Zara", 100);
		a1.withdraw(1000);
	}
}
