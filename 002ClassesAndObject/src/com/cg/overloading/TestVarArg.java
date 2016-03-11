package com.cg.overloading;

class Bill{
	public static void totalAmount(double amt1,double amt2,double amt3){
		double sum=0;
		sum=amt1+amt2+amt3;
		System.out.println("Normal The Total Bill AMount is :"+sum); 
	}//end of totalAmount method

	public static void totalAmount(double ... amt) {
		//amt is varArg - dynamic array created at runtime
		//size of the array will be decided at runtime according
		//to the number of parameters
		double sum=0;
		for(double d : amt){
			sum+=d;
		}
		System.out.println("you purchased "+amt.length+ " items");
	System.out.println(" varArg The Total Bill AMount is :"+sum);
	}
}//end of class Bill
//class to call the totalAmount method
public class TestVarArg{
	public static void main(String[] args) {
		double [] arr1={100.50, 445.8, 300.50};
		Bill.totalAmount(arr1);
		Bill.totalAmount(100.50, 445.8, 300.50,55.5,76.5);
		Bill.totalAmount(100.50, 445.8);
	}
}
