package com.cg.wrapper;

public class WrapperConversions {

	public static void main(String[] args) {
		int n1, n2, sum=0;
		n1=Integer.parseInt(args[0]);//convert String to Integer
		n2=Integer.parseInt(args[1]);
		sum=n1+n2;
		System.out.println("Sum of two numbers : "+sum);
	}
}
