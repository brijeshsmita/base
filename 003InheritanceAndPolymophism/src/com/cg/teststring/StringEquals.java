package com.cg.teststring;

import com.cg.bank.BankAccount;

public class StringEquals {
	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);//comparing references
		String s3= new String("abc");
		System.out.println(s1==s3);
		System.out.println("s1.equals(s2) : " +s1.equals(s2));
		//values is compared
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount();
		System.out.println("ba1==ba2 : " + (ba1==ba2));
		//comparing references
		System.out.println("ba1.equals(ba2) : " + ba1.equals(ba2));
		//hashcode is compared
	}
}
