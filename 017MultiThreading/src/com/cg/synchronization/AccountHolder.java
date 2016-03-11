package com.cg.synchronization;

public class AccountHolder extends Thread{
	//account holder will perform transaction
	private Transaction transaction;
	private double  amount;
	public AccountHolder(){
		
	}
	public AccountHolder(Transaction transaction,double amount,
		String threadName) {
		super(threadName);
		this.transaction=transaction;
		this.amount=amount;
	}
	@Override
	public void run() {
		transaction.doTransaction(amount);
	}
}
