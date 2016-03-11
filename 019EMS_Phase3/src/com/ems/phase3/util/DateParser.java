package com.ems.phase3.util;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
	public static Date parseDate(){
		Date d1 = new Date();
		
		return d1;
	}



public static java.sql.Date parseToSqlDate(String stringDate) {
	String format="yyyy/MM/dd";
	java.util.Date utilDate=null;
	java.sql.Date sqlDate=null;
	SimpleDateFormat sdf = new SimpleDateFormat(format);
	try {//conveting string to util date
		utilDate=sdf.parse(stringDate);
		if(!stringDate.equals(sdf.format(utilDate))){
			utilDate=null;
		}else{
			sqlDate=new java.sql.Date(utilDate.getTime());
			System.out.println("sql Date is :"+sqlDate);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return sqlDate;		
	
}
}