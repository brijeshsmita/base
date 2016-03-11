package com.cg.elseif;
import java.util.Scanner;
public class TestScanner {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter Your name and age");
		String name= sc.next();
		int age= sc.nextInt();
		if(age>18){
			System.out.println("Hello , "+name
					+" You are eligible to vote !");
			
		}else{
			System.out.println("Hello , "+name
					+" You are NOT eligible to vote !");
		}
	}
}