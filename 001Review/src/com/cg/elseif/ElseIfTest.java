package com.cg.elseif;
import java.util.Scanner;
public class ElseIfTest {
	
	public static void main(String[] args) {
		String choice="";
	//local variable- variable declared inside method
	//local var must be initialized before use
	//local var are avaible only within the method not outside the method
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Enter your choice : "
					+ "	\n1. Addition"
					+ "	\n2. Substraction"
					+ "	\n3. Multiplication"
					+ "	\n4. Division");			
			int input=scan.nextInt();
			if(input==1){
				ElseIfTest.add();
			}
			else if(input==2){
				ElseIfTest.sub();
			}else{
				System.out.println("Wrong Input....");
			}
			System.out.println("Do you want to continue(Enter Yes to continue...)");
			choice=scan.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Thank you for using our App!");
	}
	static int n1,n2;
	//declared outside the method therefore available to all method
	public static void acceptNumbers(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		n1=scan.nextInt();n2=scan.nextInt();
	}
	public static void add(){
		ElseIfTest.acceptNumbers();
		System.out.println("Addition of two numbers is :"+(n1+n2));
	}
	public static void sub(){
	}
	public static void multi(){
	}
	public static void div(){
	}
	

}
