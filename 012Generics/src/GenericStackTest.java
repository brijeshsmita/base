import com.synergy.bank.BankAccount;
import com.synergy.bank.save.SavingsAccount;
/*
 * @author Smita Brijesh
 */
public class GenericStackTest {
	public static void main (String args[ ]) {
		GenericStack<BankAccount> si = new GenericStack<BankAccount>(2); 
    	si.addNewAccount(new BankAccount());
    	si.addNewAccount(new SavingsAccount());
    	for (int i=0; i<si.size; i++) {
    		System.out.println (si.getAccount());
    	}
    	System.out.println();
        GenericStack<SavingsAccount> sf = 
        		new GenericStack<SavingsAccount>(2); 
		sf.addNewAccount(new SavingsAccount());  
		// sf.addNewAccount(new BankAccount());
    	for (int i=0; i<sf.size; i++) 
    		System.out.println (sf.getAccount());
	  }
}
