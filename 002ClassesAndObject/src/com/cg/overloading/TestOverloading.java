package com.cg.overloading;

public class TestOverloading{
	public static void main(String[] args) {
		MyMethod m1 = new MyMethod();
		System.out.println("add(int n1,int n2): "+m1.add(10,20));
		System.out.println("add(double n1,int n2): "+m1.add(10.5,20));
		System.out.println("add(int n1,int n2,int n3): "+m1.add(10,5,20));
		System.out.println("add(double n1,int n2,int n3): "+m1.add(10.5,5,20));
		System.out.println("add(int n1,int n2,double n3): "+m1.add(10,5,25.5));
/*
compiler will check at runtime
-number,datatype,and sequence of parameter passed while
calling a method
*/
	}
}

class MyMethod
{
	public int add(int n1,int n2){		
		return n1+n2;
	}
	public double add(double n1,int n2){
		return n1+n2;
	}
	public int add(int n1,int n2,int n3){
		return n1+n2+n3;
	}
	public double add(int n1,int n2,double n3){
		return n1+n2+n3;
	}
	public double add(double n1,int n2,int n3){
		return n1+n2+n3;
	}		
}
