package com.cg.role.bootclass;

import java.util.Scanner;

import com.cg.project.ui.RoleUserInterface;

public class RoleBootClass 
{
	private static boolean exit=false;
	
	public static void main(String s[]){
		roleBootClassMain();
	}
	public static void roleBootClassMain() 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		String ans="yes";
		do{	
			System.out.println("\n=======================================================\n");
			System.out.println("\t\tENTER YOUR CHOICE\n---------------"
				+ "\n\t\t1. Add Role"
				+ "\n\t\t2. Modify Role"
				+ "\n\t\t3. Remove Role"
				+ "\n\t\t4. List all Role"
				+ "\n\t\t5. Search Role by Role Number"
				);
			System.out.println("\n=======================================================\n");

			choice=sc.nextInt();
			switch (choice) {
			case 1:
				RoleUserInterface.addRole();
				break;
			case 2:
				RoleUserInterface.modifyRole();
				break;
			case 3:
				System.out.println("Role can not be Deleted");				
				break;
			case 4:
				RoleUserInterface.getAllRole();
				break;
			case 5:
				RoleUserInterface.searchRole();
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
