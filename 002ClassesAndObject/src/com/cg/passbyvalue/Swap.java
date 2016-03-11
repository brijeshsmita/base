package com.cg.passbyvalue;

public class Swap {
	public static void doSwap(int n1, int n2){
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("Swapping done....");
	}

	public static void main(String[] args) {
		// static method are invoked by using class name
		int n1=10, n2=20;
		System.out.println("Before swapping"+"N1: "+n1+",N2:"+n2);
		Swap.doSwap(n1,n2);
		System.out.println("After swapping"+"N1: "+n1+",N2:"+n2);

	}

}
