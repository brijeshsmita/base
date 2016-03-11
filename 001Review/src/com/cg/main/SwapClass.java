package com.cg.main;
import com.cg.date.MyDate;
public class SwapClass {
//in java object are always pass by value
	/*public static void swap(MyDate d1 ,MyDate d2){
		MyDate temp;
		temp=d1;
		d1=d2;
		d2=temp;
	}*/
	public static void swap(MyDate [] arr){
		MyDate temp;
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
	public static void main(String[] args) {
		MyDate d1 = new MyDate(11, 11, 2011);
		MyDate d2 = new MyDate(12, 12, 2012);
		MyDate [] dArr= {d1,d2};
		System.out.println("Before Swapping : "+dArr[0]+"\t"+dArr[1]);
		//swap(d1, d2);
		swap(dArr);
		System.out.println("After Swapping  : "+dArr[0]+"\t"+dArr[1]);
	}
}
