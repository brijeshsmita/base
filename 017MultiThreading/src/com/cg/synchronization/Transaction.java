package com.cg.synchronization;
public class Transaction {
	SavingAccount savingAccount;	
	public Transaction(){}
	public Transaction(SavingAccount savingAccount) {
		super();
		this.savingAccount = savingAccount;
	}	
public synchronized void doTransaction(double amount){
//	public void doTransaction(double amount){
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+" started transaction");
		//synchronizing only the block of code for the current thread
		//synchronized(this) 
		//{		
			System.out.println(threadName+ " is checking balance.."
					+"\nAvailable balance is:"
					+savingAccount.getAccBalance());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println(threadName + " Trying to withdraw..."
							+amount);
				savingAccount.withdraw(amount);
				System.out.println(threadName+ " Balance reciept :"
						+savingAccount.getAccBalance());
		//}//end of synchronized block		
	}	//end of doTransaction() method
}

/**/