package com.cg.array;
import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args) {
		int[] marks= new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects:");
		//inserting the values in an array
		for (int i = 0; i < marks.length; i++) {
			marks[i]=scan.nextInt();
		}
		//printing the values of an array
		System.out.println("you have entered...");
		/*for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]+",");
		}*/
/*Enhanced for loop by default start with 0th index
 * always increment by 1
 * till the length of the array
 * rule-variable data type must be same as array data type
 * because variable holds the value one by one while iterating
 */
		for( int i:marks){
			System.out.println(i);
		}
		double[] arr= {10.4,50.9,12.3,45,60}; 
		System.out.println("printing array of double value");
		for(double i: arr){
			System.out.println(i);
		}
		
		String[] strArr={"abc","def","xyz"};
		System.out.println("printing array of String value");
		for(String i : strArr){
			System.out.println(i);
		}
		
		float[] floatArr= {10.4f,50.9f,12.3f,45,60}; 
		System.out.println("printing array of float value");
		for(float i: floatArr){
			System.out.println(i);
		}
	}//end of main
}












