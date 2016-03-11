package com.cg.validate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate
{
	public static boolean checkEmpName(String name)
	{
		String charRegex="^[A-Za-z\\s]{3,20}";
		if(!Pattern.matches(charRegex,name))
		{
			System.out.println("Invalid Input");
		}
		
		return Pattern.matches(charRegex,name);
	}
	
	public static boolean checkNumber(String num)
	{
		String numberRegex="^[A-Za-z\\s]*$";
		if(!Pattern.matches(numberRegex,num))
		{
			System.out.println("Invalid Input");
		}
		
		return Pattern.matches(numberRegex,num);
	}
	
	
	
	public static boolean checkDescription(String desc)
	{
		String charRegex="^[A-Za-z0-9\\s]{0,5}";
		if(!Pattern.matches(charRegex,desc))
		{
			System.out.println("Invalid Input");
		}
		
		return Pattern.matches(charRegex,desc);
	}
	
	
	public static boolean checkEmailId(String emailId)
	{
		String emailRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(!Pattern.matches(emailRegex,emailId))
		{
			System.out.println("Invalid Input");
		}
		
		return Pattern.matches(emailRegex,emailId);
	}
	
	public static boolean checkKinId(String input){
		CharSequence inputStr=input;
		//String emailRegex="^[A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@[[A-Za-z0-9-]+](\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		String kinIdRegex="^KIN([0-9])+$";
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
	
	public static boolean checkPhoneNo(String phoneNo)
	{
		String phoneRegex="^[+]?(\\d{2})\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
		if(!Pattern.matches(phoneRegex,phoneNo))
		{
			System.out.println("Invalid Input");
		}
		
		return Pattern.matches(phoneRegex,phoneNo);
	}
	
	public static boolean checkDateOfBirth(String dateOfBirth)
	{
		//String dateRegex="(19|20)\\d\\d/(0?[1-9]|1[012])/(0?[0-9]|[12][0-9]|3[01])";
		String dateRegex="^(19|20)\\d\\d[-/.](0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])$";
		if(!Pattern.matches(dateRegex,dateOfBirth))
		{
			System.out.println("Invalid Input");
		}
		return Pattern.matches(dateRegex,dateOfBirth);
	}
	
	public static boolean checkDateOfJoining(String dateOfJoining)
	{
		String dateRegex="^(19|20)\\d\\d[-/.](0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])$";
		if(!Pattern.matches(dateRegex,dateOfJoining))
		{
			System.out.println("Invalid Input");
		}
		return Pattern.matches(dateRegex,dateOfJoining);
	}
	
	public static void main(String[] args) throws IOException 
	{
		String name;
		
		try(InputStreamReader is=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(is);)
		{
				do
				{
					System.out.println("Enter name");
					name=br.readLine();
					
						
					if(checkEmpName(name)==true)
					{
						System.out.println("DOJ :"+name);
					}
								
				}while(checkEmpName(name)==false);
		}
	}
	
}
