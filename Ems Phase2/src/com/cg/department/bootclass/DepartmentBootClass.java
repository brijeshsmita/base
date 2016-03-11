package com.cg.department.bootclass;

import java.util.Scanner;

import com.cg.exception.EmsException;
import com.cg.project.ui.DepartmentUserInterface;

public class DepartmentBootClass 
{
	private static boolean exit=false;
	//public static void main(String a[])
	public static void departmentBootClassMain() throws EmsException 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		String ans="yes";
		do{	
			System.out.println("\n=======================================================\n");
			System.out.println("\t\tENTER YOUR CHOICE\n---------------"
				+ "\n\t\t1. Add Department"
				+ "\n\t\t2. Modify Department"
				+ "\n\t\t3. Remove Department"
				+ "\n\t\t4. List all Department"
				+ "\n\t\t5. Search Department by Department Id"
				);
			System.out.println("\n=======================================================\n");

			choice=sc.nextInt();
			switch (choice) {
			case 1:
				DepartmentUserInterface.addDepartment();
				break;
			case 2:
				DepartmentUserInterface.modifyDepartment();
				break;
			case 3:
				//DepartmentUserInterface.removeDepartment();
				System.out.println("Department can not be Deleted");
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
