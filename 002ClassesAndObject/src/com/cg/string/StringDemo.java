package com.cg.string;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "smita";
		System.out.println(s1.hashCode());
		s1="kumar";
		System.out.println(s1.hashCode());
		System.out.println(s1);
		String s2 = new String("CG ");
		System.out.println(s2.hashCode());
		s2=s2+"Pvt Ltd.";
		System.out.println(s2);
		System.out.println(s2.hashCode());		
		String r1 ="hello";
		String r2 ="hello";
		System.out.println("r1 :"+r1.hashCode());
		System.out.println("r2 :"+r2.hashCode());		
		String a1 =new String("hi");		
		String a2 =new String("hi");
		String a3 =new String("hello");
		System.out.println("a1 :"+a1.hashCode());
		System.out.println("a2 :"+a2.hashCode());
		System.out.println("a3 :"+a3.hashCode());

	}

}
