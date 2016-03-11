package com.cg.passbyref;
public class SwapByRef {
	public static void doSwap(int [] nArr){
		int temp=nArr[0];
		nArr[0]=nArr[1];
		nArr[1]=temp;
		System.out.println("Swapping done....");
	}
	public static void main(String[] args) {
		// static method are invoked by using class name
		int n1=10, n2=20;
		int[] numArr={n1,n2};
		System.out.println("Before swapping"+"N1: "+numArr[0]
				+",N2:"+numArr[1]);
		SwapByRef.doSwap(numArr);
		System.out.println("After swapping"+"N1: "+numArr[0]
				+",N2:"+numArr[1]);

	}
}
