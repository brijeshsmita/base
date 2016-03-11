/**
 * 
 */
package com.ems.phase2.client;
import java.util.Scanner;

import com.ems.phase2.client.ui.EmployeeUserInterface;
import com.flp.ems.io.SaveEmployeeInFile;

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
				+ "\n4. View all Employee"
				+ "\n5. find Employee by empId"
				+ "\n6. find Employee by kinId"
				+ "\n7. find Employee by emailId"
				+ "\n8. find Employee by Name"
				);
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				EmployeeUserInterface.addEmployee();
				break;
			case 2:
				EmployeeUserInterface.removeEmployee();
				break;
			case 3:
				EmployeeUserInterface.modifyEmployee();
				break;
			case 4:
				EmployeeUserInterface.getAllEmployee();
				break;
			case 5:
				EmployeeUserInterface.searchEmployee();
				break;
			case 6:
				EmployeeUserInterface.searchEmployeeByKinId();
				break;
			case 7:
				EmployeeUserInterface.searchEmployeeByEmail();
				break;
			case 8:
				EmployeeUserInterface.searchEmployeeByName();
				break;
			default:
				System.out.println("Wrong choice!");
				break;
			}
			System.out.println("Do you want to continue(yes)"
					+ "Enter Yes to continue");
			answere=sc.next();
		}while(answere.equalsIgnoreCase("yes"));
		EmployeeUserInterface.saveEmployee();
	}
	
}// end of class
