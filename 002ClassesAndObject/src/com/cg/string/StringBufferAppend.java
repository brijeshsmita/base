package com.cg.string;

public class StringBufferAppend {

	public static void main(String[] args) {
		int num=25;
		StringBuffer sb = new StringBuffer();
		sb.append("Square root of ").append(num)
		.append(" is : ");
		sb.append(Math.sqrt(num));
		
		System.out.println(sb.toString());
		System.out.println("lenght is "+sb.length());
	}

}
