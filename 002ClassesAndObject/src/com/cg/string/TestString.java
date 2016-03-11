/**
 * 
 */
package com.cg.string;

/**
 * @author SmitaBrijesh
 *
 */
public class TestString {
	public static void main(String[] args) {
		String name = "Smita";
		System.out.println("Name is : "+name);
		//name.concat("kumar");
		name+=" kumar";
		System.out.println("Full Name is : "+name);
		System.out.println("Uppercase : "+name.toUpperCase());
		System.out.println("Lowercase : "+name.toLowerCase());
		System.out.println("Lenght of name : "+name.length());
System.out.println("Character at 5th index : "+name.charAt(6));
System.out.println("Index of 'k' is  : "+name.indexOf('k'));
System.out.println("Substring from 2nd to 4th character: "
+name.substring(2,5));
System.out.println("substring from 6th index "+name.substring(6));



	String textAge = "21";// 21 is integer literal
	int age = Integer.parseInt(textAge);
	System.out.println("String converted to integer value :"+age);
	// Input to Integer.parseInt() 
	//must be a valid integer literal
	

	String textAmt = "55";
	float amtFloat = Float.parseFloat(textAmt);
	System.out.println("String converted to Float value :"+amtFloat);// aFloat <- 55.66f
	double amtDouble = Double.parseDouble("765"); 
	System.out.println("String converted to double value :"+amtDouble);// aDouble <- 1.2345
	
	String str1="smita";
	String str2="smita";
	String str3="java";
	System.out.println("is str1==str2 : "+(str1==str2));
//here in case of string literals 
// single object reference 
//will be created as the value is same and
//as == compares reference thus it returns true
	System.out.println("is str1==str3 : "+(str1==str3));
	System.out.println("is str1.equals(str2) : "
	+str1.equals(str2));
	String str4= new String("SMITA");
	System.out.println("is str1.equals(str4) : "
			+str1.equalsIgnoreCase(str4));
/*
* public boolean equals(Object o) method is the Object class method
 * String class overrides equals()method which compares 
 * value of 2 String objects
 */
	String s1 = new String("smita");
	String s2 = new String("smita");
	System.out.println("is s1==s2 : "+(s1==s2));
//string objects are always created in different memory location
//as == compares object reference thus output is false
	
	}	
}
