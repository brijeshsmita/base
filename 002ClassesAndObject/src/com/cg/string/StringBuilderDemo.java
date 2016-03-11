package com.cg.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		int num=16;
		StringBuilder sb = new StringBuilder();
//error		//sb="Hello How are you";
		sb.append("Hello How are you? ");
		sb.append("Square root of ").append(num)
		.append(" is : ");
		sb.append(Math.sqrt(num));
		
		System.out.println(sb.toString());
		System.out.println("lenght is "+sb.length());
		sb.insert(45, ",Bye !");
		System.out.println(sb);
	}

}
