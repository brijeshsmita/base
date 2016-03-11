package com.cg.validation.datevalidation;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.cg.exception.EmsException;
import com.cg.util.DateUtil;
import com.cg.util.Validate;

public class DateValidation 
{
	private Scanner sc=new Scanner(System.in);
	private int day,month,year;
	private static Calendar c;
	
	static
	{
		c = Calendar.getInstance();
	}
	
	public void getDate(Date date) throws EmsException
	{
		
		
		
		c.setTime(date);
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH)+1;
		day=c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Year = " + year);
		System.out.println("Month = " + month);
		System.out.println("Day = " + day);
		
		 //checkDob(year, month, day);
		 
		 
		/*if(month==3)
		{
			checkLeapYear(year,month,day);
		}*/

	}
	
	public boolean checkMonthAndDay(Date date)
	{
		c.setTime(date);
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH)+1;
		day=c.get(Calendar.DAY_OF_MONTH);
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			if(day>31)
			{
				System.out.println("Invali day");
				return false;
			}
		}
		if(month==4||month==6||month==9||month==11)
		{
			if(day>30)
			{
				System.out.println("Invalid day");
				return false;
			}
		}
		return true;
		
	}
	
	public boolean checkDoj(Date date)
	{
		c.setTime(date);
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH)+1;
		day=c.get(Calendar.DAY_OF_MONTH);
		
		if(year==((Calendar.getInstance().get(Calendar.YEAR))))
		{
			if(((Calendar.getInstance().get(Calendar.MONTH))<month))
			{
				System.out.println("Date of joining cant be greater than "+year);
				return false;
			}
			else
			{
				if(((Calendar.getInstance().get(Calendar.MONTH))==month))
				{
					if((Calendar.getInstance().get(Calendar.DAY_OF_WEEK_IN_MONTH))<day)
					{
						System.out.println("Date of joining cant be greater than "+day);
						return false;
					}
				}
				
			}
		}
		if(year<1967||year>((Calendar.getInstance().get(Calendar.YEAR))))
		{
			System.out.println("Joining date cant be greater than current year or less than 1967");
			return false;
		}
	

		
		return true;
	}
	
	public boolean checkDob(Date date)
	{
		c.setTime(date);
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH)+1;
		day=c.get(Calendar.DAY_OF_MONTH);
		
		if(((Calendar.getInstance().get(Calendar.YEAR))-year)<21||((Calendar.getInstance().get(Calendar.YEAR))-year)>60)
		{
			//System.out.println("Sorry you are not eligible!, Employees should be 21 or above 21");
			return false;
		}
		return true;
	}
	
	public boolean checkLeapYear(Date date)
	{
		c.setTime(date);
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH)+1;
		day=c.get(Calendar.DAY_OF_MONTH);
		
        //if year is divisible by 4, it is a leap year
       System.out.println("day="+day);
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
        		System.out.println("Year " + year + " is a leap year");
        		return true;
        }      
        else
        {
        	System.out.println("day="+day);
        	if(day==29)
        	{
        		System.out.println("Invalid date");
        		System.out.println("Year " + year + " is not a leap year");
        		return false;
        	}
        }
        return true;
               
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DateValidation v=new DateValidation();
		String dob=null;
		Date date;
		System.out.println("Enter Employee Date of Birth"
				+ " in following format yyyy/MM/dd");
		dob=sc.next();
		date=DateUtil.convertStringToUtilDate(dob);
		try {
			v.getDate(date);
		} catch (EmsException e) {
			e.printStackTrace();
		}
		

	}

}
