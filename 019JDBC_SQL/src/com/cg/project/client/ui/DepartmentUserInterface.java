package com.cg.project.client.ui;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.cg.project.domain.Department;
import com.cg.project.service.DepartmentService;
import com.cg.project.service.IDepartmentService;
public class DepartmentUserInterface {
	private static IDepartmentService departmentService;	
	//static init block
	static
	{
		departmentService = new DepartmentService();
	}
	public static void addDepartment(){		
		//calling the addEmployee service of Employee
		departmentService.addDepartment(input());		
	}
	public static Department input(){
		Department department = new Department();
		Scanner scan = new Scanner(System.in);		
		//String ename, grade;
		Date dob;
		//int empNo,deptNo;
		System.out.println("Enter Department Number");
		department.setDeptNo(scan.nextInt());	
		System.out.println("Enter Department name");
		department.setDname(scan.next());
		System.out.println("Enter Department Location");
		department.setLoc(scan.next());		
		return department;
	}
	public static void modifyDepartment(){		
		//calling the addEmployee service of Employee
		System.out.println(departmentService.modifyDepartment(input()));	
	}
	public static void removeDepartment(){
		Scanner scan = new Scanner(System.in);
		int deptNo;
		System.out.println("Enter department Number");
		deptNo=scan.nextInt();	
		departmentService.removeDepartment(deptNo);
	}
	public static void getAllDepartment(){
		ArrayList<Department> deptList=departmentService.listAllDepartment();
		if(deptList!=null){
			for(Department department : deptList){
				System.out.println(department);
			}
		}
	}

	public static void searchDepartment(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Department Number : ");
		int deptNo=scan.nextInt();
		Department department = departmentService.searchDepartment(deptNo);
		if(department!=null){
			System.out.println("==============Department Found!============\n"
					+department);
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Department does not Exists");
	}
	
}
