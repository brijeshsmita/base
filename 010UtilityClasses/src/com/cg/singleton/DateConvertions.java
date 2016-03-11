package com.cg.singleton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConvertions {
	public static String dateToString(Date date){
/*		Date now = new Date();
		System.out.println("Date is : "+now);*/
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yy");
		String strDate = sdf.format(date);
		return strDate;
	}
	public static Date stringToDate(String strDate){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	//	String formatDate= "14-01-2016 15:00:02";
		Date date=null;
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	public static void main(String[] args) {
		String strDate=DateConvertions.dateToString(new Date());
		System.out.println("Date to String (dd/MM/yy)"+strDate);
		System.out.println("String to Date :"+stringToDate("14-01-2016 15:00:02"));
		dateToCalendar("14-01-2016 15:15:02");
	}
	public static void dateToCalendar(String strFormat){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		Date date=null;
		try {
			date = sdf.parse(strFormat);
			Calendar calendar= Calendar.getInstance();
			calendar.setTime(date);
			System.out.println("Calendar to Date is :"+calendar.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
