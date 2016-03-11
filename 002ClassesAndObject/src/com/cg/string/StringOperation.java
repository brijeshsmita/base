
package com.cg.string;
/*length(): return the length of the string.
charAt(int index): return the char at the index position (index begins at 0 to length()-1).
equals(): for comparing the contents of two strings. 
Take note that you cannot use "==" to compare two strings.*/
public class StringOperation{
	public static void main(String[] args) {
	String str = "Java is cool!";
	System.out.println(str.length());       // return int 13
	System.out.println(str.charAt(2));      // return char 'v'
	System.out.println(str.charAt(5));      // return char 'i'
	System.out.println(str.substring(0, 3));     
	 //start from 0th index and print before 3rd index
	 // return String "Jav"
	System.out.println(str.indexOf('a'));        // return int 1
	System.out.println(str.lastIndexOf('a'));    // return int 3
	System.out.println(str.endsWith("Cool!"));   // return boolean true
	System.out.println(str.toUpperCase());       // return a new String "JAVA IS COOL!"
	System.out.println(str.toLowerCase());       // return a new String "java is cool!"
	// Comparing two Strings
	String anotherStr = "Java is COOL!";
	System.out.println(str.equals(anotherStr));           // return boolean false
	System.out.println(str.equalsIgnoreCase(anotherStr)); // return boolean true
	System.out.println(anotherStr.equals(str));           // return boolean false
	System.out.println(anotherStr.equalsIgnoreCase(str)); // return boolean true
	// (str == anotherStr) to compare two Strings is WRONG!!!
	String a1 =new String("hi");		
	String a2 =new String("hi");
	String a3 =new String("hello");
	System.out.println("a1 :"+a1.hashCode());
	System.out.println("a2 :"+a2.hashCode());
	System.out.println("a3 :"+a3.hashCode());
	}
}