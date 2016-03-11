/**
 * 
 */
package com.cg.loop;

import java.util.Scanner;

/**
 * @author Brijesh
 *
 */
public class SwtichTest {

	public static void main(String[] args) {
		//command line argument
		//passed at the time of running the program
		//its is passed as argument to main method
		//thus every argument passed is String
		int payMode=0;
		String choice="";
		do{
			System.out.println("Enter Your PayMode : ");
			System.out.println("Payment Options "
					+"\n 1. Cash"
					+"\n 2. Debit Card"
					+"\n 3. Credit Card"
					+"\n 4. PayTm");
			//inpur must be integer literal
			//payMode= Integer.parseInt(args[0]);
			Scanner scan = new Scanner(System.in);
			payMode=scan.nextInt();//accept input as integer
			switch(payMode){
			case 1:System.out.println("You have opted Cash Payment");
				break;
			case 2:System.out.println("You have opted DebitCard Payment");
				break;
			case 3:System.out.println("You have opted CreditCard Payment");
				break;
			case 4:System.out.println("You have opted PayTm Payment");
				break;
			default:System.out.println("No Such Option exists");
			} //edn of switch
			System.out.println("Do you want to Check out..."
					+ "Enter yes to exit");
			choice=scan.next();//next is to accept string input
			
		}while(!choice.equalsIgnoreCase("yes"));
	}//end of main

}//end of class
