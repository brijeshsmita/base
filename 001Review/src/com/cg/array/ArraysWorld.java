package com.cg.array;

public class ArraysWorld {
//method to add only odd numbers in an integer array
	public static void addOddNumInArray(int [] arr){
		int sumEven=0;int sumOdd=0;
		for(int i:arr)
		{
			if(i%2==0)
				sumEven=sumEven+i;
			else
				sumOdd=sumOdd+i;
		}//end of for
		System.out.println("Addition of Even numbers is : "+sumEven);
		System.out.println("Addition of Odd numbers is : "+sumOdd);
	}
	//static means single copy per class
//static method to add the numbers of array
	public static int addArrayNumbers(int [] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			//sum+=arr[i];
			sum = sum +arr[i];
		}
		return sum;
	}
//static method to multiply the integer array
	public static int multiplyNumbers(int [] arr){
		int result=1;
		for (int i = 0; i < arr.length; i++) {
			result *=arr[i];
		}
		return result;
	}
	public static void printIntArray(int [] arr){
		//enhanced for loop
		for(int i : arr){
			//i will always point to the 0th index
			//i will always increment by 1
			//i will iterate till the arr length by default
			// the data type of array will decide the datatype of i
			System.out.print(i+", ");
		}
	}
	public static void printStringArray(String [] arr){
		for(String i : arr){
			System.out.print(i+", ");
		}
	}	
	public static void main(String[] args) {
		int [] numArr={10,20,30,40};
		System.out.println("Sum Of Arrays Numbers Is : "
		+ArraysWorld.addArrayNumbers(numArr));
		System.out.println("Muliplication Of Arrays Numbers Is : "
				+ArraysWorld.multiplyNumbers(numArr));
		System.out.println("\n==========Printint NNumber Array==========");
		ArraysWorld.printIntArray(numArr);
		System.out.println("\n==========================================");
		System.out.println("\n==========Printint Name Array==========");
		String [] strArr = {"Sia","Ria","Jia","Kia","Mia","Tia"};
		ArraysWorld.printStringArray(strArr);
		System.out.println("\n==========================================");
	
	}

}
