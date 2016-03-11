/**
 * 
 */
package com.cg.project.client;
import java.util.Scanner;

import com.cg.project.client.ui.EmployeeUserInterface;

public class EmployeeBootClass {
	private static boolean exit=false;
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		String answere="yes";
		do{			
			System.out.println("Enter your choice"
				+ "\n1. Add Employee"
				+ "\n2. Modify Employee"
				+ "\n3. Remove Employee"
				+ "\n4. List all Employee"
				+ "\n5. Search Employee by Employee Number"
				);
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				EmployeeUserInterface.addEmployee();
				break;
			case 2:
				EmployeeUserInterface.modifyEmployee();
				break;
			case 3:
				EmployeeUserInterface.removeEmployee();				
				break;
			case 4:
				EmployeeUserInterface.getAllEmployee();
				break;
			case 5:
				EmployeeUserInterface.searchEmployee();
				break;
			
			default:
				System.out.println("Wrong choice!");
				break;
			}
			System.out.println("Do you want to continue(yes)"
					+ "Enter Yes to continue");
			answere=sc.next();
		}while(answere.equalsIgnoreCase("yes"));
		System.out.println("Thank You for Using Our Employee App! Bye Bye");
	}
	
}// end of class
