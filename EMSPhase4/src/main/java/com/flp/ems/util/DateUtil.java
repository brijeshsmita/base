package com.flp.ems.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static Date convertStringToUtilDate(String strDate){//converting string to utilDate
		Date d=new Date();
		SimpleDateFormat ft=new SimpleDateFormat("dd/MM/yyyy");
		
		try{
			d=ft.parse(strDate);
		}catch(ParseException e){
			System.out.println("Parse Exception");
		}		
		return d;
	}

	public static java.sql.Date //converting util to sql date
	convertUtiltoSql(java.util.Date utilDob) {
	long time= utilDob.getTime();
	return new java.sql.Date(utilDob.getTime());
	
}

}
