package com.flp.ems.client.ui;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.flp.ems.client.util.Validate;
import com.flp.ems.client.util.dateUtil;
import com.flp.ems.factory.EmployeeServiceFactory;
import com.flp.ems.model.department.Department;
import com.flp.ems.model.emp.Employee;
import com.flp.ems.model.project.Project;
import com.flp.ems.model.role.Role;
import com.flp.ems.services.EmployeeService;

public class EmployeeUserInterface {
	static EmployeeService service = 
		 EmployeeServiceFactory.getInstance();
	

 
 	public static void addEmployee()
 	{
 		Employee e;
 		 e=new Employee();
 		Scanner sc= new Scanner(System.in);
 		String empName, phoneNo, address, emailId;
 		int  projectId, roleId, deptId;                  
 		Date doj, dob;
 		//sc.nextLine();
 		System.out.print("\nEnter Name Of the Employee:\t");
 		empName=Validate.checkName(sc.nextLine());
 		e.setEmpName(empName);
 		
 		System.out.print("\nEnter date of birth Of the Employee:\n\t");
 		dob=dateUtil.getDob();
 		e.setDob(dob);
 		
 		System.out.print("\nEnter Phone Number Of the Employee:\t");
 		phoneNo=Validate.checkPhone(sc.next()); 
 		e.setPhoneNo(phoneNo);
 		
 		System.out.print("\nEnter Address Of the Employee:\t");
 		sc.nextLine();
 		address=sc.nextLine();
 		e.setAddress(address);
 		
 		System.out.print("\nEnter Email Address Of the Employee:\t");
 		emailId=Validate.checkEmailId(sc.next()); 
 		e.setEmailId(emailId);
 		
 		System.out.print("\nEnter date of joining Of the Employee:(in yyyy/mm/dd format)\t");
 		doj=dateUtil.getDoj();
 		e.setDob(doj);
 		
 		Department d1= new Department();
 		deptId=d1.getDeptId();
 		e.setDeptId(deptId);
 		
 		Project p=new Project();
 		projectId=p.getProjectId();
 		e.setProjectId(projectId);
 		
 		Role r=new Role();
 		roleId=r.getRoleId();
 		e.setRoleId(roleId);
 		
 		int result= service.addEmployee(e);
 		if(result==1){
 			System.out.println("Added Successfully");
 		}
 		else
 			System.out.println("Sorry! Something wnet wrong");
 		
 	}
 	public static void modifyEmployee()
 	{
 		Scanner sc= new Scanner(System.in);
 		int id;
 		System.out.print("\nEnter Employee ID:\t");
 		id=sc.nextInt();
 		Employee emp=service.SearchEmployee(id);
 		if(emp!=null){	
 			String emailID, phoneNo, address;
 			System.out.print("\nEnter Employee email:\t");
 			emailID=Validate.checkEmailId(sc.next());  emp.setEmailId(emailID);
 			System.out.print("\nEnter Employee phone No:\t");
 			phoneNo=Validate.checkPhone(sc.next()); emp.setPhoneNo(phoneNo);
 			
 			System.out.print("\nEnter Employee address:\t");
 			sc.nextLine();
 			address=sc.nextLine(); emp.setAddress(address);
 			int result=service.modifyEmployee(emp);
 			if(result==1)
 			System.out.println("Modified Succefully!");
 			else
 	 		System.out.println("Sorry! Something was not right");
 		}
 		
 	}
 	public static void removeEmployee(){
 		Scanner sc= new Scanner(System.in);
 		int id;
 		System.out.print("\nEnter Employee ID:\t");
 		id=sc.nextInt();
 		Employee emp=service.SearchEmployee(id);
 		int result = service.removeEmployee(emp);
 		if(result==1)
 			System.out.println("Removed Succefully!");
 			else
 			System.out.println("Sorry! Something was not right");
 	}
 	public static void getAllEmployee(){
 		ArrayList<Employee> empList=service.getAllEmployee();
 		System.out.println("\n\n Employee Details\n===================\n"+empList);
 	}
 	public static void SearchEmployee(){
 		Scanner sc= new Scanner(System.in);
 		int id;
 		System.out.print("\nEnter Employee ID:\t");
 		id=sc.nextInt();
 		Employee emp=service.SearchEmployee(id);
 		if (emp!=null)
 			System.out.println("Employee found\nEmployee details are"
 					+ "\n"+emp);
 		else
 			System.out.println("Sorry Employee not found");
 	}
 	public static void SearchEmployeeByKinID(){
 		Scanner sc= new Scanner(System.in);
 		System.out.print("\nEnter Employee Kin ID:\t");
 		String kid=Validate.checkKinId(sc.next());
 		Employee emp=service.SearchEmployeeByKinID(kid);
 		if (emp!=null)
 			System.out.println("Employee found\nEmployee details are"
 					+ "\n"+emp);
 		else
 			System.out.println("Sorry Employee not found");
 	}
 	public static void SearchEmployeeByName(){
 		Scanner sc= new Scanner(System.in);
 		System.out.print("\nEnter Employee Kin ID:\t");
 		String empName=Validate.checkName(sc.nextLine());
 		Employee emp=service.SearchEmployeeByName(empName);
 		if (emp!=null)
 			System.out.println("Employee found\nEmployee details are"
 					+ "\n"+emp);
 		else
 			System.out.println("Sorry Employee not found");
 	}
 	public static void SearchEmployeeByEmail(){
 		Scanner sc= new Scanner(System.in);
 		System.out.print("\nEnter Employee Kin ID:\t");
 		String email=Validate.checkEmailId(sc.next()); 
 		Employee emp=service.SearchEmployeeByEmail(email);
 		if (emp!=null)
 			System.out.println("Employee found\nEmployee details are"
 					+ "\n"+emp);
 		else
 			System.out.println("Sorry Employee not found");
 	}
	public static void employeeSerialize() {
		service.employeeSerialize();
		
	}
}
