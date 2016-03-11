/**
 * 
 */
package com.cg.loop;

import com.cg.date.MyDate;
import com.cg.trainee.Trainee;

/**
 * @author Brijesh
 * testing switch case
 */
public class TestArray {
	public static void main(String[] args) {
		//1st way to declare array
		int marks []={10,20,30,78,96};
		System.out.println("Array of marks is :");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		//second way to declare array of chars
		char ch[]={'c','a','p'};
		System.out.println("Array of char : "+ch[2]);
		//or
		String str="cap";
		//string array
		
		
		int percent[] = new int[3];
		percent[0]=89;percent[1]=59;percent[2]=99;
		String names [] = new String[5];
		names[0]="naman";
		names[1]="raman";
		names[2]="aman";
		names[3]="manan";
		names[4]="saman";
		System.out.println("Array of names : ");
	
//enchanced for loop is used only for iteration 
//over collections and arrays
//datatype of the array and variable datatype must be same 
		for(String s:names)
		{//s point to the 0th index of names array
			System.out.println(s);
			//this for loop will automatically increment by 1
			//and goes the the length of an array b y default
		}
		
		int numbers[]={76,56,45,35,89};
		for(int i:numbers){
			System.out.println(i);
		}
		
		double mark[]={76,56,45,35,89};
		for(double i:mark){
			System.out.println(i);
		}//aray of user defined class
		MyDate m1 [] = new MyDate[3];
		m1[0]=new MyDate(11,11,2014);
		m1[1]=new MyDate(12,12,2012);
		m1[2]=new MyDate(10,5,2015);
		for(MyDate i:m1){
			System.out.println(i);
		}
		
		Trainee tarr[]=new Trainee[3];
		tarr[0]=new Trainee(1,"yojana", "HR", 8976896);
		tarr[1]=new Trainee(2,"ranjana", "IT", 3455454);
		tarr[2]=new Trainee(3,"sanjana", "Accounts", 658568);
		for(Trainee t :tarr)
		{
			System.out.println(t);
		}
	}
}






