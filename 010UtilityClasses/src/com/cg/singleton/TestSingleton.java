package com.cg.singleton;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestSingleton {
	public static void main(String[] args) {
		//Calendar c1 = new GregorianCalendar();
		Calendar c1= Calendar.getInstance();
		
		System.out.println("Calendar instance : "+c1);
		System.out.println("Time in mili seconds : "+c1.getTimeInMillis());
		System.out.println(" AM  "+c1.AM);
		System.out.println(" PM  "+c1.PM);
		Date today = new Date();
		System.out.println("Today is : "+today);
		
		MySingleton m1= MySingleton.getInstance();
		System.out.println("m1 : "+m1.hashCode());
		MySingleton m2= MySingleton.getInstance();
		System.out.println("m2 : "+m2.hashCode());
		MySingleton m3= MySingleton.getInstance();
		System.out.println("m3 : "+m3.hashCode());
		TestSingleton t1 = new TestSingleton();
		System.out.println("t1 : "+t1.hashCode());
		TestSingleton t2 = new TestSingleton();
		System.out.println("t2 : "+t2.hashCode());
	}
}
