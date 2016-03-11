import com.synergy.bank.BankAccount;
import com.synergy.print.Printable;
/*
 * @author Smita Brijesh
 */
class ManageAccounts {
	BankAccount bankList[ ];
  	int size, top;
  	
	ManageAccounts(int s) {
			 size = s;
			 bankList = new BankAccount [size];
			 top = -1;
	}
  	
	void addNewAccount(BankAccount account) { 
  			bankList [ ++top ] = account;
	}
	public static void printAll(Printable ... pArr){
		for(Printable p:pArr){
			p.print();
		}
}
	BankAccount showAccount() {
			 return bankList [ top-- ];
	}
}
