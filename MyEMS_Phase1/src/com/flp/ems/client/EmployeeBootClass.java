/**
 * 
 */
package com.flp.ems.client;

import java.util.Scanner;

import com.flp.ems.client.ui.EmployeeUserInterface;
import com.flp.ems.serializable.ObjectSerialization;

/**
 * @author ishita
 *
 */
public class EmployeeBootClass {

	public static void main(String[] args) {
		boolean exit=false;
		int choicebm;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter your choice"
					+ "\n1. Add Employee"
					+ "\n2. View Employee"
					+ "\n3. Modify Employee"
					+ "\n4. Remove Employee"
					+ "\n5. Search Employee by ID"
					+ "\n6. Search Employee by Kin ID"
					+ "\n7. Search Employee by name"
					+ "\n8. Search Employee by email"
					+ "\n9. exit");
			choicebm=sc.nextInt();
			switch(choicebm){
			case 1:EmployeeUserInterface.addEmployee();
				break;
			case 2:EmployeeUserInterface.getAllEmployee();
				break;
			case 3:EmployeeUserInterface.modifyEmployee();
				break;
			case 4:EmployeeUserInterface.removeEmployee();
				break;
			case 5:EmployeeUserInterface.SearchEmployee();
				break;
			case 6:EmployeeUserInterface.SearchEmployeeByKinID();
				break;
			case 7:EmployeeUserInterface.SearchEmployeeByName();
				break;
			case 8:EmployeeUserInterface.SearchEmployeeByEmail();
				break;
			case 9:System.out.println("Thank you for using the application!\n\t\t BYE!");
				EmployeeUserInterface.employeeSerialize();
				exit=true;
				break;
			default: 
			}	
		}while(exit==false);	
	}
}
