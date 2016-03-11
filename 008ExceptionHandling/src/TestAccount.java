
public class TestAccount {
	public static void main(String[] args) throws LowBalanceException {
		Account a1 = new Account(111,1000);
		a1.withdraw(1100);
	}
}
