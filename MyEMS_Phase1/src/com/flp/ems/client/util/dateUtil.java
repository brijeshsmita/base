package com.flp.ems.client.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateUtil {
	/*public static Date convertStringToUtilDate (String strDate){
		Date d= new Date();
		SimpleDateFormat ft=
				new SimpleDateFormat("yyyy/MM/dd");
		//System.out.println("Formatted Date : "+ ft.format(d));
		try{
			d = ft.parse(strDate);
		}catch (ParseException e){
			e.printStackTrace();
		}
		return d;
	}*/
	@SuppressWarnings("deprecation")
	public static Date getDoj(){
		Date d= new Date();
		Scanner sc= new Scanner(System.in);
		//boolean flag=false;
		int mm,dd, yy;
		for(;;){
			System.out.print("enter month"
					+ "\n valid date is from 01 (jan) to 12(dec):\t");
			mm=sc.nextInt();
			if(mm>12 || mm< 1)
				continue;
			else
				break;
		}
		for(;;){
			System.out.print("enter validate date according to entered month:\t ");
			dd=sc.nextInt();
			if(mm==02){
				if(dd<1 || dd>29)
					continue;
				else
					break;
			}
			else
			{
				if(mm==04 || mm==6 || mm==9 || mm==11){
					if(dd<1 || dd>30)
						continue;
					else
						break;
				}
				else{
					if(dd<1 || dd>31)
						continue;
					else
						break;
				}
			}
		}
		for(;;){
			System.out.print("enter valid year");
			yy=sc.nextInt();
			int x=d.getYear()+1900;
			System.out.println(x);
			if(yy>x || yy< 1990)
				continue;
			else
				break;
		}
		
		d=new Date(yy, mm, dd);
		return d;
	}
	
	public static Date getDob(){
		Date d1= new Date();
		Scanner sc= new Scanner(System.in);
		//boolean flag=false;
		int mm,dd, yy;
		for(;;){
			System.out.print("enter month"
					+ "\n valid date is from 01 (jan) to 12(dec):\t");
			mm=sc.nextInt();
			if(mm>12 || mm< 1)
				continue;
			else
				break;
		}
		for(;;){
			System.out.print("enter validate date according to entered month:\t ");
			dd=sc.nextInt();
			if(mm==02){
				if(dd<1 || dd>29)
					continue;
				else
					break;
			}
			else
			{
				if(mm==04 || mm==6 || mm==9 || mm==11){
					if(dd<1 || dd>30)
						continue;
					else
						break;
				}
				else{
					if(dd<1 || dd>31)
						continue;
					else
						break;
				}
			}
		}
		for(;;){
			System.out.print("enter valid year");
			yy=sc.nextInt();
			int x=d1.getYear()+1900;
			System.out.println(x);
			if(yy>(x-21) || yy< x-60)
				continue;
			else
				break;
		}
		
		d1=new Date(yy, mm, dd);
		return d1;
	}
	
	
}
