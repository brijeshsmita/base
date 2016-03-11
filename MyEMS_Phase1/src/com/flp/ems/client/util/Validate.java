package com.flp.ems.client.util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

	public static String checkName(String input){
		Scanner sc= new Scanner(System.in);
		String name=input;
		String charRegex="^[A-Za-z\\s]*$";
		for(;;){
			if(name.matches(charRegex)){
				break;
			}
			else{
				System.out.print("Enter a valid name:\t");
				name=sc.nextLine();
			}
		}
		return name;
	}
	public static String checkPhone(String phone){
		String input=phone;
		CharSequence inputStr=input;
		String phoneRegex="^([789])(\\d{9})$";//only 10 number with first digit either 7 or 8 or 9
		Pattern pattern = Pattern.compile(phoneRegex
				,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		Scanner sc= new Scanner(System.in);
		for(;;){
			if(input.matches(phoneRegex)){
				break;
			}
			else{
				System.out.print("Enter a valid 10 digit phone no.:\t");
				input=sc.nextLine();
			}
		}
		return input;
	}
	public static String checkKinId(String input){
		String inputStr=input;
		String kinIdRegex="^(K|k)(i|I)(D|d)(\\d{2})$";
		Pattern pattern = Pattern.compile(kinIdRegex);
		Matcher matcher = pattern.matcher(inputStr);
		Scanner sc= new Scanner(System.in);
		for(;;){
			if(inputStr.matches(kinIdRegex)){
				break;
			}
			else{
				System.out.print("Enter a valid Kin ID:\t");
				inputStr=sc.nextLine();
			}
		}
		return inputStr;
	}
	
	
	public static String checkEmailId(String input){
		String inputStr=input;
		String emailRegex="^[\\w\\.=-]+@[\\w\\.-]+\\.[\\w]{2,3}$";
		Pattern pattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		Scanner sc= new Scanner(System.in);
		for(;;){
			if(matcher.matches()){
				break;
			}
			else{
				System.out.print("Enter a valid Email ID:\t");
				inputStr=sc.nextLine();
			}
		}
		return inputStr;
	}

}
