package com.cg.project.bootclass;

import java.util.Scanner;

import com.cg.exception.EmsException;
import com.cg.project.ui.ProjectUserInterface;

public class ProjectBootClass {

	public static void projectBootClassMain() throws EmsException{
		int choice;
		Scanner sc = new Scanner(System.in);
		String ans=null;
		do{		
			System.out.println("\n=======================================================\n");
			System.out.println("\t\tENTER YOUR CHOICE\n---------------"
				+ "\n\t\t1. Add Project"
				+ "\n\t\t2. Modify Project"
				+ "\n\t\t3. Remove Project"
				+ "\n\t\t4. List all Projects"
				+ "\n\t\t5. Search Project by Project Id"
				);
			System.out.println("\n=======================================================\n");

			choice=sc.nextInt();
			switch (choice) {
			case 1:
				ProjectUserInterface.addProject();
				break;
			case 2:
				ProjectUserInterface.modifyProject();
				break;
			case 3:
				ProjectUserInterface.removeProject();
				//System.out.println("Project can not be Deleted");
				break;
			case 4:
				ProjectUserInterface.getAllProject();
				break;
			case 5:
				ProjectUserInterface.searchProject();
				break;
			
			default:
				System.out.println("Wrong choice!");
				break;
				
			}
			
			/*do
			{
				System.out.println("Do you want to continue(yes)"
						+ "Enter Yes to continue");
				answere=sc.next();*/
				
				
			//}while((!answere.equalsIgnoreCase("no"))||(!answere.equalsIgnoreCase("yes")));
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


