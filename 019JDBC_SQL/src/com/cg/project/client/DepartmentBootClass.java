/**
 * 
 */
package com.cg.project.client;
import java.util.Scanner;

import com.cg.project.client.ui.DepartmentUserInterface;

public class DepartmentBootClass {
	private static boolean exit=false;
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		String answere="yes";
		do{			
			System.out.println("Enter your choice"
				+ "\n1. Add Department"
				+ "\n2. Modify Department"
				+ "\n3. Remove Department"
				+ "\n4. List all Department"
				+ "\n5. Search Department by Department Number"
				);
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				DepartmentUserInterface.addDepartment();
				break;
			case 2:
				DepartmentUserInterface.modifyDepartment();
				break;
			case 3:
				DepartmentUserInterface.removeDepartment();				
				break;
			case 4:
				DepartmentUserInterface.getAllDepartment();
				break;
			case 5:
				DepartmentUserInterface.searchDepartment();
				break;
			
			default:
				System.out.println("Wrong choice!");
				break;
			}
			System.out.println("Do you want to continue(yes)"
					+ "Enter Yes to continue");
			answere=sc.next();
		}while(answere.equalsIgnoreCase("yes"));
		System.out.println("Thank You for Using Our Department App! Bye Bye");
	}
	
}// end of class
