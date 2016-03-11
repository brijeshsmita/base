package com.cg.employee.bootclass;

import java.util.Scanner;

import com.cg.exception.EmsException;
import com.cg.project.ui.EmployeeUserInterface;

public class EmployeeBootClass
{
	private static boolean exit=false;
	//public static void main(String s[])
	public static void employeeBootClassMain()  throws EmsException 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		String ans="yes";
		do{		
			System.out.println("\n=======================================================\n");
			System.out.println("\t\tENTER YOUR CHOICE\n---------------"
				+ "\n\t\t1. Add Employee"
				+ "\n\t\t2. Modify Employee"
				+ "\n\t\t3. Remove Employee"
				+ "\n\t\t4. List all Employee"
				+ "\n\t\t5. Search Employee by Employee Number"
				);
			System.out.println("\n=======================================================\n");

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
			ans=sc.next();
			
			if(!ans.equalsIgnoreCase("yes"))
			{
				if(!ans.equalsIgnoreCase("no"))
				{
					System.out.println("Invalid Input");
				}
				else {
					System.out.println("Thank You for Using Our Employee App! Bye Bye");
					System.exit(0);
				}
			}
	
	}while(!ans.equalsIgnoreCase("no"));
	}
}
