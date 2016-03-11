package com.cg.project.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.department.domain.Department;
import com.cg.department.services.DepartmentServices;
import com.cg.department.services.IDepartmentServices;
import com.cg.exception.EmsException;
import com.cg.validate.Validate;


public class DepartmentUserInterface
{
	private static IDepartmentServices departmentService;
	static Validate validateEmp;
	
	static
	{validateEmp=new Validate();
	departmentService = new DepartmentServices();
	}
	
	public static void addDepartment() {		
		//calling the addEmployee service of Employee
		try
		{
			departmentService.addDepartment(input("add"));	
		} catch (EmsException e) {
		System.out.println("Ems Exception in adding Department");
		e.printStackTrace();
	}
	}
	
	
	public static Department input(String str) {
	
		Department department = new Department();
		Scanner scan = new Scanner(System.in);		
		String deptName=null,deptDesc=null;
		
		try
		{
			
			if(str.equals("modify"))
			{
				getAllDepartment();
				System.out.println("Enter Department Id");
			
					department.setDeptId(scan.nextInt());
			}
			do
			{
			System.out.println("Enter Department name");
				deptName=scan.next();
				department.setDeptName(deptName);
			}while(validateEmp.checkEmpName(deptName)==false);
		
				do
				{
					System.out.println("Enter Department Description (Only 200 characters are allowed)");
					deptDesc=scan.next();
					department.setDeptDesc(deptDesc);
				}while(validateEmp.checkDescription(deptDesc)==false);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		return department;
	}
	
	public static void modifyDepartment() throws EmsException{		
		//calling the addEmployee service of Employee
		System.out.println(departmentService.modifyDepartment(input("modify")));	
	}
	public static void removeDepartment() throws EmsException{
		Scanner scan = new Scanner(System.in);
		int deptId;
		getAllDepartment();
		System.out.println("Enter Department Number");
		deptId=scan.nextInt();	
		departmentService.removeDepartment(deptId);
	}
	
	public static void getAllDepartment(){
		try
		{
		ArrayList<Department> deptList=departmentService.listAllDepartment();
		
		System.out.println("==============Department==============");
		if(deptList!=null){
			for(Department d : deptList){
				System.out.println(d);
			}
		}
		} catch (EmsException e) {
			System.out.println("Ems Exception in Listing Existing Employees");
			e.printStackTrace();
		}
	}

	public static void searchDepartment(){
		Scanner scan = new Scanner(System.in);
		try
		{
			departmentService.showAllDeptId();
		
		System.out.println("Enter Department Id : ");
		int deptId=scan.nextInt();
		Department department = departmentService.searchDepartment(deptId);
		if(department!=null){
			System.out.println("==============Department Found!============\n"
					+department);
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Department does not Exists");
		} catch (EmsException e) {
			System.out.println("Ems Exception in Listing Existing Employees");
			e.printStackTrace();
		}
	}
	
}
