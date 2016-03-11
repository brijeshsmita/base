package com.cg.synchronization;
public class AtmTest {
	public static void main(String[] args) {
		SavingAccount account = 
				new SavingAccount(10000,
				"Smita", false);		
		Transaction transaction = 
				new Transaction(account);		
		//thread object
		AccountHolder t1 = 
				new AccountHolder(transaction,6000,"MOM");
		AccountHolder t2 = 
				new AccountHolder(transaction,6000,"DAD");
		
		t1.start();t2.start();
	}
}
