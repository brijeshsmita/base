package com.cg.teststring;
public class StringDemo {
	public static void main(String[] args) {
		// String are final classes in java
		//String can also be treated as primitive
		//String are immutatable class in java
	//any changes made to string object will create a fresh new object
		String strName="Smita";
		String fname= new String("Smita");
		System.out.println(fname);
		fname+=" b kumar";
		//String can use '+' operator or concatenation
		System.out.println(fname);
		System.out.println("toUpperCase() : "+fname.toUpperCase());
		System.out.println("toLowerCase() : "+fname.toLowerCase());
		System.out.println("charAt(5) : "+fname.charAt(5));
		System.out.println("indexOf('a') : "+fname.indexOf('a'));
		System.out.println("lastIndexOf() : "+fname.lastIndexOf('a'));
		System.out.println("substring(1, 4) : "+fname.substring(1, 4));
		System.out.println("substring(5) : "+fname.substring(5));
		System.out.println("concat() : "+fname.concat(" MumBai"));
	}
}
















