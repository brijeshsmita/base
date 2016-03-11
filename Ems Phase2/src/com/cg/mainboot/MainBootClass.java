package com.cg.mainboot;

import java.util.Scanner;

import com.cg.department.bootclass.DepartmentBootClass;
import com.cg.employee.bootclass.EmployeeBootClass;
import com.cg.exception.EmsException;
import com.cg.project.bootclass.ProjectBootClass;
import com.cg.project.ui.DepartmentUserInterface;
import com.cg.project.ui.EmployeeUserInterface;
import com.cg.role.bootclass.RoleBootClass;

public class MainBootClass 
{
	private static boolean exit=false;
	public static void main(String[] args)  throws EmsException
	{
		int choice=0;;
		Scanner sc = new Scanner(System.in);
		String ans=null;
		
		do{	
				/*try
				{
				*/
					System.out.println("\n=======================================================\n");
		
					System.out.println("\t\tPLEASE SELECT YOUR DOMAIN\n"
						+ "\n\t\t1. Employee"
						+ "\n\t\t2. Department"
						+ "\n\t\t3. Project"
						+ "\n\t\t4. Role"
						);
					System.out.println("\n=======================================================\n");
		
					choice=sc.nextInt();
				//}
				/*catch(Exception e)
				{
					choice=0;
					
				}*/
					switch (choice) 
					{
					case 1:
						EmployeeBootClass.employeeBootClassMain();
						break;
					case 2:
						DepartmentBootClass.departmentBootClassMain();
						break;
					case 3:
						ProjectBootClass.projectBootClassMain();				
						break;
					case 4:
						RoleBootClass.roleBootClassMain();
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
