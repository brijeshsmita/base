package com.cg.trycatch;
public class TryCatch {
	public static void main(String[] args) {
		int n1=10,n2=0;
		double div=0;
		try {
			div=n1/n2;
			System.out.println("Division is : "+div);
		} catch (ArithmeticException ae) {
			System.out.println("Division by zero is not possible: ");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}
}
