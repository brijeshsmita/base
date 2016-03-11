package com.cg.project.ui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.cg.connection.MyConnection;
import com.cg.department.domain.Department;
import com.cg.department.services.DepartmentServices;
import com.cg.department.services.IDepartmentServices;
import com.cg.employee.domain.Employee;
import com.cg.employee.services.EmployeeServices;
import com.cg.employee.services.IEmployeeServices;
import com.cg.exception.EmsException;
import com.cg.validate.Validate;
import com.cg.validation.datevalidation.DateValidation;
import com.cg.project.domain.Project;
import com.cg.project.services.IProjectService;
import com.cg.project.services.ProjectService;
import com.cg.role.domain.Role;
import com.cg.role.services.IRoleServices;
import com.cg.role.services.RoleServices;
import com.cg.util.DateUtil;


public class EmployeeUserInterface
{
	private static IEmployeeServices employeeService;
	private static IDepartmentServices departmentService;
	private static IProjectService projectService;
	private static IRoleServices roleService;
	private static DateValidation dateValidation;
	static Validate validateEmp;
	
	static
	{validateEmp=new Validate();
	employeeService = new EmployeeServices();
	departmentService = new DepartmentServices();
	projectService = new ProjectService();
	roleService = new RoleServices();
	dateValidation=new DateValidation();
	}
	
	public static IEmployeeServices getEmployeeService() {
		return employeeService;
	}


	public static void setEmployeeService(IEmployeeServices employeeService) {
		EmployeeUserInterface.employeeService = employeeService;
	}


	public static IDepartmentServices getDepartmentService() {
		return departmentService;
	}


	public static void setDepartmentService(IDepartmentServices departmentService) {
		EmployeeUserInterface.departmentService = departmentService;
	}


	public static IProjectService getProjectService() {
		return projectService;
	}


	public static void setProjectService(IProjectService projectService) {
		EmployeeUserInterface.projectService = projectService;
	}


	public static IRoleServices getRoleService() {
		return roleService;
	}


	public static void setRoleService(IRoleServices roleService) {
		EmployeeUserInterface.roleService = roleService;
	}


	public static DateValidation getDateValidation() {
		return dateValidation;
	}


	public static void setDateValidation(DateValidation dateValidation) {
		EmployeeUserInterface.dateValidation = dateValidation;
	}


	public static Validate getValidateEmp() {
		return validateEmp;
	}


	public static void setValidateEmp(Validate validateEmp) {
		EmployeeUserInterface.validateEmp = validateEmp;
	}


	public static void addEmployee(){
		
		try
		{
		employeeService.addEmployee(input("add"));
		} catch (EmsException e) {
			System.out.println("Ems Exception in adding Employee");
			e.printStackTrace();
		}
		
	}
	
	
	public static Employee input(String strMethod){
	
		
		Employee employee = new Employee();
		Scanner scan = new Scanner(System.in);		
		String empName=null,kinId=null,emailId=null,phoneNo=null,dateOfBirth=null,dateOfJoining=null,address=null;
		Date dob,doj;
		
		try
		{
			if(strMethod.equals("modify"))
			{
				System.out.println("============Existing Employee==============");
				getAllEmployee();
				System.out.println("Enter Employee Id");
				employee.setEmpId(scan.nextInt());
			}
			
			do
			{
				System.out.println("Enter Employee name");
				empName=scan.next();
				employee.setEmpName(empName);
			}while(validateEmp.checkEmpName(empName)==false);
			
			employee.setKinId("KIN"+employee.getEmpId());
			
			do
			{
				System.out.println("Enter Employee Email (email@.domain.com)");
				emailId=scan.next();
				employee.setEmailId(emailId);
			}while(validateEmp.checkEmailId(emailId)==false);
			
			do
			{
				System.out.println("Enter Employee Phone Number (+91**********)");
				phoneNo=scan.next();
				employee.setPhoneNo(phoneNo);
			}while(validateEmp.checkPhoneNo(phoneNo)==false);
			
			do
			{
				System.out.println("Enter Employee Date of Birth"
						+ " in following format yyyy/MM/dd");
				dateOfBirth=scan.next();
				dob=DateUtil.convertStringToUtilDate(dateOfBirth);
				
				employee.setDob(dob);
			}while(validateEmp.checkDateOfBirth(dateOfBirth)==false);
			
			if(!dateValidation.checkDob(dob))
			{
				System.out.println("Sorry you are not eligible!, Employees should between 21 and 60");
				System.exit(0);
			}
			else
			{
				employee.setDob(dob);
				do
				{
					System.out.println("Enter Employee Date of Joining"
							+ " in following format yyyy/MM/dd");
					dateOfJoining=scan.next();
					doj=DateUtil.convertStringToUtilDate(dateOfJoining);
					employee.setDoj(doj);
				}while(validateEmp.checkDateOfBirth(dateOfJoining)==false||dateValidation.checkDoj(doj)==false);
				
				
				/*if(dateValidation.checkDoj(doj))
				{
					System.out.println("Wrong Joing Date");
				}
				else
				{*/
					//employee.setDoj(doj);
					do
					{
						System.out.println("Enter Employee Address (Only 200 characters are allowed)");
						address=scan.next();
						employee.setAddress(address);
					}while(validateEmp.checkDescription(address)==false);
					
					System.out.println("Enter Department Id");
					try
					{
					departmentService.showAllDeptId();
					}
					catch (EmsException e) {
						System.out.println("Ems Exception in adding Employee");
						e.printStackTrace();
					}
					//showAllDeptId();
					employee.setDeptId(scan.nextInt());
					
					System.out.println("Enter Project Id");
					projectService.showAllProjectId();
					//showAllProjectId();
					
					employee.setProjectId(scan.nextInt());
					System.out.println("Enter Role Id ");
					roleService.showAllRoleId();
					//showAllRoleId();
					employee.setRoleId(scan.nextInt());
					return employee;
				//}//end of if
			}//end of if
		}//end of try
		catch (EmsException e) 
		{
			System.out.println("Ems Exception in Listing Existing Employees");
			e.printStackTrace();
		}
		return employee;
		
	}
	public static void modifyEmployee() throws EmsException{		
		//calling the addEmployee service of Employee
		System.out.println(employeeService.modifyEmployee(input("modify")));	
	}
	public static void removeEmployee(){
		Scanner scan = new Scanner(System.in);
		int empNo;
		System.out.println("Enter Employee Number");
		empNo=scan.nextInt();	
		try {
			employeeService.removeEmployee(empNo);
		} catch (EmsException e) {
			System.out.println("Ems Exception in Removing Existing Employees");
			e.printStackTrace();
		}
	}
	public static void getAllEmployee(){
		ArrayList<Employee> empList=null;
		try {
			empList = employeeService.listAllEmployee();
		}catch (EmsException e) {
			System.out.println("Ems Exception in Fetching All Employees");
			e.printStackTrace();
		}
		if(empList!=null){
			for(Employee e : empList){
				System.out.println(e);
			}
		}
	}

	public static void searchEmployee(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Number : ");
		int empNo=scan.nextInt();
		Employee employee=null;
		try {
			employee = employeeService.searchEmployee(empNo);
		} catch (EmsException e) {
			System.out.println("Ems Exception in Searching Employees");
			e.printStackTrace();
		}
		if(employee!=null){
			System.out.println("==============Employee Found!============\n"
					+employee);
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Employee does not Exists");
	}
	
}
