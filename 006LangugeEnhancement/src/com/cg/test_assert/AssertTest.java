package com.cg.test_assert;
import java.util.Scanner;
public class AssertTest {
	public static void main(String[] args) {
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your age: ");
		age=scan.nextInt();
		//by default assertion are disabled
		//inorder to enable assertion
		//-ea command is used to be passed in VM argument
		//to disable assertion
		//-da command is used to be passed in VM argument
		assert age>=18:"Minor-Not Eligible to Vote";		
		System.out.println("Age is "+age);			
	}
}
