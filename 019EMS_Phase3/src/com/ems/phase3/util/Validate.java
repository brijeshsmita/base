package com.ems.phase3.util;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	public static boolean checkDate(String input){
		String dateRegex="([0-9]{4})/([0-9]{2})/([0-9]{2})";
		if(input.matches(dateRegex))
			return true;
		else
			return false;			
	}
	public static java.sql.Date convertStringToSqlDate(String stringDate){
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

	public static boolean checkChar(String input){
		String charRegex="^[A-Za-z\\s]*$";
		if(input.matches(charRegex))
			return true;
		else
			return false;
	}
	public static boolean checkKinId(String input){
		CharSequence inputStr=input;
		//String emailRegex="^[A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@[[A-Za-z0-9-]+](\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		String kinIdRegex="^KinID([0-9])+$";
		//must start with KinID
		//folowed by 3 digit
		Pattern pattern = Pattern.compile(kinIdRegex);
		Matcher matcher = pattern.matcher(inputStr);
		
		if(matcher.matches())
			return true;
		else
			return false;
		
//		/KinID101
	}
	public static boolean checkPhoneNo(String input){
		CharSequence inputStr=input;
		//String emailRegex="^[A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@[[A-Za-z0-9-]+](\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		String phoneRegex="^[+]?(\\d{2})\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
		//may start with + followed by 2 d eg: +91
		//may have bracket eg: +91(222)6786990
		//should be of 12 digit including +91(+ is not mandatory
		Pattern pattern = Pattern.compile(phoneRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		
		if(matcher.matches())
			return true;
		else
			return false;
		
	}
	public static boolean checkEmailId(String input){
		CharSequence inputStr=input;
		//String emailRegex="^[A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@[[A-Za-z0-9-]+](\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		String emailRegex="^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		Pattern pattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		
		if(matcher.matches())
			return true;
		else
			return false;
		
	}
	/*public static void main(String[] args) {
		System.out.println(checkChar("smi4a B kumar"));
		checkDate("");
		System.out.println(checkEmailId("smi4ta@Bkumar@gmail.co.in"));
		System.out.println(checkPhoneNo("91(221)56789091"));
		System.out.println(checkKinId("KinId101"));
	}*/
}
