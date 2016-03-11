/**
 * 
 */
//there must be 1 or none package declaration statement 
//in a .java file
//package declaration must be the first line of code in .java file
package com.cg.main;

//import statment must be 2nd line of code in .java file
//there can be none or many import statements
import com.cg.bank.BankAccount;
import java.util.Date;
/**
 * @author Smita Brijesh
 * class to create BankAccount object 
 */
//only 1 public class and name of .java file must be same as
//public class name
public class TestAccount {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.deposit(1000);
		Date d1 = new Date();
		System.out.println("Todays date is : "+d1);
	}
}
