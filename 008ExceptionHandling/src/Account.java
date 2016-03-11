
public class Account {
	private int accNo;
	private double balance;
	public Account() {
	}	
	public Account(int accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	public void withdraw(double amount) throws LowBalanceException{
		if(amount>balance){
			throw new LowBalanceException("Balance is low");
		}
		balance-=amount;
		System.out.println("withdrawal successful"
				+ "\n your current balanace is  "+balance);
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
