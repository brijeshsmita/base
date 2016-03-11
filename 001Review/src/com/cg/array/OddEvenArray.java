/**
 * 
 */
package com.cg.array;

/**
 * @author Brijesh
 *
 */
public class OddEvenArray {
	
//write a program to create array of 10 numbers
	//and display which is odd and even 
	public static void main(String[] args) {		
		int numArr[]={10,21,22,13,11,23,98,78,29,99};
		/*for(int i:numArr){
		if(i%2==0)
			System.out.println("Even "+i);
		else
			System.out.println("				Odd "+i);	
	}*/
		OddEvenArray obj1= new OddEvenArray();
		obj1.addNumArr(numArr);
		//obj1.addNumbers();
		obj1.addEvenNumbers(numArr);		
		
	}//end of main
	public void addEvenNumbers(int numArr[])
	{
		int sumEven=0;int sumOdd=0;
		for(int i:numArr)
		{
			if(i%2==0)
				sumEven=sumEven+i;
			else
				sumOdd=sumOdd+i;
		}//end of for
	}
	private void addNumArr(int[] numArr) {
		int sum=0;
		for(int i=0;i<numArr.length;i++){
			sum=sum+numArr[i];
		}
		System.out.println("Sum of numbers in numArr : "+sum);
		/*sum=0;
		for(int i:numArr){
			sum+=i;
		}//end of for	
		System.out.println("Sum of numbers in numArr : "+sum);*/
	}//end of addNumArr()
	
	private void addNumbers() {
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
	System.out.println("Sum of numbers from 1 to 100 is "+sum);
	}
}
