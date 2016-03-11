package com.cg.generic;
import com.synergy.bank.BankAccount;
/*
 * @author Smita Brijesh
 */
public class TwoGenericTest {
	public static void main (String args[ ]) {
		BankAccount ba = new BankAccount();
		Employee e = new Employee();
		TwoGeneric<BankAccount, Employee> tg = 
      		new TwoGeneric<BankAccount,Employee>(ba,e);
		tg.showTypes();
		System.out.println("Value of BankAccount : " 
				+tg.getA());
    	System.out.println("Value of Employee :" 
    			+tg.getB());
    	
 }
}